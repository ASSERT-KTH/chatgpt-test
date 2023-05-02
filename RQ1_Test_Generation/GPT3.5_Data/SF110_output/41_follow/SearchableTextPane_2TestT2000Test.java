// SearchableTextPane_2Test.java
package ghm.follow.search;

import org.junit.jupiter.api.Test;

import java.awt.Font;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link SearchableTextPane}.
 * It contains ten unit test cases for the {@link SearchableTextPane#search(String, int)} method.
 */
class SearchableTextPane_2Test {

    private final Font font = new Font("Arial", Font.PLAIN, 12);
    private final int tabSize = 4;

    @Test
    void testSearch_NullTerm() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        int result = pane.search(null, 0);
        assertEquals(-1, result);
    }

    @Test
    void testSearch_EmptyTerm() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        int result = pane.search("", 0);
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermNotFound() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        pane.setText("This is a test.");
        int result = pane.search("not found", 0);
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermFoundAtBeginning() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        pane.setText("This is a test.");
        int result = pane.search("This", 0);
        assertEquals(0, result);
    }

    @Test
    void testSearch_TermFoundInMiddle() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        pane.setText("This is a test.");
        int result = pane.search("is", 0);
        assertEquals(2, result);
    }

    @Test
    void testSearch_TermFoundAtEnd() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        pane.setText("This is a test.");
        int result = pane.search("test.", 0);
        assertEquals(10, result);
    }

    @Test
    void testSearch_TermFoundMultipleTimes() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        pane.setText("This is a test. This is another test.");
        int result = pane.search("is", 0);
        assertEquals(2, result);
        result = pane.search("is", result + 1);
        assertEquals(19, result);
    }

    @Test
    void testSearch_TermFoundWithCaseSensitive() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        pane.setText("This is a test.");
        int result = pane.search("this", 0);
        assertEquals(-1, result);
        result = pane.search("This", 0);
        assertEquals(0, result);
    }

    @Test
    void testSearch_TermFoundWithRegularExpression() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        pane.setText("This is a test.");
        int result = pane.search("\\w+", 0);
        assertEquals(0, result);
    }

    @Test
    void testSearch_TermFoundWithStartingPosition() {
        SearchableTextPane pane = new SearchableTextPane(font, tabSize);
        pane.setText("This is a test. This is another test.");
        int result = pane.search("is", 10);
        assertEquals(19, result);
    }
}