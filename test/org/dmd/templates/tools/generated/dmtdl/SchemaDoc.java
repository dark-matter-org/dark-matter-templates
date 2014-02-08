package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:55)
import java.io.IOException;                                       // Thrown by formatting - (TextualArtifact.java:35)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (TextualArtifact.java:34)
import org.dmd.templates.tools.generated.dmtdl.ClassList;         // Is a contained section - (TextualArtifact.java:41)
import org.dmd.templates.tools.generated.dmtdl.Footer;            // Is a contained section - (TextualArtifact.java:41)
import org.dmd.templates.tools.generated.dmtdl.Header;            // Is a contained section - (TextualArtifact.java:41)



// Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:57)
public class SchemaDoc {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:60)
    // Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:60)
    Header       _Header;            // A single instance of Header
    ClassList    _ClassList;         // A single instance of ClassList
    Footer       _Footer;            // A single instance of Footer


    public SchemaDoc(){
    }

    // Generated from: org.dmd.templates.server.extended.TextualArtifact.getFormatFunction(TextualArtifact.java:77)
    public void format(FormattedArtifactIF artifact) throws IOException {

        if (_Header != null)
            _Header.format(artifact);

        if (_ClassList != null)
            _ClassList.format(artifact);

        if (_Footer != null)
            _Footer.format(artifact);

    }
}