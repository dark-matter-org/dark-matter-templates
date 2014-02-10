package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:93)
import java.io.IOException;                                             // Thrown by formatting - (Section.java:80)
import java.util.ArrayList;                                             // Because we have multiple instances of some Sections - (Section.java:62)
import org.dmd.templates.server.util.FormattedArtifactIF;               // Common interface for gathering formatted output - (Section.java:79)
import org.dmd.templates.server.util.SectionIF;                         // Standard interface used by Templates - (Section.java:78)
import org.dmd.templates.tools.generated.dmtdl.ClassListEntry;          // Is a contained section - (Section.java:57)
import org.dmd.templates.tools.generated.dmtdl.ClassListHeader;         // Starts with one of these - (Section.java:48)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:95)
public class ClassList implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:98)
    ClassListHeader              _ClassListHeader;                                        // Starts with a ClassListHeader
    ArrayList<ClassListEntry>    _ClassListEntry     = new ArrayList<ClassListEntry>();   // Multiple instances of ClassListEntry


    public ClassList(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:191)
    public void format(FormattedArtifactIF artifact) throws IOException {
        if (_ClassListHeader != null)
            _ClassListHeader.format(artifact);

        DmschemadocTemplateLoader.ClassList.format(this,artifact);

        if (_ClassListEntry != null){
            for(ClassListEntry entry: _ClassListEntry){
                entry.format(artifact);
            }
        }

        artifact.addText("</table> </div>");
    }
}