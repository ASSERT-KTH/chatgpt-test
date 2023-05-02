// Maximum1Test.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

	/**
	* Test case 1:
	* Input: arr = [1, 2, 3, 4, 5], k = 2
	* Expected output: [4, 5]
	*/
	@Test
	void testCase1() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = 2;
		List<Object> expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(5);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2:
	* Input: arr = [1, 2, 3, 4, 5], k = 3
	* Expected output: [3, 4, 5]
	*/
	@Test
	void testCase2() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = 3;
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(4);
		expected.add(5);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3:
	* Input: arr = [1, 2, 3, 4, 5], k = 5
	* Expected output: [1, 2, 3, 4, 5]
	*/
	@Test
	void testCase3() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = 5;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4:
	* Input: arr = [1, 2, 3, 4, 5], k = 6
	* Expected output: [1, 2, 3, 4, 5]
	*/
	@Test
	void testCase4() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = 6;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5:
	* Input: arr = [1, 2, 3, 4, 5], k = 0
	* Expected output: []
	*/
	@Test
	void testCase5() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = 0;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6:
	* Input: arr = [], k = 2
	* Expected output: []
	*/
	@Test
	void testCase6() {
		List<Integer> arr = new ArrayList<Integer>();
		int k = 2;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7:
	* Input: arr = [1, 2, 3, 4, 5], k = -1
	* Expected output: []
	*/
	@Test
	void testCase7() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = -1;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8:
	* Input: arr = [1, 2, 3, 4, 5], k = 1
	* Expected output: [5]
	*/
	@Test
	void testCase8() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = 1;
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9:
	* Input: arr = [1, 2, 3, 4, 5], k = -2
	* Expected output: []
	*/
	@Test
	void testCase9() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = -2;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10:
	* Input: arr = [1, 2, 3, 4, 5], k = -5
	* Expected output: []
	*/
	@Test
	void testCase10() {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k = -5;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
}