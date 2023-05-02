// GenerateIntegers.java
package updated;

import java.util.ArrayList;
import java.util.List;

class GenerateIntegers {

    /**
     * Given two positive integers a and b, return the even digits between a
     * and b, in ascending order.
     *
     * For example:
     * generateIntegers(2, 8) => [2, 4, 6, 8]
     * generateIntegers(8, 2) => [2, 4, 6, 8]
     * generateIntegers(10, 14) => []
     *
     * > generateIntegers(2, 10)
     * [2, 4, 6, 8, 10]
     * > generateIntegers(10, 2)
     * [2, 4, 6, 8, 10]
     * > generateIntegers(132, 2)
     * [2]
     * > generateIntegers(17, 89)
     * [18, 20, 22, 24, 26, 28, 80, 82, 84, 86, 88]
     */
    public static List<Integer> generateIntegers(int a, int b) {
        int lower = Math.min(a, b);
        int upper = Math.max(a, b);
        List<Integer> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }
}

// GenerateIntegersTest.java
package updated;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {
    
    @Test
    void testGenerateIntegers1() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = GenerateIntegers.generateIntegers(2, 10);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = GenerateIntegers.generateIntegers(10, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers3() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        List<Integer> actual = GenerateIntegers.generateIntegers(132, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers4() {
        List<Integer> expected = new ArrayList<>();
        expected.add(18);
        expected.add(20);
        expected.add(22);
        expected.add(24);
        expected.add(26);
        expected.add(28);
        expected.add(80);
        expected.add(82);
        expected.add(84);
        expected.add(86);
        expected.add(88);
        List<Integer> actual = GenerateIntegers.generateIntegers(17, 89);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers5() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = GenerateIntegers.generateIntegers(10, 14);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers6() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Integer> actual = GenerateIntegers.generateIntegers(2, 8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers7() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Integer> actual = GenerateIntegers.generateIntegers(8, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers8() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = GenerateIntegers.generateIntegers(2, 10);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers9() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = GenerateIntegers.generateIntegers(10, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers10() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        List<Integer> actual = GenerateIntegers.generateIntegers(132, 2);
        assertEquals(expected, actual);
    }
}