// Here's the source code for the WordsStringTest class:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WordsStringTest {

    @Test
    void testEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = WordsString.wordsString("");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleWord() {
        List<Object> expected = Arrays.asList("Hello");
        List<Object> actual = WordsString.wordsString("Hello");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWords() {
        List<Object> expected = Arrays.asList("Hi", "my", "name", "is", "John");
        List<Object> actual = WordsString.wordsString("Hi, my name is John");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithExtraSpaces() {
        List<Object> expected = Arrays.asList("Hi", "my", "name", "is", "John");
        List<Object> actual = WordsString.wordsString("Hi,   my   name   is   John");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithExtraCommas() {
        List<Object> expected = Arrays.asList("Hi", "my", "name", "is", "John");
        List<Object> actual = WordsString.wordsString("Hi,, my, name, is, John,");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithExtraSpacesAndCommas() {
        List<Object> expected = Arrays.asList("Hi", "my", "name", "is", "John");
        List<Object> actual = WordsString.wordsString("Hi, , my , name , is , John , ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithOnlyCommas() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = WordsString.wordsString(",, , ,, , ,");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithOnlySpaces() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = WordsString.wordsString("     ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithMixedSpacesAndCommas() {
        List<Object> expected = Arrays.asList("ahmed", "gamal");
        List<Object> actual = WordsString.wordsString("ahmed     , gamal");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWordsWithMixedSpacesAndCommas2() {
        List<Object> expected = Arrays.asList("One", "two", "three", "four", "five", "six");
        List<Object> actual = WordsString.wordsString("One, two, three, four, five, six");
        assertEquals(expected, actual);
    }
}