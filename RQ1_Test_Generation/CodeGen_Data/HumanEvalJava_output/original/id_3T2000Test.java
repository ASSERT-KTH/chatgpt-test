// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains one unit test case for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

    /**
     * Test suite for belowZero method.
     */
    @Test
    void belowZero() {
        List<Integer> expected = new ArrayList<>();
        expected.add(13);
        expected.add(-24);
        assertTrue(belowZero(expected).equals(true));

        List<Integer> nonExpected = new ArrayList<>();
        expected.set(0, 17);
        expected.set(-50, 10);
        expected.set(-100, 8);

        assertFalse(belowZero(nonExpected).equals(true));
		
		List<Integer> nonExpected = new ArrayList<>();
        expected.set(0, 17);
        expected.set(-50, 10);
        expected.set(-100, 8);
        assertFalse(belowZero(nonExpected).equals(true));

		expected.add(0);
        expected.add(-100);
        assertTrue(belowZero(expected).equals(true));
	}
}