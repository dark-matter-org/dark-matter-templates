package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:95)
import java.util.TreeMap;                                         // To store values - (Section.java:102)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class HtmlHead implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public HtmlHead(){
    }

    /**
     * Constructs a new HtmlHead section.
     * @param schemaName_ The name of the schema
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:143)
     */
    public HtmlHead(String schemaName_){
        if (schemaName_ != null)
            values.put("schemaName", schemaName_);

    }

    public HtmlHead setSchemaName(String schemaName_){
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

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.HtmlHead.format(this,artifact, DmschemadocTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}