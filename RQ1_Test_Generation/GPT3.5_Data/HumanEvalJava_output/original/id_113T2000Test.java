// OddCount.java
package updated;

import java.util.ArrayList;
import java.util.List;

class OddCount {

    /**
     * Given a list of strings, where each string consists of only digits, return a list.
     * Each element i of the output should be "the number of odd elements in the
     * string i of the input." where all the i's should be replaced by the number
     * of odd digits in the i'th string of the input.
     *
     * >>> oddCount(['1234567'])
     * ["the number of odd elements 4n the str4ng 4 of the 4nput."]
     * >>> oddCount(['3',"11111111"])
     * ["the number of odd elements 1n the str1ng 1 of the 1nput.",
     * "the number of odd elements 8n the str8ng 8 of the 8nput."]
     *
     * > oddCount(["1234567"])
     * ["the number of odd elements 4n the str4ng 4 of the 4nput."]
     * > oddCount(["3", "11111111"])
     * ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput."]
     * > oddCount(["271", "137", "314"])
     * ["the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput."]
     */
    public static List<String> oddCount(List<String> lst) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            int count = 0;
            for (int j = 0; j < lst.get(i).length(); j++) {
                if (Character.getNumericValue(lst.get(i).charAt(j)) % 2 != 0) {
                    count++;
                }
            }
            result.add("the number of odd elements " + count + " in the string " + (i+1) + " of the input.");
        }
        return result;
    }
}

// OddCountTest.java
package updated;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
    
    @Test
    void testOddCountWithOneString() {
        List<String> lst = new ArrayList<String>();
        lst.add("1234567");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 4 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithTwoStrings() {
        List<String> lst = new ArrayList<String>();
        lst.add("3");
        lst.add("11111111");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 1 in the string 1 of the input.");
        expected.add("the number of odd elements 8 in the string 2 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithThreeStrings() {
        List<String> lst = new ArrayList<String>();
        lst.add("271");
        lst.add("137");
        lst.add("314");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 2 in the string 1 of the input.");
        expected.add("the number of odd elements 3 in the string 2 of the input.");
        expected.add("the number of odd elements 2 in the string 3 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithEmptyList() {
        List<String> lst = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithNullList() {
        List<String> lst = null;
        assertThrows(NullPointerException.class, () -> {
            OddCount.oddCount(lst);
        });
    }
    
    @Test
    void testOddCountWithOneEvenNumber() {
        List<String> lst = new ArrayList<String>();
        lst.add("2468");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 0 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithOneOddNumber() {
        List<String> lst = new ArrayList<String>();
        lst.add("13579");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 5 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithMixedNumbers() {
        List<String> lst = new ArrayList<String>();
        lst.add("123456789");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 5 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithLeadingZeros() {
        List<String> lst = new ArrayList<String>();
        lst.add("00123");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 2 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithTrailingZeros() {
        List<String> lst = new ArrayList<String>();
        lst.add("12300");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 2 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
}