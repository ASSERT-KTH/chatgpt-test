// EvenOddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {

	@Test
	void testEvenOddCount() {
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-12));
		assertEquals(List.of(1, 2), EvenOddCount.evenOddCount(123));
		assertEquals(List.of(0, 1), EvenOddCount.evenOddCount(7));
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-78));
		assertEquals(List.of(2, 2), EvenOddCount.evenOddCount(3452));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(346211));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(-345821));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(-2));
		assertEquals(List.of(2, 3), EvenOddCount.evenOddCount(-45347));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(0));
	}
}