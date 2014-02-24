package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:65)
import java.io.IOException;                                         // Thrown by formatting - (TextualArtifact.java:37)
import org.dmd.templates.server.util.FormattedArtifactIF;           // Common interface for gathering formatted output - (TextualArtifact.java:36)
import org.dmd.templates.tools.generated.dmtdl.DocType;             // Is a contained section - (TextualArtifact.java:46)
import org.dmd.templates.tools.generated.dmtdl.HtmlContent;         // Is a contained section - (TextualArtifact.java:46)



// Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:67)
    /**
     * The structure of the SchemaDoc TextualArtifact is as follows:
     * 
     * [] : many Sections
     * ++ : an optional Section
     * -- : a static Section
     * <- : values can be inserted
     * 
     * SchemaDoc
     *   -- DocType  
     *   -- HtmlContent  
     *     -- HtmlHead  <-
     *     -- Body  
     *       -- DivHeader  
     *       -- DivMain  
     *         -- DivContent  
     *           -- SchemaTitle  <-
     *           -- DivSummary  
     *             ++ ClassSummary  <-
     *               -- ClassListStart  
     *               [] ClassListEntry  <-
     */
public class SchemaDoc {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:71)
    DocType        _DocType;             // A single static instance of DocType
    HtmlContent    _HtmlContent;         // A single static instance of HtmlContent


    public SchemaDoc(){
        _DocType = new DocType(); // Static Section
        _HtmlContent = new HtmlContent(); // Static Section
    }

    // Generated from: org.dmd.templates.server.extended.TextualArtifact.getFormatFunction(TextualArtifact.java:125)
    public void format(FormattedArtifactIF artifact) throws IOException {

        _DocType.format(artifact);

        _HtmlContent.format(artifact);

    }

    public DocType getDocType(){
        return(_DocType);
    }

    public HtmlContent getHtmlContent(){
        return(_HtmlContent);
    }

}