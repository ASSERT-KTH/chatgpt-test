// RemoveDuplicates.java
package updated;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class RemoveDuplicates {

    /**
     * From a list of integers, remove all elements that occur more than once.
     * Keep order of elements left the same as in the input.
     *
     * > removeDuplicates([1, 2, 3, 2, 4])
     * [1, 3, 4]
     * > removeDuplicates([])
     * []
     * > removeDuplicates([1, 2, 3, 4])
     * [1, 2, 3, 4]
     * > removeDuplicates([1, 2, 3, 2, 4, 3, 5])
     * [1, 4, 5]
     */
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        Set<Integer> set = new LinkedHashSet<Integer>(numbers);
        List<Integer> result = new ArrayList<Integer>(set);
        return result;
    }
}

// RemoveDuplicatesTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        List<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 4));
        List<Integer> expectedOutput1 = new ArrayList<Integer>(Arrays.asList(1, 3, 4));
        assertEquals(expectedOutput1, RemoveDuplicates.removeDuplicates(input1));

        List<Integer> input2 = new ArrayList<Integer>();
        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        assertEquals(expectedOutput2, RemoveDuplicates.removeDuplicates(input2));

        List<Integer> input3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expectedOutput3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        assertEquals(expectedOutput3, RemoveDuplicates.removeDuplicates(input3));

        List<Integer> input4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 4, 3, 5));
        List<Integer> expectedOutput4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expectedOutput4, RemoveDuplicates.removeDuplicates(input4));

        List<Integer> input5 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1));
        List<Integer> expectedOutput5 = new ArrayList<Integer>(Arrays.asList(1));
        assertEquals(expectedOutput5, RemoveDuplicates.removeDuplicates(input5));

        List<Integer> input6 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expectedOutput6 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(expectedOutput6, RemoveDuplicates.removeDuplicates(input6));

        List<Integer> input7 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expectedOutput7 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(expectedOutput7, RemoveDuplicates.removeDuplicates(input7));

        List<Integer> input8 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        List<Integer> expectedOutput8 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(expectedOutput8, RemoveDuplicates.removeDuplicates(input8));

        List<Integer> input9 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2));
        List<Integer> expectedOutput9 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(expectedOutput9, RemoveDuplicates.removeDuplicates(input9));

        List<Integer> input10 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3));
        List<Integer> expectedOutput10 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(expectedOutput10, RemoveDuplicates.removeDuplicates(input10));
    }
}