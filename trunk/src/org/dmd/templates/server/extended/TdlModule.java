package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dms.ClassDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.templates.server.generated.dmw.TdlModuleDMW;
import org.dmd.templates.shared.generated.dmo.TdlModuleDMO;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;


public class TdlModule extends TdlModuleDMW {

    public TdlModule(){
        super();
    }

    public TdlModule(TdlModuleDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }
    
    public void generateTemplateLoader(String outdir) throws IOException {
		ImportManager imports = new ImportManager();
		MemberManager members = new MemberManager();
    	
		imports.addImport("java.util.TreeMap", "To store SectionInfo");
		imports.addImport("java.util.ArrayList", "To store file search paths");
		imports.addImport("java.io.IOException", "May occur when finding/reading the templates");
		imports.addImport("org.dmd.dms.SchemaManager", "Manages the schemas we use");
		imports.addImport("org.dmd.util.parsing.DmcUncheckedOIFParser", "Basic parsing of objects");
		imports.addImport("org.dmd.util.parsing.DmcUncheckedOIFHandlerIF", "Basic parsing of objects");
		imports.addImport("org.dmd.dmc.util.DmcUncheckedObject", "Basic parsing of objects");
		imports.addImport("org.dmd.dmw.DmwObjectFactory", "Constructs wrapped objects");
		imports.addImport("org.dmd.dmc.DmcValueException", "May be thrown when parsing objects");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "May be thrown when instantiating objects");
		imports.addImport("org.dmd.util.exceptions.ResultException", "May be thrown by schema management");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "May be thrown by rule manager");
		imports.addImport("org.dmd.dmv.shared.DmvRuleManager", "The injected rule manager used for initializations");
		imports.addImport("org.dmd.dmc.rules.SourceInfo", "To indicate the source of rule problems");
		imports.addImport("org.dmd.dmw.DmwWrapper", "To handle factory created objects");
		imports.addImport("org.dmd.templates.server.extended.Template", "The Template");
		imports.addImport("org.dmd.templates.server.generated.DmtdlSchemaAG", "The dmtdl schema");
		imports.addImport("org.dmd.util.parsing.ConfigFinder", "Finds configs we may need to parse");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Handle to a discovered configuration");
		imports.addImport("org.dmd.util.parsing.ConfigVersion", "Handle to a particular config version");
		imports.addImport("org.dmd.dms.AttributeDefinition", "To allow addition of preserve newline attributes");
		imports.addImport("org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW", "To allow addition of preserve newline attributes");
		imports.addImport("org.dmd.templates.server.util.TemplateMediator", "Allows us to access loaded templates");

		members.addMember("SchemaManager",                	"schema", "Manages the schema for this DSD");
		members.addMember("DmcUncheckedOIFParser",       	"parser", "new DmcUncheckedOIFParser(this)", "Parses objects from the config file");
		members.addMember("DmwObjectFactory",             	"factory", "Instantiates wrapped objects");
		members.addMember("DmvRuleManager", 				"rules", "new DmvRuleManager()", "Rule manager");
		members.addMember("ConfigFinder", 					"finder", "new ConfigFinder(\"" + getTemplateFileSuffix() + "\")", "Config finder for template files ending with ." + getTemplateFileSuffix());
		members.addMember("ConfigLocation",					"location", "The location of the config being parsed");
		members.addMember("TreeMap<String,TemplateMediator>",				"mediators", "new TreeMap<String,TemplateMediator>()", "The mediators by name");
		members.addSpacer();
		
		Iterator<Section>	sections = getAllSection();
		while(sections.hasNext()){
			Section section = sections.next();
			members.addMember("public static TemplateMediator",		section.getName().getNameString(), "new TemplateMediator(\"" + section.getName() + "\")", "Mediator for the " + section.getName() + " template");
		}
		
		String cn = GenUtility.capTheName(getName().getNameString() + "TemplateLoader");
		
		
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cn + ".java");

		out.write("package " + getPackage() + ".generated.dmtdl;\n\n");

		out.write(imports.getFormattedImports() + "\n");
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + cn + " implements DmcUncheckedOIFHandlerIF {\n\n");
		
		out.write(members.getFormattedMembers() + "\n");
        
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    /**\n");
		out.write("     * Creates a new template loader for templates associated with the " + getName() + " TdlModule.\n");
		out.write("     * @param paths the paths that we'll search for the template definition file.\n");
		out.write("     */\n");
		out.write("    public " + cn + "(ArrayList<String> paths) throws ResultException, DmcValueException, DmcNameClashException {\n");
		out.write("        schema = new SchemaManager();\n");
		out.write("        DmtdlSchemaAG sd = new DmtdlSchemaAG();\n");	
		out.write("        schema.manageSchema(sd);\n");
		out.write("        if (sd.getAttributeDefListSize() > 0){\n");
		out.write("            AttributeDefinitionIterableDMW attrs = sd.getAttributeDefList();\n");
		out.write("            while(attrs.hasNext()){\n");
		out.write("                AttributeDefinition ad = attrs.getNext();\n");
		out.write("                if (ad.getPreserveNewlines()){\n");
		out.write("                    parser.addPreserveNewlinesAttribute(ad.getName().getNameString());\n");
		out.write("                }\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        finder.setSourceInfo(paths);\n\n");
		
		sections = getAllSection();
		while(sections.hasNext()){
			Section section = sections.next();
			out.write("        mediators.put(\"" + section.getName() + "\"," + section.getName() + ");\n");
		}
		
		out.write("        \n");
		out.write("        factory      = new DmwObjectFactory(schema);\n");
		out.write("        \n");
		out.write("    }\n\n");
		
		
		String fn = getTemplateFile() + "." + getTemplateFileSuffix();
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    /**\n");
		out.write("     * We attempt to find and load the " + fn + " file.\n");
		out.write("     */\n");
		out.write("    public void findAndLoadTemplate() throws ResultException, IOException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("        for(TemplateMediator tm: mediators.values()){\n");
		out.write("            tm.reset();\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        finder.findConfigs();\n");
		out.write("        ConfigVersion version = finder.getConfig(\""+ getTemplateFile() + "\");\n");
		out.write("        if (version == null){\n");
		out.write("            ResultException ex = new ResultException(\"Could not find template definition file: " + fn + "\");\n");
		out.write("            ex.moreMessages(finder.getSearchInfo());\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        location = version.getLatestVersion();\n");
		out.write("        parser.parseFile(location.getFileName());\n");
		out.write("    }\n\n");
		

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    @Override\n");
		out.write("    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("        Template template = null;\n");
		out.write("        DmwWrapper wrapper = null;\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            wrapper = factory.createWrapper(uco);\n");
		out.write("            template = (Template) wrapper;\n");
		out.write("        } catch (ClassNotFoundException e) {\n");
		out.write("            ResultException ex = new ResultException(\"Unknown object class: \" + uco.classes.get(0));\n");
		out.write("            ex.result.lastResult().fileName(infile);\n");
		out.write("            ex.result.lastResult().lineNumber(lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch (ResultException ex){\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch(DmcValueException e){\n");
		out.write("            ResultException ex = new ResultException();\n");
		out.write("            ex.addError(e.getMessage());\n");
		out.write("            if (e.getAttributeName() != null)\n");
		out.write("                ex.result.lastResult().moreMessages(\"Attribute: \" + e.getAttributeName());\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch(ClassCastException e){\n");
		out.write("            ResultException ex = new ResultException();\n");
		out.write("            ex.addError(\"The following object is not valid in a ." + getTemplateFileSuffix() + " file:\\n\\n\" + wrapper.toOIF());\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        template.setLineNumber(lineNumber);\n");
		out.write("        template.setFile(infile);\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            // Run the rules against the definition\n");
		out.write("            rules.executeInitializers(template.getDmcObject());\n");
		out.write("            rules.executeAttributeValidation(template.getDmcObject());\n");
		out.write("            rules.executeObjectValidation(template.getDmcObject());\n");
		out.write("        }\n");
		out.write("        catch(DmcRuleExceptionSet ex){\n");
		out.write("            ex.source(new SourceInfo(infile, lineNumber));\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        TemplateMediator tm = mediators.get(template.getName().getNameString());\n");
		out.write("        if (tm == null){\n");
		out.write("            ResultException ex = new ResultException(\"Template for an unknown Section: \" + template.getName());\n");
		out.write("            ex.moreMessages(\"The Template must use one of the following names:\");\n");
		out.write("            for (String n : mediators.keySet()){\n");
		out.write("                ex.moreMessages(n);\n");
		out.write("            }\n");
		out.write("            ex.setLocationInfo(template.getFile(), template.getLineNumber());\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        if (tm.getTemplate() != null){\n");
		out.write("            ResultException ex = new ResultException(\"Duplicate Template for Section: \" + template.getName());\n");
		out.write("            ex.moreMessages(\"Previously defined at line: \" + tm.getTemplate().getLineNumber());\n");
		out.write("            ex.setLocationInfo(template.getFile(), template.getLineNumber());\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        template.initialize(\"" + getInsertMarker() + "\");\n");
		out.write("        \n");
		out.write("        tm.setTemplate(template);\n");
		out.write("\n");
		out.write("    }\n");

		
		out.write("\n");
		out.write("}\n");

		out.close();
    }

}

