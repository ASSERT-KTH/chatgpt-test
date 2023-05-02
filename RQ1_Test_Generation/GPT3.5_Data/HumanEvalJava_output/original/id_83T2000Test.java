// StartsOneEndsTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StartsOneEnds}.
 * It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
 */
class StartsOneEndsTest {

    @Test
    void testStartsOneEndsOneDigit() {
        assertEquals(1, StartsOneEnds.startsOneEnds(1));
    }

    @Test
    void testStartsOneEndsTwoDigits() {
        assertEquals(18, StartsOneEnds.startsOneEnds(2));
    }

    @Test
    void testStartsOneEndsThreeDigits() {
        assertEquals(180, StartsOneEnds.startsOneEnds(3));
    }

    @Test
    void testStartsOneEndsFourDigits() {
        assertEquals(1800, StartsOneEnds.startsOneEnds(4));
    }

    @Test
    void testStartsOneEndsFiveDigits() {
        assertEquals(18000, StartsOneEnds.startsOneEnds(5));
    }

    @Test
    void testStartsOneEndsSixDigits() {
        assertEquals(180000, StartsOneEnds.startsOneEnds(6));
    }

    @Test
    void testStartsOneEndsSevenDigits() {
        assertEquals(1800000, StartsOneEnds.startsOneEnds(7));
    }

    @Test
    void testStartsOneEndsEightDigits() {
        assertEquals(18000000, StartsOneEnds.startsOneEnds(8));
    }

    @Test
    void testStartsOneEndsNineDigits() {
        assertEquals(180000000, StartsOneEnds.startsOneEnds(9));
    }

    @Test
    void testStartsOneEndsTenDigits() {
        assertEquals(1800000000, StartsOneEnds.startsOneEnds(10));
    }
}