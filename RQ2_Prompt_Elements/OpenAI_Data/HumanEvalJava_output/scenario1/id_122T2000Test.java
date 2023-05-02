// AddElementsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

		@Test
		void testAddElements_1() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 3;
				int expected = 6;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_2() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 5;
				int expected = 15;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_3() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 6;
				int expected = 15;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_4() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 0;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_5() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = -1;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_6() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = -5;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_7() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = -6;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_8() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = -100;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_9() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 100;
				int expected = 15;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_10() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 1000;
				int expected = 15;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
}

// AddElementsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
		
		@Test
		void testAddElements_1() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 3;
				int expected = 6;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_2() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 5;
				int expected = 15;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_3() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 6;
				int expected = 15;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_4() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = 0;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_5() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = -1;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_6() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = -5;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_7() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = -6;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_8() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int k = -100;
				int expected = 0;
				int actual = AddElements.addElements(arr, k);
				assertEquals(expected, actual);
		}
		
		@Test
		void testAddElements_9() {
				List<Integer> arr = List.of(1, 2, 3, 4, 5);
				int