// CorrectBracketingTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {

		/**
		* Test case 1.
		* The input is a string with no brackets.
		* The expected result is true.
		*/
		@Test
		void test1() {
				assertTrue(CorrectBracketing.correctBracketing(""));
		}
		
		/**
		* Test case 2.
		* The input is a string with one opening bracket.
		* The expected result is false.
		*/
		@Test
		void test2() {
				assertFalse(CorrectBracketing.correctBracketing("<"));
		}
		
		/**
		* Test case 3.
		* The input is a string with one closing bracket.
		* The expected result is false.
		*/
		@Test
		void test3() {
				assertFalse(CorrectBracketing.correctBracketing(">"));
		}
		
		/**
		* Test case 4.
		* The input is a string with one opening bracket and one closing bracket.
		* The expected result is true.
		*/
		@Test
		void test4() {
				assertTrue(CorrectBracketing.correctBracketing("<>"));
		}
		
		/**
		* Test case 5.
		* The input is a string with two opening brackets and one closing bracket.
		* The expected result is false.
		*/
		@Test
		void test5() {
				assertFalse(CorrectBracketing.correctBracketing("<<>"));
		}
		
		/**
		* Test case 6.
		* The input is a string with one opening bracket and two closing brackets.
		* The expected result is false.
		*/
		@Test
		void test6() {
				assertFalse(CorrectBracketing.correctBracketing("<>>"));
		}
		
		/**
		* Test case 7.
		* The input is a string with two opening brackets and two closing brackets.
		* The expected result is true.
		*/
		@Test
		void test7() {
				assertTrue(CorrectBracketing.correctBracketing("<<>>"));
		}
		
		/**
		* Test case 8.
		* The input is a string with two opening brackets and three closing brackets.
		* The expected result is false.
		*/
		@Test
		void test8() {
				assertFalse(CorrectBracketing.correctBracketing("<<>>>"));
		}
		
		/**
		* Test case 9.
		* The input is a string with three opening brackets and two closing brackets.
		* The expected result is false.
		*/
		@Test
		void test9() {
				assertFalse(CorrectBracketing.correctBracketing("<<<>>"));
		}
		
		/**
		* Test case 10.
		* The input is a string with three opening brackets and three closing brackets.
		* The expected result is true.
		*/
		@Test
		void test10() {
				assertTrue(CorrectBracketing.correctBracketing("<<<>>>"));
		}
}

// CorrectBracketingTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {
		
		/**
		* Test case 1.
		* The input is a string with no brackets.
		* The expected result is true.
		*/
		@Test
		void test1() {
				assertTrue(CorrectBracketing.correctBracketing(""));
		}
		
		/**
		* Test case 2.
		* The input is a string with one opening bracket.
		* The expected result is false.
		*/
		@Test
		void test2() {
				assertFalse(CorrectBracketing.correctBracketing("<"));
		}
		
		/**
		* Test case 3.
		* The input is a string with one closing bracket.
		* The expected result is false.
		*/
		@Test
		void test3() {
				assertFalse(CorrectBracketing.correctBracketing(">"));
		}
		
		/**
		* Test case 4.
		* The input is a string with one opening bracket and one closing bracket.
		* The expected result is true.
		*/
		@Test
		void test4() {
				assertTrue(CorrectBracketing.correctBracketing("<>"));
		}
		
		/**
		* Test case 5.
		* The input is a string with two opening brackets and one closing bracket.
		* The expected result is false.
		*/
		@Test
		void test5() {
				assertFalse(CorrectBracketing.correctBracketing("<<>"));
		}
		
		/**
		* Test case 6.
		* The input is a string with one opening bracket and two closing brackets.
		* The expected result is false.
		*/
		@Test
		void test6() {
				assertFalse(CorrectBracketing.correctBracketing("<>>"));
		}
		
		/**
		* Test case 7.
		* The input is a string with two opening brackets and two closing brackets.
		* The expected result is true.
		*/
		@Test
		void test7() {
				assertTrue(CorrectBracketing.correctBracketing("<<>>"));
		}
		
		/**
		* Test case 8.
		* The input is a string with two opening brackets and three closing brackets.
		* The expected result is false.
		*/
		@Test
		void test8() {
				assertFalse(CorrectBracketing.correctBracketing("<<>>>"));
		}
		
		/**
		* Test case 9.
		* The input is a string with three opening brackets and two closing brackets.
		* The expected result is false.
		*/
		@Test
		void test9() {
				assertFalse(CorrectBracketing.correctBracketing("<<<>>"));
		}
		
		/**
		* Test case 10.
		* The input is a string with three opening brackets and three closing brackets.
		* The expected result is true.
		*/
		@Test
		void test10() {
				assertTrue(CorrectBracketing.correctBracketing("<<<>>>"));
		}
}

// CorrectBracketingTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {
		
		/**
		* Test case 1.
		* The input is a string with no brackets.
		* The expected result is true.
		*/
		@Test
		void test1() {
				assertTrue(CorrectBracketing.correctBracketing(""));
		}
		
		/**
		* Test case 2.
		* The input is a string with one opening bracket