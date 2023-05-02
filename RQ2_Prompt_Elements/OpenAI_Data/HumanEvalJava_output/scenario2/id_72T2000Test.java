// WillItFlyTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {

	@Test
	void testWillItFly() {
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 10));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 20));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 30));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 40));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 50));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 60));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 70));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 80));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 90));
		assertTrue(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 100));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 9));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 19));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 29));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 39));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 49));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 59));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 69));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 79));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 89));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 99));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 101));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 102));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 103));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 104));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 105));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 106));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 107));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 108));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 109));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 110));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 111));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 112));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 113));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 114));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 115));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 116));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 117));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 118));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 119));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 120));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 121));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 122));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 123));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 124));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 125));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 126));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 127));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 128));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 129));
		assertFalse(WillItFly.willItFly(List.of(1, 2, 3, 4, 5