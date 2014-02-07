                                                                                                                                        package org.dmd.templates.tools.dmtdlgen;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.templates.server.extended.Section;
import org.dmd.templates.server.extended.TdlModule;
import org.dmd.templates.server.generated.dsd.TdlModuleDefinitionManager;
import org.dmd.templates.server.generated.dsd.TdlModuleGenUtility;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;

public class DmtdlGen extends TdlModuleGenUtility {

	@Override
	public void parsingComplete(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws ResultException {
		// TODO Auto-generated method stub

	}

	@Override
	public void generate(TdlModule module, ConfigLocation location, TdlModuleDefinitionManager definitions) throws IOException {
		System.out.println("HERE");
		
		FileUpdateManager.instance().generationStarting();
		
		String gendir = location.getConfigParentDirectory() + File.separator + "generated" + File.separator + "dmtdl";
		createIfRequired(gendir);
		
		Iterator<Section> sections = module.getAllSection();
		while(sections.hasNext()){
			sections.next().generateSectionClass(gendir);
		}
		
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
