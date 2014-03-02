package org.dmd.templates.tools.xml;

import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class XmlAnalyzerTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("\n\n*** Analyzer running from: " + workingDir);
	}
	
	@Test
	public void testDocType01() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/01-doc-type-error.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		try{
			analyzer.parse(infn,true);
			assertEquals("Should have throw an exception", true, false);
		}
		catch(ResultException ex){
			System.out.println("Got expected exception:\n" + ex.toString() + "\n\n");
		}
				
	}

	@Test
	public void testDocType02() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/02-doc-type.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		analyzer.parse(infn,true);
		
		assertNotNull("Declaration shouldn't be null", analyzer.getDeclaration());
		
	}

	@Test
	public void testDocType03() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/03-malformed-start-tag.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		try{
			analyzer.parse(infn,true);
			assertEquals("Should have throw an exception", true, false);
		}
		catch(ResultException ex){
			System.out.println("Got expected exception:\n" + ex.toString() + "\n\n");
		}
				
	}

	@Test
	public void testDocType04() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/04-bad-tag-name.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		try{
			analyzer.parse(infn,true);
			assertEquals("Should have throw an exception", true, false);
		}
		catch(ResultException ex){
			System.out.println("Got expected exception:\n" + ex.toString() + "\n\n");
		}
				
	}

	@Test
	public void testDocType05() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/05-bad-tag-name.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		try{
			analyzer.parse(infn,true);
			assertEquals("Should have throw an exception", true, false);
		}
		catch(ResultException ex){
			System.out.println("Got expected exception:\n" + ex.toString() + "\n\n");
		}
				
	}

	@Test
	public void testDocType06() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/06-bad-tag-termination.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		try{
			analyzer.parse(infn,true);
			assertEquals("Should have throw an exception", true, false);
		}
		catch(ResultException ex){
			System.out.println("Got expected exception:\n" + ex.toString() + "\n\n");
		}
				
	}

	@Test
	public void testDocType07() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/07-bad-start-tag.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		try{
			analyzer.parse(infn,true);
			assertEquals("Should have throw an exception", true, false);
		}
		catch(ResultException ex){
			System.out.println("Got expected exception:\n" + ex.toString() + "\n\n");
		}
				
	}

	@Test
	public void testDocType08() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/08-single-empty-element.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		analyzer.parse(infn,true);
		
		assertNotNull("Declaration shouldn't be null", analyzer.getDeclaration());
			
		assertEquals("Elements should be 1", 1, analyzer.getTopElements().size());
		
		assertEquals("Element should be empty", true, analyzer.getTopElements().get(0).isEmpty());
	}

	@Test
	public void testDocType09() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/09-single-empty-element.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		analyzer.parse(infn,true);
		
		assertNotNull("Declaration shouldn't be null", analyzer.getDeclaration());
			
		assertEquals("Elements should be 1", 1, analyzer.getTopElements().size());
		
		assertEquals("Element should be empty", true, analyzer.getTopElements().get(0).isEmpty());
	}

	@Test
	public void testDocType10() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/10-single-empty-element.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		analyzer.parse(infn,true);
		
		assertNotNull("Declaration shouldn't be null", analyzer.getDeclaration());
			
		assertEquals("Elements should be 1", 1, analyzer.getTopElements().size());
		
		assertEquals("Element should be empty", true, analyzer.getTopElements().get(0).isEmpty());
	}

	@Test
	public void testDocType11() throws ResultException, IOException{
		String infn = workingDir +"/test/org/dmd/templates/tools/xml/files/11-simple-ok.xml";
		
		XmlAnalyzer analyzer = new XmlAnalyzer();
		
		analyzer.parse(infn,true);
		
		assertNotNull("Declaration shouldn't be null", analyzer.getDeclaration());
			
		assertEquals("Elements should be 1", 1, analyzer.getTopElements().size());
		
		assertEquals("Top element should have one sub element", 1, analyzer.getTopElements().get(0).subElementCount());
	}


}
