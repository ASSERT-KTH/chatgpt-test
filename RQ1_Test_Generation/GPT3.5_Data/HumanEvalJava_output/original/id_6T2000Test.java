// ParseNestedParensTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class ParseNestedParensTest {

    /**
     * Test case for empty input string.
     */
    @Test
    void testEmptyString() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = ParseNestedParens.parseNestedParens("");
        assertEquals(expected, result);
    }

    /**
     * Test case for single group with maximum nesting level of 1.
     */
    @Test
    void testSingleGroupMaxLevel1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> result = ParseNestedParens.parseNestedParens("()");
        assertEquals(expected, result);
    }

    /**
     * Test case for single group with maximum nesting level of 2.
     */
    @Test
    void testSingleGroupMaxLevel2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()())");
        assertEquals(expected, result);
    }

    /**
     * Test case for single group with maximum nesting level of 3.
     */
    @Test
    void testSingleGroupMaxLevel3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        List<Integer> result = ParseNestedParens.parseNestedParens("((()))");
        assertEquals(expected, result);
    }

    /**
     * Test case for multiple groups with varying maximum nesting levels.
     */
    @Test
    void testMultipleGroups() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(1);
        expected.add(3);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())");
        assertEquals(expected, result);
    }

    /**
     * Test case for multiple groups with maximum nesting level of 1.
     */
    @Test
    void testMultipleGroupsMaxLevel1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        List<Integer> result = ParseNestedParens.parseNestedParens("() (()) ()");
        assertEquals(expected, result);
    }

    /**
     * Test case for multiple groups with maximum nesting level of 2.
     */
    @Test
    void testMultipleGroupsMaxLevel2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(2);
        List<Integer> result = ParseNestedParens.parseNestedParens("() (()()) ((()))");
        assertEquals(expected, result);
    }

    /**
     * Test case for multiple groups with maximum nesting level of 3.
     */
    @Test
    void testMultipleGroupsMaxLevel3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(3);
        expected.add(3);
        List<Integer> result = ParseNestedParens.parseNestedParens("((())) (((()))) ((()))");
        assertEquals(expected, result);
    }

    /**
     * Test case for single group with maximum nesting level of 4.
     */
    @Test
    void testSingleGroupMaxLevel4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()(())((())))");
        assertEquals(expected, result);
    }

    /**
     * Test case for input string with no parentheses.
     */
    @Test
    void testNoParentheses() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = ParseNestedParens.parseNestedParens("hello world");
        assertEquals(expected, result);
    }
}