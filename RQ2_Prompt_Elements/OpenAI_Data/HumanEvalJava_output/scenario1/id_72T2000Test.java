// WillItFlyTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {

	@Test
	void testWillItFly_1() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 10;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_2() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 55;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_3() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 56;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_4() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 54;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_5() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 53;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_6() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 52;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_7() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 51;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_8() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 50;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_9() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 49;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_10() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 48;
		assertTrue(WillItFly.willItFly(q, w));
	}
}

// WillItFlyTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
		
	@Test
	void testWillItFly_1() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 10;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_2() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 55;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_3() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 56;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_4() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 54;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_5() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 53;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_6() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 52;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_7() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 51;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_8() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 50;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_9() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 49;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_10() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 48;
		assertTrue(WillItFly.willItFly(q, w));
	}
}

// WillItFlyTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
		
	@Test
	void testWillItFly_1() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 10;
		assertFalse(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_2() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int w = 55;
		assertTrue(WillItFly.willItFly(q, w));
	}
	
	@Test
	void testWillItFly_3() {
		List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8,