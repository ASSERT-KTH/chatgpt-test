// Here's the source code for the AntiShuffleTest class:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AntiShuffleTest {

    @Test
    void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleWord() {
        String input = "Hi";
        String expectedOutput = "Hi";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleWordSorted() {
        String input = "hello";
        String expectedOutput = "ehllo";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMultipleWords() {
        String input = "Hello World!!!";
        String expectedOutput = "Hello !!!Wdlor";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testAllCharactersSame() {
        String input = "aaaaa";
        String expectedOutput = "aaaaa";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testAllCharactersDifferent() {
        String input = "abcd";
        String expectedOutput = "abcd";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMixedCase() {
        String input = "Hi. My name is Mister Robot. How are you?";
        String expectedOutput = ".Hi My aemn is Meirst .Rboot How aer ?ouy";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNumbers() {
        String input = "1234567890";
        String expectedOutput = "0123456789";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSpecialCharacters() {
        String input = "!@#$%^&*()_+-={}[]\\|;:'\",.<>/?";
        String expectedOutput = "!\"#$%&'()*+,-./0123456789:;<=>?@[\\]^_`{|}~";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMixedCharacters() {
        String input = "Hello World! 123";
        String expectedOutput = "H !Wdellor 123";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }
}