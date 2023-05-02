// RollingMax.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class RollingMax {

    /**
     * From a given list of integers, generate a list of rolling maximum element found until given moment
     * in the sequence.
     *
     * @param numbers List of integers
     * @return List of rolling maximum elements
     */
    public static List<Integer> rollingMax(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        Integer max = null;
        for (Integer number : numbers) {
            if (max == null || number > max) {
                max = number;
            }
            result.add(max);
        }
        return result;
    }
}

// RollingMaxTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class of {@link RollingMax}.
 * It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
 */
class RollingMaxTest {

    @Test
    void testRollingMaxWithValidInput() {
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 3, 4, 2);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 3, 3, 4, 4);
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithEmptyInput() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithAscendingInput() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 4);
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithDescendingInput() {
        List<Integer> input = Arrays.asList(4, 3, 2, 1);
        List<Integer> expectedOutput = Arrays.asList(4, 4, 4, 4);
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithSingleElementInput() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expectedOutput = Arrays.asList(5);
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithNegativeInput() {
        List<Integer> input = Arrays.asList(-1, -2, -3, -2, -3, -4, -2);
        List<Integer> expectedOutput = Arrays.asList(-1, -1, -1, -1, -1, -1, -1);
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithMixedInput() {
        List<Integer> input = Arrays.asList(3, 2, 3, 100, 3);
        List<Integer> expectedOutput = Arrays.asList(3, 3, 3, 100, 100);
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithNullInput() {
        assertThrows(NullPointerException.class, () -> RollingMax.rollingMax(null));
    }

    @Test
    void testRollingMaxWithInvalidInput() {
        List<Object> input = new ArrayList<>();
        input.add(1);
        input.add("2");
        assertThrows(IllegalArgumentException.class, () -> RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithLargeInput() {
        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            input.add(i);
        }
        List<Integer> expectedOutput = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            expectedOutput.add(i);
        }
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }
}