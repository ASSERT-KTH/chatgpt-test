// Here's the source code for the Fib4Test class:

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Fib4}.
 * It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
 */
class Fib4Test {

    @Test
    void testFib4Zero() {
        assertEquals(0, Fib4.fib4(0));
    }

    @Test
    void testFib4One() {
        assertEquals(0, Fib4.fib4(1));
    }

    @Test
    void testFib4Two() {
        assertEquals(2, Fib4.fib4(2));
    }

    @Test
    void testFib4Three() {
        assertEquals(0, Fib4.fib4(3));
    }

    @Test
    void testFib4Five() {
        assertEquals(4, Fib4.fib4(5));
    }

    @Test
    void testFib4Six() {
        assertEquals(8, Fib4.fib4(6));
    }

    @Test
    void testFib4Seven() {
        assertEquals(14, Fib4.fib4(7));
    }

    @Test
    void testFib4Eight() {
        assertEquals(28, Fib4.fib4(8));
    }

    @Test
    void testFib4Ten() {
        assertEquals(104, Fib4.fib4(10));
    }

    @Test
    void testFib4Twelve() {
        assertEquals(386, Fib4.fib4(12));
    }
}