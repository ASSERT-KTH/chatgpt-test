// HeaderSettings_0Test.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HeaderSettings}.
 * It contains ten unit test cases for the {@link HeaderSettings#setHeaders()} method.
 */
class HeaderSettings_0Test {

    /**
     * Test case for setting headers with Firefox user agent.
     */
    @Test
    void testSetHeadersFirefox() {
        HeaderSettings.initHeaders(HeaderSettings.FIREFOX, "http://www.example.com");
        Header[] headers = HeaderSettings.setHeaders();
        assertNotNull(headers);
        assertEquals("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)", headers[0].getValue());
        assertEquals("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", headers[1].getValue());
        assertEquals("http://www.example.com", headers[2].getValue());
        assertEquals("Keep-Alive", headers[3].getName());
        assertEquals("300", headers[3].getValue());
    }

    /**
     * Test case for setting headers with custom user agent and referer.
     */
    @Test
    void testSetHeadersCustom() {
        HeaderSettings.initHeaders(HeaderSettings.CUSTOM, "http://www.example.com");
        Header[] headers = HeaderSettings.setHeaders();
        assertNotNull(headers);
        assertEquals("http://www.example.com", headers[2].getValue());
    }

    /**
     * Test case for setting headers with preset cookie.
     */
    @Test
    void testSetHeadersWithCookie() {
        HeaderSettings.setCookie("myCookie=123");
        HeaderSettings.initHeaders(HeaderSettings.FIREFOX, "http://www.example.com");
        Header[] headers = HeaderSettings.setHeaders();
        assertNotNull(headers);
        assertEquals("myCookie=123", headers[4].getValue());
    }

    /**
     * Test case for clearing preset cookie.
     */
    @Test
    void testClearCookie() {
        HeaderSettings.setCookie("myCookie=123");
        HeaderSettings.clearCookie();
        assertNull(HeaderSettings.setHeaders()[4]);
    }

    /**
     * Test case for getting headers as string.
     */
    @Test
    void testGetHeaders() {
        HeaderSettings.initHeaders(HeaderSettings.IE6, "http://www.example.com");
        String headersString = HeaderSettings.getHeaders();
        assertNotNull(headersString);
        assertTrue(headersString.contains("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)"));
        assertTrue(headersString.contains("Referer: http://www.example.com"));
    }

    /**
     * Test case for showing headers of a request.
     */
    @Test
    void testShowHeadersRequest() {
        HttpGet request = new HttpGet("http://www.example.com");
        HeaderSettings.initHeaders(HeaderSettings.IE7, "http://www.example.com");
        Header[] headers = HeaderSettings.setHeaders();
        request.setHeaders(headers);
        String headersString = HeaderSettings.showHeaders(request);
        assertNotNull(headersString);
        assertTrue(headersString.contains("User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)"));
        assertTrue(headersString.contains("Referer: http://www.example.com"));
    }

    /**
     * Test case for showing headers of an array of headers.
     */
    @Test
    void testShowHeadersArray() {
        Header[] headers = new Header[2];
        headers[0] = new Header() {
            @Override
            public String getName() {
                return "Header1";
            }

            @Override
            public String getValue() {
                return "Value1";
            }

            @Override
            public HeaderElement[] getElements() throws UnsupportedOperationException {
                return null;
            }
        };
        headers[1] = new Header() {
            @Override
            public String getName() {
                return "Header2";
            }

            @Override
            public String getValue() {
                return "Value2";
            }

            @Override
            public HeaderElement[] getElements() throws UnsupportedOperationException {
                return null;
            }
        };
        String headersString = HeaderSettings.showHeaders(headers);
        assertNotNull(headersString);
        assertTrue(headersString.contains("Header1: Value1"));
        assertTrue(headersString.contains("Header2: Value2"));
    }

    /**
     * Test case for setting headers with empty referer.
     */
    @Test
    void testSetHeadersEmptyReferer() {
        HeaderSettings.initHeaders(HeaderSettings.IPHONE, "");
        Header[] headers = HeaderSettings.setHeaders();
        assertNotNull(headers);
        assertEquals("http://www.example.com", headers[2].getValue());
    }

    /**
     * Test case for setting headers with null referer.
     */
    @Test
    void testSetHeadersNullReferer() {
        HeaderSettings.initHeaders(HeaderSettings.MSNBOT, null);
        Header[] headers = HeaderSettings.setHeaders();
        assertNotNull(headers);
        assertEquals("http://www.example.com", headers[2].getValue());
    }

    /**
     * Test case for setting headers with custom headers string.
     */
    @Test
    void testSetHeadersCustomHeaders() {
        String myHeaders = "Header1: Value1\nHeader2: Value2";
        HeaderSettings.initHeaders(myHeaders);
        Header[] headers = HeaderSettings.setHeaders();
        assertNotNull(headers);
        assertEquals("Value1", headers[0].getValue());
        assertEquals("Value2", headers[1].getValue());
    }

    /**
     * Test case for setting headers with empty custom headers string.
     */
    @Test
    void testSetHeadersEmptyCustomHeaders() {
        String myHeaders = "";
        HeaderSettings.initHeaders(myHeaders);
        Header[] headers = HeaderSettings.setHeaders();
        assertNotNull(headers);
        assertEquals(0, headers.length);
    }
}