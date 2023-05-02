// Histogram.java
package original;

import java.util.HashMap;
import java.util.Map;

class Histogram {

    /**
     * Given a string representing a space separated lowercase letters, return a dictionary
     * of the letter with the most repetition and containing the corresponding count.
     * If several letters have the same occurrence, return all of them.
     *
     * Example:
     * histogram('a b c') == {'a': 1, 'b': 1, 'c': 1}
     * histogram('a b b a') == {'a': 2, 'b': 2}
     * histogram('a b c a b') == {'a': 2, 'b': 2}
     * histogram('b b b b a') == {'b': 4}
     * histogram('') == {}
     *
     * > histogram("a b b a")
     * {"a": 2, "b": 2}
     * > histogram("a b c a b")
     * {"a": 2, "b": 2}
     * > histogram("a b c d g")
     * {"a": 1, "b": 1, "c": 1, "d": 1, "g": 1}
     * > histogram("r t g")
     * {"r": 1, "t": 1, "g": 1}
     * > histogram("b b b b a")
     * {"b": 4}
     * > histogram("r t g")
     * {"r": 1, "t": 1, "g": 1}
     * > histogram("")
     * {}
     * > histogram("a")
     * {"a": 1}
     */
    public static Map<String, Integer> histogram(String test) {
        Map<String, Integer> map = new HashMap<>();
        if (test == null || test.length() == 0) {
            return map;
        }
        String[] arr = test.split(" ");
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int max = 0;
        for (int i : map.values()) {
            max = Math.max(max, i);
        }
        Map<String, Integer> res = new HashMap<>();
        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                res.put(s, map.get(s));
            }
        }
        return res;
    }
}

// HistogramTest.java
package original;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {
    
    @Test
    void testEmptyString() {
        Map<String, Integer> expected = new HashMap<>();
        Map<String, Integer> actual = Histogram.histogram("");
        assertEquals(expected, actual);
    }
    
    @Test
    void testSingleLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        Map<String, Integer> actual = Histogram.histogram("a");
        assertEquals(expected, actual);
    }
    
    @Test
    void testMultipleLettersWithSameCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        Map<String, Integer> actual = Histogram.histogram("a b b a");
        assertEquals(expected, actual);
    }
    
    @Test
    void testMultipleLettersWithDifferentCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        Map<String, Integer> actual = Histogram.histogram("a b c a b");
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllLettersWithSameCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        expected.put("d", 1);
        expected.put("g", 1);
        Map<String, Integer> actual = Histogram.histogram("a b c d g");
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllLettersWithDifferentCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("r", 1);
        expected.put("t", 1);
        expected.put("g", 1);
        Map<String, Integer> actual = Histogram.histogram("r t g");
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllSameLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("b", 4);
        Map<String, Integer> actual = Histogram.histogram("b b b b a");
        assertEquals(expected, actual);
    }
    
    @Test
    void testNullString() {
        Map<String, Integer> expected = new HashMap<>();
        Map<String, Integer> actual = Histogram.histogram(null);
        assertEquals(expected, actual);
    }
    
    @Test
    void testStringWithSpaces() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        Map<String, Integer> actual = Histogram.histogram("a b c a b");
        assertEquals(expected, actual);
    }
    
    @Test
    void testStringWithTabs() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        Map<String, Integer> actual = Histogram.histogram("a\tb\tc\ta\tb");
        assertEquals(expected, actual);
    }
}