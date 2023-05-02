// AllPrefixesTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 0.
		*/
		@Test
		void testAllPrefixes_EmptyString() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = AllPrefixes.allPrefixes("");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 1.
		*/
		@Test
		void testAllPrefixes_StringOfLength1() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				List<Object> actual = AllPrefixes.allPrefixes("a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 2.
		*/
		@Test
		void testAllPrefixes_StringOfLength2() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("ab");
				List<Object> actual = AllPrefixes.allPrefixes("ab");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 3.
		*/
		@Test
		void testAllPrefixes_StringOfLength3() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("ab");
				expected.add("abc");
				List<Object> actual = AllPrefixes.allPrefixes("abc");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 4.
		*/
		@Test
		void testAllPrefixes_StringOfLength4() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				List<Object> actual = AllPrefixes.allPrefixes("abcd");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 5.
		*/
		@Test
		void testAllPrefixes_StringOfLength5() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				expected.add("abcde");
				List<Object> actual = AllPrefixes.allPrefixes("abcde");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 6.
		*/
		@Test
		void testAllPrefixes_StringOfLength6() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				expected.add("abcde");
				expected.add("abcdef");
				List<Object> actual = AllPrefixes.allPrefixes("abcdef");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 7.
		*/
		@Test
		void testAllPrefixes_StringOfLength7() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				expected.add("abcde");
				expected.add("abcdef");
				expected.add("abcdefg");
				List<Object> actual = AllPrefixes.allPrefixes("abcdefg");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 8.
		*/
		@Test
		void testAllPrefixes_StringOfLength8() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				expected.add("abcde");
				expected.add("abcdef");
				expected.add("abcdefg");
				expected.add("abcdefgh");
				List<Object> actual = AllPrefixes.allPrefixes("abcdefgh");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link AllPrefixes#allPrefixes(String)} method.
		* It tests the method with a string of length 9.
		*/
		@Test
		void testAllPrefixes_StringOfLength9() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("a");
				expected.add("ab");
				expected.add("abc");
				expected.add("abcd");
				expected.add("abcde");
				expected.add("abcdef");
				expected.add("abcdefg");
				expected.add("abcdefgh");
				expected.add("abcdefghi");
				List<Object> actual = AllPrefixes.allPrefixes("abcdefghi");
				assertEquals(expected, actual);
		}
}