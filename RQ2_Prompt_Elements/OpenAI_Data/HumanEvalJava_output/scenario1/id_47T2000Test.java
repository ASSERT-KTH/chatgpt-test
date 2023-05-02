// MedianTest.java
package scenario1;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {

		/**
		* Test case 1.
		* The input list is empty.
		* The expected result is null.
		*/
		@Test
		void testMedian_1() {
				List<Integer> l = Collections.emptyList();
				assertNull(Median.median(l));
		}
		
		/**
		* Test case 2.
		* The input list contains one element.
		* The expected result is the element.
		*/
		@Test
		void testMedian_2() {
				List<Integer> l = Collections.singletonList(1);
				assertEquals(1, Median.median(l));
		}
		
		/**
		* Test case 3.
		* The input list contains two elements.
		* The expected result is the average of the two elements.
		*/
		@Test
		void testMedian_3() {
				List<Integer> l = List.of(1, 2);
				assertEquals(1.5, Median.median(l));
		}
		
		/**
		* Test case 4.
		* The input list contains three elements.
		* The expected result is the second element.
		*/
		@Test
		void testMedian_4() {
				List<Integer> l = List.of(1, 2, 3);
				assertEquals(2, Median.median(l));
		}
		
		/**
		* Test case 5.
		* The input list contains four elements.
		* The expected result is the average of the two middle elements.
		*/
		@Test
		void testMedian_5() {
				List<Integer> l = List.of(1, 2, 3, 4);
				assertEquals(2.5, Median.median(l));
		}
		
		/**
		* Test case 6.
		* The input list contains five elements.
		* The expected result is the third element.
		*/
		@Test
		void testMedian_6() {
				List<Integer> l = List.of(1, 2, 3, 4, 5);
				assertEquals(3, Median.median(l));
		}
		
		/**
		* Test case 7.
		* The input list contains six elements.
		* The expected result is the average of the two middle elements.
		*/
		@Test
		void testMedian_7() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
				assertEquals(3.5, Median.median(l));
		}
		
		/**
		* Test case 8.
		* The input list contains seven elements.
		* The expected result is the fourth element.
		*/
		@Test
		void testMedian_8() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals(4, Median.median(l));
		}
		
		/**
		* Test case 9.
		* The input list contains eight elements.
		* The expected result is the average of the two middle elements.
		*/
		@Test
		void testMedian_9() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				assertEquals(4.5, Median.median(l));
		}
		
		/**
		* Test case 10.
		* The input list contains nine elements.
		* The expected result is the fifth element.
		*/
		@Test
		void testMedian_10() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertEquals(5, Median.median(l));
		}
}