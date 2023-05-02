// Here's the source code for the Wildcard_1Test class:

package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Wildcard_1Test {

    @Test
    void testMatchWildcard() {
        String pattern = "file*.txt";
        String filename = "file123.txt";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("123", result);
    }

    @Test
    void testMatchWildcardNoMatch() {
        String pattern = "file*.txt";
        String filename = "file123.xml";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);
    }

    @Test
    void testMatchWildcardMultiplePatterns() {
        String pattern = "file*.txt;file*.xml";
        String filename = "file123.xml";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcardMultiplePatternsNoMatch() {
        String pattern = "file*.txt;file*.xml";
        String filename = "file123.jpg";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);
    }

    @Test
    void testMatchWildcardEmptyPattern() {
        String pattern = "";
        String filename = "file.txt";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);
    }

    @Test
    void testMatchWildcardEmptyFilename() {
        String pattern = "file*.txt";
        String filename = "";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);
    }

    @Test
    void testMatchWildcardNullPattern() {
        String pattern = null;
        String filename = "file.txt";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);
    }

    @Test
    void testMatchWildcardNullFilename() {
        String pattern = "file*.txt";
        String filename = null;
        String result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);
    }

    @Test
    void testMatchWildcardNoStar() {
        String pattern = "file.txt";
        String filename = "file.txt";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcardStarAtEnd() {
        String pattern = "file*";
        String filename = "file123.txt";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("123.txt", result);
    }
}