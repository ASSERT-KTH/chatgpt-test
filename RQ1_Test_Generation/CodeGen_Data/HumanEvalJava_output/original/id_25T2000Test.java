// FactorizeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains one unit test case for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {

    /**
     * Test method for {@link Factorize#factorize(int)}.
     */
    @Test
    void testFactorize() {
        assertEquals(new Integer(16), new Factorize().factorize(16));
		assertEquals(new Integer(64), new Factorize().factorize(64));
		assertEquals(new Integer(250), new Factorize().factorize(250));
    }
}