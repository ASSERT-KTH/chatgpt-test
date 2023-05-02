// FilterBySubstringTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns an empty list when the input list is empty.
		*/
		@Test
		void testEmptyList() {
				List<Object> input = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns an empty list when the input list does not contain the substring.
		*/
		@Test
		void testNoSubstring() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bacd");
				input.add("cde");
				input.add("array");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "john");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains the substring.
		*/
		@Test
		void testSubstring() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bacd");
				input.add("cde");
				input.add("array");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("bacd");
				expected.add("array");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains the substring.
		*/
		@Test
		void testSubstring2() {
				List<Object> input = new ArrayList<Object>();
				input.add("xxx");
				input.add("asd");
				input.add("xxy");
				input.add("john doe");
				input.add("xxxAAA");
				input.add("xxx");
				List<Object> expected = new ArrayList<Object>();
				expected.add("xxx");
				expected.add("xxxAAA");
				expected.add("xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "xxx");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains the substring.
		*/
		@Test
		void testSubstring3() {
				List<Object> input = new ArrayList<Object>();
				input.add("xxx");
				input.add("asd");
				input.add("aaaxxy");
				input.add("john doe");
				input.add("xxxAAA");
				input.add("xxx");
				List<Object> expected = new ArrayList<Object>();
				expected.add("xxx");
				expected.add("aaaxxy");
				expected.add("xxxAAA");
				expected.add("xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "xx");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains the substring.
		*/
		@Test
		void testSubstring4() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				input.add("trumpet");
				input.add("prune");
				input.add("gruesome");
				List<Object> expected = new ArrayList<Object>();
				expected.add("grunt");
				expected.add("prune");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "run");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains the substring.
		*/
		@Test
		void testSubstring5() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				input.add("trumpet");
				input.add("prune");
				input.add("gruesome");
				List<Object> expected = new ArrayList<Object>();
				expected.add("grunt");
				expected.add("trumpet");
				expected.add("prune");
				expected.add("gruesome");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "r");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains the substring.
		*/
		@Test
		void testSubstring6() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				input.add("trumpet");
				input.add("prune");
				input.add("gruesome");
				List<Object> expected = new ArrayList<Object>();
				expected.add("grunt");
				expected.add("trumpet");
				expected.add("prune");
				expected.add("gruesome");
				List<Object> actual = FilterBySubstring.filterBySubstring(input, "ru");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It checks if the method returns the correct list when the input list contains the substring.
		*/
		@Test
		void testSubstring7() {
				List<Object> input = new ArrayList<Object>();
				input.add("grunt");
				input.add("trumpet");
				input.add("prune");
				input.add("gruesome");
				List<Object> expected = new ArrayList<Object>();
				expected