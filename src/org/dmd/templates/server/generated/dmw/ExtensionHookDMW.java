package org.dmd.templates.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                         // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.templates.server.extended.ContainedElement;              // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.templates.server.extended.ExtensionHook;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.templates.server.extended.Section;                       // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.templates.shared.generated.dmo.ExtensionHookDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.templates.shared.generated.types.SectionREF;             // Is reference type REF - (BaseDMWGenerator.java:1115)
import org.dmd.templates.shared.generated.types.TdlModuleREF;           // Required to access defined in module name - (DMWGenerator.java:180)



/**
 * The dark-matter Domain Specific Definition (DSD) mechanisms allow for
 * the\n extension of objects using auxliary classes and arbitrary name value
 * pairs (via the nvp attribute).\n These mechanisms are useful because they
 * allow you to augment an existing Domain Specific Language\n (DSL) with
 * your own information that can be used to facilitate generation of other
 * types\n of artifacts.\n <p/>\n However, you might also want that
 * additional information to show up in the documentation\n produced as part
 * of the base DSL. That's where the ExtensionHook mechanism comes into
 * play;\n although you can use this for your own purposes to allow others to
 * extend the\n content of your generated artifacts - there's nothing
 * dark-matter specific about \n the mechanism.\n <p/>\n When defining your
 * Sections, you may indicate that they contain ExtensionHooks.  This\n will
 * result in the generation of an ExtensionHook interface for the template
 * definition module.\n Other designers who have extended your DSL then
 * create a class that implements the ExtensionHook\n interface and have it
 * dynamically loaded when the artifact generator is invoked (this is
 * usually\n done via commandline arguments that are passed to the generated
 * TemplateLoader). It's up to the\n designer of the base DSL to provide
 * these mechanisms.\n <p/>\n When formatting the artifact, the base DSL
 * designer will call the method on a Section\n (in the appropriate sequence)
 * to have the TemplateLoader call any registered classes that\n implement
 * the ExtensionHook interface.
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class ExtensionHookDMW extends ContainedElement implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public ExtensionHookDMW() {
        super(new ExtensionHookDMO(), org.dmd.templates.server.generated.DmtdlSchemaAG._ExtensionHook);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public ExtensionHookDMW(DmcTypeModifierMV mods) {
        super(new ExtensionHookDMO(mods), org.dmd.templates.server.generated.DmtdlSchemaAG._ExtensionHook);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public ExtensionHook getModificationRecorder(){
        ExtensionHook rc = new ExtensionHook();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public ExtensionHookDMW(ExtensionHookDMO obj) {
        super(obj, org.dmd.templates.server.generated.DmtdlSchemaAG._ExtensionHook);
    }

    public ExtensionHook cloneIt() {
        ExtensionHook rc = new ExtensionHook();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ExtensionHookDMO getDMO() {
        return((ExtensionHookDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected ExtensionHookDMW(ExtensionHookDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((ExtensionHookDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ExtensionHookDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ExtensionHookDMW){
            return( getObjectName().equals( ((ExtensionHookDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((ExtensionHookDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((ExtensionHookDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((ExtensionHookDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((ExtensionHookDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getTargetObjectClass(){
        return(((ExtensionHookDMO) core).getTargetObjectClass());
    }

    /**
     * Sets targetObjectClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setTargetObjectClass(Object value) throws DmcValueException {
        ((ExtensionHookDMO) core).setTargetObjectClass(value);
    }

    /**
     * Sets targetObjectClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setTargetObjectClass(String value){
        ((ExtensionHookDMO) core).setTargetObjectClass(value);
    }

    /**
     * Removes the targetObjectClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remTargetObjectClass(){
        ((ExtensionHookDMO) core).remTargetObjectClass();
    }

    /**
     * @return A Section object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
    public Section getUsesSection(){
        SectionREF ref = ((ExtensionHookDMO) core).getUsesSection();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Section)ref.getObject().getContainer());
    }

    /**
     * Sets the usesSection to the specified value.
     * @param value A value compatible with SectionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setUsesSection(Section value) {
        ((ExtensionHookDMO) core).setUsesSection(value.getDMO());
    }

    /**
     * Sets the usesSection to the specified value.
     * @param value A value compatible with SectionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setUsesSection(Object value) throws DmcValueException {
        ((ExtensionHookDMO) core).setUsesSection(value);
    }

    /**
     * Removes the usesSection attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remUsesSection(){
        ((ExtensionHookDMO) core).remUsesSection();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:221)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        TdlModuleREF ref = ((ExtensionHookDMO) core).getDefinedInTdlModule();
        return(ref.getName().getNameString());
    }


}