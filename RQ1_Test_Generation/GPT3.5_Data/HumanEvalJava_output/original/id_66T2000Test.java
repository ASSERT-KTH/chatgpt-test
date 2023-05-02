// Digitsum.java
package original;

class Digitsum {

    /**
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     * Examples:
     * digitSum("") => 0
     * digitSum("abAB") => 131
     * digitSum("abcCd") => 67
     * digitSum("helloE") => 69
     * digitSum("woArBld") => 131
     * digitSum("aAaaaXa") => 153
     *
     * > digitSum("")
     * 0
     * > digitSum("abAB")
     * 131
     * > digitSum("abcCd")
     * 67
     * > digitSum("helloE")
     * 69
     * > digitSum("woArBld")
     * 131
     * > digitSum("aAaaaXa")
     * 153
     * > digitSum(" How are yOu?")
     * 151
     * > digitSum("You arE Very Smart")
     * 327
     */
    public static int digitSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sum += c;
            }
        }
        return sum;
    }
}

// DigitsumTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
    
    @Test
    void testEmptyString() {
        assertEquals(0, Digitsum.digitSum(""));
    }
    
    @Test
    void testOnlyLowerCase() {
        assertEquals(0, Digitsum.digitSum("abcde"));
    }
    
    @Test
    void testOnlyUpperCase() {
        assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
    }
    
    @Test
    void testMixedCase() {
        assertEquals(131, Digitsum.digitSum("woArBld"));
    }
    
    @Test
    void testMixedCaseWithNumbers() {
        assertEquals(153, Digitsum.digitSum("aAaaaXa"));
    }
    
    @Test
    void testMixedCaseWithSpaces() {
        assertEquals(151, Digitsum.digitSum(" How are yOu?"));
    }
    
    @Test
    void testOnlyNumbers() {
        assertEquals(0, Digitsum.digitSum("12345"));
    }
    
    @Test
    void testSpecialCharacters() {
        assertEquals(0, Digitsum.digitSum("!@#$%"));
    }
    
    @Test
    void testMixedCaseWithSpecialCharacters() {
        assertEquals(131, Digitsum.digitSum("woArBld!@#$%"));
    }
    
    @Test
    void testUpperCaseWithSpecialCharacters() {
        assertEquals(131, Digitsum.digitSum("woArBld!@#$%ABCD"));
    }
}