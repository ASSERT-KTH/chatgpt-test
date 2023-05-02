// LineReader.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * This class reads a file and provides methods to read lines or blocks of lines from it.
 * It uses an index of the lines' positions in the file to optimize the reading process.
 * 
 * @author Pierre Laporte
 * Date: 7 avr. 2010
 */
public class LineReader {

    //NON-NLS
    private static final String READONLY_MODE = "r";

    /**
     * The index of the lines in the file.
     */
    private final FileIndex index;

    /**
     * The file to read.
     */
    private final File file;

    /**
     * The stream used to read the file.
     */
    private final RandomAccessFile randomAccess;

    /**
     * Constructor of a LineReader from an index of the lines in the file.
     * The index must indicate the position of the first character of each line in the file.
     *
     * @param file  the file to read
     * @param index the index to use
     * @throws java.io.FileNotFoundException if the file does not exist
     */
    public LineReader(File file, FileIndex index) throws FileNotFoundException {
        this.file = file;
        this.index = index;
        this.randomAccess = new RandomAccessFile(file, READONLY_MODE);
    }

    /**
     * Closes the stream used to read the file.
     *
     * @throws IOException if an error occurs
     */
    public void close() throws IOException {
        randomAccess.close();
    }

    /**
     * Returns the number of indexed lines.
     *
     * @return the number of indexed lines
     */
    public int getIndexSize() {
        return index.size();
    }

    /**
     * Reads the line whose number is passed as parameter.
     * The line number must be between 0 and the number of indexed lines.
     *
     * @param lineNumber the number of the line to read. Must be between 0 and the number of indexed lines.
     * @return the line corresponding to the number passed as parameter
     * @throws IOException if an error occurs during the reading
     */
    public String readLine(int lineNumber) throws IOException {
        long position = index.getPosition(lineNumber);
        randomAccess.seek(position);
        return randomAccess.readLine();
    }

    /**
     * Reads the lines between <code>fromLine</code> and <code>toLine</code> (exclusive).
     *
     * @param fromLine the number of the first line to read
     * @param toLine   the number of the last line to read (exclusive)
     * @return the lines of the file whose number is between the two parameters
     * @throws IOException if an error occurs during the reading
     */
    public List<String> readBlock(int fromLine, int toLine) throws IOException {
        List<String> lines = new ArrayList<>();
        long startPosition = index.getPosition(fromLine);
        long endPosition = index.getPosition(toLine);
        randomAccess.seek(startPosition);
        while (randomAccess.getFilePointer() < endPosition) {
            lines.add(randomAccess.readLine());
        }
        return lines;
    }
}

// LineReader_1Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains ten unit test cases for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {
    
    /**
     * Tests that an empty list is returned when trying to read a block of lines from an empty file.
     */
    @Test
    void testReadBlockFromEmptyFile() throws IOException {
        File file = new File("src/test/resources/empty.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(0, 10);
        reader.close();
        assertTrue(lines.isEmpty());
    }
    
    /**
     * Tests that an empty list is returned when trying to read a block of lines from a file with only one line.
     */
    @Test
    void testReadBlockFromOneLineFile() throws IOException {
        File file = new File("src/test/resources/one_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(0, 10);
        reader.close();
        assertTrue(lines.isEmpty());
    }
    
    /**
     * Tests that the correct line is returned when trying to read a single line from a file with only one line.
     */
    @Test
    void testReadSingleLineFromOneLineFile() throws IOException {
        File file = new File("src/test/resources/one_line.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        String line = reader.readLine(0);
        reader.close();
        assertEquals("This is a test line.", line);
    }
    
    /**
     * Tests that the correct lines are returned when trying to read a block of lines from a file with only two lines.
     */
    @Test
    void testReadBlockFromTwoLinesFile() throws IOException {
        File file = new File("src/test/resources/two_lines.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(0, 2);
        reader.close();
        assertEquals(2, lines.size());
        assertEquals("This is the first line.", lines.get(0));
        assertEquals("This is the second line.", lines.get(1));
    }
    
    /**
     * Tests that the correct lines are returned when trying to read a block of lines from a file with multiple lines.
     */
    @Test
    void testReadBlockFromMultipleLinesFile() throws IOException {
        File file = new File("src/test/resources/multiple_lines.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        List<String> lines = reader.readBlock(2, 5);
        reader.close();
        assertEquals(3, lines.size());
        assertEquals("This is the third line.", lines.get(0));
        assertEquals("This is the fourth line.", lines.get(1));
        assertEquals("This is the fifth line.", lines.get(2));
    }
    
    /**
     * Tests that an exception is thrown when trying to read a line with an invalid line number.
     */
    @Test
    void testReadLineWithInvalidLineNumber() throws IOException {
        File file = new File("src/test/resources/multiple_lines.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        assertThrows(IndexOutOfBoundsException.class, () -> reader.readLine(10));
        reader.close();
    }
    
    /**
     * Tests that an exception is thrown when trying to read a block of lines with invalid line numbers.
     */
    @Test
    void testReadBlockWithInvalidLineNumbers() throws IOException {
        File file = new File("src/test/resources/multiple_lines.txt");
        FileIndex index = new FileIndex(file);
        LineReader reader = new LineReader(file, index);
        assertThrows(IndexOutOfBoundsException.class, () -> reader.readBlock(5, 2));
        reader.close();
    }
    
    /**
     * Tests that an exception is thrown when trying to read a line from a non-existing file.
     */
    @Test
    void testReadLineFromNonExistingFile() throws IOException {
        File file = new File("src/test/resources/non_existing.txt");
        FileIndex index = new FileIndex(file);
        assertThrows(FileNotFoundException.class, () -> new LineReader(file, index));
    }
    
    /**
     * Tests that an exception is thrown when trying to read a block of lines from a non-existing file.
     */
    @Test
    void testReadBlockFromNonExistingFile() throws IOException {
        File file = new File("src/test/resources/non_existing.txt");
        FileIndex index = new FileIndex(file);
        assertThrows(FileNotFoundException.class, () -> new LineReader(file, index));
    }
    
    /**
     * Tests that an exception is thrown when trying to read a line from a directory instead of a file.
     */
    @Test
    void testReadLineFromDirectory() throws IOException {
        File file = new File("src/test/resources/directory");
        FileIndex index = new FileIndex(file);
        assertThrows(FileNotFoundException.class, () -> new LineReader(file, index));
    }
    
    /**
     * Tests that an exception is thrown when trying to read a block of lines from a directory instead of a file.
     */
    @Test
    void testReadBlockFromDirectory() throws IOException {
        File file = new File("src/test/resources/directory");
        FileIndex index = new FileIndex(file);
        assertThrows(FileNotFoundException.class, () -> new LineReader(file, index));
    }
}