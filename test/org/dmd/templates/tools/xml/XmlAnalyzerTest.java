package org.dmd.templates.tools.xml;

import java.io.File;
import java.io.IOException;

import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class XmlAnalyzerTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Analyzer running from: " + workingDir);
	}
	
	@Test
	public void simpleElementTest01() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/template/tools/xml/files/01.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		analyzer.parse(infn);
		
		
	}

}
