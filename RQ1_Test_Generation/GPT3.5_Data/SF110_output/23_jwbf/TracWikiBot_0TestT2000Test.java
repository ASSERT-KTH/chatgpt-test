// TracWikiBot_0Test.java
package net.sourceforge.jwbf.trac.bots;

import java.net.MalformedURLException;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Article;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TracWikiBot}.
* It contains ten unit test cases for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBot_0Test {

    /**
     * Test case for reading an existing article.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_existingArticle() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
        assertTrue(article.getText().contains("TracWiki"));
    }

    /**
     * Test case for reading a non-existing article.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_nonExistingArticle() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("NonExistingArticle");
        assertNotNull(article);
        assertTrue(article.getText().isEmpty());
    }

    /**
     * Test case for reading the main page.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_mainPage() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("WikiStart");
        assertNotNull(article);
        assertTrue(article.getText().contains("Welcome to Trac"));
    }

    /**
     * Test case for reading an article with a special character in the title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_specialCharacter() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("Special:RecentChanges");
        assertNotNull(article);
        assertTrue(article.getText().contains("RecentChanges"));
    }

    /**
     * Test case for reading an article with a slash in the title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_slash() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracGuide/GettingStarted");
        assertNotNull(article);
        assertTrue(article.getText().contains("GettingStarted"));
    }

    /**
     * Test case for reading an article with a colon in the title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_colon() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracGuide:Index");
        assertNotNull(article);
        assertTrue(article.getText().contains("TracGuide"));
    }

    /**
     * Test case for reading an article with a question mark in the title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_questionMark() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracGuide/FAQ");
        assertNotNull(article);
        assertTrue(article.getText().contains("FAQ"));
    }

    /**
     * Test case for reading an article with an apostrophe in the title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_apostrophe() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracGuide/'HowTo'");
        assertNotNull(article);
        assertTrue(article.getText().contains("HowTo"));
    }

    /**
     * Test case for reading an article with a backslash in the title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_backslash() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracGuide\\GettingStarted");
        assertNotNull(article);
        assertTrue(article.getText().contains("GettingStarted"));
    }

    /**
     * Test case for reading an article with a percent sign in the title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testReadContent_percentSign() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracGuide%2FGettingStarted");
        assertNotNull(article);
        assertTrue(article.getText().contains("GettingStarted"));
    }

}