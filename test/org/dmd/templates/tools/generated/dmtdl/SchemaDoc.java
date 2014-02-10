package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:56)
import java.io.IOException;                                         // Thrown by formatting - (TextualArtifact.java:35)
import org.dmd.templates.server.util.FormattedArtifactIF;           // Common interface for gathering formatted output - (TextualArtifact.java:34)
import org.dmd.templates.tools.generated.dmtdl.DocType;             // Is a contained section - (TextualArtifact.java:41)
import org.dmd.templates.tools.generated.dmtdl.HtmlContent;         // Is a contained section - (TextualArtifact.java:41)



// Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:58)
public class SchemaDoc {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:61)
    DocType        _DocType;             // A single instance of DocType
    HtmlContent    _HtmlContent;         // A single instance of HtmlContent


    public SchemaDoc(){
    }

    // Generated from: org.dmd.templates.server.extended.TextualArtifact.getFormatFunction(TextualArtifact.java:85)
    public void format(FormattedArtifactIF artifact) throws IOException {

        if (_DocType != null)
            _DocType.format(artifact);

        if (_HtmlContent != null)
            _HtmlContent.format(artifact);

    }
    public DocType addDocType(){
        if (_DocType != null)
            throw(new IllegalStateException("Multiple calls to add a DocType Section. There should only be one of these in a SchemaDoc."));
        _DocType = new DocType();
        return(_DocType);
    }

    public DocType getDocType(){
        return(_DocType);
    }

    public HtmlContent addHtmlContent(){
        if (_HtmlContent != null)
            throw(new IllegalStateException("Multiple calls to add a HtmlContent Section. There should only be one of these in a SchemaDoc."));
        _HtmlContent = new HtmlContent();
        return(_HtmlContent);
    }

    public HtmlContent getHtmlContent(){
        return(_HtmlContent);
    }

}