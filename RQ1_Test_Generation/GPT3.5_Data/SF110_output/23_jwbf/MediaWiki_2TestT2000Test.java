// Source code for MediaWiki_2Test.java

package net.sourceforge.jwbf.mediawiki.actions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MediaWiki}.
 * It contains ten unit test cases for the {@link MediaWiki#decode(String)} method.
 */
class MediaWiki_2Test {

    @Test
    void testDecodeEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeNoSpecialCharacters() {
        String input = "This is a test string.";
        String expectedOutput = "This is a test string.";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeSingleAmpersand() {
        String input = "This & that";
        String expectedOutput = "This &amp; that";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeMultipleAmpersands() {
        String input = "This && that";
        String expectedOutput = "This &amp;&amp; that";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeSingleQuote() {
        String input = "It's a beautiful day";
        String expectedOutput = "It&#39;s a beautiful day";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeDoubleQuote() {
        String input = "She said, \"Hello!\"";
        String expectedOutput = "She said, &quot;Hello!&quot;";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeLessThan() {
        String input = "3 < 5";
        String expectedOutput = "3 &lt; 5";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeGreaterThan() {
        String input = "5 > 3";
        String expectedOutput = "5 &gt; 3";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeAmpersandAndQuotes() {
        String input = "This & that's \"it\"";
        String expectedOutput = "This &amp; that&#39;s &quot;it&quot;";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testDecodeNonAsciiCharacters() {
        String input = "Café au lait";
        String expectedOutput = "Caf&eacute; au lait";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }
}