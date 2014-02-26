package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                        // Thrown by formatting - (Section.java:91)
import org.dmd.templates.server.extended.Template;                 // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;          // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                    // Standard interface used by Templates - (Section.java:88)
import org.dmd.templates.server.util.TemplateMediator;             // To access commentContainer - (Section.java:94)
import org.dmd.templates.tools.generated.dmtdl.DivContent;         // Is a contained section - (Section.java:62)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class DivMain implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)
    DivContent    _DivContent;         // A single static instance of DivContent


    public DivMain(){
        _DivContent = new DivContent(); // Static Section
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "DivMain starts with text");
        DmschemadocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div id=\"main\">\n");

        DmschemadocTemplateLoader.DivMain.format(this,artifact, DmschemadocTemplateLoader._Comment);

        _DivContent.format(artifact);

        artifact.addText("</div> <!-- main -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:329)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public DivContent getDivContent(){
        return(_DivContent);
    }

}