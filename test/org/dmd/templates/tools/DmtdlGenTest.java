package org.dmd.templates.tools;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.templates.tools.dmtdlgen.DmtdlGen;
import org.dmd.templates.tools.generated.dmtdl.DmschemadocTemplateLoader;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class DmtdlGenTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Generator running from: " + workingDir);
	}
	
	@Test
	public void testBasic() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
		String[] args = { "-workspace", workingDir,
				"-srcdir", "test/org/dmd/templates/tools/dmconfig"
		};
		
		DmtdlGen util = new DmtdlGen();
		
		util.run(args);
		
	}
}
