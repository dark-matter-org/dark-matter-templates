package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                 // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.TdlModuleDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.shared.generated.dmo.TdlModuleDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class TdlModule extends TdlModuleDMW {

    public TdlModule(){
        super();
    }

    public TdlModule(TdlModuleDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

