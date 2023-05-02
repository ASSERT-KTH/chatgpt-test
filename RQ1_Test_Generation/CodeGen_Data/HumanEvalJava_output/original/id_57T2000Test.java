// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains one unit test case for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

        /**
         * Test method for {@link Monotonic#monotonic(List)}.
         */
@Test
        public void testMonotonic() {
            assertEquals(true, new Monotonic().monotonic(null));
            assertEquals(false, new Monotonic().monotonic(new List<Integer>()));
                     List<Integer> list = new List<>(1, 4, 10, 20);
            assertEquals(true, new Monotonic().monotonic(list));

        }
}
