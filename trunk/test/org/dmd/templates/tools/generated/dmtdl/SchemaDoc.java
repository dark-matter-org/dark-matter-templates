package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:72)
import java.io.IOException;                                         // Thrown by formatting - (TextualArtifact.java:40)
import org.dmd.templates.server.util.FormattedArtifactIF;           // Common interface for gathering formatted output - (TextualArtifact.java:39)
import org.dmd.templates.tools.generated.dmtdl.DivSummary;          // To access static Section: DivSummary - (TextualArtifact.java:43)
import org.dmd.templates.tools.generated.dmtdl.DocType;             // Is a contained section - (TextualArtifact.java:53)
import org.dmd.templates.tools.generated.dmtdl.HtmlContent;         // Is a contained section - (TextualArtifact.java:53)
import org.dmd.templates.tools.generated.dmtdl.HtmlHead;            // To access static Section: HtmlHead - (TextualArtifact.java:43)
import org.dmd.templates.tools.generated.dmtdl.SchemaTitle;         // To access static Section: SchemaTitle - (TextualArtifact.java:43)



    // Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:74)
    /**
     * The structure of the SchemaDoc TextualArtifact is as follows:
     * 
     * [] : many Sections
     * ++ : an optional Section
     * -- : a static Section
     * <- : values can be inserted
     * xx : extension hook can be inserted
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
     *               xx ClassAttributesExt
     *                 [] ClassListEntry  <-
     */
    public class SchemaDoc {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:78)
    DocType        _DocType;             // A single static instance of DocType
    HtmlContent    _HtmlContent;         // A single static instance of HtmlContent


    // Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:81)
    public SchemaDoc(){
        _DocType = new DocType(); // Static Section
        _HtmlContent = new HtmlContent(); // Static Section
    }

    // Generated from: org.dmd.templates.server.extended.TextualArtifact.getFormatFunction(TextualArtifact.java:137)
    public void format(FormattedArtifactIF artifact) throws IOException {

        _DocType.format(artifact);

        _HtmlContent.format(artifact);

    }

    // Generated from: org.dmd.templates.server.util.StaticAccessInfo.getAccessFunctions(StaticAccessInfo.java:47)
    /**
     * @return the DivSummary Section at: _HtmlContent.getBody().getDivMain().getDivContent().getDivSummary()
     */
    public DivSummary getDivSummary(){
        return(_HtmlContent.getBody().getDivMain().getDivContent().getDivSummary());
    }

    // Generated from: org.dmd.templates.server.util.StaticAccessInfo.getAccessFunctions(StaticAccessInfo.java:47)
    /**
     * @return the HtmlHead Section at: _HtmlContent.getHtmlHead()
     */
    public HtmlHead getHtmlHead(){
        return(_HtmlContent.getHtmlHead());
    }

    // Generated from: org.dmd.templates.server.util.StaticAccessInfo.getAccessFunctions(StaticAccessInfo.java:47)
    /**
     * @return the SchemaTitle Section at: _HtmlContent.getBody().getDivMain().getDivContent().getSchemaTitle()
     */
    public SchemaTitle getSchemaTitle(){
        return(_HtmlContent.getBody().getDivMain().getDivContent().getSchemaTitle());
    }

}