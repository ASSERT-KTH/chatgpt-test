// CommonTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {

		/**
		* Test case 1:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test1() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				assertEquals(expected, Common.common(l1, l2));
		}
		
		/**
		* Test case 2:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test2() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				assertEquals(expected, Common.common(l1, l2));
		}
		
		/**
		* Test case 3:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test3() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				assertEquals(expected, Common.common(l1, l2));
		}
		
		/**
		* Test case 4:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test4() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				l2.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				assertEquals(expected, Common.common(l1, l2));
		}
		
		/**
		* Test case 5:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test5() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				l2.add(8);
				l2.add(9);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				assertEquals(expected, Common.common(l1, l2));
		}
		
		/**
		* Test case 6:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@