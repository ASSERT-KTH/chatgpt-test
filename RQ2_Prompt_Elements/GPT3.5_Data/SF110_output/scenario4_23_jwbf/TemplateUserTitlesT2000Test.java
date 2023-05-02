// TemplateUserTitles.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;

/**
 * Action class using the MediaWiki-api's "list=embeddedin" that is used to find
 * all articles which use a template.
 *
 * @since MediaWiki 1.9.0
 */
@Slf4j
@SupportedBy({ MW1_09, MW1_10, MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16, MW1_17 })
public class TemplateUserTitles extends TitleQuery<String> {

    /**
     * Constant value for the eilimit-parameter.
     */
    private static final int LIMIT = 50;

    private final MediaWikiBot bot;

    /**
     * Collection that will contain the result (titles of articles using the
     * template) after performing the action has finished.
     */
    private Collection<String> titleCollection = new ArrayList<>();

    private final String templateName;

    private final int[] namespaces;

    /**
     * The public constructor. It will have a MediaWiki-request generated, which
     * is then added to msgs. When it is answered, the method
     * processAllReturningText will be called (from outside this class). For the
     * parameters, see
     * {@link TemplateUserTitles#generateRequest(String, String, String)}
     */
    public TemplateUserTitles(MediaWikiBot bot, String templateName, int... namespaces) throws VersionException {
    }

    /**
     * Generates the next MediaWiki-request (GetMethod) and adds it to msgs.
     *
     * @param templateName
     *          the name of the template, not null
     * @param namespace
     *          the namespace(s) that will be searched for links, as a string of
     *          numbers separated by '|'; if null, this parameter is omitted
     * @param eicontinue
     *          the value for the eicontinue parameter, null for the generation of
     *          the initial request
     */
    private HttpAction generateRequest(String templateName, String namespace, String eicontinue);

    /**
     * Deals with the MediaWiki API's response by parsing the provided text.
     *
     * @param s
     *          the answer to the most recently generated MediaWiki-request
     *
     * @return empty string
     */
    public String processAllReturningText(final String s);

    /**
     * Gets the information about a follow-up page from a provided API response.
     * If there is one, a new request is added to msgs by calling generateRequest.
     *
     * @param s
     *          text for parsing
     */
    @Override
    protected String parseHasMore(final String s);

    /**
     * Picks the article name from a MediaWiki API response.
     *
     * @param s
     *          text for parsing
     */
    @Override
    protected Collection<String> parseArticleTitles(String s);

    @Override
    protected HttpAction prepareCollection();

    @Override
    protected Object clone() throws CloneNotSupportedException;
}

// TemplateUserTitlesTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TemplateUserTitles}.
 * It contains ten unit test cases for the {@link TemplateUserTitles#processAllReturningText(String)} method.
 */
class TemplateUserTitlesTest {
    @Test
    void testProcessAllReturningTextWithEmptyResponse() {
    }

    @Test
    void testProcessAllReturningTextWithOneResult() {
    }

    @Test
    void testProcessAllReturningTextWithMultipleResults() {
    }

    @Test
    void testProcessAllReturningTextWithContinue() {
    }

    @Test
    void testProcessAllReturningTextWithNoTitle() {
    }

    @Test
    void testProcessAllReturningTextWithEmptyTitle() {
    }

    @Test
    void testProcessAllReturningTextWithNullTitle() {
    }

    @Test
    void testProcessAllReturningTextWithNoQueryContinue() {
    }

    @Test
    void testProcessAllReturningTextWithEmptyQueryContinue() {
    }

    @Test
    void testProcessAllReturningTextWithNullQueryContinue() {
    }
}