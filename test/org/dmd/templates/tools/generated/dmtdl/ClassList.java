package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:95)
import java.io.IOException;                                             // Thrown by formatting - (Section.java:82)
import java.util.ArrayList;                                             // Because we have multiple instances of some Sections - (Section.java:62)
import java.util.Iterator;                                              // Because we have multiple instances of some Sections - (Section.java:63)
import org.dmd.templates.server.extended.Template;                      // The Template - (Section.java:80)
import org.dmd.templates.server.util.FormattedArtifactIF;               // Common interface for gathering formatted output - (Section.java:81)
import org.dmd.templates.server.util.SectionIF;                         // Standard interface used by Templates - (Section.java:79)
import org.dmd.templates.tools.generated.dmtdl.ClassListEntry;          // Is a contained section - (Section.java:57)
import org.dmd.templates.tools.generated.dmtdl.ClassListHeader;         // Starts with one of these - (Section.java:48)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:97)
public class ClassList implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:100)
    ClassListHeader              _ClassListHeader;                                        // Starts with a ClassListHeader
    ArrayList<ClassListEntry>    _ClassListEntry     = new ArrayList<ClassListEntry>();   // Multiple instances of ClassListEntry


    public ClassList(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:200)
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

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:254)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public ClassListEntry addClassListEntry(){
        if (_ClassListEntry == null)
            _ClassListEntry = new ArrayList<ClassListEntry>();
        ClassListEntry rc = new ClassListEntry();
        _ClassListEntry.add(rc);
        return(rc);
    }

    public Iterator<ClassListEntry> getClassListEntrySet(){
        return(_ClassListEntry.iterator());
    }

    public ClassListEntry fastAddClassListEntry(String className_){
        if (_ClassListEntry == null)
            _ClassListEntry = new ArrayList<ClassListEntry>();
        ClassListEntry rc = new ClassListEntry(className_);
        _ClassListEntry.add(rc);
        return(rc);
    }

}