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
import java.io.Serializable;                                    // To prevent serialization warnings - (NewComplexTypeFormatter.java:83)
import java.util.ArrayList;                                     // To store NameValuePairs - (NewComplexTypeFormatter.java:90)
import org.dmd.dmc.DmcAttributeInfo;                            // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:88)
import org.dmd.dmc.DmcInputStreamIF;                            // Standard serialization techniques - (NewComplexTypeFormatter.java:84)
import org.dmd.dmc.DmcOutputStreamIF;                           // Standard serialization techniques - (NewComplexTypeFormatter.java:85)
import org.dmd.dmc.DmcValueException;                           // Standard value exception - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.util.ComplexTypeSplitter;                    // For parsing initial input - (NewComplexTypeFormatter.java:89)
import org.dmd.dmc.util.NameValuePair;                          // To store values parsed from initial input - (NewComplexTypeFormatter.java:91)
import org.dmd.dms.generated.enums.DataTypeEnum;                // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:86)
import org.dmd.dms.generated.enums.ValueTypeEnum;               // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:87)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;         // Standard type - (NewComplexTypeFormatter.java:637)



@SuppressWarnings("serial")
/**
 * The Value class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:118)
 */
public class Value implements Serializable {

    final static int requiredParts = 2;

    // The name of the value that can be inserted into a Template
    String valueNameV;

    final static DmcAttributeInfo valueNameAI = new DmcAttributeInfo("valueName",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A description of the value.
    String descriptionV;

    final static DmcAttributeInfo descriptionAI = new DmcAttributeInfo("description",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public Value(){
    }

    /**
     * Copy constructor.
     */
    public Value(Value original){
        valueNameV = original.valueNameV;
        descriptionV = original.descriptionV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:147)
     */
    public Value(String valueName_, String description_) throws DmcValueException {
        valueNameV = DmcTypeStringSTATIC.instance.typeCheck(valueName_);
        descriptionV = DmcTypeStringSTATIC.instance.typeCheck(description_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:195)
     */
    public Value(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:203)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<NameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: Value"));

        valueNameV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        descriptionV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(1).getValue());
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
        sb.append(valueNameV.toString());
        sb.append(' ');
        sb.append("\"" + descriptionV.toString() + "\"");
        return(sb.toString());
    }

    public String getValueName(){
        return(valueNameV);
    }

    public String getDescription(){
        return(descriptionV);
    }

}
