// MeanAbsoluteDeviationTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MeanAbsoluteDeviation}.
 * It contains ten unit test cases for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
 */
class MeanAbsoluteDeviationTest {

    @Test
    void testEmptyList() {
        List<Double> numbers = Arrays.asList();
        Double expected = null;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of empty list should be null");
    }

    @Test
    void testSingleElementList() {
        List<Double> numbers = Arrays.asList(1.0);
        Double expected = 0.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of single element list should be 0.0");
    }

    @Test
    void testTwoElementList() {
        List<Double> numbers = Arrays.asList(1.0, 2.0);
        Double expected = 0.5;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of two element list should be 0.5");
    }

    @Test
    void testThreeElementList() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        Double expected = 0.6666666666666666;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of three element list should be 0.6666666666666666");
    }

    @Test
    void testFourElementList() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        Double expected = 1.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of four element list should be 1.0");
    }

    @Test
    void testFiveElementList() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double expected = 1.2;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of five element list should be 1.2");
    }

    @Test
    void testNegativeNumbers() {
        List<Double> numbers = Arrays.asList(-1.0, -2.0, -3.0, -4.0, -5.0);
        Double expected = 1.2;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of negative numbers should be 1.2");
    }

    @Test
    void testMixedNumbers() {
        List<Double> numbers = Arrays.asList(-1.0, 2.0, -3.0, 4.0, -5.0);
        Double expected = 2.4;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of mixed numbers should be 2.4");
    }

    @Test
    void testRepeatedNumbers() {
        List<Double> numbers = Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0);
        Double expected = 0.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of repeated numbers should be 0.0");
    }

    @Test
    void testLargeNumbers() {
        List<Double> numbers = Arrays.asList(1000000.0, 2000000.0, 3000000.0, 4000000.0, 5000000.0);
        Double expected = 1200000.0;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of large numbers should be 1200000.0");
    }

    @Test
    void testDecimalNumbers() {
        List<Double> numbers = Arrays.asList(0.1, 0.2, 0.3, 0.4, 0.5);
        Double expected = 0.12;
        Double actual = MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, "MAD of decimal numbers should be 0.12");
    }
}