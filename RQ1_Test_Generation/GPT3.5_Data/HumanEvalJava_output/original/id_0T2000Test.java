// HasCloseElementsTest.java
package updated;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HasCloseElements}.
 * It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
 */
class HasCloseElementsTest {

    @Test
    void testHasCloseElementsWithNoCloseElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.5));
    }

    @Test
    void testHasCloseElementsWithCloseElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 0.3));
    }

    @Test
    void testHasCloseElementsWithCloseElements2() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 0.3));
    }

    @Test
    void testHasCloseElementsWithNoCloseElements2() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.05));
    }

    @Test
    void testHasCloseElementsWithCloseElements3() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 0.95));
    }

    @Test
    void testHasCloseElementsWithNoCloseElements3() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.8));
    }

    @Test
    void testHasCloseElementsWithCloseElements4() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 0.1));
    }

    @Test
    void testHasCloseElementsWithCloseElements5() {
        List<Double> numbers = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 1.0));
    }

    @Test
    void testHasCloseElementsWithNoCloseElements4() {
        List<Double> numbers = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.5));
    }
}