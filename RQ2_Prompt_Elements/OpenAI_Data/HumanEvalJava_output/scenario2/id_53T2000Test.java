// AddTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {

		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the two numbers are positive.
		*/
		@Test
		public void testAddPositiveNumbers() {
				assertEquals(5, Add.add(2, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the two numbers are negative.
		*/
		@Test
		public void testAddNegativeNumbers() {
				assertEquals(-5, Add.add(-2, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is positive and the second number is negative.
		*/
		@Test
		public void testAddPositiveAndNegativeNumbers() {
				assertEquals(-1, Add.add(2, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is negative and the second number is positive.
		*/
		@Test
		public void testAddNegativeAndPositiveNumbers() {
				assertEquals(1, Add.add(-2, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is zero and the second number is positive.
		*/
		@Test
		public void testAddZeroAndPositiveNumbers() {
				assertEquals(3, Add.add(0, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is zero and the second number is negative.
		*/
		@Test
		public void testAddZeroAndNegativeNumbers() {
				assertEquals(-3, Add.add(0, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is positive and the second number is zero.
		*/
		@Test
		public void testAddPositiveAndZeroNumbers() {
				assertEquals(3, Add.add(3, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is negative and the second number is zero.
		*/
		@Test
		public void testAddNegativeAndZeroNumbers() {
				assertEquals(-3, Add.add(-3, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is zero and the second number is zero.
		*/
		@Test
		public void testAddZeroAndZeroNumbers() {
				assertEquals(0, Add.add(0, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is the maximum integer value and the second number is positive.
		*/
		@Test
		public void testAddMaxIntegerAndPositiveNumbers() {
				assertEquals(-2147483648, Add.add(Integer.MAX_VALUE, 1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct result when the first number is the minimum integer value and the second number is negative.
		*/
		@Test
		public void testAddMinIntegerAndNegativeNumbers() {
				assertEquals(2147483647, Add.add(Integer.MIN_VALUE, -1));
		}
}