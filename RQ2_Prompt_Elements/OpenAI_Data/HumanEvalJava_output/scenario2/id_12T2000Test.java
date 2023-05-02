// LongestTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {

	@Test
	void testLongest_emptyList() {
		List<Object> strings = List.of();
		assertNull(Longest.longest(strings));
	}
	
	@Test
	void testLongest_oneElement() {
		List<Object> strings = List.of("a");
		assertEquals("a", Longest.longest(strings));
	}
	
	@Test
	void testLongest_twoElements() {
		List<Object> strings = List.of("a", "b");
		assertEquals("b", Longest.longest(strings));
	}
	
	@Test
	void testLongest_threeElements() {
		List<Object> strings = List.of("a", "bb", "ccc");
		assertEquals("ccc", Longest.longest(strings));
	}
	
	@Test
	void testLongest_fourElements() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd");
		assertEquals("dddd", Longest.longest(strings));
	}
	
	@Test
	void testLongest_fiveElements() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee");
		assertEquals("eeeee", Longest.longest(strings));
	}
	
	@Test
	void testLongest_sixElements() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff");
		assertEquals("ffffff", Longest.longest(strings));
	}
	
	@Test
	void testLongest_sevenElements() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
		assertEquals("ggggggg", Longest.longest(strings));
	}
	
	@Test
	void testLongest_eightElements() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg", "hhhhhhhh");
		assertEquals("hhhhhhhh", Longest.longest(strings));
	}
	
	@Test
	void testLongest_nineElements() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg", "hhhhhhhh", "iiiiiiiii");
		assertEquals("iiiiiiiii", Longest.longest(strings));
	}
}