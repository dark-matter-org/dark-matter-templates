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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:401)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:398)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:163)
import org.dmd.templates.server.extended.Section;                 // A definition from the TdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.templates.server.extended.TdlDefinition;           // A definition from the TdlModule Module - (DSDefinitionModule.java:161)
import org.dmd.templates.server.extended.TextualArtifact;         // A definition from the TdlModule Module - (DSDefinitionModule.java:174)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:405)
/**
 * This interface is implemented by the generated wrapper class for the TdlModule module.
 */
public interface TdlModuleScopedInterface {

    public int getTdlDefinitionCount();
    public TdlDefinition getTdlDefinition(DotName name);
    public Iterator<TdlDefinition> getAllTdlDefinition();

    public void addSection(Section def);
    public int getSectionCount();
    public Section getSection(DotName name);
    public Iterator<Section> getAllSection();

    public void addTextualArtifact(TextualArtifact def);
    public int getTextualArtifactCount();
    public TextualArtifact getTextualArtifact(DotName name);
    public Iterator<TextualArtifact> getAllTextualArtifact();

}

