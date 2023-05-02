// StrongestExtensionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {

	/**
	* Test case 1.
	* The method should return "A.B" when the class name is "A" and the extensions are "B", "C", "D".
	*/
	@Test
	void testCase1() {
		String className = "A";
		List<String> extensions = List.of("B", "C", "D");
		String expected = "A.B";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The method should return "A.B" when the class name is "A" and the extensions are "b", "c", "d".
	*/
	@Test
	void testCase2() {
		String className = "A";
		List<String> extensions = List.of("b", "c", "d");
		String expected = "A.b";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The method should return "A.B" when the class name is "A" and the extensions are "b", "C", "d".
	*/
	@Test
	void testCase3() {
		String className = "A";
		List<String> extensions = List.of("b", "C", "d");
		String expected = "A.C";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The method should return "A.B" when the class name is "A" and the extensions are "b", "C", "D".
	*/
	@Test
	void testCase4() {
		String className = "A";
		List<String> extensions = List.of("b", "C", "D");
		String expected = "A.C";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The method should return "A.B" when the class name is "A" and the extensions are "B", "C", "d".
	*/
	@Test
	void testCase5() {
		String className = "A";
		List<String> extensions = List.of("B", "C", "d");
		String expected = "A.B";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The method should return "A.B" when the class name is "A" and the extensions are "B", "c", "d".
	*/
	@Test
	void testCase6() {
		String className = "A";
		List<String> extensions = List.of("B", "c", "d");
		String expected = "A.B";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The method should return "A.B" when the class name is "A" and the extensions are "b", "c", "D".
	*/
	@Test
	void testCase7() {
		String className = "A";
		List<String> extensions = List.of("b", "c", "D");
		String expected = "A.D";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The method should return "A.B" when the class name is "A" and the extensions are "B", "c", "D".
	*/
	@Test
	void testCase8() {
		String className = "A";
		List<String> extensions = List.of("B", "c", "D");
		String expected = "A.B";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The method should return "A.B" when the class name is "A" and the extensions are "b", "C", "D".
	*/
	@Test
	void testCase9() {
		String className = "A";
		List<String> extensions = List.of("b", "C", "D");
		String expected = "A.C";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The method should return "A.B" when the class name is "A" and the extensions are "B", "C", "D".
	*/
	@Test
	void testCase10() {
		String className = "A";
		List<String> extensions = List.of("B", "C", "D");
		String expected = "A.B";
		String actual = StrongestExtension.strongestExtension(className, extensions);
		assertEquals(expected, actual);
	}
}