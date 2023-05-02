// Maximum1Test.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

	@Test
	void testMaximum1() {
		List<Integer> arr = Arrays.asList(-3, -4, 5);
		List<Object> res = Maximum1.maximum(arr, 3);
		List<Object> expected = Arrays.asList(-4, -3, 5);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum2() {
		List<Integer> arr = Arrays.asList(4, -4, 4);
		List<Object> res = Maximum1.maximum(arr, 2);
		List<Object> expected = Arrays.asList(4, 4);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum3() {
		List<Integer> arr = Arrays.asList(-3, 2, 1, 2, -1, -2, 1);
		List<Object> res = Maximum1.maximum(arr, 1);
		List<Object> expected = Arrays.asList(2);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum4() {
		List<Integer> arr = Arrays.asList(123, -123, 20, 0, 1, 2, -3);
		List<Object> res = Maximum1.maximum(arr, 3);
		List<Object> expected = Arrays.asList(2, 20, 123);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum5() {
		List<Integer> arr = Arrays.asList(-123, 20, 0, 1, 2, -3);
		List<Object> res = Maximum1.maximum(arr, 4);
		List<Object> expected = Arrays.asList(0, 1, 2, 20);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum6() {
		List<Integer> arr = Arrays.asList(5, 15, 0, 3, -13, -8, 0);
		List<Object> res = Maximum1.maximum(arr, 7);
		List<Object> expected = Arrays.asList(-13, -8, 0, 0, 3, 5, 15);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum7() {
		List<Integer> arr = Arrays.asList(-1, 0, 2, 5, 3, -10);
		List<Object> res = Maximum1.maximum(arr, 2);
		List<Object> expected = Arrays.asList(3, 5);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum8() {
		List<Integer> arr = Arrays.asList(1, 0, 5, -7);
		List<Object> res = Maximum1.maximum(arr, 1);
		List<Object> expected = Arrays.asList(5);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum9() {
		List<Integer> arr = Arrays.asList(4, -4);
		List<Object> res = Maximum1.maximum(arr, 2);
		List<Object> expected = Arrays.asList(-4, 4);
		assertEquals(expected, res);
	}
	
	@Test
	void testMaximum10() {
		List<Integer> arr = Arrays.asList(-10, 10);
		List<Object> res = Maximum1.maximum(arr, 2);
		List<Object> expected = Arrays.asList(-10, 10);
		assertEquals(expected, res);
	}
}