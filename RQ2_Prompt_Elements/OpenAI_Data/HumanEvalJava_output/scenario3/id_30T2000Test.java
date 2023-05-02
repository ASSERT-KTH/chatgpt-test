// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

	@Test
	void testGetPositive() {
		List<Object> l = List.of(-1, 2, -4, 5, 6);
		List<Object> expected = List.of(2, 5, 6);
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive2() {
		List<Object> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> expected = List.of(5, 3, 2, 3, 9, 123, 1);
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive3() {
		List<Object> l = List.of(-1, -2, 4, 5, 6);
		List<Object> expected = List.of(4, 5, 6);
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive4() {
		List<Object> l = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> expected = List.of(5, 3, 2, 3, 3, 9, 123, 1);
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive5() {
		List<Object> l = List.of(-1, -2);
		List<Object> expected = List.of();
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive6() {
		List<Object> l = List.of();
		List<Object> expected = List.of();
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive7() {
		List<Object> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive8() {
		List<Object> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive9() {
		List<Object> l = List.of(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		List<Object> expected = List.of();
		assertEquals(expected, GetPositive.getPositive(l));
	}
	
	@Test
	void testGetPositive10() {
		List<Object> l = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		List<Object> expected = List.of();
		assertEquals(expected, GetPositive.getPositive(l));
	}
}