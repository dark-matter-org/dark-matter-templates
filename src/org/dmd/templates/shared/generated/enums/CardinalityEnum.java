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
package org.dmd.templates.shared.generated.enums;

import java.util.*;

import org.dmd.dmc.DmcEnumIF;

/**
 * The CardinalityEnum indicates whether a Section will exist one or many
 * times within another Section,\n or whther the Section is static and always
 * added automatically.
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:100)
 */
public enum CardinalityEnum implements DmcEnumIF
{
    ONE(0,"Indicates that a section may appear once. You have to manually add the Section."),

    MANY(1,"Indicates that a section will appear many times."),

    STATIC(2,"Indicates that a section is static and will be automatically added.");

    // Maps our integer value to the enumeration value
    private static final Map<Integer,CardinalityEnum> lookup = new HashMap<Integer,CardinalityEnum>();

    static {
        for(CardinalityEnum s : EnumSet.allOf(CardinalityEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,CardinalityEnum> lookupString = new HashMap<String, CardinalityEnum>();

    static {
        for(CardinalityEnum s : EnumSet.allOf(CardinalityEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    // Our current display value as a String
    private String dval;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private CardinalityEnum(int i, String d){
        ival = i;
        dval = d;
    }

    /**
     * Returns the value of this enum value as an int.
     */
    public int intValue(){
        return(ival);
    }

    /**
     * Returns the display value of this enum value as a String.
     */
    public String displayValue(){
        return(dval);
    }

    /**
     * Returns the enum value of the specified int or null if it's not valid.
     */
    public static CardinalityEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static CardinalityEnum get(String str) {
        return(lookupString.get(str.toUpperCase()));
    }

}