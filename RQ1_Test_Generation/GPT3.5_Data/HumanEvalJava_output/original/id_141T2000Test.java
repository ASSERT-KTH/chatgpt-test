// Here's the source code for the test class of FileNameCheck

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileNameCheckTest {

    @Test
    void testValidFileName() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
    }

    @Test
    void testFileNameWithNumberAtBeginning() {
        assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
    }

    @Test
    void testFileNameWithNumbers() {
        assertEquals("No", FileNameCheck.fileNameCheck("s1sdf3.asd"));
    }

    @Test
    void testValidFileNameWithCapitalLetter() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("K.dll"));
    }

    @Test
    void testValidFileNameWithNumbers() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("MY16FILE3.exe"));
    }

    @Test
    void testInvalidFileNameWithNumbers() {
        assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
    }

    @Test
    void testInvalidFileNameWithUnderscore() {
        assertEquals("No", FileNameCheck.fileNameCheck("_Y.txt"));
    }

    @Test
    void testInvalidFileNameWithSpecialCharacter() {
        assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
    }

    @Test
    void testInvalidFileNameWithPath() {
        assertEquals("No", FileNameCheck.fileNameCheck("/this_is_valid.dll"));
    }

    @Test
    void testInvalidFileNameWithWrongExtension() {
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.wow"));
    }

    @Test
    void testValidFileNameWithMultipleExtensions() {
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.txtexe"));
    }

    @Test
    void testInvalidFileNameWithNumbersInExtension() {
        assertEquals("No", FileNameCheck.fileNameCheck("#this2_i4s_5valid.ten"));
    }

    @Test
    void testInvalidFileNameWithSpecialCharactersInExtension() {
        assertEquals("No", FileNameCheck.fileNameCheck("@this1_is6_valid.exe"));
    }

    @Test
    void testInvalidFileNameWithNumbersAndExtensions() {
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_12valid.6exe4.txt"));
    }

    @Test
    void testInvalidFileNameWithMultipleDots() {
        assertEquals("No", FileNameCheck.fileNameCheck("all.exe.txt"));
    }

    @Test
    void testValidFileNameWithNumbersAndCapitalLetters() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("I563_No.exe"));
    }

    @Test
    void testValidFileNameWithNumbersAndLetters() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("Is3youfault.txt"));
    }

    @Test
    void testValidFileNameWithSpecialCharacters() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("no_one#knows.dll"));
    }

    @Test
    void testInvalidFileNameWithNumbersAtBeginningAndEnd() {
        assertEquals("No", FileNameCheck.fileNameCheck("1I563_Yes3.exe"));
    }

    @Test
    void testInvalidFileNameWithNumbersAtEnd() {
        assertEquals("No", FileNameCheck.fileNameCheck("I563_Yes3.txtt"));
    }

    @Test
    void testInvalidFileNameWithDoubleDot() {
        assertEquals("No", FileNameCheck.fileNameCheck("final..txt"));
    }

    @Test
    void testInvalidFileNameWithNoExtension() {
        assertEquals("No", FileNameCheck.fileNameCheck("final132"));
    }

    @Test
    void testInvalidFileNameWithNumbersAtEndAndDot() {
        assertEquals("No", FileNameCheck.fileNameCheck("_f4indsartal132."));
    }

    @Test
    void testInvalidFileNameWithOnlyExtension() {
        assertEquals("No", FileNameCheck.fileNameCheck(".txt"));
    }

    @Test
    void testInvalidFileNameWithOnlyLetterAndDot() {
        assertEquals("No", FileNameCheck.fileNameCheck("s."));
    }
}