package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:132)
import java.io.IOException;                                              // May occur when finding/reading the templates - (TdlModule.java:83)
import java.util.ArrayList;                                              // To store file search paths - (TdlModule.java:82)
import java.util.TreeMap;                                                // To store SectionInfo - (TdlModule.java:81)
import org.dmd.dmc.DmcNameClashException;                                // May be thrown when instantiating objects - (TdlModule.java:90)
import org.dmd.dmc.DmcValueException;                                    // May be thrown when parsing objects - (TdlModule.java:89)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                            // May be thrown by rule manager - (TdlModule.java:92)
import org.dmd.dmc.rules.SourceInfo;                                     // To indicate the source of rule problems - (TdlModule.java:94)
import org.dmd.dmc.util.DmcUncheckedObject;                              // Basic parsing of objects - (TdlModule.java:87)
import org.dmd.dms.AttributeDefinition;                                  // To allow addition of preserve newline attributes - (TdlModule.java:101)
import org.dmd.dms.SchemaManager;                                        // Manages the schemas we use - (TdlModule.java:84)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;         // To allow addition of preserve newline attributes - (TdlModule.java:102)
import org.dmd.dmv.shared.DmvRuleManager;                                // The injected rule manager used for initializations - (TdlModule.java:93)
import org.dmd.dmw.DmwObjectFactory;                                     // Constructs wrapped objects - (TdlModule.java:88)
import org.dmd.dmw.DmwWrapper;                                           // To handle factory created objects - (TdlModule.java:95)
import org.dmd.templates.server.extended.Template;                       // The Template - (TdlModule.java:96)
import org.dmd.templates.server.generated.DmtdlSchemaAG;                 // The dmtdl schema - (TdlModule.java:97)
import org.dmd.templates.server.util.TemplateMediator;                   // Allows us to access loaded templates - (TdlModule.java:103)
import org.dmd.util.exceptions.ResultException;                          // May be thrown by schema management - (TdlModule.java:91)
import org.dmd.util.parsing.ConfigFinder;                                // Finds configs we may need to parse - (TdlModule.java:98)
import org.dmd.util.parsing.ConfigLocation;                              // Handle to a discovered configuration - (TdlModule.java:99)
import org.dmd.util.parsing.ConfigVersion;                               // Handle to a particular config version - (TdlModule.java:100)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                    // Basic parsing of objects - (TdlModule.java:86)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                       // Basic parsing of objects - (TdlModule.java:85)



// Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:135)
public class DmschemadocTemplateLoader implements DmcUncheckedOIFHandlerIF {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:138)
    SchemaManager                       schema;                                                       // Manages the schema for this DSD
    DmcUncheckedOIFParser               parser            = new DmcUncheckedOIFParser(this);          // Parses objects from the config file
    DmwObjectFactory                    factory;                                                      // Instantiates wrapped objects
    DmvRuleManager                      rules             = new DmvRuleManager();                     // Rule manager
    ConfigFinder                        finder            = new ConfigFinder("dmt");                  // Config finder for template files ending with .dmt
    ConfigLocation                      location;                                                     // The location of the config being parsed
    TreeMap<String,TemplateMediator>    mediators         = new TreeMap<String,TemplateMediator>();   // The mediators by name
                                                                                                      // 
    public static TemplateMediator      Body              = new TemplateMediator("Body");             // Mediator for the Body template
    public static TemplateMediator      ClassListEnd      = new TemplateMediator("ClassListEnd");     // Mediator for the ClassListEnd template
    public static TemplateMediator      ClassListEntry    = new TemplateMediator("ClassListEntry");   // Mediator for the ClassListEntry template
    public static TemplateMediator      ClassListStart    = new TemplateMediator("ClassListStart");   // Mediator for the ClassListStart template
    public static TemplateMediator      ClassSummary      = new TemplateMediator("ClassSummary");     // Mediator for the ClassSummary template
    public static TemplateMediator      DivContent        = new TemplateMediator("DivContent");       // Mediator for the DivContent template
    public static TemplateMediator      DivHeader         = new TemplateMediator("DivHeader");        // Mediator for the DivHeader template
    public static TemplateMediator      DivMain           = new TemplateMediator("DivMain");          // Mediator for the DivMain template
    public static TemplateMediator      DivSummary        = new TemplateMediator("DivSummary");       // Mediator for the DivSummary template
    public static TemplateMediator      DocType           = new TemplateMediator("DocType");          // Mediator for the DocType template
    public static TemplateMediator      HtmlContent       = new TemplateMediator("HtmlContent");      // Mediator for the HtmlContent template
    public static TemplateMediator      HtmlHead          = new TemplateMediator("HtmlHead");         // Mediator for the HtmlHead template
    public static TemplateMediator      SchemaTitle       = new TemplateMediator("SchemaTitle");      // Mediator for the SchemaTitle template
                                                                                                      // 
    public static Template              _Comment;                                                     // Used to display debug comments in formatted output

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:140)
    /**
     * Creates a new template loader for templates associated with the dmschemadoc TdlModule.
     * @param paths the paths that we'll search for the template definition file.
     */
    public DmschemadocTemplateLoader(ArrayList<String> paths) throws ResultException, DmcValueException, DmcNameClashException {
        schema = new SchemaManager();
        DmtdlSchemaAG sd = new DmtdlSchemaAG();
        schema.manageSchema(sd);
        if (sd.getAttributeDefListSize() > 0){
            AttributeDefinitionIterableDMW attrs = sd.getAttributeDefList();
            while(attrs.hasNext()){
                AttributeDefinition ad = attrs.getNext();
                if (ad.getPreserveNewlines()){
                    parser.addPreserveNewlinesAttribute(ad.getName().getNameString());
                }
            }
        }
        
        finder.setSourceInfo(paths);

        mediators.put("Body",Body);
        mediators.put("ClassListEnd",ClassListEnd);
        mediators.put("ClassListEntry",ClassListEntry);
        mediators.put("ClassListStart",ClassListStart);
        mediators.put("ClassSummary",ClassSummary);
        mediators.put("DivContent",DivContent);
        mediators.put("DivHeader",DivHeader);
        mediators.put("DivMain",DivMain);
        mediators.put("DivSummary",DivSummary);
        mediators.put("DocType",DocType);
        mediators.put("HtmlContent",HtmlContent);
        mediators.put("HtmlHead",HtmlHead);
        mediators.put("SchemaTitle",SchemaTitle);
        
        factory      = new DmwObjectFactory(schema);
        
        _Comment = new Template();
        _Comment.setFile("DmschemadocTemplateLoader");
        _Comment.setLineNumber(1);
        _Comment.setFormat("\n<!-- ::comment:: -->");
        _Comment.initialize("::");
        
    }

// Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:184)
    /**
     * We attempt to find and load the schemaDocTemplates.dmt file.
     */
    public void findAndLoadTemplate() throws ResultException, IOException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        for(TemplateMediator tm: mediators.values()){
            tm.reset();
        }
        
        finder.findConfigs();
        ConfigVersion version = finder.getConfig("schemaDocTemplates");
        if (version == null){
            ResultException ex = new ResultException("Could not find template definition file: schemaDocTemplates.dmt");
            ex.moreMessages(finder.getSearchInfo());
            throw(ex);
        }

        location = version.getLatestVersion();
        parser.parseFile(location.getFileName());
    }

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:206)
    @Override
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        Template template = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            template = (Template) wrapper;
        } catch (ClassNotFoundException e) {
            ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
            ex.result.lastResult().fileName(infile);
            ex.result.lastResult().lineNumber(lineNumber);
            throw(ex);
        }
        catch (ResultException ex){
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(DmcValueException e){
            ResultException ex = new ResultException();
            ex.addError(e.getMessage());
            if (e.getAttributeName() != null)
                ex.result.lastResult().moreMessages("Attribute: " + e.getAttributeName());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(ClassCastException e){
            ResultException ex = new ResultException();
            ex.addError("The following object is not valid in a .dmt file:\n\n" + wrapper.toOIF());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }

        template.setLineNumber(lineNumber);
        template.setFile(infile);

        try{
            // Run the rules against the definition
            rules.executeInitializers(template.getDmcObject());
            rules.executeAttributeValidation(template.getDmcObject());
            rules.executeObjectValidation(template.getDmcObject());
        }
        catch(DmcRuleExceptionSet ex){
            ex.source(new SourceInfo(infile, lineNumber));
            throw(ex);
        }

        TemplateMediator tm = mediators.get(template.getName().getNameString());
        if (tm == null){
            ResultException ex = new ResultException("Template for an unknown Section: " + template.getName());
            ex.moreMessages("The Template must use one of the following names:");
            for (String n : mediators.keySet()){
                ex.moreMessages(n);
            }
            ex.setLocationInfo(template.getFile(), template.getLineNumber());
            throw(ex);
        }
        
        if (tm.getTemplate() != null){
            ResultException ex = new ResultException("Duplicate Template for Section: " + template.getName());
            ex.moreMessages("Previously defined at line: " + tm.getTemplate().getLineNumber());
            ex.setLocationInfo(template.getFile(), template.getLineNumber());
            throw(ex);
        }
        
        template.initialize("::");
        
        tm.setTemplate(template);

    }

}