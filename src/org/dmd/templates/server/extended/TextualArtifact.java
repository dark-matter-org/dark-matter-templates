package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

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
			else if (c.getOccurences() == CardinalityEnum.MANY){
				imports.addImport("java.util.ArrayList", "Because we have multiple instances of some Sections");
				imports.addImport("java.util.Iterator", "Because we have multiple instances of some Sections");
				members.addMember("ArrayList<" + contained.getName().getNameString() + ">", "_" + contained.getName(), "new ArrayList<" + contained.getName().getNameString() + ">()", "Multiple instances of " + contained.getName());
			}
			else{
				members.addMember(contained.getName().getNameString(), "_" + contained.getName(), "A single static instance of " + contained.getName());
			}
		}

        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, getName().getNameString() + ".java");
        
        out.write("package " + getDefinedInTdlModule().getPackage() + ".generated.dmtdl;\n\n");

        out.write(imports.getFormattedImports()  + "\n\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(getFormatHint());
        out.write("public class " + getName() + " {\n\n");
        out.write("\n");
        out.write(members.getFormattedMembers() + "\n");
        out.write("\n");

        out.write("    public " + getName() + "(){\n");
        out.write(getStaticSectionConstruction());
        out.write("    }\n\n");
        out.write("");
        
getStaticAccessToStructure();

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
    
    /**
     * Creates the static instantiations of the starts with, ends with and static contained Sections.
     * @return
     */
    String getStaticSectionConstruction(){
    	StringBuffer sb = new StringBuffer();
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			Section contained = (Section)c.getSection().getObject().getContainer();
			if (c.getOccurences() == CardinalityEnum.STATIC){
	    		sb.append("        _" + contained.getName() + " = new " + contained.getName() + "(); // Static Section\n");
			}
		}
    	
    	return(sb.toString());
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
	    	else if (c.getOccurences() == CardinalityEnum.MANY){
	    		sb.append("        if (_" + contained.getName() + " != null){\n");
	        	sb.append("            for(" + contained.getName() + " entry: _" + contained.getName() + "){\n");
	    		sb.append("                entry.format(artifact);\n");
	        	sb.append("            }\n");
	        	sb.append("        }\n");
	    	}
	    	else{
	    		sb.append("        _" + contained.getName() + ".format(artifact);\n");
	    	}
		}
		
    	sb.append("\n");
    	sb.append("    }\n\n");
    	
    	return(sb.toString());
    }

    String getFormatHint(){
    	StringBuffer hint = new StringBuffer();
    	
    	hint.append("    /**\n");
    	hint.append("     * The structure of the " + getName() + " TextualArtifact is as follows:\n");
    	hint.append("     * \n");
    	hint.append("     * [] : many Sections\n");
    	hint.append("     * ++ : an optional Section\n");
    	hint.append("     * -- : a static Section\n");
    	hint.append("     * <- : values can be inserted\n");
    	hint.append("     * \n");
    	hint.append("     * " + getName() + "\n");
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			Section contained = (Section)c.getSection().getObject().getContainer();
			contained.getFormatHint(c.getOccurences(), "  ", hint);
		}
    	hint.append("     */\n");
    	
    	return(hint.toString());
    }
    
    String getStaticAccessToStructure(){
    	StringBuffer sb = new StringBuffer();
    	TreeMap<String,ArrayList<String>>	sections = new TreeMap<String, ArrayList<String>>();
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			Section contained = (Section)c.getSection().getObject().getContainer();
			contained.getStaticAccessToStructure(0, c.getOccurences(), "", sections);
		}
    	
		for(String section: sections.keySet()){
			ArrayList<String> callPaths = sections.get(section);
			if (callPaths.size() == 1){
				System.out.println(section + "  --  " + callPaths.get(0));
			}
			else{
				
			}
		}
    	
    	return(sb.toString());
    }
    
}

