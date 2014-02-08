package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.dms.ClassDefinition;                               // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.ContainsIterableDMW;
import org.dmd.templates.server.generated.dmw.SectionDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.server.generated.dmw.ValueIterableDMW;
import org.dmd.templates.shared.generated.dmo.SectionDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.templates.shared.generated.enums.CardinalityEnum;
import org.dmd.templates.shared.generated.types.Contains;
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
    
    /**
     * @return the fully qualified name of the generated class for this Section
     */
    public String getClassImport(){
    	return(getDefinedInTdlModule().getPackage() + ".generated.dmtdl." + getName());
    }
    
    public String getAddFastMethodCall(){
    	StringBuffer sb = new StringBuffer();
    	
    	return(sb.toString());
    }
    
    void getSubsectionImportsAndMembers(ImportManager imports, MemberManager members){
    	if (getStartsWith() != null){
			imports.addImport(getStartsWith().getClassImport(), "Starts with one of these");
			members.addMember(getStartsWith().getName().getNameString(), "_" + getStartsWith().getName(), "Starts with a " + getStartsWith().getName());
    	}
    	
    	if (getContainsHasValue()){
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
    				members.addMember("ArrayList<" + contained.getName().getNameString() + ">", "_" + contained.getName(), "new ArrayList<" + contained.getName().getNameString() + ">()", "Multiple instances of " + contained.getName());
    			}
    		}
    	}
    	
    	if (getEndsWith() != null){
			imports.addImport(getEndsWith().getClassImport(), "Ends with one of these");
			members.addMember(getEndsWith().getName().getNameString(), "_" + getEndsWith().getName(), "Ends with a " + getEndsWith().getName());
    	}
    }

    public void generateSectionClass(String outdir) throws IOException {
    	ImportManager 	imports = new ImportManager();
    	MemberManager	members	= new MemberManager();
    	
    	imports.addImport("org.dmd.templates.server.util.SectionIF", "Standard interface used by Templates");
    	imports.addImport("org.dmd.templates.server.util.FormattedArtifactIF", "Common interface for gathering formatted output");
    	imports.addImport("java.io.IOException", "Thrown by formatting");
    	
        if (getValueHasValue()){
        	imports.addImport("java.util.TreeMap", "To store values");
        	members.addMember("TreeMap<String,String>", "values", "new TreeMap<String,String>()", "Required to store our values");
        }
        
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, getName().getNameString() + ".java");
        
        out.write("package " + getDefinedInTdlModule().getPackage() + ".generated.dmtdl;\n\n");
        
        getSubsectionImportsAndMembers(imports, members);
                
        out.write(imports.getFormattedImports()  + "\n\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + getName() + " implements SectionIF {\n\n");
        out.write("\n");
        out.write(members.getFormattedMembers() + "\n");
        out.write("\n");
        
        out.write("    public " + getName() + "(){\n");
        out.write("    }\n\n");
        out.write("");
        
        if (getValueHasValue()){
        	ValueIterableDMW values = null;
	        // If the number of values we have is less than or equal to the number that
	        // we want in the fastAdd() method, we create a constructor that takes all
	        // of the values as parameters.
	        if (getValueSize() <= getDefinedInTdlModule().getMaxFastAddValues()){
	        	
	        	out.write("    /**\n");
	        	out.write("     * Constructs a new " + getName() + " section.\n");
	            values = getValueIterable();
	            while(values.hasNext()){
	            	Value value = values.getNext();
		        	out.write("     * @param " + value.getValueName() + "_ " + value.getDescription() + "\n");
	            }
	        	out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        	out.write("     */\n");
	            out.write("    public " + getName() + "(");
	            
	            values = getValueIterable();
	            while(values.hasNext()){
	            	Value value = values.getNext();
	            	
	            	out.write("String " + value.getValueName() + "_");
	            	if (values.hasNext())
	            		out.write(", ");
	            }
	            out.write("){\n");
	            
	            values = getValueIterable();
	            while(values.hasNext()){
	            	Value value = values.getNext();
	            	
	            	out.write("        if (" + value.getValueName() + "_ != null)\n");
		            out.write("            values.put(\"" + value.getValueName() + "\", " + value.getValueName() + "_);\n");
		            out.write("\n");
	            }	            
	            
	            out.write("    }\n\n");
	            out.write("");
	        }
	        
	        if (getStartsWith() != null){
	        	
	        }
	        
	        if (getStartsWithText() != null){
	        	
	        }
	        
	        if (getEndsWith() != null){
	        	
	        }
	        
	        if (getEndsWithText() != null){
	        	
	        }
	        
            out.write("    public String getValue(String name){\n");
            out.write("        String rc = values.get(name);\n");
            out.write("        if (rc == null)\n");
            out.write("            rc = \"\";\n");
            out.write("        return(rc);\n");
            out.write("    }\n\n");
	        
        }
        else{
        	// No values
            out.write("    public String getValue(String name){\n");
            out.write("        return(\"\");\n");
            out.write("    }\n\n");

        }
        
        out.write(getFormatFunction());
        
        out.write("}");
        
        
        
        out.close();

    }
    
    String getFormatFunction(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    public void format(FormattedArtifactIF artifact) throws IOException {\n");
    	
    	
    	// Starts with
    	
    	if (getStartsWith() != null){
    		sb.append("        if (_" + getStartsWith().getName() + " != null)\n");
    		sb.append("            _" + getStartsWith().getName() + ".format(artifact);\n");    		
    	}
    	
    	if (getStartsWithText() != null){
        	sb.append("        artifact.addText(\"" + getStartsWithText().replaceAll("\\\"", "\\\\\"") + "\");\n");
    	}
    	
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
    	
    	
    	// Ends with
    	if (getEndsWith() != null){
    		sb.append("        if (_" + getEndsWith().getName() + " != null)\n");
    		sb.append("            _" + getEndsWith().getName() + ".format(artifact);\n");    		
    	}
    	
    	if (getEndsWithText() != null){
        	sb.append("        artifact.addText(\"" + getEndsWithText().replaceAll("\\\"", "\\\\\"") + "\");\n");
    	}
    	
    	
    	sb.append("    }\n");
    	
    	return(sb.toString());
    }
}

