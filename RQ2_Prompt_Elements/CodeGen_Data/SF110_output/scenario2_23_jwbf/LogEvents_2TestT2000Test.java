// LogEvents_2Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains one unit test case for the {@link LogEvents#iterator()} method.
*/
class LogEvents_2Test {
// LogEvents.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

/**
 * List log events, filtered by time range, event type, user type, or the page
 * it applies to. Ordered by event timestamp. Parameters: letype (flt), lefrom
 * (paging timestamp), leto (flt), ledirection (dflt=older), leuser (flt),
 * letitle (flt), lelimit (dflt=10, max=500/5000)
 *
 * api.php? action=query & list=logevents      - List last 10 events of any type
 *
 * TODO This is a semi-complete extension point
 *
 * @author Thomas Stock
 */
@Slf4j
@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
public class LogEvents extends MWAction implements Iterator<LogItem>, Iterable<LogItem> {

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public Iterator<LogItem> iterator() {
        try {
            return (Iterator<LogItem>) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

// LogEvents_2Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains one unit test case for the {@link LogEvents#iterator()} method.
*/
class LogEvents_2Test {
		
    public final static Integer LETYPESPEC = new Integer(0);
    public final static String USERBOTNAME = "";
    public static final String USER = "";
	public final static String PAGENAME = "";
    public final static String WLITEMTYPE = "";

    String logItem = "";
    Collection<LogItem> logItems = new Vector<LogItem>();

    public void setUp() {
    	logItem="";
    	logItems = new Vector<LogItem>();
	}

	/**
	 * @param action
	 *
	 * @return the action
	 */
    Collection<?> executeLogAction(Object action) {
    	Collection<?> collection = (Collection<?>) getExecutionContext(action,new String[]{""});
		return collection;	
    }
    
    /**
     * Test get last ten events of an mw action instance
     * @throws ProcessException 
     * @throws VersionException 
     * @throws IOException 
     * @throws JDOMException 
     */
    @Test
    void testGetLastOne() throws IOException, JDOMException, VersionException, ProcessException,
            Exception {
		logItems.add(new LogItem(PAGENAME, USERBOTNAME, "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", 
    			PAGENAME + "1", new String[]{"*" + USERBOTNAME + "*"}, null, null, null));
		// try with a null name & no user
		logItems.add(new LogItem(PAGENAME, USERBOTNAME, "", USER, "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", ""));
		// no log item
		Collection<?> collection =  getExecutionContext(logItems.get(0),new String[]{""});
		Collection<?> collection1 = getExecutionContext(logItems.get(1),new String[]{""});
		assertEquals("Mismatch of list and collection: log items are not correctly added",1,collection.size());
		assertEquals("Mismatch of list and collection:  log items are not correctly added",collection.size(),collection1.size());
		// get the last ten events
		logItems = getExecutionContext(logItems.get(2),new String[]{""});
		collection =  getExecutionContext(logItems.get(0),new String[]{""});
		collection1 =  getExecutionContext