package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                          // Thrown by formatting - (Section.java:95)
import org.dmd.templates.server.extended.Template;                   // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;            // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                      // Standard interface used by Templates - (Section.java:92)
import org.dmd.templates.server.util.TemplateMediator;               // To access commentContainer - (Section.java:98)
import org.dmd.templates.tools.generated.dmtdl.ClassSummary;         // Is a contained section - (Section.java:62)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class DivSummary implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    ClassSummary    _ClassSummary;         // A single instance of ClassSummary


    public DivSummary(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "DivSummary starts with text");
        DmschemadocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div class=\"summary\">\n");

        DmschemadocTemplateLoader.DivSummary.format(this,artifact, DmschemadocTemplateLoader._Comment);

        if (_ClassSummary != null)
            _ClassSummary.format(artifact);

        artifact.addText("</div> <!-- summary -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:361)
    public ClassSummary addClassSummary(){
        if (_ClassSummary != null)
            throw(new IllegalStateException("Multiple calls to add a ClassSummary Section. There should only be one of these in a DivSummary."));
        _ClassSummary = new ClassSummary();
        return(_ClassSummary);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:369)
    public ClassSummary getClassSummary(){
        return(_ClassSummary);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:376)
    public ClassSummary fastAddClassSummary(String classCount_){
        if (_ClassSummary != null)
            throw(new IllegalStateException("Multiple calls to add a ClassSummary Section. There should only be one of these in a DivSummary."));
        _ClassSummary = new ClassSummary(classCount_);
        return(_ClassSummary);
    }

}