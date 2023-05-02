// NextSmallestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

		/**
		* Test case 1.
		* The input list is empty.
		* The expected result is null.
		*/
		@Test
		void test1() {
				List<Object> lst = List.of();
				assertNull(NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 2.
		* The input list contains one element.
		* The expected result is null.
		*/
		@Test
		void test2() {
				List<Object> lst = List.of(1);
				assertNull(NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 3.
		* The input list contains two elements.
		* The expected result is the second element.
		*/
		@Test
		void test3() {
				List<Object> lst = List.of(1, 2);
				assertEquals(2, NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 4.
		* The input list contains two elements.
		* The expected result is the first element.
		*/
		@Test
		void test4() {
				List<Object> lst = List.of(2, 1);
				assertEquals(1, NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 5.
		* The input list contains three elements.
		* The expected result is the second element.
		*/
		@Test
		void test5() {
				List<Object> lst = List.of(1, 2, 3);
				assertEquals(2, NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 6.
		* The input list contains three elements.
		* The expected result is the third element.
		*/
		@Test
		void test6() {
				List<Object> lst = List.of(1, 3, 2);
				assertEquals(2, NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 7.
		* The input list contains three elements.
		* The expected result is the first element.
		*/
		@Test
		void test7() {
				List<Object> lst = List.of(2, 1, 3);
				assertEquals(1, NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 8.
		* The input list contains three elements.
		* The expected result is the first element.
		*/
		@Test
		void test8() {
				List<Object> lst = List.of(2, 3, 1);
				assertEquals(1, NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 9.
		* The input list contains three elements.
		* The expected result is the third element.
		*/
		@Test
		void test9() {
				List<Object> lst = List.of(3, 1, 2);
				assertEquals(2, NextSmallest.nextSmallest(lst));
		}
		
		/**
		* Test case 10.
		* The input list contains three elements.
		* The expected result is the third element.
		*/
		@Test
		void test10() {
				List<Object> lst = List.of(3, 2, 1);
				assertEquals(1, NextSmallest.nextSmallest(lst));
		}
}