package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:91)
import java.util.TreeMap;                                         // To store values - (Section.java:98)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:88)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class SchemaTitle implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public SchemaTitle(){
    }

    /**
     * Constructs a new SchemaTitle section.
     * @param schemaName_ Just the name of the schema
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:139)
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

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.SchemaTitle.format(this,artifact, DmschemadocTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:329)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}