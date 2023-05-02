// SBMLFilter_0Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilter_0Test {

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_0() {
		System.out.println("accept");
		File file = null;
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_1() {
		System.out.println("accept");
		File file = new File("");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_2() {
		System.out.println("accept");
		File file = new File("test/resources/test.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_3() {
		System.out.println("accept");
		File file = new File("test/resources/test.sbml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_4() {
		System.out.println("accept");
		File file = new File("test/resources/test.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_5() {
		System.out.println("accept");
		File file = new File("test/resources/test.xml.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_6() {
		System.out.println("accept");
		File file = new File("test/resources/test.sbml.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_7() {
		System.out.println("accept");
		File file = new File("test/resources/test.xml.sbml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_8() {
		System.out.println("accept");
		File file = new File("test/resources/test.sbml.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	public void testAccept_File_9() {
		System.out.println("accept");
		File file = new File("test/resources/test.sbml.xml.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
}

// SBMLFilter_1Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#getReader(String)} method.
*/
class SBMLFilter_1Test {
		
	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_0() {
		System.out.println("getReader");
		String fileName = "";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_1() {
		System.out.println("getReader");
		String fileName = "test/resources/test.xml";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_2() {
		System.out.println("getReader");
		String fileName = "test/resources/test.sbml";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_3() {
		System.out.println("getReader");
		String fileName = "test/resources/test.txt";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_4() {
		System.out.println("getReader");
		String fileName = "test/resources/test.xml.txt";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_5() {
		System.out.println("getReader");
		String fileName = "test/resources/test.sbml.txt";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_6() {
		System.out.println("getReader");
		String fileName = "test/resources/test.xml.sbml";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_7() {
		System.out.println("getReader");
		String fileName = "test/resources/test.sbml.xml";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_8() {
		System.out.println("getReader");
		String fileName = "test/resources/test.sbml.xml.txt";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader_String_9() {
		System.out.println("getReader");
		String fileName = "test/resources/test.sbml.xml.txt";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
	}
}

// SBMLFilter_2Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#getDescription()} method.
*/
class SBMLFilter_2Test {
		
	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_0() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_1() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_2() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_3() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_4() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_5() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_6() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_7() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_8() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class SBMLFilter.
	 */
	@Test
	public void testGetDescription_9() {
		System.out.println("getDescription");
		SBMLFilter instance = new SBMLFilter();
		String expResult = "SBML files";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}
}

// SBMLFilter_3Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#getExtensionList()} method.
*/
class SBMLFilter_3Test {
		
	/**
	 * Test of getExtensionList method, of class SBMLFilter.
	 */
	@Test
	public void testGetExtensionList_0() {
		System.out.println("getExtensionList");
		SBMLFilter instance = new SBMLFilter();
		String[] expResult = { "xml", "sbml" };
		String[] result = instance.getExtensionList();
		assertArrayEquals(expResult, result);
	}

	/**
	 * Test of getExtensionList method, of class SBMLFilter.
	 */
	@Test
	public void testGetExtensionList_1() {
		System.out.println("getExtensionList");
		