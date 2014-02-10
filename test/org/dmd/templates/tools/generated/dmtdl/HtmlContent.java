package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:95)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:82)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:80)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:81)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:79)
import org.dmd.templates.tools.generated.dmtdl.HtmlEnd;           // Ends with one of these - (Section.java:70)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:97)
public class HtmlContent implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:100)
    HtmlEnd    _HtmlEnd;         // Ends with a HtmlEnd


    public HtmlContent(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:200)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.HtmlContent.format(this,artifact);

        if (_HtmlEnd != null)
            _HtmlEnd.format(artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:254)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}