package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.dms.ClassDefinition;                               // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.SectionDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.server.generated.dmw.ValueIterableDMW;
import org.dmd.templates.shared.generated.dmo.SectionDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.templates.shared.generated.types.Value;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;


public class Section extends SectionDMW {

    public Section(){
        super();
    }

    public Section(SectionDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public void generateSectionClass(String outdir) throws IOException {
    	ImportManager 	imports = new ImportManager();
    	MemberManager	members	= new MemberManager();
    	
    	imports.addImport("java.util.TreeMap", "To store values");
    	
    	members.addMember("TreeMap<String,String>", "values", "new TreeMap<String,String>()", "Required to store our values");
    	
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, getName().getNameString() + ".java");
        
        out.write("package " + getDefinedInTdlModule().getPackage() + ".generated.dmtdl;\n\n");
        
        out.write(imports.getFormattedImports()  + "\n\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + getName() + "{\n\n");
        out.write("\n");
        out.write(members.getFormattedMembers() + "\n");
        out.write("\n");
        
        out.write("    public " + getName() + "(){\n");
        out.write("    }\n\n");
        out.write("");
        
        if (getValueHasValue()){
	        // If the number of values we have is less than or equal to the number that
	        // we want in the fastAdd() method, we create a constructor that takes all
	        // of the values as parameters.
	        if (getValueSize() <= getDefinedInTdlModule().getMaxFastAddValues()){
	            out.write("    public " + getName() + "(");
	            ValueIterableDMW values = getValueIterable();
	            
	            while(values.hasNext()){
	            	Value value = values.getNext();
	            	
	            	out.write("String " + value.getValueName() + "_");
	            	if (values.hasNext())
	            		out.write(", ");
	            }
	            out.write("    ){\n");
	            out.write("    }\n\n");
	            out.write("");
	        }
        }
        
        
        out.write("}");
        
        
        
        out.close();

    }
}

