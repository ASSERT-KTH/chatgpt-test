// Add1Test.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {
    
    @Test
    void testAddWithEmptyList() {
        List<Integer> lst = Arrays.asList();
        int result = Add1.add(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testAddWithOneElementList() {
        List<Integer> lst = Arrays.asList(5);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testAddWithTwoElementList() {
        List<Integer> lst = Arrays.asList(4, 5);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testAddWithThreeElementList() {
        List<Integer> lst = Arrays.asList(4, 5, 6);
        int result = Add1.add(lst);
        assertEquals(6, result);
    }
    
    @Test
    void testAddWithFourElementList() {
        List<Integer> lst = Arrays.asList(4, 2, 6, 7);
        int result = Add1.add(lst);
        assertEquals(2, result);
    }
    
    @Test
    void testAddWithTwoEvenElementsList() {
        List<Integer> lst = Arrays.asList(4, 88);
        int result = Add1.add(lst);
        assertEquals(88, result);
    }
    
    @Test
    void testAddWithMultipleElementsList() {
        List<Integer> lst = Arrays.asList(4, 5, 6, 7, 2, 122);
        int result = Add1.add(lst);
        assertEquals(122, result);
    }
    
    @Test
    void testAddWithZeroElementList() {
        List<Integer> lst = Arrays.asList(4, 0, 6, 7);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testAddWithAllEvenElementsList() {
        List<Integer> lst = Arrays.asList(4, 4, 6, 8);
        int result = Add1.add(lst);
        assertEquals(12, result);
    }
    
    @Test
    void testAddWithAllOddElementsList() {
        List<Integer> lst = Arrays.asList(3, 5, 7, 9);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }
}