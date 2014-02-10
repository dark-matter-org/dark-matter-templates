package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:95)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:82)
import java.util.TreeMap;                                         // To store values - (Section.java:85)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:80)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:81)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:79)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:97)
public class ClassListEntry implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:100)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public ClassListEntry(){
    }

    /**
     * Constructs a new ClassListEntry section.
     * @param className_ The name of the class
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:121)
     */
    public ClassListEntry(String className_){
        if (className_ != null)
            values.put("className", className_);

    }

    public String getValue(String name){
        String rc = values.get(name);
        if (rc == null)
            rc = "";
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:200)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DmschemadocTemplateLoader.ClassListEntry.format(this,artifact);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:254)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}