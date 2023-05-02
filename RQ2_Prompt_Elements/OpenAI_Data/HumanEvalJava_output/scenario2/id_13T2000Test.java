// GreatestCommonDivisorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {

		/**
		* Test case 1:
		* Input: a = 1, b = 1
		* Expected output: 1
		*/
		@Test
		void test1() {
			int a = 1;
			int b = 1;
			int expected = 1;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 2:
		* Input: a = 1, b = 2
		* Expected output: 1
		*/
		@Test
		void test2() {
			int a = 1;
			int b = 2;
			int expected = 1;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 3:
		* Input: a = 2, b = 1
		* Expected output: 1
		*/
		@Test
		void test3() {
			int a = 2;
			int b = 1;
			int expected = 1;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 4:
		* Input: a = 2, b = 2
		* Expected output: 2
		*/
		@Test
		void test4() {
			int a = 2;
			int b = 2;
			int expected = 2;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 5:
		* Input: a = 2, b = 4
		* Expected output: 2
		*/
		@Test
		void test5() {
			int a = 2;
			int b = 4;
			int expected = 2;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 6:
		* Input: a = 4, b = 2
		* Expected output: 2
		*/
		@Test
		void test6() {
			int a = 4;
			int b = 2;
			int expected = 2;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 7:
		* Input: a = 4, b = 4
		* Expected output: 4
		*/
		@Test
		void test7() {
			int a = 4;
			int b = 4;
			int expected = 4;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 8:
		* Input: a = 4, b = 8
		* Expected output: 4
		*/
		@Test
		void test8() {
			int a = 4;
			int b = 8;
			int expected = 4;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 9:
		* Input: a = 8, b = 4
		* Expected output: 4
		*/
		@Test
		void test9() {
			int a = 8;
			int b = 4;
			int expected = 4;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 10:
		* Input: a = 8, b = 8
		* Expected output: 8
		*/
		@Test
		void test10() {
			int a = 8;
			int b = 8;
			int expected = 8;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
}

// GreatestCommonDivisorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {
		
		/**
		* Test case 1:
		* Input: a = 1, b = 1
		* Expected output: 1
		*/
		@Test
		void test1() {
			int a = 1;
			int b = 1;
			int expected = 1;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 2:
		* Input: a = 1, b = 2
		* Expected output: 1
		*/
		@Test
		void test2() {
			int a = 1;
			int b = 2;
			int expected = 1;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 3:
		* Input: a = 2, b = 1
		* Expected output: 1
		*/
		@Test
		void test3() {
			int a = 2;
			int b = 1;
			int expected = 1;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 4:
		* Input: a = 2, b = 2
		* Expected output: 2
		*/
		@Test
		void test4() {
			int a = 2;
			int b = 2;
			int expected = 2;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 5:
		* Input: a = 2, b = 4
		* Expected output: 2
		*/
		@Test
		void test5() {
			int a = 2;
			int b = 4;
			int expected = 2;
			int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
			assertEquals(expected, actual);
		}
		
		/**
		* Test case 6:
		* Input: a = 4, b = 2
		* Expected output: 2
		*/
		@Test
		void test6() {
			int a = 4;
			int b = 2;
			int