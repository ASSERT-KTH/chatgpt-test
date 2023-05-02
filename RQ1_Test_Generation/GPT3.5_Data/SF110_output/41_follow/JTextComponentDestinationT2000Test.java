// Here's the source code for the JTextComponentDestinationTest class:

package ghm.follow.io;

import javax.swing.JTextArea;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JTextComponentDestination}.
 * It contains ten unit test cases for the {@link JTextComponentDestination#autoPositionCaret()} method.
 */
class JTextComponentDestinationTest {

    @Test
    void testAutoPositionCaretTrue() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, true);
        assertTrue(destination.autoPositionCaret());
    }

    @Test
    void testAutoPositionCaretFalse() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, false);
        assertFalse(destination.autoPositionCaret());
    }

    @Test
    void testSetAutoPositionCaretTrue() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, false);
        destination.setAutoPositionCaret(true);
        assertTrue(destination.autoPositionCaret());
    }

    @Test
    void testSetAutoPositionCaretFalse() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, true);
        destination.setAutoPositionCaret(false);
        assertFalse(destination.autoPositionCaret());
    }

    @Test
    void testHandlePrint() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, true);
        destination.handlePrint("test");
        assertEquals("test", textArea.getText());
    }

    @Test
    void testHandlePrintWithAutoPositionCaret() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, true);
        destination.handlePrint("test");
        assertEquals(textArea.getDocument().getLength(), textArea.getCaretPosition());
    }

    @Test
    void testHandlePrintWithoutAutoPositionCaret() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, false);
        destination.handlePrint("test");
        assertEquals(0, textArea.getCaretPosition());
    }

    @Test
    void testClear() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, true);
        destination.handlePrint("test");
        destination.clear();
        assertEquals("", textArea.getText());
    }

    @Test
    void testClearWithAutoPositionCaret() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, true);
        destination.handlePrint("test");
        destination.clear();
        assertEquals(0, textArea.getCaretPosition());
    }

    @Test
    void testClearWithoutAutoPositionCaret() {
        JTextArea textArea = new JTextArea();
        JTextComponentDestination destination = new JTextComponentDestination(textArea, false);
        destination.handlePrint("test");
        destination.clear();
        assertEquals(0, textArea.getCaretPosition());
    }
}