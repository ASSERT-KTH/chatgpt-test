// Functions_1Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains one unit test case for the {@link Functions#addS(String)} method.
*/
class Functions_1Test {
// Functions.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;

/**
 * @author luc
 */
public class Functions {

    //private static Log mLogger = LogFactory.getLog(Functions.class);
    private static final Map<Integer, String> NUMBERS_WORD = new HashMap<Integer, String>();

    private static final String UNDERSCORE = "_";

    private static final String REGEX_UNDERSCORE_ONE_OR_MORE = "_+";

    private static final String REGEX_WHITESPACE_ONE_OR_MORE = "\\s+";

    private static final String[] TO_REPLACE = { "-", ":", ",", "'", "!", "\"", "\\*", "\\(", "\\)", "~", "`" };

    private static final String BLURB_SUFFIX = "...";

    private static final String STRING_SPACE = " ";

    private static final String STRING_DOT = ".";

    private static final String STRING_COMMA = ",";

    private static final String STRING_EMPTY = "";

    private static final String STRING_HTML_CR = "<br />";

    //private static final String STRING_CR = System.getProperty("line.separator");
    private final static String EOL_LINUX = "\n";

    private final static String EOL_WIN32 = "\r\n";

    private final static String EOL_MAC_LEGACY = "\n\r";

    public static final String LINK_PREFIX = "webtools.link.";

    static {
    }

    public static int year(int pOffset);

    public static char toUpper(char c);

    public static char forDigit(int pDigit, int pRadix);

    public static int length(Object pCollection) throws JspTagException;

    public static String join(String[] pStrings, String pSep);

    public static String seo(String pValue);

    public static long round(double pValue);

    public static String stripHTML(String s);

    public static String blurb(String s, int pMaxLength);

    public static String blurbHTML(String s, int pMaxLength);

    public static String since(Date pFrom);

    public static String decimalFormat(double pDouble, String pPattern);

    /**
     * Format a date with a pattern (using java.text.SimpleDateFormat)
     * @param pDateTime the date
     * @param pPattern the pattern
     * @return the date to display
     */
    public static String dateFormat(Date pDateTime, String pPattern);

    /**
     * Add's or'at the end of the text, for example "James'" for "James" or "Daniel's" for "Daniel"
     * @param pText the text
     * @return the text with's or '
     */
    public static String addS(String pText);

    /**
     * Return the pMaxLength first characters of the string s with "..."
     * @param s
     * @param pMaxLength
     * @return
     */
    public static String blurbChar(String s, int pMaxLength);

    /**
     *  Break up a too big word on several lines
     * @param s
     * @param pMaxLength
     * @return
     */
    public static String cutWordCR(String s, int pMaxLength);

    /**
     * Break up the too big words in the given text
     * @param pText
     * @param pMaxLength
     * @return
     */
    public static String cutWordCRText(String pText, int pMaxLength);

    /**
     * Break up the too big words in the given text
     * @param pText
     * @param pMaxLength
     * @return
     */
    public static String replaceCRWithBR(String pText);

    /**
     * Convert a date in milliseconds
     * @param pDateTime the date
     * @return the milliseconds
     */
    public static long dateToMilliseconds(Date pDateTime);

    /**
     * Order the words of a String
     * @param s
     * @param separator the words separator
     * @return
     */
    public static String orderWords(String s, String pSeparator);

    public static String capFirstLetters(String s);

    private static void fillTens(int pTen, String pTenWord);

    public static String numberInWord(int pValue) throws Exception;

    public static String ordinal(int pInteger);

    private static int getLastDigit(int pInteger);

    public static IRequest removeParam(String pName, IRequest pRequest) throws Exception;

    public static IRequest addParam(String pName, String pValue, IRequest pRequest) throws Exception;

    public static IRequest setParam(String pName, String pValue, IRequest pRequest) throws Exception;
}

// Functions_1Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains one unit test case for the {@link Functions#addS(String)} method.
*/
class Functions_1Test {
		public Functions_1Test() {
				// This is the simplest case of one unit test.
				// AddOneCase is a one case.
				// In this case we are not using the {@link #replaceCRWithBR(String)} method but just converting
				// between characters.
				for (int i = 0; i < 25; i++) {
						mLogger.debug(
								"Adding a word with the replacement { "
										+ ", " + replace(" ", "'", replace(" ", "'", i, replace(" ", "'")) + " ', '%").trim());
				}
				mLogger.debug("In the end of the processing, all words are added.");
				//assertEquals(3, wordsLength());
		}

		@Test
		public final void addOneCase() throws Exception {
				// assertTrue(wordsLength() == 1);
				String s = replace("-", " + ", ");
				assertEquals(4, i(s, 1));
		}

		@Test
		public final void addOneCaseNegativeOnePositive() throws Exception {
				String s = replace("-", " + ", " + replace(" ", "'", replace(" ", "'", 0, 0)) + "'");
				assertEquals(4, i(s, 1));
		}

		@Test
		public final void addOneCaseOnePosPosNegOne() throws Exception {
				String s = replace("+", " + ", " + replace(" ", "'", replace(" ", "'", i(i(s, 10), 0, 0)) + "'"));
				assertEquals(5, i(s, 10));
		}

		@Test
		public final void addOneCaseNegOnePosOneNegPos() throws Exception {
				final String s = replace("-", " + ", " + replace(" ", "'", replace(" ", "'", -10, 0)) + "'");
				assertEquals(5, i(s, 10));
		}

		@Test
		public final void addOneCaseNegOnePosOnePosNeg() throws Exception {
				final String s = replace("-", " + ", " + replace(" ", "'", replace(" ", "'", -10, 0)) + "'");
				assertEquals(5, i(s, 10));
		}

		@Test
		public final void addOneCasePos1PosNeg1PosNeg() throws Exception {
				final String s =
						replace("+