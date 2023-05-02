// ByLengthTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

	@Test
	void testByLength() {
		List<Object> arr = List.of(2, 1, 1, 4, 5, 8, 2, 3);
		List<Object> expected = List.of("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthEmpty() {
		List<Object> arr = List.of();
		List<Object> expected = List.of();
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber() {
		List<Object> arr = List.of(1, -1, 55);
		List<Object> expected = List.of("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength1() {
		List<Object> arr = List.of(1, -1, 3, 2);
		List<Object> expected = List.of("Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength2() {
		List<Object> arr = List.of(9, 4, 8);
		List<Object> expected = List.of("Nine", "Eight", "Four");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength3() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Object> expected = List.of("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength4() {
		List<Object> arr = List.of(9, 8, 7, 6, 5, 4, 3, 2, 1);
		List<Object> expected = List.of("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength5() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Object> expected = List.of("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength6() {
		List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		List<Object> expected = List.of("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength7() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		List<Object> expected = List.of("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength8() {
		List<Object> arr = List.of(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		List<Object> expected = List.of("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength9() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		List<Object> expected = List.of("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLength10() {
		List<Object> arr = List.of(12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		List<Object> expected = List.of("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
		assertEquals(expected, ByLength.byLength(arr));
	}
}