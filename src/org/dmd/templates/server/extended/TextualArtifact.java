package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.dms.ClassDefinition;                                       // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.ContainsIterableDMW;
import org.dmd.templates.server.generated.dmw.TextualArtifactDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.shared.generated.dmo.TextualArtifactDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.templates.shared.generated.enums.CardinalityEnum;
import org.dmd.templates.shared.generated.types.Contains;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;


public class TextualArtifact extends TextualArtifactDMW {

    public TextualArtifact(){
        super();
    }

    public TextualArtifact(TextualArtifactDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public void generateTextualArtifactClass(String outdir) throws IOException{
    	ImportManager 	imports = new ImportManager();
    	MemberManager	members	= new MemberManager();
    	
    	imports.addImport("org.dmd.templates.server.util.FormattedArtifactIF", "Common interface for gathering formatted output");
    	imports.addImport("java.io.IOException", "Thrown by formatting");
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			Section contained = (Section)c.getSection().getObject().getContainer();
			imports.addImport(contained.getClassImport(), "Is a contained section");
			if (c.getOccurences() == CardinalityEnum.ONE){
				members.addMember(contained.getName().getNameString(), "_" + contained.getName(), "A single instance of " + contained.getName());
			}
			else{
				imports.addImport("java.util.ArrayList", "Because we have multiple instances of some Sections");
				imports.addImport("java.util.Iterator", "Because we have multiple instances of some Sections");
				members.addMember("ArrayList<" + contained.getName().getNameString() + ">", "_" + contained.getName(), "new ArrayList<" + contained.getName().getNameString() + ">()", "Multiple instances of " + contained.getName());
			}
		}

        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, getName().getNameString() + ".java");
        
        out.write("package " + getDefinedInTdlModule().getPackage() + ".generated.dmtdl;\n\n");

        out.write(imports.getFormattedImports()  + "\n\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + getName() + " {\n\n");
        out.write("\n");
        out.write(members.getFormattedMembers() + "\n");
        out.write("\n");

        out.write("    public " + getName() + "(){\n");
        out.write("    }\n\n");
        out.write("");

        out.write(getFormatFunction());
        
		it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			Section contained = (Section)c.getSection().getObject().getContainer();
			out.write(contained.getAccessFunctions(this.getName().getNameString(), c.getOccurences()));
		}
        
        out.write("}");

        out.close();
    }
    
    String getFormatFunction(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    public void format(FormattedArtifactIF artifact) throws IOException {\n");
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			Section contained = (Section)c.getSection().getObject().getContainer();
	    	sb.append("\n");
	    	
	    	if (c.getOccurences() == CardinalityEnum.ONE){
	    		sb.append("        if (_" + contained.getName() + " != null)\n");
	    		sb.append("            _" + contained.getName() + ".format(artifact);\n");
	    	}
	    	else{
	    		sb.append("        if (_" + contained.getName() + " != null){\n");
	        	sb.append("            for(" + contained.getName() + " entry: _" + contained.getName() + "){\n");
	    		sb.append("                entry.format(artifact);\n");
	        	sb.append("            }\n");
	        	sb.append("        }\n");
	    	}
		}
		
    	sb.append("\n");
    	sb.append("    }\n");
    	
    	return(sb.toString());
    }

}

