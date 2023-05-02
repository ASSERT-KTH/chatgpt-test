// FilterByPrefixTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

		@Test
		void testFilterByPrefix_1() {
			List<Object> strings = new ArrayList<Object>();
			strings.add("abc");
			strings.add("bcd");
			strings.add("cde");
			strings.add("def");
			strings.add("efg");
			strings.add("fgh");
			strings.add("ghi");
			strings.add("hij");
			strings.add("ijk");
			strings.add("jkl");
			strings.add("klm");
			strings.add("lmn");
			strings.add("mno");
			strings.add("nop");
			strings.add("opq");
			strings.add("pqr");
			strings.add("qrs");
			strings.add("rst");
			strings.add("stu");
			strings.add("tuv");
			strings.add("uvw");
			strings.add("vwx");
			strings.add("wxy");
			strings.add("xyz");
			List<Object> expected = new ArrayList<Object>();
			expected.add("abc");
			expected.add("bcd");
			expected.add("cde");
			expected.add("def");
			expected.add("efg");
			expected.add("fgh");
			expected.add("ghi");
			expected.add("hij");
			expected.add("ijk");
			expected.add("jkl");
			expected.add("klm");
			expected.add("lmn");
			expected.add("mno");
			expected.add("nop");
			expected.add("opq");
			expected.add("pqr");
			expected.add("qrs");
			expected.add("rst");
			expected.add("stu");
			expected.add("tuv");
			expected.add("uvw");
			expected.add("vwx");
			expected.add("wxy");
			expected.add("xyz");
			List<Object> actual = FilterByPrefix.filterByPrefix(strings, "a");
			assertEquals(expected, actual);
		}
		
		@Test
		void testFilterByPrefix_2() {
			List<Object> strings = new ArrayList<Object>();
			strings.add("abc");
			strings.add("bcd");
			strings.add("cde");
			strings.add("def");
			strings.add("efg");
			strings.add("fgh");
			strings.add("ghi");
			strings.add("hij");
			strings.add("ijk");
			strings.add("jkl");
			strings.add("klm");
			strings.add("lmn");
			strings.add("mno");
			strings.add("nop");
			strings.add("opq");
			strings.add("pqr");
			strings.add("qrs");
			strings.add("rst");
			strings.add("stu");
			strings.add("tuv");
			strings.add("uvw");
			strings.add("vwx");
			strings.add("wxy");
			strings.add("xyz");
			List<Object> expected = new ArrayList<Object>();
			expected.add("abc");
			expected.add("bcd");
			expected.add("cde");
			expected.add("def");
			expected.add("efg");
			expected.add("fgh");
			expected.add("ghi");
			expected.add("hij");
			expected.add("ijk");
			expected.add("jkl");
			expected.add("klm");
			expected.add("lmn");
			expected.add("mno");
			expected.add("nop");
			expected.add("opq");
			expected.add("pqr");
			expected.add("qrs");
			expected.add("rst");
			expected.add("stu");
			expected.add("tuv");
			expected.add("uvw");
			expected.add("vwx");
			expected.add("wxy");
			expected.add("xyz");
			List<Object> actual = FilterByPrefix.filterByPrefix(strings, "a");
			assertEquals(expected, actual);
		}
		
		@Test
		void testFilterByPrefix_3() {
			List<Object> strings = new ArrayList<Object>();
			strings.add("abc");
			strings.add("bcd");
			strings.add("cde");
			strings.add("def");
			strings.add("efg");
			strings.add("fgh");
			strings.add("ghi");
			strings.add("hij");
			strings.add("ijk");
			strings.add("jkl");
			strings.add("klm");
			strings.add("lmn");
			strings.add("mno");
			strings.add("nop");
			strings.add("opq");
			strings.add("pqr");
			strings.add("qrs");
			strings.add("rst");
			strings.add("stu");
			strings.add("tuv");
			strings.add("uvw");
			strings.add("vwx");
			strings.add("wxy");
			strings.add("xyz");
			List<Object> expected = new ArrayList<Object>();
			expected.add("abc");
			expected.add("bcd");
			expected.add("cde");
			expected.add("def");
			expected.add("efg");
			expected.add("fgh");
			expected.add("ghi");
			expected.add("hij");
			expected.add("ijk");
			expected.add("jkl");
			expected.add("klm");
			expected.add("lmn");
			expected.add("mno");
			expected.add("nop");
			expected.add("opq");
			expected.add("pqr");
			expected.add("qrs");
			expected.add("rst");
			expected.add("stu");
			expected.add("tuv");
			expected.add("uvw");
			expected.add("vwx");
			expected.add("wxy");
			expected.add("xyz");
			List<Object> actual = FilterByPrefix.filterByPrefix(strings, "a");
			assertEquals(expected, actual);
		}
		
		@Test
		void testFilterByPrefix_4() {
			List<Object> strings = new ArrayList<Object>();
			strings.add("abc");
			strings.add("bcd");
			strings.add("cde");
			strings.add("def");
			strings.add("efg");
			strings.add("fgh");
			strings.add("ghi");
			strings.add("hij");
			strings.add("ijk");
			strings.add("j