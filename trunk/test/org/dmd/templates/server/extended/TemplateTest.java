package org.dmd.templates.server.extended;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.templates.server.generated.DmtdlSchemaAG;
import org.dmd.templates.tools.generated.dmtdl.Header;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TemplateTest {

	@Before
	public void initialize() throws IOException, ResultException, DmcValueException, DmcNameClashException {
        SchemaManager schema = new SchemaManager();
        DmtdlSchemaAG ds = new DmtdlSchemaAG();
        schema.manageSchema(ds);
	}
	
	@Test
	public void testBasic() throws ResultException {
		
		Template t = new Template();
		t.setFile("Junit");
		t.setLineNumber(1);
		
		// No inserted names
		t.setFormat("<td> </td>");
		
		t.initialize("::");
		System.out.println("");
		
		assertEquals("Should be 1 element", 1, t.getElementCount());
		

		// One inserted name with text
		t.setFormat("<td> ::name:: </td>");
		t.initialize("::");
		System.out.println("");
		
		assertEquals("Should be 3 elements", 3, t.getElementCount());
		assertEquals("Element index 1 should be name", "name", t.getElement(1));

		// One inserted name with extraneous spaces and text
		t.setFormat("<td> ::name   :: </td>");
		t.initialize("::");
		System.out.println("");
		
		assertEquals("Should be 3 elements", 3, t.getElementCount());
		assertEquals("Element index 1 should be name", "name", t.getElement(1));

		// One inserted name with extraneous spaces and text
		t.setFormat("<td> ::\nname:: </td>");
		t.initialize("::");
		System.out.println("");
		
		assertEquals("Should be 3 elements", 3, t.getElementCount());
		assertEquals("Element index 1 should be name", "name", t.getElement(1));

		// Two inserted names
		t.setFormat("<td> ::name:: </td> ::name2::");
		t.initialize("::");
		System.out.println("");
		
		assertEquals("Should be 4 elements", 4, t.getElementCount());
		assertEquals("Element index 1 should be name", "name", t.getElement(1));
		assertEquals("Element index 3 should be name", "name2", t.getElement(3));

		// One inserted name with no text
		
		t.setFormat("::name::");
		t.initialize("::");
		System.out.println("");
		
		assertEquals("Should be 1 element", 1, t.getElementCount());
		assertEquals("Element index 0 should be name", "name", t.getElement(0));
		
		// Missing marker
		try{
			t.setFormat("<td> ::name: </td>");
			t.initialize("::");
			assertEquals("Should have been an exception", "name", t.getElement(0));
		}
		catch (Exception e) {
			System.out.println("Expected exception:");
			System.out.println(e.toString());
		}
	}
	
	@Test
	public void testWithSection() throws ResultException {
		Header header = new Header("meta");
		Template t = new Template();
		t.setFile("Junit");
		t.setLineNumber(1);
		
		// No inserted names
		t.setFormat("<title> The ::schemaName:: Schema </title>");
		t.initialize("::");
		
		
		
	}
	
}
