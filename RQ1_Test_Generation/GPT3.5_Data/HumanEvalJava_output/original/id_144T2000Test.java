// Here's the source code for the SimplifyTest class:

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Simplify}.
 * It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
 */
class SimplifyTest {

    @Test
    void testSimplify1() {
        assertTrue(Simplify.simplify("1/5", "5/1"));
    }

    @Test
    void testSimplify2() {
        assertFalse(Simplify.simplify("1/6", "2/1"));
    }

    @Test
    void testSimplify3() {
        assertTrue(Simplify.simplify("5/1", "3/1"));
    }

    @Test
    void testSimplify4() {
        assertFalse(Simplify.simplify("7/10", "10/2"));
    }

    @Test
    void testSimplify5() {
        assertTrue(Simplify.simplify("2/10", "50/10"));
    }

    @Test
    void testSimplify6() {
        assertTrue(Simplify.simplify("7/2", "4/2"));
    }

    @Test
    void testSimplify7() {
        assertTrue(Simplify.simplify("11/6", "6/1"));
    }

    @Test
    void testSimplify8() {
        assertFalse(Simplify.simplify("2/3", "5/2"));
    }

    @Test
    void testSimplify9() {
        assertFalse(Simplify.simplify("5/2", "3/5"));
    }

    @Test
    void testSimplify10() {
        assertTrue(Simplify.simplify("2/4", "8/4"));
    }

    @Test
    void testSimplify11() {
        assertTrue(Simplify.simplify("2/4", "4/2"));
    }

    @Test
    void testSimplify12() {
        assertTrue(Simplify.simplify("1/5", "5/1"));
    }

    @Test
    void testSimplify13() {
        assertFalse(Simplify.simplify("1/5", "1/5"));
    }
}