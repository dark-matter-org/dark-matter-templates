package org.dmd.templates.server.extended;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TemplateTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Generator running from: " + workingDir);
	}
	
	@Test
	public void testBasic(){
		String[] args = { "-workspace", workingDir,
				"-srcdir", "test/org/dmd/gpb/tools/generation", "src/org/dmd/gpb/base",
		};
		
		
		
	}
}
