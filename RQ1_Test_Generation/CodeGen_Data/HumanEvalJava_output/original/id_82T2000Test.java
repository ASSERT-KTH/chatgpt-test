// PrimeLengthTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains one unit test case for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
/**
		* Write a unit test for the {@link PrimeLength#primeLength(String)} method.
		* Examples
		* primeLength("Hello") == true
		* primeLength("abcdcba") == true
		* primeLength("kittens") == true
		* primeLength("orange") == false
		*
		* @throws NoSuchMethodException
		* @throws SecurityException
		* @throws IllegalArgumentException
		* @throws IllegalAccessException
		* @throws InvocationTargetException
		*/
		@Test
		public void primeLengthTest(){
			Boolean result = new PrimeLength().primeLength("Hello");
			assertEquals(result, true);

			result = new PrimeLength().primeLength("abcdcba");
			assertEquals(result, true);

			result = new PrimeLength().primeLength("kittens");
			assertEquals(result, false);

			try {
				new PrimeLength().primeLength("not really");
				assertTrue(false);
			} catch (NoSuchMethodException e){}

			try {
				new PrimeLength().primeLength("not really");
				assertTrue(false);
			} catch (SecurityException e){}

			try {
				new PrimeLength().primeLength("not really");
				assertTrue(false);
			} catch (IllegalArgumentException e){}

			try {
				new PrimeLength().primeLength("not really");
				assertTrue(false);
			} catch (IllegalAccessException e){}

			try {
				new PrimeLength().primeLength("not really");
				assertTrue(false);
			} catch (InvocationTargetException e){}
		}
}