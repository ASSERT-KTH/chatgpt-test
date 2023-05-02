// FizzBuzzTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains one unit test case for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {

        @Test
		public void testFizzBuzz(){
                int n = 100;
	        assertEquals("fizzBuzz(100)", FizzBuzz.fizzBuzz( n ), 1);
        }
        
	//@Test
}
