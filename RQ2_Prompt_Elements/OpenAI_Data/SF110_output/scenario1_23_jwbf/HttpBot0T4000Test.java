// HttpBotTest.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains ten unit test cases for the {@link HttpBot#getInstance()} method.
*/
class HttpBotTest {

	@Test
	void testGetInstance() {
		HttpBot bot = HttpBot.getInstance();
		assertNotNull(bot);
	}
}

// HttpActionClient.java
package net.sourceforge.jwbf.core.actions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.core.internal.Checked;
import net.sourceforge.jwbf.core.internal.Nonnull;
import net.sourceforge.jwbf.core.internal.Nullable;
import net.sourceforge.jwbf.core.internal.SimpleAction;
import net.sourceforge.jwbf.core.internal.SimpleHttpAction;
import net.sourceforge.jwbf.core.internal.SimpleHttpActionClient;
import net.sourceforge.jwbf.core.internal.SimpleRequestBuilder;
import net.sourceforge.jwbf.core.internal.SimpleResponse;
import net.sourceforge.jwbf.core.internal.SimpleResponseProcessor;
import net.sourceforge.jwbf.core.internal.SimpleUrlChecked;
import net.sourceforge.jwbf.core.internal.SimpleUrlConnection;
import net.sourceforge.jwbf.core.internal.SimpleUrlConnectionFactory;
import net.sourceforge.jwbf.core.internal.SimpleUrlFetchService;
import net.sourceforge.jwbf.core.internal.SimpleUrlFetchServiceFactory;
import net.sourceforge.jwbf.core.internal.SimpleUrlReader;
import net.sourceforge.jwbf.core.internal.SimpleUrlReaderFactory;
import net.sourceforge.jwbf.core.internal.SimpleUrlValidator;
import net.sourceforge.jwbf.core.internal.SimpleUrlValidatorFactory;
import net.sourceforge.jwbf.core.internal.SimpleUserinfo;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoFinder;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoFinderFactory;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoParser;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoParserFactory;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoProcessor;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoProcessorFactory;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoReader;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoReaderFactory;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoValidator;
import net.sourceforge.jwbf.core.internal.SimpleUserinfoValidatorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticle;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleFinder;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleFinderFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleParser;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleParserFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleProcessor;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleProcessorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleReader;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleReaderFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleValidator;
import net.sourceforge.jwbf.core.internal.SimpleWikiArticleValidatorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentProcessor;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentProcessorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentReader;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentReaderFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentValidator;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentValidatorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentWriter;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentWriterFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentWriterProcessor;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentWriterProcessorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentWriterValidator;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentWriterValidatorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentWriterWriter;
import net.sourceforge.jwbf.core.internal.SimpleWikiContentWriterWriterFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiUrlConnection;
import net.sourceforge.jwbf.core.internal.SimpleWikiUrlConnectionFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiUrlFetchService;
import net.sourceforge.jwbf.core.internal.SimpleWikiUrlFetchServiceFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiUrlReader;
import net.sourceforge.jwbf.core.internal.SimpleWikiUrlReaderFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiUrlValidator;
import net.sourceforge.jwbf.core.internal.SimpleWikiUrlValidatorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiWriter;
import net.sourceforge.jwbf.core.internal.SimpleWikiWriterFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiWriterProcessor;
import net.sourceforge.jwbf.core.internal.SimpleWikiWriterProcessorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiWriterValidator;
import net.sourceforge.jwbf.core.internal.SimpleWikiWriterValidatorFactory;
import net.sourceforge.jwbf.core.internal.SimpleWikiWriterWriter;
import net.sourceforge.jwbf.core.internal.SimpleWikiWriterWriterFactory;
import net.sourceforge.jwbf.core.internal.WikiArticle;
import net.sourceforge.jwbf.core.internal.WikiArticleFactory;
import net.sourceforge.jwbf.core.internal.WikiArticleFinder;
import net.sourceforge.jwbf.core.internal.WikiArticleFinderFactory;
import net.sourceforge.jwbf.core.internal.WikiArticleParser;
import net.sourceforge.jwbf.core.internal.WikiArticleParserFactory;
import net.sourceforge.jwbf.core.internal.WikiArticleProcessor;
import net.sourceforge.jwbf.core.internal.WikiArticleProcessorFactory;
import net.sourceforge.jwbf.core.internal.WikiArticleReader;
import net.sourceforge.jwbf.core.internal.WikiArticleReaderFactory;
import net.sourceforge.jwbf.core.internal.WikiArticleValidator;
import net.sourceforge.jwbf.core.internal.WikiArticleValidatorFactory;
import net.sourceforge.jwbf.core.internal.WikiContentProcessor;
import net.sourceforge.jwbf.core.internal.WikiContentProcessorFactory;
import net.sourceforge.jwbf.core.internal.WikiContentReader;
import net.sourceforge.jwbf.core.internal.WikiContentReaderFactory;
import net.sourceforge.jwbf.core.internal.WikiContentValidator;
import net.sourceforge.jwbf.core.internal.WikiContentValidatorFactory;
import net.sourceforge.jwbf.core.internal.WikiContentWriter;
import net.sourceforge.jwbf.core.internal.WikiContentWriterFactory;
import net.sourceforge.jwbf.core.internal.WikiContentWriterProcessor;
import net.sourceforge.jwbf.core.internal.WikiContentWriterProcessorFactory;
import net.sourceforge.jwbf.core.internal.WikiContentWriterValidator;
import net.sourceforge.jwbf.core.internal.WikiContentWriterValidatorFactory;
import net.sourceforge.jwbf.core.internal.WikiContentWriterWriter;
import net.sourceforge.jwbf.core.internal.WikiContentWriterWriterFactory;
import net.sourceforge.jwbf.core.internal.WikiUrlConnection;
import net.sourceforge.jwbf.core.internal.WikiUrlConnectionFactory;
import net.sourceforge.jwbf.core.internal.WikiUrlFetchService;
import net.sourceforge.jwbf.core.internal.WikiUrlFetchServiceFactory;
import net.sourceforge.jwbf.core.internal.WikiUrlReader;
import net.sourceforge.jwbf.core.internal.WikiUrlReaderFactory;
import net.sourceforge.jwbf.core.internal.WikiUrlValidator;
import net.sourceforge.jwbf.core.internal.WikiUrlValidatorFactory;
import net.sourceforge.jwbf.core.internal.WikiWriter;
import net.sourceforge.jwbf.core.internal.WikiWriterFactory;
import net.sourceforge.jwbf.core.internal.WikiWriterProcessor;
import net.sourceforge.jwbf.core.internal.WikiWriterProcessorFactory;
import net.sourceforge.jwbf.core.internal.WikiWriterValidator;
import net.sourceforge.jwbf.core.internal.WikiWriterValidatorFactory;
import net.sourceforge.jwbf.core.internal.WikiWriterWriter;
import net.sourceforge.jwbf.core.internal.WikiWriterWriterFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedAction;
import net.sourceforge.jwbf.core.internal.actions.CheckedActionClient;
import net.sourceforge.jwbf.core.internal.actions.CheckedActionClientFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedActionFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedActionProcessor;
import net.sourceforge.jwbf.core.internal.actions.CheckedActionProcessorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedActionValidator;
import net.sourceforge.jwbf.core.internal.actions.CheckedActionValidatorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedHttpAction;
import net.sourceforge.jwbf.core.internal.actions.CheckedHttpActionClient;
import net.sourceforge.jwbf.core.internal.actions.CheckedHttpActionClientFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedHttpActionFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedHttpActionProcessor;
import net.sourceforge.jwbf.core.internal.actions.CheckedHttpActionProcessorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedHttpActionValidator;
import net.sourceforge.jwbf.core.internal.actions.CheckedHttpActionValidatorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedRequestBuilder;
import net.sourceforge.jwbf.core.internal.actions.CheckedRequestBuilderFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedResponse;
import net.sourceforge.jwbf.core.internal.actions.CheckedResponseProcessor;
import net.sourceforge.jwbf.core.internal.actions.CheckedResponseProcessorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedResponseValidator;
import net.sourceforge.jwbf.core.internal.actions.CheckedResponseValidatorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlChecked;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlCheckedFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlConnection;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlConnectionFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlFetchService;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlFetchServiceFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlReader;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlReaderFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlValidator;
import net.sourceforge.jwbf.core.internal.actions.CheckedUrlValidatorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticle;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleFinder;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleFinderFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleParser;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleParserFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleProcessor;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleProcessorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleReader;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleReaderFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleValidator;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiArticleValidatorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentProcessor;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentProcessorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentReader;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentReaderFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentValidator;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentValidatorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentWriter;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentWriterFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentWriterProcessor;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentWriterProcessorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentWriterValidator;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentWriterValidatorFactory;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentWriterWriter;
import net.sourceforge.jwbf.core.internal.actions.CheckedWikiContentWriterWriterFactory;
import net.sourceforge.jwbf.core.internal.actions