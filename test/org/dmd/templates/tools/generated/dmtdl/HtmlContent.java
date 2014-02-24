package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:91)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:88)
import org.dmd.templates.tools.generated.dmtdl.Body;              // Is a contained section - (Section.java:62)
import org.dmd.templates.tools.generated.dmtdl.HtmlHead;          // Is a contained section - (Section.java:62)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class HtmlContent implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)
    HtmlHead    _HtmlHead;         // A single static instance of HtmlHead
    Body        _Body;             // A single static instance of Body


    public HtmlContent(){
        _HtmlHead = new HtmlHead(); // Static Section
        _Body = new Body(); // Static Section
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.HtmlContent.format(this,artifact, DmschemadocTemplateLoader._Comment);

        _HtmlHead.format(artifact);

        _Body.format(artifact);

        artifact.addText("</html>\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:328)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public HtmlHead getHtmlHead(){
        return(_HtmlHead);
    }

    public Body getBody(){
        return(_Body);
    }

}