import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void testDigitsWithOneDigit() {
        assertEquals(1, Digits.digits(1));
    }

    @Test
    void testDigitsWithEvenDigits() {
        assertEquals(0, Digits.digits(2468));
    }

    @Test
    void testDigitsWithOddDigits() {
        assertEquals(15, Digits.digits(235));
    }

    @Test
    void testDigitsWithMixedDigits() {
        assertEquals(5, Digits.digits(5014));
    }

    @Test
    void testDigitsWithAllOddDigits() {
        assertEquals(315, Digits.digits(98765));
    }

    @Test
    void testDigitsWithAllEvenDigitsAndZero() {
        assertEquals(0, Digits.digits(120));
    }

    @Test
    void testDigitsWithAllEvenDigits() {
        assertEquals(0, Digits.digits(2468));
    }

    @Test
    void testDigitsWithLeadingZeros() {
        assertEquals(5, Digits.digits(0054));
    }

    @Test
    void testDigitsWithTrailingZeros() {
        assertEquals(5, Digits.digits(5400));
    }

    @Test
    void testDigitsWithNegativeNumber() {
        assertEquals(15, Digits.digits(-235));
    }
}