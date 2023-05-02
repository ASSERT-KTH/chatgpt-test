// CountUpTo.java
package scenario1;

import java.util.ArrayList;
import java.util.List;

class CountUpTo {

    public static List<Integer> countUpTo(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 2;
        while (i <= n) {
            if (isPrime(i)) {
                result.add(i);
            }
            i++;
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// CountUpToTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
    
    @Test
    void testCountUpToWithNegativeNumber() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = CountUpTo.countUpTo(-5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithZero() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = CountUpTo.countUpTo(0);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = CountUpTo.countUpTo(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithTwo() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        List<Integer> actual = CountUpTo.countUpTo(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithTen() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7));
        List<Integer> actual = CountUpTo.countUpTo(10);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithTwenty() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        List<Integer> actual = CountUpTo.countUpTo(20);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithThirty() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        List<Integer> actual = CountUpTo.countUpTo(30);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithHundred() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        List<Integer> actual = CountUpTo.countUpTo(100);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithThousand() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541));
        List<Integer> actual = CountUpTo.countUpTo(1000);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithLargeNumber() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997));
        List<Integer> actual = CountUpTo.countUpTo(10000);
        assertEquals(expected, actual);
    }
}