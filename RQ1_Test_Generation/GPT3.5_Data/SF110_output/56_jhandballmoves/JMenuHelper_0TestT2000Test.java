// JMenuHelper_0Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
*/
class JMenuHelper_0Test {
    
    @Test
    void testAddMenuBarItem() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "Help");
        assertEquals("File", menu1.getText());
        assertEquals("Edit", menu2.getText());
        assertEquals("Help", menu3.getText());
        assertEquals(3, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithMnemonic() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "F_ile");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "E_dit");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "H_elp");
        assertEquals("File", menu1.getText());
        assertEquals("Edit", menu2.getText());
        assertEquals("Help", menu3.getText());
        assertEquals('I', menu1.getMnemonic());
        assertEquals('D', menu2.getMnemonic());
        assertEquals('H', menu3.getMnemonic());
        assertEquals(3, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithDuplicateMnemonic() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "F_ile");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "E_dit");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "H_elp");
        JMenu menu4 = JMenuHelper.addMenuBarItem(menuBar, "F_ile2");
        assertEquals("File", menu1.getText());
        assertEquals("Edit", menu2.getText());
        assertEquals("Help", menu3.getText());
        assertEquals("File2", menu4.getText());
        assertEquals('I', menu1.getMnemonic());
        assertEquals('D', menu2.getMnemonic());
        assertEquals('H', menu3.getMnemonic());
        assertEquals('F', menu4.getMnemonic());
        assertEquals(4, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithNoText() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "");
        assertEquals("", menu1.getText());
        assertEquals(1, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithNull() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, null);
        assertNull(menu1);
        assertEquals(0, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithEmptyMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals("File", menu1.getText());
        assertEquals(1, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithMultipleMenus() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "Help");
        JMenu menu4 = JMenuHelper.addMenuBarItem(menuBar, "View");
        assertEquals("File", menu1.getText());
        assertEquals("Edit", menu2.getText());
        assertEquals("Help", menu3.getText());
        assertEquals("View", menu4.getText());
        assertEquals(4, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithSpecialCharacters() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "F!l@e#");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "E$d^i&t*");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "H(e)l_p-");
        assertEquals("F!l@e#", menu1.getText());
        assertEquals("E$d^i&t*", menu2.getText());
        assertEquals("H(e)l_p-", menu3.getText());
        assertEquals(3, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithLongText() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "This is a very long menu item");
        assertEquals("This is a very long menu item", menu1.getText());
        assertEquals(1, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithLeadingDash() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "-File");
        assertNull(menu1);
        assertEquals(0, menuBar.getMenuCount());
    }
    
    @Test
    void testAddMenuBarItemWithTrailingDash() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "File-");
        assertEquals("File-", menu1.getText());
        assertEquals(1, menuBar.getMenuCount());
    }
}