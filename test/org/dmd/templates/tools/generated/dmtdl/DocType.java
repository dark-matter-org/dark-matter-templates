package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:91)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:88)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class DocType implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)


    public DocType(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.DocType.format(this,artifact, DmschemadocTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:328)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}