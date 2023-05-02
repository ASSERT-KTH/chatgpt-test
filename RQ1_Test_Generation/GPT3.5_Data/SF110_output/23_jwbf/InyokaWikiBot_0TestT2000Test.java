// InyokaWikiBot_0Test.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InyokaWikiBot}.
 * It contains ten unit test cases for the {@link InyokaWikiBot#getArticle(String)} method.
 */
class InyokaWikiBot_0Test {

    /**
     * Test case for getting an existing article.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetExistingArticle() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        Article article = bot.getArticle("Startseite");
        assertNotNull(article);
        assertEquals("Startseite", article.getTitle());
    }

    /**
     * Test case for getting a non-existing article.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetNonExistingArticle() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        Article article = bot.getArticle("NonExistingArticle");
        assertNotNull(article);
        assertEquals("NonExistingArticle", article.getTitle());
        assertTrue(article.getText().isEmpty());
    }

    /**
     * Test case for getting an article with special characters in the title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetArticleWithSpecialCharacters() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        Article article = bot.getArticle("Benutzer:Testuser/Testseite");
        assertNotNull(article);
        assertEquals("Benutzer:Testuser/Testseite", article.getTitle());
    }

    /**
     * Test case for getting an article with properties.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetArticleWithProperties() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        Article article = bot.getArticle("Startseite", 1);
        assertNotNull(article);
        assertEquals("Startseite", article.getTitle());
        assertNotNull(article.getRevisionId());
    }

    /**
     * Test case for getting an article with invalid properties.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetArticleWithInvalidProperties() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        Article article = bot.getArticle("Startseite", 2);
        assertNotNull(article);
        assertEquals("Startseite", article.getTitle());
        assertTrue(article.getText().isEmpty());
    }

    /**
     * Test case for getting an article with null title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetArticleWithNullTitle() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(null));
    }

    /**
     * Test case for getting an article with empty title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetArticleWithEmptyTitle() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(""));
    }

    /**
     * Test case for getting an article with whitespace title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetArticleWithWhitespaceTitle() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(" "));
    }

    /**
     * Test case for getting an article with newline character in title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetArticleWithNewlineTitle() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle("New\nline"));
    }

    /**
     * Test case for getting an article with tab character in title.
     * @throws MalformedURLException if the URL is malformed
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     */
    @Test
    void testGetArticleWithTabTitle() throws MalformedURLException, ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle("Tab\tcharacter"));
    }

}