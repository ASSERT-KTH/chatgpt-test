// AddElementsTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
    
    @Test
    void testAddElementsWithPositiveNumbers() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 4;
        int expectedSum = 6;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithNegativeNumbers() {
        List<Integer> arr = Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9);
        int k = 4;
        int expectedSum = -6;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithMixedNumbers() {
        List<Integer> arr = Arrays.asList(-1, 2, -3, 4, -5, 6, -7, 8, -9);
        int k = 4;
        int expectedSum = 3;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithZero() {
        List<Integer> arr = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 4;
        int expectedSum = 0;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithOneElement() {
        List<Integer> arr = Arrays.asList(1);
        int k = 1;
        int expectedSum = 1;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithAllElementsHavingTwoDigits() {
        List<Integer> arr = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
        int k = 4;
        int expectedSum = 33;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithAllElementsHavingMoreThanTwoDigits() {
        List<Integer> arr = Arrays.asList(111, 222, 333, 444, 555, 666, 777, 888, 999);
        int k = 4;
        int expectedSum = 0;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithAllElementsHavingExactlyTwoDigits() {
        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
        int k = 4;
        int expectedSum = 30;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithKEqualToArrayLength() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 9;
        int expectedSum = 45;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    void testAddElementsWithKGreaterThanArrayLength() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 10;
        int expectedSum = 45;
        int actualSum = AddElements.addElements(arr, k);
        assertEquals(expectedSum, actualSum);
    }
}