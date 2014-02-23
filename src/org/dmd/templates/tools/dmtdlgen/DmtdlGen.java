                                                                                                                                        package org.dmd.templates.tools.dmtdlgen;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.templates.server.extended.ContainedElement;
import org.dmd.templates.server.extended.ExtensionHook;
import org.dmd.templates.server.extended.Section;
import org.dmd.templates.server.extended.TdlModule;
import org.dmd.templates.server.extended.TextualArtifact;
import org.dmd.templates.server.generated.dmw.ContainsIterableDMW;
import org.dmd.templates.server.generated.dsd.TdlModuleDefinitionManager;
import org.dmd.templates.server.generated.dsd.TdlModuleGenUtility;
import org.dmd.templates.shared.generated.types.Contains;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;

public class DmtdlGen extends TdlModuleGenUtility {

	@Override
	public void parsingComplete(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws ResultException {
		onlySectionsInArtifact(module);
	}
	
	/**
	 * Checks that TextualArtifacts only refer to Sections, not ExtensionHooks.
	 * @param module
	 * @throws ResultException
	 */
	void onlySectionsInArtifact(TdlModule module) throws ResultException{
		ResultException ex = null;

		Iterator<TextualArtifact> artifacts = module.getAllTextualArtifact();
		while(artifacts.hasNext()){
			TextualArtifact artifact = artifacts.next();
			ContainsIterableDMW it = artifact.getContainsIterable();
			while(it.hasNext()){
    			Contains c = it.getNext();
    			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
    			
    			if (ce instanceof ExtensionHook){
    				if (ex == null)
    					ex = new ResultException();
    				ex.addError("ExtensionHook: " + ce.getName() + " can only be used in Sections, not TextualArtifacts");
    			}
			}
			if (ex != null){
				ex.setLocationInfo(artifact.getFile(), artifact.getLineNumber());
				throw(ex);
			}
		}
	}

	@Override
	public void generate(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws IOException {
		System.out.println("HERE");
		
		FileUpdateManager.instance().generationStarting();
		
		String gendir = location.getConfigParentDirectory() + File.separator + "generated" + File.separator + "dmtdl";
		createIfRequired(gendir);
		
		Iterator<TextualArtifact> artifacts = module.getAllTextualArtifact();
		while(artifacts.hasNext()){
			artifacts.next().generateTextualArtifactClass(gendir);
		}
		
		Iterator<Section> sections = module.getAllSection();
		while(sections.hasNext()){
			sections.next().generateSectionClass(gendir);
		}
		
		module.generateTemplateLoader(gendir);
		
		FileUpdateManager.instance().generationComplete();
	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub

	}

	/**
	 * Creates the specified directory is it doesn't already exist.
	 */
	protected void createIfRequired(String outdir){
		if (outdir == null)
			return;
		
		File dir = new File(outdir);
		if (!dir.exists())
			dir.mkdirs();
	}


}
