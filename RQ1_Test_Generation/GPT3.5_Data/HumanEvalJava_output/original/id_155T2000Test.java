// EvenOddCountTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
    
    @Test
    void testEvenOddCountWithPositiveEvenNumber() {
        List<Integer> expected = Arrays.asList(2, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(2468);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithPositiveOddNumber() {
        List<Integer> expected = Arrays.asList(0, 4);
        List<Integer> actual = EvenOddCount.evenOddCount(1357);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithNegativeEvenNumber() {
        List<Integer> expected = Arrays.asList(2, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(-2468);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithNegativeOddNumber() {
        List<Integer> expected = Arrays.asList(0, 4);
        List<Integer> actual = EvenOddCount.evenOddCount(-1357);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithZero() {
        List<Integer> expected = Arrays.asList(1, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(0);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithSingleDigitPositiveEvenNumber() {
        List<Integer> expected = Arrays.asList(1, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithSingleDigitPositiveOddNumber() {
        List<Integer> expected = Arrays.asList(0, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(7);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithSingleDigitNegativeEvenNumber() {
        List<Integer> expected = Arrays.asList(1, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(-8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithSingleDigitNegativeOddNumber() {
        List<Integer> expected = Arrays.asList(0, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(-7);
        assertEquals(expected, actual);
    }
    
    @Test
    void testEvenOddCountWithMaxValue() {
        List<Integer> expected = Arrays.asList(0, 19);
        List<Integer> actual = EvenOddCount.evenOddCount(Integer.MAX_VALUE);
        assertEquals(expected, actual);
    }
}