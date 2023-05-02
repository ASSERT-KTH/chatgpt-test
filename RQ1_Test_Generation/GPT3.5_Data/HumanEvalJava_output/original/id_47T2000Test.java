// MedianTest.java
package original;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {
    
    @Test
    void testMedianOdd() {
        List<Integer> l = Arrays.asList(3, 1, 2, 4, 5);
        assertEquals(3, Median.median(l));
    }
    
    @Test
    void testMedianEven() {
        List<Integer> l = Arrays.asList(-10, 4, 6, 1000, 10, 20);
        assertEquals(8.0, Median.median(l));
    }
    
    @Test
    void testMedianSingleElement() {
        List<Integer> l = Collections.singletonList(5);
        assertEquals(5, Median.median(l));
    }
    
    @Test
    void testMedianTwoElements() {
        List<Integer> l = Arrays.asList(6, 5);
        assertEquals(5.5, Median.median(l));
    }
    
    @Test
    void testMedianRepeatedElements() {
        List<Integer> l = Arrays.asList(8, 1, 3, 9, 9, 2, 7);
        assertEquals(7, Median.median(l));
    }
    
    @Test
    void testMedianEmptyList() {
        List<Integer> l = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> Median.median(l));
    }
    
    @Test
    void testMedianNullList() {
        assertThrows(NullPointerException.class, () -> Median.median(null));
    }
    
    @Test
    void testMedianDescendingOrder() {
        List<Integer> l = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(3, Median.median(l));
    }
    
    @Test
    void testMedianAscendingOrder() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3, Median.median(l));
    }
    
    @Test
    void testMedianRandomOrder() {
        List<Integer> l = Arrays.asList(5, 2, 4, 1, 3);
        assertEquals(3, Median.median(l));
    }
}