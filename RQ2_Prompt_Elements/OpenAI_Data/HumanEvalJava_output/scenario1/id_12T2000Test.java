// LongestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {

		@Test
		void testLongest_EmptyList() {
				List<Object> list = List.of();
				assertNull(Longest.longest(list));
		}
		
		@Test
		void testLongest_OneElement() {
				List<Object> list = List.of("a");
				assertEquals("a", Longest.longest(list));
		}
		
		@Test
		void testLongest_TwoElements() {
				List<Object> list = List.of("a", "b");
				assertEquals("b", Longest.longest(list));
		}
		
		@Test
		void testLongest_ThreeElements() {
				List<Object> list = List.of("a", "b", "c");
				assertEquals("c", Longest.longest(list));
		}
		
		@Test
		void testLongest_FourElements() {
				List<Object> list = List.of("a", "b", "c", "d");
				assertEquals("d", Longest.longest(list));
		}
		
		@Test
		void testLongest_FiveElements() {
				List<Object> list = List.of("a", "b", "c", "d", "e");
				assertEquals("e", Longest.longest(list));
		}
		
		@Test
		void testLongest_SixElements() {
				List<Object> list = List.of("a", "b", "c", "d", "e", "f");
				assertEquals("f", Longest.longest(list));
		}
		
		@Test
		void testLongest_SevenElements() {
				List<Object> list = List.of("a", "b", "c", "d", "e", "f", "g");
				assertEquals("g", Longest.longest(list));
		}
		
		@Test
		void testLongest_EightElements() {
				List<Object> list = List.of("a", "b", "c", "d", "e", "f", "g", "h");
				assertEquals("h", Longest.longest(list));
		}
		
		@Test
		void testLongest_NineElements() {
				List<Object> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
				assertEquals("i", Longest.longest(list));
		}
		
		@Test
		void testLongest_TenElements() {
				List<Object> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
				assertEquals("j", Longest.longest(list));
		}
}