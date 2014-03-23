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
package org.dmd.templates.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:126)
import java.io.Serializable;                                                              // To prevent serialization warnings - (NewComplexTypeFormatter.java:92)
import java.util.ArrayList;                                                               // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcAttributeInfo;                                                      // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:97)
import org.dmd.dmc.DmcContainerIF;                                                        // To support object references - (NewComplexTypeFormatter.java:109)
import org.dmd.dmc.DmcInputStreamIF;                                                      // Standard serialization techniques - (NewComplexTypeFormatter.java:93)
import org.dmd.dmc.DmcNameClashResolverIF;                                                // To support possible clashing object references - (NewComplexTypeFormatter.java:113)
import org.dmd.dmc.DmcNameResolverIF;                                                     // To support object references - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                     // To support possible clashing object references - (NewComplexTypeFormatter.java:111)
import org.dmd.dmc.DmcNamedObjectIF;                                                      // To support object references - (NewComplexTypeFormatter.java:107)
import org.dmd.dmc.DmcNamedObjectREF;                                                     // To support object references - (NewComplexTypeFormatter.java:108)
import org.dmd.dmc.DmcObject;                                                             // To support possible clashing object references - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcOmni;                                                               // To enable back reference tracking - (NewComplexTypeFormatter.java:116)
import org.dmd.dmc.DmcOutputStreamIF;                                                     // Standard serialization techniques - (NewComplexTypeFormatter.java:94)
import org.dmd.dmc.DmcValueException;                                                     // Standard value exception - (NewComplexTypeFormatter.java:121)
import org.dmd.dmc.DmcValueExceptionSet;                                                  // To support possible clashing object references - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.types.Modifier;                                                        // To enable back reference tracking - (NewComplexTypeFormatter.java:117)
import org.dmd.dmc.util.ComplexTypeSplitter;                                              // For parsing initial input - (NewComplexTypeFormatter.java:98)
import org.dmd.dmc.util.ParsedNameValuePair;                                              // To store values parsed from initial input - (NewComplexTypeFormatter.java:100)
import org.dmd.dms.generated.enums.DataTypeEnum;                                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:95)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                         // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:96)
import org.dmd.templates.shared.generated.enums.CardinalityEnum;                          // Primitive type - (NewComplexTypeFormatter.java:839)
import org.dmd.templates.shared.generated.types.ContainedElementREF;                      // Object reference - (NewComplexTypeFormatter.java:831)
import org.dmd.templates.shared.generated.types.DmcTypeCardinalityEnumSTATIC;             // Internally generated type - (NewComplexTypeFormatter.java:856)
import org.dmd.templates.shared.generated.types.DmcTypeContainedElementREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:856)



@SuppressWarnings("serial")
/**
 * The Contains class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:133)
 */
public class Contains implements Serializable {

    final static int requiredParts = 2;

    // The number of times a contained Section will occur.
    CardinalityEnum occurencesV;

    final static DmcAttributeInfo occurencesAI = new DmcAttributeInfo("occurences",0,"CardinalityEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The Section or ExtensionHook being referenced.
    ContainedElementREF elementV;

    final static DmcAttributeInfo elementAI = new DmcAttributeInfo("element",0,"ContainedElement",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public Contains(){
    }

    /**
     * Copy constructor.
     */
    public Contains(Contains original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:794)
        occurencesV =  original.occurencesV;
        elementV =  original.elementV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:164)
     */
    public Contains(CardinalityEnum occurences_, ContainedElementREF element_) throws DmcValueException {
        occurencesV = DmcTypeCardinalityEnumSTATIC.instance.typeCheck(occurences_);
        elementV = DmcTypeContainedElementREFSTATIC.instance.typeCheck(element_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:237)
     */
    public Contains(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:245)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: Contains"));

        occurencesV = DmcTypeCardinalityEnumSTATIC.instance.typeCheck(nvp.get(0).getValue());
        elementV = DmcTypeContainedElementREFSTATIC.instance.typeCheck(nvp.get(1).getValue());
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        dos.writeUTF(toString());
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        initialize(dis.readUTF());
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:344)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(occurencesV.toString());
        sb.append(' ');
        sb.append(elementV.toString());
        return(sb.toString());
    }

    public CardinalityEnum getOccurences(){
        return(occurencesV);
    }

    public ContainedElementREF getElement(){
        return(elementV);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:452)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((elementV != null) && (!elementV.isResolved())){
            obj = resolver.findNamedObject(elementV.getObjectName());
            if (elementAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + elementV.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)elementV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)elementV).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:501)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((elementV != null) && (!elementV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, elementV.getObjectName(), ncr, elementAI);
            if (elementAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + elementV.getObjectName() + " via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)elementV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)elementV).setObject(obj);
        
            if (DmcOmni.instance().backRefTracking()){
                Modifier backrefMod = new Modifier("element", object, elementV);
                if (obj instanceof DmcContainerIF)
                    ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                else
                    ((DmcObject)obj).addBackref(backrefMod);
                elementV.setBackrefModifier(backrefMod);
            }
        }
        
    }

}
