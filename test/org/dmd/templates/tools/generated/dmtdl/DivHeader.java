package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:104)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:87)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:85)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:86)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:84)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:106)
public class DivHeader implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:109)


    public DivHeader(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:247)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.DivHeader.format(this,artifact, DmschemadocTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:310)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}