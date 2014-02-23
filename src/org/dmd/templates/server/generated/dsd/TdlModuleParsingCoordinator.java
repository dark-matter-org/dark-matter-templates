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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:803)
import java.io.IOException;                                                        // If we run it to problems finding configs - (DSDArtifactFormatter.java:763)
import java.util.ArrayList;                                                        // To handle lists of things - (DSDArtifactFormatter.java:765)
import java.util.Iterator;                                                         // To iterate over collections - (DSDArtifactFormatter.java:764)
import java.util.TreeMap;                                                          // To handle loaded configs - (DSDArtifactFormatter.java:766)
import org.dmd.dmc.DmcNameClashException;                                          // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:771)
import org.dmd.dmc.DmcValueException;                                              // To handle exceptions from value handling - (DSDArtifactFormatter.java:770)
import org.dmd.dmc.DmcValueExceptionSet;                                           // May occur when resolving objects - (DSDArtifactFormatter.java:778)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                      // In case we have rule failures - (DSDArtifactFormatter.java:773)
import org.dmd.dmc.types.DefinitionName;                                           // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:768)
import org.dmd.dms.DSDefinition;                                                   // The common base for all modules - so that we can get error location info - (DSDArtifactFormatter.java:769)
import org.dmd.dmv.shared.DmvRuleManager;                                          // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:780)
import org.dmd.templates.server.extended.TdlModule;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:792)
import org.dmd.templates.server.generated.dsd.TdlModuleDefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:783)
import org.dmd.templates.server.generated.dsd.TdlModuleGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:786)
import org.dmd.templates.server.generated.dsd.TdlModuleParser;                     // Required to parse TdlModule definitions - (DSDArtifactFormatter.java:796)
import org.dmd.templates.shared.generated.dmo.DmtdlDMSAG;                          // To allow loading of rules from the dmtdl schema - (DSDArtifactFormatter.java:798)
import org.dmd.templates.shared.generated.types.TdlModuleREF;                      // To access references to TdlModule - (DSDArtifactFormatter.java:794)
import org.dmd.util.exceptions.ResultException;                                    // To handle processing exceptions - (DSDArtifactFormatter.java:772)
import org.dmd.util.parsing.ConfigFinder;                                          // Finds configs we may need to parse - (DSDArtifactFormatter.java:775)
import org.dmd.util.parsing.ConfigLocation;                                        // Handle to a discovered configuration - (DSDArtifactFormatter.java:776)
import org.dmd.util.parsing.ConfigVersion;                                         // Handle to a particular config version - (DSDArtifactFormatter.java:777)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:807)
/**
 * The parsing coordinator will find all config files associated with the TdlModule DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class TdlModuleParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:814)
    DmvRuleManager                            rules                     = new DmvRuleManager();                           // Rule manager
    TdlModuleDefinitionManager                definitions               = new TdlModuleDefinitionManager();               // Maintains all parsed definitions
    TdlModuleGeneratorInterface               generator;                                                                  // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>           loadedConfigs             = new TreeMap<String, ModuleInfoBase>();          // Stores all loaded configs based on the name of the file that was parsed.
    TdlModuleParser                           parserForTdlModule;                                                         // Parser for TdlModule definitions
    ConfigFinder                              finderForTdlModule        = new ConfigFinder("dmtdl");                      // Config finder for TdlModule config files ending with .dmtdl
    TreeMap<DefinitionName, TdlModuleInfo>    loadedTdlModuleConfigs    = new TreeMap<DefinitionName, TdlModuleInfo>();   // The names/location of the TdlModule modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:816)
    public TdlModuleParsingCoordinator(TdlModuleGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

        rules.loadRules(DmtdlDMSAG.instance());
        parserForTdlModule = new TdlModuleParser(definitions, rules);
        finderForTdlModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForTdlModule.findConfigs();

    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:868)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        ConfigVersion version = finderForTdlModule.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        TdlModule loaded = loadTdlModuleModule(location);
        
        if (location.isFromJAR()){
            ResultException ex = new ResultException("We can't run generation for a config loaded from a JAR: " + configName);
            ex.moreMessages(location.toString());
            throw(ex);
        }
        
        generator.parsingComplete(loaded, location, definitions);
        
        definitions.resolveReferences();
        
        generator.generate(loaded,location,definitions);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:894)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
        TdlModule loaded = null;
        TdlModuleInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForTdlModule.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (TdlModuleInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = loadTdlModuleModule(location);
            }
            else{
                loaded = loadedInfo.module;
            }

            generator.parsingComplete(loaded, location, definitions);

            definitions.resolveReferences();

            if (!location.isFromJAR())
                generator.generate(loaded,location,definitions);

        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:931)
    TdlModule loadTdlModuleModule(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        TdlModuleInfo info = loadedTdlModuleConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        TdlModule loaded = parserForTdlModule.parseConfig(location);
        TdlModuleInfo loadedInfo = new TdlModuleInfo(loaded,location);
        loadedTdlModuleConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:949)
    void loadModuleDependencies(ModuleInfoBase mi) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

        if (mi.dependenciesLoaded)
            return;

        if (mi instanceof TdlModuleInfo){
            TdlModuleInfo info = (TdlModuleInfo)mi;
            if (info.module.getDependsOnTdlModuleHasValue()){
                Iterator<TdlModuleREF> it = info.module.getDMO().getDependsOnTdlModule();
                while(it.hasNext()){
                    TdlModuleREF ref = it.next();
                    ConfigVersion version = finderForTdlModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".dmtdl");
            
                    loadTdlModuleModule(version.getLatestVersion());
                }
            }
            info.dependenciesLoaded = true;
        }




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:979)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:985)
    void missingConfigError(DSDefinition module, String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        ex.setLocationInfo(module.getFile(), module.getLineNumber());
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:993)
    class ModuleInfoBase {
        ConfigLocation location;
        boolean        dependenciesLoaded;
    }

    class TdlModuleInfo extends ModuleInfoBase {
        TdlModule module;

        TdlModuleInfo(TdlModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}
