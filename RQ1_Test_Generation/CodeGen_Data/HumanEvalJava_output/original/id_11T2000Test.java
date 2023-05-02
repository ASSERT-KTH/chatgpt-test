// StringXorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains one unit test case for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {
/**
		 * Test of stringXor method, of class StringXor.
		 */
        @Test
        public void testStringXor() {
        	assertEquals("000", StringXor.stringXor("1", "1"));
        }
}
