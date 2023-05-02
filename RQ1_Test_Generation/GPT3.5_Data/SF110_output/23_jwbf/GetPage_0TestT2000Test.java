// GetPage_0Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_0Test {

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns true when called for the first time.
     */
    @Test
    void testHasMoreMessages1() {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        assertTrue(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called twice.
     */
    @Test
    void testHasMoreMessages2() {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        assertTrue(getPage.hasMoreMessages());
        assertFalse(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called after processReturningText() is called.
     */
    @Test
    void testHasMoreMessages3() throws ProcessException {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        getPage.processReturningText("", new HttpAction() {});
        assertFalse(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called after processReturningText() is called and hasMoreMessages() was called before.
     */
    @Test
    void testHasMoreMessages4() throws ProcessException {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        assertTrue(getPage.hasMoreMessages());
        getPage.processReturningText("", new HttpAction() {});
        assertFalse(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called after getNextMessage() is called.
     */
    @Test
    void testHasMoreMessages5() {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        getPage.getNextMessage();
        assertFalse(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called after getNextMessage() is called and hasMoreMessages() was called before.
     */
    @Test
    void testHasMoreMessages6() {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        assertTrue(getPage.hasMoreMessages());
        getPage.getNextMessage();
        assertFalse(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called after getNextMessage() and processReturningText() are called.
     */
    @Test
    void testHasMoreMessages7() throws ProcessException {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        getPage.getNextMessage();
        getPage.processReturningText("", new HttpAction() {});
        assertFalse(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called after getNextMessage() and processReturningText() are called and hasMoreMessages() was called before.
     */
    @Test
    void testHasMoreMessages8() throws ProcessException {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        assertTrue(getPage.hasMoreMessages());
        getPage.getNextMessage();
        getPage.processReturningText("", new HttpAction() {});
        assertFalse(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called twice after getNextMessage() is called.
     */
    @Test
    void testHasMoreMessages9() {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        getPage.getNextMessage();
        assertFalse(getPage.hasMoreMessages());
        assertFalse(getPage.hasMoreMessages());
    }

    /**
     * Test method for {@link GetPage#hasMoreMessages()}.
     * Test case: hasMoreMessages() returns false when called twice after processReturningText() is called.
     */
    @Test
    void testHasMoreMessages10() throws ProcessException {
        GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
        getPage.processReturningText("", new HttpAction() {});
        assertFalse(getPage.hasMoreMessages());
        assertFalse(getPage.hasMoreMessages());
    }

}