// ChangeBaseTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {

		/**
		* Test case 1.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "0".
		*/
		@Test
		void test1() {
			assertEquals("0", ChangeBase.changeBase(0, 2));
		}
		
		/**
		* Test case 2.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 1</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "1".
		*/
		@Test
		void test2() {
			assertEquals("1", ChangeBase.changeBase(1, 2));
		}
		
		/**
		* Test case 3.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 2</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "10".
		*/
		@Test
		void test3() {
			assertEquals("10", ChangeBase.changeBase(2, 2));
		}
		
		/**
		* Test case 4.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 3</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "11".
		*/
		@Test
		void test4() {
			assertEquals("11", ChangeBase.changeBase(3, 2));
		}
		
		/**
		* Test case 5.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 4</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "100".
		*/
		@Test
		void test5() {
			assertEquals("100", ChangeBase.changeBase(4, 2));
		}
		
		/**
		* Test case 6.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 5</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "101".
		*/
		@Test
		void test6() {
			assertEquals("101", ChangeBase.changeBase(5, 2));
		}
		
		/**
		* Test case 7.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 6</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "110".
		*/
		@Test
		void test7() {
			assertEquals("110", ChangeBase.changeBase(6, 2));
		}
		
		/**
		* Test case 8.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 7</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "111".
		*/
		@Test
		void test8() {
			assertEquals("111", ChangeBase.changeBase(7, 2));
		}
		
		/**
		* Test case 9.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 8</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "1000".
		*/
		@Test
		void test9() {
			assertEquals("1000", ChangeBase.changeBase(8, 2));
		}
		
		/**
		* Test case 10.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 9</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "1001".
		*/
		@Test
		void test10() {
			assertEquals("1001", ChangeBase.changeBase(9, 2));
		}
}