package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:104)
import java.io.IOException;                                         // Thrown by formatting - (Section.java:87)
import org.dmd.templates.server.extended.Template;                  // The Template - (Section.java:85)
import org.dmd.templates.server.util.FormattedArtifactIF;           // Common interface for gathering formatted output - (Section.java:86)
import org.dmd.templates.server.util.SectionIF;                     // Standard interface used by Templates - (Section.java:84)
import org.dmd.templates.server.util.TemplateMediator;              // To access commentContainer - (Section.java:90)
import org.dmd.templates.tools.generated.dmtdl.DivSummary;          // Is a contained section - (Section.java:59)
import org.dmd.templates.tools.generated.dmtdl.SchemaTitle;         // Is a contained section - (Section.java:59)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:106)
public class DivContent implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:109)
    SchemaTitle    _SchemaTitle;         // A single static instance of SchemaTitle
    DivSummary     _DivSummary;          // A single static instance of DivSummary


    public DivContent(){
        _SchemaTitle = new SchemaTitle(); // Static Section
        _DivSummary = new DivSummary(); // Static Section
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:249)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "DivContent starts with text");
        DmschemadocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div id=\"content\">\n");

        DmschemadocTemplateLoader.DivContent.format(this,artifact, DmschemadocTemplateLoader._Comment);

        _SchemaTitle.format(artifact);

        _DivSummary.format(artifact);

        artifact.addText("</div> <!-- content -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:312)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public SchemaTitle getSchemaTitle(){
        return(_SchemaTitle);
    }

    public DivSummary getDivSummary(){
        return(_DivSummary);
    }

}