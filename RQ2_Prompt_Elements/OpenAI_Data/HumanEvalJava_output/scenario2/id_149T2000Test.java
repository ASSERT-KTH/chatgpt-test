// SortedListSumTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings in sorted order.
	*/
	@Test
	void testSortedListSum() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		lst.add("e");
		lst.add("f");
		lst.add("g");
		lst.add("h");
		lst.add("i");
		lst.add("j");
		lst.add("k");
		lst.add("l");
		lst.add("m");
		lst.add("n");
		lst.add("o");
		lst.add("p");
		lst.add("q");
		lst.add("r");
		lst.add("s");
		lst.add("t");
		lst.add("u");
		lst.add("v");
		lst.add("w");
		lst.add("x");
		lst.add("y");
		lst.add("z");
		List<Object> result = new ArrayList<Object>();
		result.add("b");
		result.add("d");
		result.add("f");
		result.add("h");
		result.add("j");
		result.add("l");
		result.add("n");
		result.add("p");
		result.add("r");
		result.add("t");
		result.add("v");
		result.add("x");
		result.add("z");
		Collections.sort(result, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		assertEquals(result, SortedListSum.sortedListSum(lst));
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings in sorted order.
	*/
	@Test
	void testSortedListSum2() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		lst.add("e");
		lst.add("f");
		lst.add("g");
		lst.add("h");
		lst.add("i");
		lst.add("j");
		lst.add("k");
		lst.add("l");
		lst.add("m");
		lst.add("n");
		lst.add("o");
		lst.add("p");
		lst.add("q");
		lst.add("r");
		lst.add("s");
		lst.add("t");
		lst.add("u");
		lst.add("v");
		lst.add("w");
		lst.add("x");
		lst.add("y");
		lst.add("z");
		lst.add("aa");
		lst.add("bb");
		lst.add("cc");
		lst.add("dd");
		lst.add("ee");
		lst.add("ff");
		lst.add("gg");
		lst.add("hh");
		lst.add("ii");
		lst.add("jj");
		lst.add("kk");
		lst.add("ll");
		lst.add("mm");
		lst.add("nn");
		lst.add("oo");
		lst.add("pp");
		lst.add("qq");
		lst.add("rr");
		lst.add("ss");
		lst.add("tt");
		lst.add("uu");
		lst.add("vv");
		lst.add("ww");
		lst.add("xx");
		lst.add("yy");
		lst.add("zz");
		List<Object> result = new ArrayList<Object>();
		result.add("b");
		result.add("d");
		result.add("f");
		result.add("h");
		result.add("j");
		result.add("l");
		result.add("n");
		result.add("p");
		result.add("r");
		result.add("t");
		result.add("v");
		result.add("x");
		result.add("z");
		result.add("bb");
		result.add("dd");
		result.add("ff");
		result.add("hh");
		result.add("jj");
		result.add("ll");
		result.add("nn");
		result.add("pp");
		result.add("rr");
		result.add("tt");
		result.add("vv");
		result.add("xx");
		result.add("zz");
		Collections.sort(result, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		assertEquals(result, SortedListSum.sortedListSum(lst));
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings in sorted order.
	*/
	@Test
	void testSortedListSum3() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		lst.add("e");
		lst.add("f");
		lst.add("g");
		lst.add("h");
		lst.add("i");
		lst.add("j");
		lst.add("k");
		lst.add("l");
		lst.add("m");
		lst.add("n");
		lst.add("o");
		lst.add("p");
		lst.add("q");
		lst.add("r");
		lst.add("s");
		lst.add("t");
		lst.add("u");
		lst.add("v");
		lst.add("w");
		lst.add("x");
		lst.add("y");
		lst.add("z");
		lst.add("aa