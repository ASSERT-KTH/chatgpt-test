// MonotonicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

	@Test
	void testMonotonic1() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic2() {
		List<Integer> l = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic3() {
		List<Integer> l = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic4() {
		List<Integer> l = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic5() {
		List<Integer> l = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic6() {
		List<Integer> l = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic8() {
		List<Integer> l = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic10() {
		List<Integer> l = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
}

// MonotonicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic1() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic2() {
		List<Integer> l = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic3() {
		List<Integer> l = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic4() {
		List<Integer> l = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic5() {
		List<Integer> l = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic6() {
		List<Integer> l = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic8() {
		List<Integer> l = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic10() {
		List<Integer> l = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
}

// MonotonicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic1() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic2() {
		List<Integer> l = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic3() {
		List<Integer> l = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic4() {
		List<Integer> l = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic5() {
		List<Integer> l = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic6() {
		List<Integer> l = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic8() {
		List<Integer> l = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertTrue(Monotonic.monotonic(l));
	}
	
	@Test
	void testMonotonic10() {
		List<Integer> l = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
}

// MonotonicTest