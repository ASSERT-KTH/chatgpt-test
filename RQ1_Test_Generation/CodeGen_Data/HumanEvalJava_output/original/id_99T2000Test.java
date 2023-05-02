// ClosestIntegerTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains one unit test case for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
// Class under test 
		static double[] arr = {
                4.0+0.0, 1.0-0.0, 0.0, 
                0.0, -1.0, 0.0, 
		};
        
		/**
         * Test of closestInteger(String).
         */
        @Test
        public void testClosest() {
                assertArrayEquals("Closest is 0.0", new double[] {}, ClosestInteger.closestInteger("0"));
                assertArrayEquals("Closest is 1.0-0.0", new double[] { -0.5, 0.5, 0.5, 0.5, 0.5}, ClosestInteger.closestInteger("0-0"));
                assertArrayEquals("Closest is 0.0", arr, ClosestInteger.closestInteger("0"));
        }
}