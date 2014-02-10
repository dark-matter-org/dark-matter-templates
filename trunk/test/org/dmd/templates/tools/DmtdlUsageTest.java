package org.dmd.templates.tools;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.templates.tools.generated.dmtdl.DmschemadocTemplateLoader;
import org.dmd.templates.tools.generated.dmtdl.SchemaDoc;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class DmtdlUsageTest {
	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Generator running from: " + workingDir);
	}

	@Test
	public void testLoading() throws ResultException, DmcValueException, DmcNameClashException, IOException, DmcRuleExceptionSet {
		ArrayList<String> paths = new ArrayList<String>();
		paths.add(workingDir + "/test/org/dmd/templates/tools");
		
		DmschemadocTemplateLoader	loader = new DmschemadocTemplateLoader(paths);
		loader.findAndLoadTemplate();
		
		SchemaDoc doc = new SchemaDoc();
		
		
		
	}
}
