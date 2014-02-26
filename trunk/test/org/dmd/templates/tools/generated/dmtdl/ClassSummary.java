package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                            // Thrown by formatting - (Section.java:91)
import java.util.ArrayList;                                            // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                             // Because we have multiple instances of some Sections - (Section.java:68)
import java.util.TreeMap;                                              // To store values - (Section.java:98)
import org.dmd.templates.server.extended.Template;                     // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;              // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                        // Standard interface used by Templates - (Section.java:88)
import org.dmd.templates.tools.generated.dmtdl.ClassListEntry;         // Is a contained section - (Section.java:62)
import org.dmd.templates.tools.generated.dmtdl.ClassListStart;         // Starts with one of these - (Section.java:50)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class ClassSummary implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)
    TreeMap<String,String>       values             = new TreeMap<String,String>();      // Required to store our values
    ClassListStart               _ClassListStart;                                        // Starts with a ClassListStart
    ArrayList<ClassListEntry>    _ClassListEntry    = new ArrayList<ClassListEntry>();   // Multiple instances of ClassListEntry


    public ClassSummary(){
        _ClassListStart = new ClassListStart(); // Starts with
    }

    /**
     * Constructs a new ClassSummary section.
     * @param classCount_ The number of classes in ClassListStart
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:139)
     */
    public ClassSummary(String classCount_){
        _ClassListStart = new ClassListStart(); // Starts with
        if (classCount_ != null)
            values.put("classCount", classCount_);

    }

    public ClassSummary setClassCount(String classCount_){
        if (classCount_ != null)
            values.put("classCount", classCount_);
        return(this);
    }

    public String getValue(String name){
        String rc = values.get(name);
        if (rc == null)
            rc = "";
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {
        _ClassListStart.format(artifact);

        DmschemadocTemplateLoader.ClassSummary.format(this,artifact, DmschemadocTemplateLoader._Comment);

        if (_ClassListEntry != null){
            for(ClassListEntry entry: _ClassListEntry){
                entry.format(artifact);
            }
        }

        artifact.addText("ClassListEnd\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:329)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public ClassListStart getClassListStart(){
        return(_ClassListStart);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:375)
    public ClassListEntry addClassListEntry(){
        if (_ClassListEntry == null)
            _ClassListEntry = new ArrayList<ClassListEntry>();
        ClassListEntry rc = new ClassListEntry();
        _ClassListEntry.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:384)
    public Iterator<ClassListEntry> getClassListEntrySet(){
        return(_ClassListEntry.iterator());
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:391)
    public ClassListEntry fastAddClassListEntry(String className_){
        if (_ClassListEntry == null)
            _ClassListEntry = new ArrayList<ClassListEntry>();
        ClassListEntry rc = new ClassListEntry(className_);
        _ClassListEntry.add(rc);
        return(rc);
    }

}