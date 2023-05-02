// FilterIntegersTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
    
    @Test
    void testFilterIntegersWithMixedValues() {
        List<Object> values = new ArrayList<>();
        values.add("a");
        values.add(3.14);
        values.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(5);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithNonIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add("abc");
        values.add(new Object());
        values.add(new ArrayList<>());
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithEmptyList() {
        List<Object> values = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithMixedValues2() {
        List<Object> values = new ArrayList<>();
        values.add(4);
        values.add(new Object());
        values.add(new ArrayList<>());
        values.add(23.2);
        values.add(9);
        values.add("adasd");
        List<Object> expected = new ArrayList<>();
        expected.add(4);
        expected.add(9);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithRepeatedValues() {
        List<Object> values = new ArrayList<>();
        values.add(3);
        values.add("c");
        values.add(3);
        values.add(3);
        values.add("a");
        values.add("b");
        List<Object> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        expected.add(3);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithAllIntegers() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithAllNonIntegers() {
        List<Object> values = new ArrayList<>();
        values.add("a");
        values.add(3.14);
        values.add(new Object());
        values.add(new ArrayList<>());
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithNullValue() {
        List<Object> values = new ArrayList<>();
        values.add(null);
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithNegativeValues() {
        List<Object> values = new ArrayList<>();
        values.add(-1);
        values.add(-2);
        values.add(3);
        List<Object> expected = new ArrayList<>();
        expected.add(-1);
        expected.add(-2);
        expected.add(3);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFilterIntegersWithLargeValues() {
        List<Object> values = new ArrayList<>();
        values.add(Integer.MAX_VALUE);
        values.add(Integer.MIN_VALUE);
        values.add(0);
        List<Object> expected = new ArrayList<>();
        expected.add(Integer.MAX_VALUE);
        expected.add(Integer.MIN_VALUE);
        expected.add(0);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
}