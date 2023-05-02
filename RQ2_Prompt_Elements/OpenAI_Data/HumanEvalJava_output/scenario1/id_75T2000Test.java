// IsMultiplyPrimeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

		/**
		* Test case 1.
		* The input is a negative number.
		* The expected result is false.
		*/
		@Test
		void test1() {
				assertFalse(IsMultiplyPrime.isMultiplyPrime(-1));
		}
		
		/**
		* Test case 2.
		* The input is a prime number.
		* The expected result is false.
		*/
		@Test
		void test2() {
				assertFalse(IsMultiplyPrime.isMultiplyPrime(2));
		}
		
		/**
		* Test case 3.
		* The input is a number that is not a multiply prime.
		* The expected result is false.
		*/
		@Test
		void test3() {
				assertFalse(IsMultiplyPrime.isMultiplyPrime(6));
		}
		
		/**
		* Test case 4.
		* The input is a multiply prime.
		* The expected result is true.
		*/
		@Test
		void test4() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(210));
		}
		
		/**
		* Test case 5.
		* The input is a multiply prime.
		* The expected result is true.
		*/
		@Test
		void test5() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(2310));
		}
		
		/**
		* Test case 6.
		* The input is a multiply prime.
		* The expected result is true.
		*/
		@Test
		void test6() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(30030));
		}
		
		/**
		* Test case 7.
		* The input is a multiply prime.
		* The expected result is true.
		*/
		@Test
		void test7() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(510510));
		}
		
		/**
		* Test case 8.
		* The input is a multiply prime.
		* The expected result is true.
		*/
		@Test
		void test8() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(9699690));
		}
		
		/**
		* Test case 9.
		* The input is a multiply prime.
		* The expected result is true.
		*/
		@Test
		void test9() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(223092870));
		}
		
		/**
		* Test case 10.
		* The input is a multiply prime.
		* The expected result is true.
		*/
		@Test
		void test10() {
				assertTrue(IsMultiplyPrime.isMultiplyPrime(6469693230L));
		}
}