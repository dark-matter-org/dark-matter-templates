package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:92)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:79)
import java.util.TreeMap;                                         // To store values - (Section.java:82)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:78)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:77)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:94)
public class Header implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:60)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:97)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public Header(){
    }

    /**
     * Constructs a new Header section.
     * @param schemaName_ The name of the schema being formatted
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:118)
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

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:190)
    public void format(FormattedArtifactIF artifact) throws IOException {

    }
}