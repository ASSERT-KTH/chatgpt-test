// SearchableTextPane_1Test.java
package ghm.follow.search;

import org.junit.jupiter.api.Test;

import java.awt.Font;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class of {@link SearchableTextPane}.
 * It contains ten unit test cases for the {@link SearchableTextPane#search(String)} method.
 */
class SearchableTextPane_1Test {

    @Test
    void testSearch_NullTerm() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        int result = pane.search(null);
        assertEquals(-1, result);
    }

    @Test
    void testSearch_EmptyTerm() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        int result = pane.search("");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermNotFound() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        pane.setText("This is a test");
        int result = pane.search("not found");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermFound() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        pane.setText("This is a test");
        int result = pane.search("test");
        assertEquals(10, result);
    }

    @Test
    void testSearch_TermFoundMultipleTimes() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        pane.setText("This is a test. This is another test.");
        int result = pane.search("test");
        assertEquals(10, result);
        result = pane.search("test");
        assertEquals(27, result);
    }

    @Test
    void testSearch_TermFoundCaseSensitive() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        pane.setText("This is a test");
        int result = pane.search("Test");
        assertEquals(-1, result);
        result = pane.search("test");
        assertEquals(10, result);
    }

    @Test
    void testSearch_TermFoundRegularExpression() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        pane.setText("This is a test");
        int result = pane.search("\\w+");
        assertEquals(0, result);
    }

    @Test
    void testSearch_TermFoundAtEnd() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        pane.setText("This is a test");
        int result = pane.search("test");
        assertEquals(10, result);
        result = pane.search("test");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermFoundAtBeginning() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        pane.setText("This is a test");
        int result = pane.search("This");
        assertEquals(0, result);
        result = pane.search("This");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_Highlight() {
        SearchableTextPane pane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        pane.setText("This is a test");
        List<LineResult> results = pane.highlight("test", 0);
        assertNotNull(results);
        assertEquals(1, results.size());
        LineResult lineResult = results.get(0);
        assertEquals(1, lineResult.getWordResults().size());
        WordResult wordResult = lineResult.getWordResults().get(0);
        assertEquals(10, wordResult.start);
        assertEquals(14, wordResult.end);
    }
}