// MonotonicTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

    @Test
    void testMonotonicIncreasing() {
        List<Integer> l = Arrays.asList(1, 2, 4, 10);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicIncreasing2() {
        List<Integer> l = Arrays.asList(1, 2, 4, 20);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicDecreasing() {
        List<Integer> l = Arrays.asList(4, 1, 0, -10);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicEqual() {
        List<Integer> l = Arrays.asList(9, 9, 9, 9);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicEqual2() {
        List<Integer> l = Arrays.asList(1, 1, 1, 1);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicNonMonotonic() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        assertFalse(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicNonMonotonic2() {
        List<Integer> l = Arrays.asList(1, 2, 3, 2, 5, 60);
        assertFalse(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicNonMonotonic3() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 60);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicNonMonotonic4() {
        List<Integer> l = Arrays.asList(4, 1, 1, 0);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicSingleElement() {
        List<Integer> l = Arrays.asList(1);
        assertTrue(Monotonic.monotonic(l));
    }
}