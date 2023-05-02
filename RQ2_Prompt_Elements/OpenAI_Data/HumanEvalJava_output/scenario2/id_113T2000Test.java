// OddCountTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {

	/**
	* Test case 1.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase1() {
		List<String> input = new ArrayList<String>();
		input.add("12345");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase2() {
		List<String> input = new ArrayList<String>();
		input.add("1234");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 1n the str1ng 1 of the 1nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase3() {
		List<String> input = new ArrayList<String>();
		input.add("123");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 2n the str2ng 2 of the 2nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase4() {
		List<String> input = new ArrayList<String>();
		input.add("12");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 1n the str1ng 1 of the 1nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase5() {
		List<String> input = new ArrayList<String>();
		input.add("1");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 1n the str1ng 1 of the 1nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase6() {
		List<String> input = new ArrayList<String>();
		input.add("");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 0n the str0ng 0 of the 0nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase7() {
		List<String> input = new ArrayList<String>();
		input.add("123456789");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 5n the str5ng 5 of the 5nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase8() {
		List<String> input = new ArrayList<String>();
		input.add("12345678");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase9() {
		List<String> input = new ArrayList<String>();
		input.add("1234567");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains only one element.
	* The element is a string of only digits.
	* The expected result is a list with one element.
	* The element is a string that contains the number of odd digits in the input string.
	*/
	@Test
	void testCase10() {
		List<String> input = new ArrayList<String>();
		input.add("123456");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 2n the str2ng 2 of the 2nput.");
		List<String> actual = OddCount.oddCount(input);
		assertEquals(expected, actual);
	}
}