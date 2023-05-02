// Source code for MediaWiki.java

package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

/**
 * This class contains utility methods related to MediaWiki.
 */
public final class MediaWiki {

    /**
     * @deprecated use {@link #NS_MAIN} instead. Wrong value.
     */
    @Deprecated
    public static final int ARTICLE = 1 << 1;

    /**
     * @deprecated use {@link #NS_MAIN} instead. Wrong value.
     */
    @Deprecated
    public static final int MEDIA = 1 << 2;

    /**
     * @deprecated use {@link #NS_CATEGORY} instead.
     */
    @Deprecated
    public static final int SUBCATEGORY = 1 << 3;

    static final String CHARSET = "UTF-8";

    public static final int NS_MAIN = 0;

    public static final int NS_MAIN_TALK = 1;

    public static final int NS_USER = 2;

    public static final int NS_USER_TALK = 3;

    public static final int NS_META = 4;

    public static final int NS_META_TALK = 5;

    public static final int NS_IMAGES = 6;

    public static final int NS_IMAGES_TALK = 7;

    public static final int NS_MEDIAWIKI = 8;

    public static final int NS_MEDIAWIKI_TALK = 9;

    public static final int NS_TEMPLATE = 10;

    public static final int NS_TEMPLATE_TALK = 11;

    public static final int NS_HELP = 12;

    public static final int NS_HELP_TALK = 13;

    public static final int NS_CATEGORY = 14;

    public static final int NS_CATEGORY_TALK = 15;

    public static final int[] NS_ALL = { NS_MAIN, NS_MAIN_TALK, NS_USER, NS_USER_TALK, NS_META, NS_META_TALK, NS_IMAGES, NS_IMAGES_TALK, NS_MEDIAWIKI, NS_MEDIAWIKI_TALK, NS_TEMPLATE, NS_TEMPLATE_TALK, NS_HELP, NS_HELP_TALK, NS_CATEGORY, NS_CATEGORY_TALK };

    public static final Set<String> BOT_GROUPS = new HashSet<String>();

    static {
        BOT_GROUPS.add("bot");
    }

    /**
     * Representaion of MediaWiki version.
     */
    public enum Version {

        /**
         * @deprecated requires PHP 5.2 expired 2011-01-06
         */
        MW1_09,
        /**
         * @deprecated requires PHP 5.2 expired 2011-01-06
         */
        MW1_10,
        /**
         * @deprecated requires PHP 5.2 expired 2011-01-06
         */
        MW1_11,
        /**
         * @deprecated requires PHP 5.2 expired 2011-01-06
         */
        MW1_12,
        /**
         * Released 2008-08
         *
         * @deprecated requires PHP 5.2 expired 2011-01-06; is installable but
         *             doesn't work
         */
        MW1_13,
        /**
         * Released 2009-02
         *
         * @deprecated database installer doesn't work anymore
         */
        MW1_14,
        /**
         * Released 2009-06
         */
        MW1_15,
        /**
         * Released 2010-07
         */
        MW1_16,
        /**
         * Released 2011-06
         */
        MW1_17,
        /**
         * Released 2011-11
         */
        MW1_18,
        UNKNOWN,
        DEVELOPMENT;

        private static Version last = UNKNOWN;

        /**
         * @return a, like 1.15
         */
        public String getNumber() {
            return name().replace("MW", "").replace("_0", "_").replace("_", ".");
        }

        private int getIntValue() {
            try {
                return Integer.parseInt(getNumber().replace(".", ""));
            } catch (Exception e) {
                if (this == DEVELOPMENT)
                    return Integer.MAX_VALUE;
                return -1;
            }
        }

        /**
         * @return the latest version
         */
        public static Version getLatest() {
            if (last == UNKNOWN) {
                Version[] as = valuesStable();
                for (int i = 0; i < as.length; i++) {
                    if (as[i].getIntValue() > last.getIntValue()) {
                        last = as[i];
                    }
                }
            }
            return last;
        }

        /**
         * @deprecated use {@link #getLatest()} instead.
         * @return the latest version
         */
        @Deprecated
        public static Version getLast() {
            return getLatest();
        }

        /**
         * @param v
         *          a
         * @return true if
         */
        public boolean greaterEqThen(Version v) {
            if (v.getIntValue() > getIntValue())
                return false;
            return true;
        }

        /**
         * @return all known stable MW Versions
         */
        public static Version[] valuesStable() {
            Version[] vxN = new Version[Version.values().length - 2];
            Version[] vx = Version.values();
            int j = 0;
            for (int i = 0; i < vx.length; i++) {
                if (!(vx[i].equals(DEVELOPMENT) || vx[i].equals(UNKNOWN))) {
                    vxN[j++] = vx[i];
                }
            }
            return vxN;
        }
    }

    private MediaWiki() {
        // do nothing
    }

    /**
     * @return the character set used by MediaWiki
     */
    public static String getCharset() {
        return CHARSET;
    }

    /**
     * Encodes a string using the character set used by MediaWiki.
     *
     * @param s
     *          the string to encode
     * @return the encoded string
     */
    public static String encode(String s) {
        try {
            return URLEncoder.encode(s, MediaWiki.CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Decodes a string using the character set used by MediaWiki.
     *
     * @param s
     *          the string to decode
     * @return the decoded string
     */
    public static String decode(final String s) {
        String out = HTMLEntities.unhtmlentities(s);
        out = HTMLEntities.unhtmlQuotes(out);
        return out;
    }
}

// Source code for MediaWiki_1Test.java

package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link MediaWiki}.
 */
class MediaWiki_1Test {

    /**
     * Tests encoding of a string with no special characters.
     */
    @Test
    void testEncode_noSpecialChars() {
        String input = "hello world";
        String expectedOutput = "hello%20world";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * Tests encoding of a string with special characters.
     */
    @Test
    void testEncode_specialChars() {
        String input = "hello world & goodbye";
        String expectedOutput = "hello%20world%20%26%20goodbye";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * Tests encoding of a string with non-ASCII characters.
     */
    @Test
    void testEncode_nonAsciiChars() {
        String input = "héllo wörld";
        String expectedOutput = "h%C3%A9llo%20w%C3%B6rld";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * Tests decoding of a string with no special characters.
     */
    @Test
    void testDecode_noSpecialChars() {
        String input = "hello world";
        String expectedOutput = "hello world";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * Tests decoding of a string with special characters.
     */
    @Test
    void testDecode_specialChars() {
        String input = "hello%20world%20%26%20goodbye";
        String expectedOutput = "hello world & goodbye";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * Tests decoding of a string with HTML entities.
     */
    @Test
    void testDecode_htmlEntities() {
        String input = "hello &amp; world";
        String expectedOutput = "hello & world";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * Tests decoding of a string with HTML quotes.
     */
    @Test
    void testDecode_htmlQuotes() {
        String input = "hello &quot;world&quot;";
        String expectedOutput = "hello \"world\"";
        String actualOutput = MediaWiki.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * Tests decoding of a string with