// SeparateParenGroupsTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups() {
		List<String> expected = new ArrayList<String>();
		expected.add("(()())");
		expected.add("((()))");
		expected.add("()");
		expected.add("((())()())");
		List<String> actual = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups2() {
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		expected.add("(())");
		expected.add("((()))");
		expected.add("(((())))");
		List<String> actual = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups3() {
		List<String> expected = new ArrayList<String>();
		expected.add("(()(())((())))");
		List<String> actual = SeparateParenGroups.separateParenGroups("(()(())((())))");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups4() {
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		List<String> actual = SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups5() {
		List<String> expected = new ArrayList<String>();
		expected.add("(()())");
		expected.add("((()))");
		expected.add("()");
		expected.add("((())()())");
		List<String> actual = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups6() {
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		expected.add("(())");
		expected.add("((()))");
		expected.add("(((())))");
		List<String> actual = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups7() {
		List<String> expected = new ArrayList<String>();
		expected.add("(()(())((())))");
		List<String> actual = SeparateParenGroups.separateParenGroups("(()(())((())))");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups8() {
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		List<String> actual = SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups9() {
		List<String> expected = new ArrayList<String>();
		expected.add("(()())");
		expected.add("((()))");
		expected.add("()");
		expected.add("((())()())");
		List<String> actual = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SeparateParenGroups#separateParenGroups(String)} method.
	* It tests the method with a string containing multiple groups of nested parentheses.
	* The method should return a list of those groups.
	*/
	@Test
	void testSeparateParenGroups10() {
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		expected.add("(())");
		expected.add("((()))");
		expected.add("(((())))");
		List<String> actual = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
		assertEquals(expected, actual);
	}
}