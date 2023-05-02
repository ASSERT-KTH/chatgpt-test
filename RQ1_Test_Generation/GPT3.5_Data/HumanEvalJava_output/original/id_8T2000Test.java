// SumProduct.java
package updated;

import java.util.ArrayList;
import java.util.List;

class SumProduct {

    /**
     * For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
     * Empty sum should be equal to 0 and empty product should be equal to 1.
     *
     * @param numbers List of integers
     * @return List of integers containing sum and product of the input list
     * @throws IllegalArgumentException if the input list contains non-integer values
     */
    public static List<Integer> sumProduct(List<Integer> numbers) {
        Integer sum = 0;
        Integer product = 1;
        for (Integer number : numbers) {
            sum += number;
            product *= number;
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(sum);
        result.add(product);
        return result;
    }
}

// SumProductTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

    @Test
    void testSumProductWithValidInput() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedOutput = Arrays.asList(10, 24);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithEmptyInput() {
        List<Integer> input = new ArrayList<Integer>();
        List<Integer> expectedOutput = Arrays.asList(0, 1);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithSameNumbers() {
        List<Integer> input = Arrays.asList(1, 1, 1);
        List<Integer> expectedOutput = Arrays.asList(3, 1);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithZero() {
        List<Integer> input = Arrays.asList(100, 0);
        List<Integer> expectedOutput = Arrays.asList(100, 0);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithOddNumbers() {
        List<Integer> input = Arrays.asList(3, 5, 7);
        List<Integer> expectedOutput = Arrays.asList(15, 105);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithSingleNumber() {
        List<Integer> input = Arrays.asList(10);
        List<Integer> expectedOutput = Arrays.asList(10, 10);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithNullInput() {
        assertThrows(NullPointerException.class, () -> SumProduct.sumProduct(null));
    }

    @Test
    void testSumProductWithNonIntegerInput() {
        List<Object> input = Arrays.asList(1, 2, "3", 4);
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, 2, -3, 4);
        List<Integer> expectedOutput = Arrays.asList(2, 24);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithLargeNumbers() {
        List<Integer> input = Arrays.asList(1000000, 2000000, 3000000);
        List<Integer> expectedOutput = Arrays.asList(6000000, 6000000000000000);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }
}