//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.templates.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:146)
import java.util.Iterator;                                                      // To allow access to our definitions - (DSDArtifactFormatter.java:133)
import org.dmd.dmc.DmcAttributeInfo;                                            // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashException;                                       // Used when resolving clashes - (DSDArtifactFormatter.java:144)
import org.dmd.dmc.DmcNameClashObjectSet;                                       // Used when resolving clashes - (DSDArtifactFormatter.java:143)
import org.dmd.dmc.DmcNameClashResolverIF;                                      // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                           // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcNamedObjectIF;                                            // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcObject;                                                   // To support object resolution - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.DmcObjectName;                                               // To support object resolution - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.DmcValueException;                                           // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcValueExceptionSet;                                        // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                // Our base to provide definition set storage - (DSDArtifactFormatter.java:132)
import org.dmd.dmc.types.DotName;                                               // To support the find method for definitions - (DSDArtifactFormatter.java:134)
import org.dmd.dms.DSDefinition;                                                // The base of all definitions - (DSDArtifactFormatter.java:131)
import org.dmd.templates.server.extended.Section;                               // A definition from the TdlModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.templates.server.extended.TdlDefinition;                         // A definition from the TdlModule Module - (DSDArtifactFormatter.java:279)
import org.dmd.templates.server.extended.TdlModule;                             // A definition from the TdlModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.templates.server.extended.TextualArtifact;                       // A definition from the TdlModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.templates.server.generated.dsd.TdlModuleGlobalInterface;         // Interface for TdlModule definitions - (DSDArtifactFormatter.java:276)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:150)
public class TdlModuleDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, TdlModuleGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:302)
    DmcDefinitionSet<TdlDefinition> TdlDefinitionDefs;
    DmcDefinitionSet<Section> SectionDefs;
    DmcDefinitionSet<TdlModule> TdlModuleDefs;
    DmcDefinitionSet<TextualArtifact> TextualArtifactDefs;

    public TdlModuleDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:329)
        TdlDefinitionDefs = new DmcDefinitionSet<TdlDefinition>("TdlDefinition", allDefinitions);
        SectionDefs = new DmcDefinitionSet<Section>("Section", allDefinitions);
        TdlModuleDefs = new DmcDefinitionSet<TdlModule>("TdlModule", allDefinitions);
        TextualArtifactDefs = new DmcDefinitionSet<TextualArtifact>("TextualArtifact", allDefinitions);

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:166)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:174)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        return(def);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:191)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:197)
    @Override
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        if (def==null)
            return(null);

        return(def.getDMO());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:217)
    @Override
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DotName dn = new DotName(name.getNameString() + "." + ai.type);
    
        // The name might contain module.defname, in which case we'll try to look it up
        // using a fully qualified DotName of the form module.defname.type. Otherwise,
        // we use the getDefinitionByNameAndType() form of the lookup.
        if (name.getNameString().indexOf(".") == -1){
            try{
                rc = allDefinitions.getDefinitionByNameAndType(dn);
            } catch (DmcNameClashException e) {
                rc = resolver.resolveClash(object, ai, e.getClashSet());
            }
        }
        else{
            rc = allDefinitions.getDefinition(dn);
        }
    
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:240)
    @Override
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DSDefinition resolving = (DSDefinition) obj.getContainer();
    
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinition def = (DSDefinition) it.next();
            if (resolving.getNameOfModuleWhereThisCameFrom().equals(def.getNameOfModuleWhereThisCameFrom())){
                rc = def;
                break;
            }
        }
        return(rc);
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:323)
    /**
     * All definitions are added to the base definition collection.
     */
    void addTdlDefinition(TdlDefinition def){
        TdlDefinitionDefs.add(def);
    }

    public int getTdlDefinitionCount(){
        return(TdlDefinitionDefs.size());
    }

    public TdlDefinition getTdlDefinition(DotName name){
        return(TdlDefinitionDefs.getDefinition(name));
    }

    public Iterator<TdlDefinition> getAllTdlDefinition(){
        return(TdlDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addSection(Section def){
        SectionDefs.add(def);
        addTdlDefinition(def);
    }

    public int getSectionCount(){
        return(SectionDefs.size());
    }

    public Section getSection(DotName name){
        return(SectionDefs.getDefinition(name));
    }

    public Iterator<Section> getAllSection(){
        return(SectionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addTdlModule(TdlModule def){
        TdlModuleDefs.add(def);
        addTdlDefinition(def);
    }

    public int getTdlModuleCount(){
        return(TdlModuleDefs.size());
    }

    public TdlModule getTdlModule(DotName name){
        return(TdlModuleDefs.getDefinition(name));
    }

    public Iterator<TdlModule> getAllTdlModule(){
        return(TdlModuleDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addTextualArtifact(TextualArtifact def){
        TextualArtifactDefs.add(def);
        addTdlDefinition(def);
    }

    public int getTextualArtifactCount(){
        return(TextualArtifactDefs.size());
    }

    public TextualArtifact getTextualArtifact(DotName name){
        return(TextualArtifactDefs.getDefinition(name));
    }

    public Iterator<TextualArtifact> getAllTextualArtifact(){
        return(TextualArtifactDefs.values().iterator());
    }


}
