package org.dmd.templates.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                            // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                   // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                        // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.templates.server.extended.ContainedElement;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.templates.server.extended.TdlDefinition;                    // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.templates.shared.generated.dmo.ContainedElementDMO;         // Abstract class - (BaseDMWGenerator.java:1230)



/**
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class ContainedElementDMW extends TdlDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    protected ContainedElementDMW() {
        super();
    }

    abstract public ContainedElement getModificationRecorder();

    public ContainedElementDMO getDMO() {
        return((ContainedElementDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected ContainedElementDMW(ContainedElementDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((ContainedElementDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ContainedElementDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ContainedElementDMW){
            return( getObjectName().equals( ((ContainedElementDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((ContainedElementDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((ContainedElementDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((ContainedElementDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((ContainedElementDMO) core).remName();
    }


}
