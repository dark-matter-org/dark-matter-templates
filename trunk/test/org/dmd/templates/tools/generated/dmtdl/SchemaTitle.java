package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:104)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:87)
import java.util.TreeMap;                                         // To store values - (Section.java:94)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:85)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:86)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:84)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:106)
public class SchemaTitle implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:109)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public SchemaTitle(){
    }

    /**
     * Constructs a new SchemaTitle section.
     * @param schemaName_ Just the name of the schema
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:135)
     */
    public SchemaTitle(String schemaName_){
        if (schemaName_ != null)
            values.put("schemaName", schemaName_);

    }

    public SchemaTitle setSchemaName(String schemaName_){
        if (schemaName_ != null)
            values.put("schemaName", schemaName_);
        return(this);
    }

    public String getValue(String name){
        String rc = values.get(name);
        if (rc == null)
            rc = "";
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:247)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.SchemaTitle.format(this,artifact, DmschemadocTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:310)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}