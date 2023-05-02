// Here's the completed DecimalToBinaryTest.java file:

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link DecimalToBinary}.
 * It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
 */
class DecimalToBinaryTest {

    @Test
    void testDecimalToBinaryZero() {
        assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
    }

    @Test
    void testDecimalToBinaryOne() {
        assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
    }

    @Test
    void testDecimalToBinaryTwo() {
        assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
    }

    @Test
    void testDecimalToBinaryThree() {
        assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
    }

    @Test
    void testDecimalToBinaryTen() {
        assertEquals("db1010db", DecimalToBinary.decimalToBinary(10));
    }

    @Test
    void testDecimalToBinaryFifteen() {
        assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
    }

    @Test
    void testDecimalToBinarySixteen() {
        assertEquals("db10000db", DecimalToBinary.decimalToBinary(16));
    }

    @Test
    void testDecimalToBinaryThirtyTwo() {
        assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
    }

    @Test
    void testDecimalToBinaryOneHundred() {
        assertEquals("db1100100db", DecimalToBinary.decimalToBinary(100));
    }

    @Test
    void testDecimalToBinaryOneHundredThree() {
        assertEquals("db1100111db", DecimalToBinary.decimalToBinary(103));
    }
}