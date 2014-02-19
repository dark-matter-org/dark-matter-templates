package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:104)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:87)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:85)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:86)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:84)
import org.dmd.templates.server.util.TemplateMediator;            // To access commentContainer - (Section.java:90)
import org.dmd.templates.tools.generated.dmtdl.DivHeader;         // Is a contained section - (Section.java:59)
import org.dmd.templates.tools.generated.dmtdl.DivMain;           // Is a contained section - (Section.java:59)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:106)
public class Body implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:109)
    DivHeader    _DivHeader;         // A single static instance of DivHeader
    DivMain      _DivMain;           // A single static instance of DivMain


    public Body(){
        _DivHeader = new DivHeader(); // Static Section
        _DivMain = new DivMain(); // Static Section
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:249)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "Body starts with text");
        DmschemadocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<body>\n");

        DmschemadocTemplateLoader.Body.format(this,artifact, DmschemadocTemplateLoader._Comment);

        _DivHeader.format(artifact);

        _DivMain.format(artifact);

        artifact.addText("</body>\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:312)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public DivHeader getDivHeader(){
        return(_DivHeader);
    }

    public DivMain getDivMain(){
        return(_DivMain);
    }

}