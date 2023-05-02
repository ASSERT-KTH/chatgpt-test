// Document.java
import java.io.*;
import java.util.Vector;

/**
 * Code for storing and processing individual documents of any type.
 */
public class Document {

    private String author;
    private String filename;
    private char[] rawText;
    private int size;
    /**
     * Contains current processed text*
     */
    public Vector<Character> procText;

    /**
     * Create and read in document with known text unknown author*
     */
    public Document(String filename) {
        this.author = null;
        this.filename = filename;
        readText(filename);
    }

    /**
     * Create and read in document with known text and known author*
     */
    public Document(String filename, String author) {
        this.author = author;
        this.filename = filename;
        readText(filename);
    }

    /**
     * Returns the full filename of the current document*
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the author of the current document*
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Retrieves the author of the current document*
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the size of the document. Size is determined by the
     * number of characters plus whitespace
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns text with preprocessing done. Preprocessing can
     * include stripping whitespace or normalizing the case
     */
    public Vector<Character> getProcessedText() {
        return procText;
    }

    /**
     * Reads text from a local file. Exceptions are not caught
     * by name. Rather, all exceptions are handled through just
     * printing the error message to stdout. This should
     * probably be changed for robustness. The raw text of the
     * file is stored for quick access in an array.
     */
    public void readText(String filename) {
        int c, ctr = 0;
        try {
            File input = new File(filename);
            this.size = (int) input.length();
            this.rawText = new char[size];
            this.procText = new Vector<Character>();
            FileInputStream fis = new FileInputStream(input);
            while ((c = fis.read()) != -1) {
                rawText[ctr++] = (char) c;
                procText.add(new Character((char) c));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        String t = new String();
        t = "Document: " + filename + "\n";
        t += "Author:   " + author + "\n";
        return t;
    }

    public void print() {
        for (Character c : procText) System.out.print(c);
    }

    /**
     * Convert processed document into one really long string.
     * I'm not quite sure yet why this ever would need to be done.
     */
    public String stringify() {
        StringBuilder sb = new StringBuilder();
        for (Character c : procText) {
            sb.append(c);
        }
        return sb.toString();
    }
}

// DocumentTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Document}.
 * It contains ten unit test cases for the {@link Document#stringify()} method.
 */
class DocumentTest {

    /**
     * Test case for an empty document.
     */
    @Test
    void testEmptyDocument() {
        Document doc = new Document("test_files/empty.txt");
        assertEquals("", doc.stringify());
    }

    /**
     * Test case for a document with one character.
     */
    @Test
    void testOneCharacterDocument() {
        Document doc = new Document("test_files/one_char.txt");
        assertEquals("a", doc.stringify());
    }

    /**
     * Test case for a document with multiple characters.
     */
    @Test
    void testMultipleCharacterDocument() {
        Document doc = new Document("test_files/multiple_chars.txt");
        assertEquals("abcde", doc.stringify());
    }

    /**
     * Test case for a document with multiple lines.
     */
    @Test
    void testMultipleLineDocument() {
        Document doc = new Document("test_files/multiple_lines.txt");
        assertEquals("This is a test.\nThis is only a test.", doc.stringify());
    }

    /**
     * Test case for a document with special characters.
     */
    @Test
    void testSpecialCharacterDocument() {
        Document doc = new Document("test_files/special_chars.txt");
        assertEquals("!@#$%^&*()_+-=[]{}|;':\",./<>?", doc.stringify());
    }

    /**
     * Test case for a document with whitespace.
     */
    @Test
    void testWhitespaceDocument() {
        Document doc = new Document("test_files/whitespace.txt");
        assertEquals("This is a test. This is only a test.", doc.stringify());
    }

    /**
     * Test case for a document with mixed whitespace.
     */
    @Test
    void testMixedWhitespaceDocument() {
        Document doc = new Document("test_files/mixed_whitespace.txt");
        assertEquals("This is a test.\nThis is only a test.", doc.stringify());
    }

    /**
     * Test case for a document with mixed case.
     */
    @Test
    void testMixedCaseDocument() {
        Document doc = new Document("test_files/mixed_case.txt");
        assertEquals("tHiS iS a TeSt. tHiS iS oNlY a TeSt.", doc.stringify());
    }

    /**
     * Test case for a document with non-ASCII characters.
     */
    @Test
    void testNonASCIIDocument() {
        Document doc = new Document("test_files/non_ascii.txt");
        assertEquals("こんにちは", doc.stringify());
    }

    /**
     * Test case for a document with a mix of characters.
     */
    @Test
    void testMixedCharacterDocument() {
        Document doc = new Document("test_files/mixed_chars.txt");
        assertEquals("This is a test. 12345 !@#$%", doc.stringify());
    }
}