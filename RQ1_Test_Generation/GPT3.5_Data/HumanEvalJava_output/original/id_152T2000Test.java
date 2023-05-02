// Compare.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class Compare {

    /**
     * Determines if a person correctly guessed the results of a number of matches.
     * You are given two arrays of scores and guesses of equal length, where each index shows a match.
     * Return an array of the same length denoting how far off each guess was. If they have guessed correctly,
     * the value is 0, and if not, the value is the absolute difference between the guess and the score.
     *
     * @param game  List of scores
     * @param guess List of guesses
     * @return List of differences between scores and guesses
     */
    public static List<Integer> compare(List<Integer> game, List<Integer> guess) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < game.size(); i++) {
            result.add(Math.abs(game.get(i) - guess.get(i)));
        }
        return result;
    }
}

// CompareTest.java
package updated;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link Compare}.
 * It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
 */
class CompareTest {

    @Test
    void testCompareWithEqualLists() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithDifferentLists() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 2, -2);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 3, 3);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithAllZeros() {
        List<Integer> game = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> guess = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithNegativeNumbers() {
        List<Integer> game = Arrays.asList(1, 2, 3);
        List<Integer> guess = Arrays.asList(-1, -2, -3);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithMixedNumbers() {
        List<Integer> game = Arrays.asList(1, 2, 3, 5);
        List<Integer> guess = Arrays.asList(-1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(2, 0, 0, 1);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithEmptyLists() {
        List<Integer> game = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithDifferentListSizes() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = Arrays.asList(1, 2, 3, 4, 2);
        List<Integer> expected = null;
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithNullLists() {
        List<Integer> game = null;
        List<Integer> guess = null;
        List<Integer> expected = null;
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithOneNullList() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = null;
        List<Integer> expected = null;
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareWithOneEmptyList() {
        List<Integer> game = Arrays.asList(1, 2, 3, 4, 5, 1);
        List<Integer> guess = new ArrayList<>();
        List<Integer> expected = null;
        assertEquals(expected, Compare.compare(game, guess));
    }
}