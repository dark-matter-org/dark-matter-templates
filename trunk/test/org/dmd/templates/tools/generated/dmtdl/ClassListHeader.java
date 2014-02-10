package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:93)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:80)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:79)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:78)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:95)
public class ClassListHeader implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:98)


    public ClassListHeader(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:191)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.ClassListHeader.format(this,artifact);

    }
}