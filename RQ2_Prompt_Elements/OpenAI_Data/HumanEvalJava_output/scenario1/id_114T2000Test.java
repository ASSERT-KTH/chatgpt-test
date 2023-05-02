// MinsubarraysumTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

	/**
	* Test case 1.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test1() {
		List<Object> nums = List.of(1, 2, 3, 4, 5);
		long expected = 1;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test2() {
		List<Object> nums = List.of(1, 2, 3, 4, -5);
		long expected = -5;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test3() {
		List<Object> nums = List.of(1, 2, 3, -4, 5);
		long expected = -4;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test4() {
		List<Object> nums = List.of(1, 2, -3, 4, 5);
		long expected = -3;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test5() {
		List<Object> nums = List.of(1, -2, 3, 4, 5);
		long expected = -2;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test6() {
		List<Object> nums = List.of(-1, 2, 3, 4, 5);
		long expected = -1;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test7() {
		List<Object> nums = List.of(1, 2, 3, 4, -5, -6, -7, -8, -9, -10);
		long expected = -55;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test8() {
		List<Object> nums = List.of(1, 2, 3, 4, -5, -6, -7, -8, -9, -10, 11, 12, 13, 14, 15);
		long expected = -55;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test9() {
		List<Object> nums = List.of(1, 2, 3, 4, -5, -6, -7, -8, -9, -10, 11, 12, 13, 14, -15);
		long expected = -55;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input is a list of integers.
	* The expected output is the minimum sum of a subarray.
	*/
	@Test
	void test10() {
		List<Object> nums = List.of(1, 2, 3, 4, -5, -6, -7, -8, -9, -10, 11, 12, 13, -14, 15);
		long expected = -55;
		long actual = Minsubarraysum.minsubarraysum(nums);
		assertEquals(expected, actual);
	}
}