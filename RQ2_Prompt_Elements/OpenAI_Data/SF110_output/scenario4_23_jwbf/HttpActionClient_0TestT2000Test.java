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
* It contains ten unit test cases for the {@link HttpActionClient#performAction(ContentProcessable)} method.
*/
class HttpActionClient_0Test {

		private static final String HOST_URL = "http://localhost/";
		private static final String PATH = "";
		private static final String URL = HOST_URL + PATH;
		private static final String USER_AGENT = "JWBF";
		private static final String ENCODING = "UTF-8";
		private static final String CONTENT_TYPE = "text/html; charset=UTF-8";
		private static final String CONTENT_TYPE_2 = "text/html; charset=ISO-8859-1";
		private static final String CONTENT_TYPE_3 = "text/html; charset=ISO-8859-15";
		private static final String CONTENT_TYPE_4 = "text/html; charset=ISO-8859-2";
		private static final String CONTENT_TYPE_5 = "text/html; charset=ISO-8859-3";
		private static final String CONTENT_TYPE_6 = "text/html; charset=ISO-8859-4";
		private static final String CONTENT_TYPE_7 = "text/html; charset=ISO-8859-5";
		private static final String CONTENT_TYPE_8 = "text/html; charset=ISO-8859-6";
		private static final String CONTENT_TYPE_9 = "text/html; charset=ISO-8859-7";
		private static final String CONTENT_TYPE_10 = "text/html; charset=ISO-8859-8";
		private static final String CONTENT_TYPE_11 = "text/html; charset=ISO-8859-9";
		private static final String CONTENT_TYPE_12 = "text/html; charset=ISO-8859-10";
		private static final String CONTENT_TYPE_13 = "text/html; charset=ISO-8859-11";
		private static final String CONTENT_TYPE_14 = "text/html; charset=ISO-8859-13";
		private static final String CONTENT_TYPE_15 = "text/html; charset=ISO-8859-14";
		private static final String CONTENT_TYPE_16 = "text/html; charset=ISO-8859-16";
		private static final String CONTENT_TYPE_17 = "text/html; charset=US-ASCII";
		private static final String CONTENT_TYPE_18 = "text/html; charset=UTF-16";
		private static final String CONTENT_TYPE_19 = "text/html; charset=UTF-16BE";
		private static final String CONTENT_TYPE_20 = "text/html; charset=UTF-16LE";
		private static final String CONTENT_TYPE_21 = "text/html; charset=UTF-32";
		private static final String CONTENT_TYPE_22 = "text/html; charset=UTF-32BE";
		private static final String CONTENT_TYPE_23 = "text/html; charset=UTF-32LE";
		private static final String CONTENT_TYPE_24 = "text/html; charset=UTF-7";
		private static final String CONTENT_TYPE_25 = "text/html; charset=UTF-8";
		private static final String CONTENT_TYPE_26 = "text/html; charset=UTF-16";
		private static final String CONTENT_TYPE_27 = "text/html; charset=UTF-16BE";
		private static final String CONTENT_TYPE_28 = "text/html; charset=UTF-16LE";
		private static final String CONTENT_TYPE_29 = "text/html; charset=UTF-32";
		private static final String CONTENT_TYPE_30 = "text/html; charset=UTF-32BE";
		private static final String CONTENT_TYPE_31 = "text/html; charset=UTF-32LE";
		private static final String CONTENT_TYPE_32 = "text/html; charset=UTF-7";
		private static final String CONTENT_TYPE_33 = "text/html; charset=UTF-8";
		private static final String CONTENT_TYPE_34 = "text/html; charset=UTF-16";
		private static final String CONTENT_TYPE_35 = "text/html; charset=UTF-16BE";
		private static final String CONTENT_TYPE_36 = "text/html; charset=UTF-16LE";
		private static final String CONTENT_TYPE_37 = "text/html; charset=UTF-32";
		private static final String CONTENT_TYPE_38 = "text/html; charset=UTF-32BE";
		private static final String CONTENT_TYPE_39 = "text/html; charset=UTF-32LE";
		private static final String CONTENT_TYPE_40 = "text/html; charset=UTF-7";
		private static final String CONTENT_TYPE_41 = "text/html; charset=UTF-8";
		private static final String CONTENT_TYPE_42 = "text/html; charset=UTF-16";
		private static final String CONTENT_TYPE_43 = "text/html; charset=UTF-16BE";
		private static final String CONTENT_TYPE_44 = "text/html; charset=UTF-16LE";
		private static final String CONTENT_TYPE_45 = "text/html; charset=UTF-32";
		private static final String CONTENT_TYPE_46 = "text/html; charset=UTF-32BE";
		private static final String CONTENT_TYPE_47 = "text/html; charset=UTF-32LE";
		private static final String CONTENT_TYPE_48 = "text/html; charset=UTF-7";
		private static final String CONTENT_TYPE_49 = "text/html; charset=UTF-8";
		private static final String CONTENT_TYPE_50 = "text/html; charset=UTF-16";
		private static final String CONTENT_TYPE_51 = "text/html; charset=UTF-16BE";
		private static final String CONTENT_TYPE_52 = "text/html; charset=UTF-16LE";
		private static final String CONTENT_TYPE_53 = "text/html; charset=UTF-32";
		private static final String CONTENT_TYPE_54 = "text/html; charset=UTF-32BE";
		private static final String CONTENT_TYPE_55 = "text/html; charset=UTF-32LE";
		private static final String CONTENT_TYPE_56 = "text/html; charset=UTF-7";
		private static final String CONTENT_TYPE_57 = "text/html; charset=UTF-8";
		private static final String CONTENT_TYPE_58 = "text/html; charset=UTF-16";
		private static final String CONTENT_TYPE_59 = "text/html; charset=UTF-16BE";
		private static final String CONTENT_TYPE_60 = "text/html; charset=UTF-16LE";
		private static final String CONTENT_TYPE_61 = "text/html; charset=UTF-32";
		private static final String CONTENT_TYPE_62 = "text/html; charset=UTF-32BE";
		private static final String CONTENT_TYPE_63 = "text/html; charset=UTF-32LE";
		private static final String CONTENT_TYPE_64 = "text/html; charset=UTF-7";
		private static final String CONTENT_TYPE_65 = "text/html; charset=UTF-8";
		private static final String CONTENT_TYPE_66 = "text/html; charset=UTF-16";
		private static final String CONTENT_TYPE_67 = "text/html; charset=UTF-16BE";
		private static final String CONTENT_TYPE_68 = "text/html; charset=UTF-16LE";
		private static final String CONTENT_TYPE_69 = "text/html; charset=UTF-32";
		private static final String CONTENT_TYPE_70 = "text/html; charset=UTF-32BE";
		private static final String CONTENT_TYPE_71 = "text/html; charset=UTF-32LE";
	