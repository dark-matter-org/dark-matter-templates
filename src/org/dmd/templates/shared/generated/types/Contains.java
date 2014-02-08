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
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:111)
import java.io.Serializable;                                                          // To prevent serialization warnings - (NewComplexTypeFormatter.java:83)
import java.util.ArrayList;                                                           // To store NameValuePairs - (NewComplexTypeFormatter.java:90)
import org.dmd.dmc.DmcAttributeInfo;                                                  // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:88)
import org.dmd.dmc.DmcContainerIF;                                                    // To support object references - (NewComplexTypeFormatter.java:97)
import org.dmd.dmc.DmcInputStreamIF;                                                  // Standard serialization techniques - (NewComplexTypeFormatter.java:84)
import org.dmd.dmc.DmcNameClashResolverIF;                                            // To support possible clashing object references - (NewComplexTypeFormatter.java:101)
import org.dmd.dmc.DmcNameResolverIF;                                                 // To support object references - (NewComplexTypeFormatter.java:94)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                 // To support possible clashing object references - (NewComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcNamedObjectIF;                                                  // To support object references - (NewComplexTypeFormatter.java:95)
import org.dmd.dmc.DmcNamedObjectREF;                                                 // To support object references - (NewComplexTypeFormatter.java:96)
import org.dmd.dmc.DmcObject;                                                         // To support possible clashing object references - (NewComplexTypeFormatter.java:102)
import org.dmd.dmc.DmcOutputStreamIF;                                                 // Standard serialization techniques - (NewComplexTypeFormatter.java:85)
import org.dmd.dmc.DmcValueException;                                                 // Standard value exception - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.DmcValueExceptionSet;                                              // To support possible clashing object references - (NewComplexTypeFormatter.java:103)
import org.dmd.dmc.util.ComplexTypeSplitter;                                          // For parsing initial input - (NewComplexTypeFormatter.java:89)
import org.dmd.dmc.util.NameValuePair;                                                // To store values parsed from initial input - (NewComplexTypeFormatter.java:91)
import org.dmd.dms.generated.enums.DataTypeEnum;                                      // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:86)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                     // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:87)
import org.dmd.templates.shared.generated.enums.CardinalityEnum;                      // Primitive type - (NewComplexTypeFormatter.java:620)
import org.dmd.templates.shared.generated.types.DmcTypeCardinalityEnumSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:637)
import org.dmd.templates.shared.generated.types.DmcTypeSectionREFSTATIC;              // Internally generated type - (NewComplexTypeFormatter.java:637)
import org.dmd.templates.shared.generated.types.SectionREF;                           // Object reference - (NewComplexTypeFormatter.java:612)



@SuppressWarnings("serial")
/**
 * The Contains class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:118)
 */
public class Contains implements Serializable {

    final static int requiredParts = 2;

    // The number of times a contained Section will occur.
    CardinalityEnum occurencesV;

    final static DmcAttributeInfo occurencesAI = new DmcAttributeInfo("occurences",0,"CardinalityEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The Section being referenced.
    SectionREF sectionV;

    final static DmcAttributeInfo sectionAI = new DmcAttributeInfo("section",0,"Section",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public Contains(){
    }

    /**
     * Copy constructor.
     */
    public Contains(Contains original){
        occurencesV = original.occurencesV;
        sectionV = original.sectionV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:147)
     */
    public Contains(CardinalityEnum occurences_, SectionREF section_) throws DmcValueException {
        occurencesV = DmcTypeCardinalityEnumSTATIC.instance.typeCheck(occurences_);
        sectionV = DmcTypeSectionREFSTATIC.instance.typeCheck(section_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:195)
     */
    public Contains(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:203)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<NameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: Contains"));

        occurencesV = DmcTypeCardinalityEnumSTATIC.instance.typeCheck(nvp.get(0).getValue());
        sectionV = DmcTypeSectionREFSTATIC.instance.typeCheck(nvp.get(1).getValue());
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:281)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(occurencesV.toString());
        sb.append(' ');
        sb.append("\"" + sectionV.toString() + "\"");
        return(sb.toString());
    }

    public CardinalityEnum getOccurences(){
        return(occurencesV);
    }

    public SectionREF getSection(){
        return(sectionV);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:347)
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((sectionV != null) && (!sectionV.isResolved())){
            obj = resolver.findNamedObject(sectionV.getObjectName());
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + sectionV.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)sectionV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)sectionV).setObject(obj);
        }
        
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:371)
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((sectionV != null) && (!sectionV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, sectionV.getObjectName(), ncr, sectionAI);
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + sectionV.getObjectName() + " via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)sectionV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)sectionV).setObject(obj);
        }
        
    }

}
