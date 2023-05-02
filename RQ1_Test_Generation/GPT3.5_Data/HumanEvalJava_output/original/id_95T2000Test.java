// CheckDictCase.java
package updated;

import java.util.Map;

public class CheckDictCase {

    /**
     * Given a dictionary, return True if all keys are strings in lower
     * case or all keys are strings in upper case, else return False.
     * The function should return False is the given dictionary is empty.
     * 
     * @param dict the dictionary to be checked
     * @return true if all keys are strings in lower case or all keys are strings in upper case, else false
     */
    public static boolean checkDictCase(Map<Object, Object> dict) {
        if (dict.isEmpty()) {
            return false;
        }
        boolean allLower = true;
        boolean allUpper = true;
        for (Object key : dict.keySet()) {
            if (key instanceof String) {
                String s = (String) key;
                if (!s.equals(s.toLowerCase())) {
                    allLower = false;
                }
                if (!s.equals(s.toUpperCase())) {
                    allUpper = false;
                }
            } else {
                return false;
            }
        }
        return allLower || allUpper;
    }
}

// CheckDictCaseTest.java
package updated;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CheckDictCase}.
 * It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Map)} method.
 */
class CheckDictCaseTest {

    @Test
    void testAllLower() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testAllUpper() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put("STATE", "NC");
        dict.put("ZIP", "12345");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testMixedCase() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("B", "banana");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testEmptyDict() {
        Map<Object, Object> dict = new HashMap<>();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testNonStringKey() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put(5, "banana");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testDuplicateKeys() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("a", "apple");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testSingleKey() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put("fruit", "Orange");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testSingleUpperCaseKey() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put("FRUIT", "Orange");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testSingleLowerCaseKey() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put("fruit", "orange");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testMultipleKeys() {
        Map<Object, Object> dict = new HashMap<>();
        dict.put("fruit", "Orange");
        dict.put("taste", "Sweet");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }
}