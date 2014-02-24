package org.dmd.templates.tools.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TdlModule.generateExtensionInterface(TdlModule.java:50)
import java.util.ArrayList;                                            // To hold formatted extensions - (TdlModule.java:35)
import org.dmd.templates.server.extended.ContainedElement;             // The object formatted by ExtensionHook - ClassAttributesExt - (TdlModule.java:41)
import org.dmd.templates.tools.generated.dmtdl.ClassListEntry;         // Used by ExtensionHook - ClassAttributesExt - (TdlModule.java:40)



// Generated from: org.dmd.templates.server.extended.TdlModule.generateExtensionInterface(TdlModule.java:53)
public interface DmschemadocExtensionHookIF {

    /**
     * Create any other required ClassListEntry entries based on the ContainedElement object.
     * @param target the object currently being formatted.
     * @return null or a set of ClassListEntry Sections to be inserted in the artifact.
     */
    public ArrayList<ClassListEntry> performClassAttributesExt(ContainedElement target);


}

