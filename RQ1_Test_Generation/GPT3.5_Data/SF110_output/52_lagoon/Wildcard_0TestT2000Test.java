// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Wildcard}.
 * It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
 */
class Wildcard_0Test {

    @Test
    void testIsWildcard_noWildcard() {
        assertFalse(Wildcard.isWildcard("file.txt"));
    }

    @Test
    void testIsWildcard_singleWildcard() {
        assertTrue(Wildcard.isWildcard("file*.txt"));
    }

    @Test
    void testIsWildcard_multipleWildcards() {
        assertTrue(Wildcard.isWildcard("file*.t*t"));
    }

    @Test
    void testIsWildcard_onlyWildcard() {
        assertTrue(Wildcard.isWildcard("*"));
    }

    @Test
    void testIsWildcard_onlySemicolon() {
        assertTrue(Wildcard.isWildcard(";"));
    }

    @Test
    void testIsWildcard_wildcardAndSemicolon() {
        assertTrue(Wildcard.isWildcard("file*.txt;file*.xml"));
    }

    @Test
    void testIsWildcard_multipleSemicolons() {
        assertTrue(Wildcard.isWildcard("file.txt;;file.xml"));
    }

    @Test
    void testIsWildcard_startsWithSemicolon() {
        assertTrue(Wildcard.isWildcard(";file.txt"));
    }

    @Test
    void testIsWildcard_endsWithSemicolon() {
        assertTrue(Wildcard.isWildcard("file.txt;"));
    }

    @Test
    void testIsWildcard_multipleWildcardsAndSemicolons() {
        assertTrue(Wildcard.isWildcard("file*.txt;file*.xml;file*.html"));
    }
}