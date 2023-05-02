// Test class of InspirentoUtilities
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InspirentoUtilities}.
 * It contains ten unit test cases for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
 */
class InspirentoUtilitiesTest {

    @Test
    void testStringReplaceAll() {
        // Test case 1: Replace a single character in a string
        StringBuffer buffer1 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer1, 'l', "L");
        assertEquals("heLLo", buffer1.toString());

        // Test case 2: Replace multiple characters in a string
        StringBuffer buffer2 = new StringBuffer("hello world");
        InspirentoUtilities.stringReplaceAll(buffer2, 'o', "O");
        assertEquals("hellO wOrld", buffer2.toString());

        // Test case 3: Replace a character that appears multiple times in a row
        StringBuffer buffer3 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer3, 'l', "LL");
        assertEquals("heLLLo", buffer3.toString());

        // Test case 4: Replace a character that does not appear in the string
        StringBuffer buffer4 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer4, 'z', "Z");
        assertEquals("hello", buffer4.toString());

        // Test case 5: Replace a character with an empty string
        StringBuffer buffer5 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer5, 'l', "");
        assertEquals("heo", buffer5.toString());

        // Test case 6: Replace a character with a string that contains the character being replaced
        StringBuffer buffer6 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer6, 'l', "ll");
        assertEquals("hellollo", buffer6.toString());

        // Test case 7: Replace a character with a string that is longer than the character being replaced
        StringBuffer buffer7 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer7, 'l', "lll");
        assertEquals("hellolllo", buffer7.toString());

        // Test case 8: Replace a character with a string that is shorter than the character being replaced
        StringBuffer buffer8 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer8, 'l', "l");
        assertEquals("hello", buffer8.toString());

        // Test case 9: Replace a character with a string that is null
        StringBuffer buffer9 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer9, 'l', null);
        assertEquals("heo", buffer9.toString());

        // Test case 10: Replace a character with a string that is empty
        StringBuffer buffer10 = new StringBuffer("hello");
        InspirentoUtilities.stringReplaceAll(buffer10, 'l', "");
        assertEquals("heo", buffer10.toString());
    }
}