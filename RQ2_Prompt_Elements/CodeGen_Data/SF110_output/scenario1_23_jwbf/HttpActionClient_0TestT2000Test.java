// HttpActionClient_0Test.java
package net.sourceforge.jwbf.core.actions;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.JWBF;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.CookieException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpActionClient}.
* It contains one unit test case for the {@link HttpActionClient#performAction(ContentProcessable)} method.
*/
class HttpActionClient_0Test {
/** Creates a new instance of HttpProcessable */
		private final ContentProcessable testContentProcessable1;
		/** Creates a new instance of ContentProcessable */
		private final ContentProcessable testContentProcessable2;
		/** Creates a new instance of HttpPost */
		private final HttpPost testHttpPost;
		/** Creates a new instance of HttpPost */
		private final HttpUriRequest testHttpUriRequest1;
		/** Creates a new instance of HttpGet */
		private final  HttpGet testHttpGet;
		/** Creates a new instance of HttpGet */
		private final  HttpUriRequest testHttpUriRequest2;
		/** Creates a new instance of HttpPost */
		private final HttpPost testHttpPost2;
		/** Creates a new instance of {@link HttpAction}. */
		public HttpActionClient_0Test(final ContentProcessable testData) throws ActionException {
			super();
			testContentProcessable1 = testData;
			testContentProcessable2 = testData.addPostProcessable("test1");//, "test2" );
			testHttpPost = testHttpPost1 = createHttpUriRequest("post");//, testContentProcessable2 );
			testHttpUriRequest1 = createHttpUriRequest("uri1");//, testContentProcessable2 );
			testHttpUriRequest2 = createHttpUriRequest("uri2");//, testContentProcessable1);
			testHttpGet = testHttpGet1 = createHttpUriRequest("get");//,"testContentProcessable1" );
			testHttpGet2 = createHttpUriRequest("test3");//, testContentProcessable1);

		}
		@Test
		void testPerformAction() {
			try {
				performAction(testContentProcessable2);
				fail("No exception thrown.");
			} catch (ActionException e) { /*expected*/ }
			try {
				performAction(testContentProcessable2, testHttpPost2, "");
				fail("No exception thrown.");
			} catch (ActionException e) { /*expected*/ }
			try {
				performAction(testContentProcessable2, testHttpUriRequest1, "");
				fail("No exception thrown.");
			} catch (ActionException e) { /*expected*/ }
			try {
				performAction(testContentProcessable2, testHttpUriRequest2, "");
				fail("No exception thrown.");
			} catch (ActionException e) { /*expected*/ }
			try {
				performAction(testContentProcessable2, testHttpPost2, "uri2");
				fail("No exception thrown.");
			}