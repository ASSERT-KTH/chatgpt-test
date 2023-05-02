// IsNestedTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsNested}.
 * It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
 */
class IsNestedTest {

    @Test
    void testIsNested1() {
        assertTrue(IsNested.isNested("[[]]"));
    }

    @Test
    void testIsNested2() {
        assertFalse(IsNested.isNested("[]]]]]]][[[[[]"));
    }

    @Test
    void testIsNested3() {
        assertFalse(IsNested.isNested("[][]"));
    }

    @Test
    void testIsNested4() {
        assertFalse(IsNested.isNested("[]"));
    }

    @Test
    void testIsNested5() {
        assertTrue(IsNested.isNested("[[[[]]]]"));
    }

    @Test
    void testIsNested6() {
        assertFalse(IsNested.isNested("[]]]]]]]]]]"));
    }

    @Test
    void testIsNested7() {
        assertTrue(IsNested.isNested("[][][[]]"));
    }

    @Test
    void testIsNested8() {
        assertFalse(IsNested.isNested("[[]"));
    }

    @Test
    void testIsNested9() {
        assertFalse(IsNested.isNested("[]]"));
    }

    @Test
    void testIsNested10() {
        assertTrue(IsNested.isNested("[[]][["));
    }

    @Test
    void testIsNested11() {
        assertTrue(IsNested.isNested("[[][]]"));
    }

    @Test
    void testIsNested12() {
        assertFalse(IsNested.isNested(""));
    }

    @Test
    void testIsNested13() {
        assertFalse(IsNested.isNested("[[[[[[[["));
    }

    @Test
    void testIsNested14() {
        assertFalse(IsNested.isNested("]]]]]]]]"));
    }
}