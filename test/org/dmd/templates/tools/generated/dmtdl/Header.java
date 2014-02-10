package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:93)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:80)
import java.util.TreeMap;                                         // To store values - (Section.java:83)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:79)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:78)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:95)
public class Header implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:98)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public Header(){
    }

    /**
     * Constructs a new Header section.
     * @param schemaName_ The name of the schema being formatted
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:119)
     */
    public Header(String schemaName_){
        if (schemaName_ != null)
            values.put("schemaName", schemaName_);

    }

    public String getValue(String name){
        String rc = values.get(name);
        if (rc == null)
            rc = "";
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:191)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.Header.format(this,artifact);

    }
}