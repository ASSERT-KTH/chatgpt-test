// TriplesSumToZero.java
package updated;

import java.util.List;

class TriplesSumToZero {

    /**
     * triplesSumToZero takes a list of integers as an input.
     * it returns True if there are three distinct elements in the list that
     * sum to zero, and False otherwise.
     *
     * > triplesSumToZero([1, 3, 5, 0])
     * false
     * > triplesSumToZero([1, 3, 5, -1])
     * false
     * > triplesSumToZero([1, 3, -2, 1])
     * true
     * > triplesSumToZero([1, 2, 3, 7])
     * false
     * > triplesSumToZero([1, 2, 5, 7])
     * false
     * > triplesSumToZero([2, 4, -5, 3, 9, 7])
     * true
     * > triplesSumToZero([1])
     * false
     * > triplesSumToZero([1, 3, 5, -100])
     * false
     * > triplesSumToZero([100, 3, 5, -100])
     * false
     */
    public static Boolean triplesSumToZero(List<Integer> l) {
        if (l == null || l.size() < 3) {
            return false;
        }
        for (int i = 0; i < l.size() - 2; i++) {
            for (int j = i + 1; j < l.size() - 1; j++) {
                for (int k = j + 1; k < l.size(); k++) {
                    if (l.get(i) + l.get(j) + l.get(k) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// TriplesSumToZeroTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
    
    @Test
    void testNullList() {
        assertFalse(TriplesSumToZero.triplesSumToZero(null));
    }
    
    @Test
    void testEmptyList() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList()));
    }
    
    @Test
    void testListWithOneElement() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1)));
    }
    
    @Test
    void testListWithTwoElements() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2)));
    }
    
    @Test
    void testListWithThreeElementsSummingToZero() {
        assertTrue(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, -1, 0)));
    }
    
    @Test
    void testListWithThreeElementsNotSummingToZero() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2, 3)));
    }
    
    @Test
    void testListWithFourElementsSummingToZero() {
        assertTrue(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, -1, 2, -2)));
    }
    
    @Test
    void testListWithFourElementsNotSummingToZero() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2, 3, 4)));
    }
    
    @Test
    void testListWithSixElementsSummingToZero() {
        assertTrue(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, -1, 2, -2, 3, -3)));
    }
    
    @Test
    void testListWithSixElementsNotSummingToZero() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }
}