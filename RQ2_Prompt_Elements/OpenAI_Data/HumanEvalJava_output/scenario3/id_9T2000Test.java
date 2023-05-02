// RollingMaxTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

	@Test
	void testRollingMax() {
		List<Object> numbers = List.of(1, 2, 3, 2, 3, 4, 2);
		List<Object> expected = List.of(1, 2, 3, 3, 3, 4, 4);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxEmpty() {
		List<Object> numbers = List.of();
		List<Object> expected = List.of();
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxAscending() {
		List<Object> numbers = List.of(1, 2, 3, 4);
		List<Object> expected = List.of(1, 2, 3, 4);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxDescending() {
		List<Object> numbers = List.of(4, 3, 2, 1);
		List<Object> expected = List.of(4, 4, 4, 4);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxPeaks() {
		List<Object> numbers = List.of(3, 2, 3, 100, 3);
		List<Object> expected = List.of(3, 3, 3, 100, 100);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxOneElement() {
		List<Object> numbers = List.of(1);
		List<Object> expected = List.of(1);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxTwoElements() {
		List<Object> numbers = List.of(1, 2);
		List<Object> expected = List.of(1, 2);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxTwoElementsDescending() {
		List<Object> numbers = List.of(2, 1);
		List<Object> expected = List.of(2, 2);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxTwoElementsSame() {
		List<Object> numbers = List.of(1, 1);
		List<Object> expected = List.of(1, 1);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxTwoElementsSameDescending() {
		List<Object> numbers = List.of(1, 1);
		List<Object> expected = List.of(1, 1);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
}