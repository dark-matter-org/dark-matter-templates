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
package org.dmd.templates.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.templates.shared.generated.types.TdlModuleREF;

import org.dmd.templates.shared.generated.dmo.TdlModuleDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TdlModule
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:583)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTdlModuleREF extends DmcTypeNamedObjectREF<TdlModuleREF, DefinitionName> {

    public DmcTypeTdlModuleREF(){
    
    }

    public DmcTypeTdlModuleREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TdlModuleREF getNewHelper(){
        return(new TdlModuleREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( TdlModuleDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TdlModuleDMO)
            return(true);
        return(false);
    }

    @Override
    protected TdlModuleREF typeCheck(Object value) throws DmcValueException {
        TdlModuleREF rc = null;

        if (value instanceof TdlModuleREF)
            rc = (TdlModuleREF)value;
        else if (value instanceof TdlModuleDMO)
            rc = new TdlModuleREF((TdlModuleDMO)value);
        else if (value instanceof DefinitionName)
            rc = new TdlModuleREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new TdlModuleREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TdlModuleREF, TdlModuleDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TdlModuleREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TdlModuleREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TdlModuleREF rc = new TdlModuleREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TdlModuleREF cloneValue(TdlModuleREF value){
        return(new TdlModuleREF(value));
    }



}
