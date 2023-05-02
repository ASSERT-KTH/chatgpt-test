// DigitsumTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains one unit test case for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
/**
		* Test for digitSum() method.
		*/
    @Test
    void test() {
        assertEquals(Digitsum.digitSum(""), 0);
        assertEquals(Digitsum.digitSum("abAB"), 0);
        assertEquals(Digitsum.digitSum("abcCd"), 0);
        assertEquals(Digitsum.digitSum("helloE"), 1);
        assertEquals(Digitsum.digitSum("woArBld"), 1);
        assertEquals(Digitsum.digitSum("aAaaaXa"), 12);
    }
}