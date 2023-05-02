// Here is the source code for the test class ExtBoolArray_0Test

package de.beiri22.stringincrementor.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ExtBoolArray}.
 * It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
 */
class ExtBoolArray_0Test {

    @Test
    void testIsFalse1() {
        ExtBoolArray arr = new ExtBoolArray(5);
        assertTrue(arr.isFalse(0, 4));
    }

    @Test
    void testIsFalse2() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertTrue(arr.isFalse(0, 0));
    }

    @Test
    void testIsFalse3() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertFalse(arr.isFalse(0, 1));
    }

    @Test
    void testIsFalse4() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertFalse(arr.isFalse(2, 3));
    }

    @Test
    void testIsFalse5() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertFalse(arr.isFalse(1, 2));
    }

    @Test
    void testIsFalse6() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertFalse(arr.isFalse(0, 3));
    }

    @Test
    void testIsFalse7() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertFalse(arr.isFalse(1, 3));
    }

    @Test
    void testIsFalse8() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertFalse(arr.isFalse(2, 4));
    }

    @Test
    void testIsFalse9() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertFalse(arr.isFalse(0, 4));
    }

    @Test
    void testIsFalse10() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertFalse(arr.isFalse(3, 4));
    }
}