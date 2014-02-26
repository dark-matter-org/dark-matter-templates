package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                     // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.ExtensionHookDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.shared.generated.dmo.ExtensionHookDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.templates.shared.generated.enums.CardinalityEnum;


public class ExtensionHook extends ExtensionHookDMW {

    public ExtensionHook(){
        super();
    }

    public ExtensionHook(ExtensionHookDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    /**
     * Inserts the xx indicator, the name of the extension hook and then hint for
     * the section that it uses.
     * @param indent
     * @param hint
     */
    public void getFormatHint(String indent, StringBuffer hint){
		hint.append("     * " + indent);

		hint.append("xx " + getName() + "\n");
		
		getUsesSection().getFormatHint(CardinalityEnum.MANY, indent + "  ", hint);
    }
}

