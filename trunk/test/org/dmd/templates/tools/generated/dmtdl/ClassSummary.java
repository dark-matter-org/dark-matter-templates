package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                            // Thrown by formatting - (Section.java:95)
import java.util.ArrayList;                                            // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                             // Because we have multiple instances of some Sections - (Section.java:68)
import java.util.TreeMap;                                              // To store values - (Section.java:102)
import org.dmd.templates.server.extended.ContainedElement;             // The object formatted by ExtensionHook - ClassAttributesExt - (ExtensionHook.java:40)
import org.dmd.templates.server.extended.Template;                     // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;              // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                        // Standard interface used by Templates - (Section.java:92)
import org.dmd.templates.tools.generated.dmtdl.ClassListEntry;         // Is a contained section - (Section.java:62)
import org.dmd.templates.tools.generated.dmtdl.ClassListStart;         // Starts with one of these - (Section.java:50)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class ClassSummary implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    TreeMap<String,String>       values                                = new TreeMap<String,String>();      // Required to store our values
    ClassListStart               _ClassListStart;                                                           // Starts with a ClassListStart
    ArrayList<ClassListEntry>    _ClassListEntry                       = new ArrayList<ClassListEntry>();   // Multiple instances of ClassListEntry
    ArrayList<ClassListEntry>    _ClassListEntry_ClassAttributesExt    = new ArrayList<ClassListEntry>();   // Multiple instances of ClassListEntry for extension hook ClassAttributesExt


    public ClassSummary(){
        _ClassListStart = new ClassListStart(); // Starts with
    }

    /**
     * Constructs a new ClassSummary section.
     * @param classCount_ The number of classes in ClassListStart
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:143)
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

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        _ClassListStart.format(artifact);

        DmschemadocTemplateLoader.ClassSummary.format(this,artifact, DmschemadocTemplateLoader._Comment);

        if (_ClassListEntry != null){
            for(ClassListEntry entry: _ClassListEntry){
                entry.format(artifact);
            }
        }

        for(ClassListEntry entry: _ClassListEntry_ClassAttributesExt){
            entry.format(artifact);
        }

        artifact.addText("ClassListEnd\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public ClassListStart getClassListStart(){
        return(_ClassListStart);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:388)
    public ClassListEntry addClassListEntry(){
        if (_ClassListEntry == null)
            _ClassListEntry = new ArrayList<ClassListEntry>();
        ClassListEntry rc = new ClassListEntry();
        _ClassListEntry.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:397)
    public Iterator<ClassListEntry> getClassListEntrySet(){
        return(_ClassListEntry.iterator());
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:404)
    public ClassListEntry fastAddClassListEntry(String className_){
        if (_ClassListEntry == null)
            _ClassListEntry = new ArrayList<ClassListEntry>();
        ClassListEntry rc = new ClassListEntry(className_);
        _ClassListEntry.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.ExtensionHook.getExtensionFunction(ExtensionHook.java:62)
    public void extensionClassAttributesExt(ContainedElement target){
        for(DmschemadocExtensionHookIF hook: DmschemadocTemplateLoader._extensionHooks){
            ArrayList<ClassListEntry> ext = hook.performClassAttributesExt(target);
            if (ext != null){
                for(ClassListEntry entry: ext){
                    _ClassListEntry_ClassAttributesExt.add(entry);
                }
            }
        }
    }
}