// TotalMatchTest.java
package original;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TotalMatch}.
 * It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
 */
class TotalMatchTest {

    @Test
    void testEmptyLists() {
        List<Object> lst1 = Collections.emptyList();
        List<Object> lst2 = Collections.emptyList();
        List<Object> expected = Collections.emptyList();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testSameTotalChars() {
        List<Object> lst1 = Arrays.asList("hi", "admin");
        List<Object> lst2 = Arrays.asList("hi", "hi");
        List<Object> expected = Arrays.asList("hi", "hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testFirstListHasLessTotalChars() {
        List<Object> lst1 = Arrays.asList("hi", "admin");
        List<Object> lst2 = Arrays.asList("hi", "hi", "admin", "project");
        List<Object> expected = Arrays.asList("hi", "admin");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testSecondListHasLessTotalChars() {
        List<Object> lst1 = Arrays.asList("hi", "admin");
        List<Object> lst2 = Arrays.asList("hI", "hi", "hi");
        List<Object> expected = Arrays.asList("hI", "hi", "hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testSingleElementLists() {
        List<Object> lst1 = Arrays.asList("4");
        List<Object> lst2 = Arrays.asList("1", "2", "3", "4", "5");
        List<Object> expected = Arrays.asList("4");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testCaseInsensitive() {
        List<Object> lst1 = Arrays.asList("hi", "admin");
        List<Object> lst2 = Arrays.asList("hI", "Hi");
        List<Object> expected = Arrays.asList("hI", "Hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testLongerStringInFirstList() {
        List<Object> lst1 = Arrays.asList("hi", "admin");
        List<Object> lst2 = Arrays.asList("hI", "hi", "hii");
        List<Object> expected = Arrays.asList("hi", "admin");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testFirstListIsEmpty() {
        List<Object> lst1 = Collections.emptyList();
        List<Object> lst2 = Arrays.asList("this");
        List<Object> expected = Collections.emptyList();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testSecondListIsEmpty() {
        List<Object> lst1 = Arrays.asList("this");
        List<Object> lst2 = Collections.emptyList();
        List<Object> expected = Collections.emptyList();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void testMixedLists() {
        List<Object> lst1 = Arrays.asList("hi", 1, "admin", 2);
        List<Object> lst2 = Arrays.asList("hI", "hi", "hi", 3);
        List<Object> expected = Arrays.asList("hI", "hi", "hi", 3);
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
}