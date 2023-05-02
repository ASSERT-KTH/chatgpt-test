// Login_3Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#authorize()} method.
*/
class Login_3Test {
// Login.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;

public class Login {

    public User authorize() throws LoginException {
        user = null;
        if (userMgr == null)
            throw new LoginException("UserMgr undefined");
        if (password == null)
            throw new LoginException("Password not supplied");
        user = userMgr.getUser(this.userid);
        user.setIpAddr(this.ipAddr);
        // compare password validity start date with current date
        Date today = new Date();
        Date pwvd = null;
        if ((user.getPassvalidstart()!= null) && (!user.getPassvalidstart().equals(""))) {
            pwvd = convertDateFromUTC(user.getPassvalidstart());
            if (!dateCompare(pwvd, today)) {
                log(user, "Not allowed to login currently.");
                user = null;
                throw new LoginException("Not allowed to login currently.");
            }
        }
        // check if user needs to change password before proceeding
        user.setPasschange(false);
        if ((user.getPassvalidstart()!= null) && (user.getPassrenewal()!= null) && (!user.getPassvalidstart().equals("")) && (!user.getPassrenewal().equals("")) && (!user.getPassrenewal().equals("-1"))) {
            Calendar c1 = Calendar.getInstance();
            c1.setTime(pwvd);
            c1.add(Calendar.DATE, Integer.parseInt(user.getPassrenewal()));
            if (dateCompare(c1.getTime(), today)) {
                user.setPasschange(true);
            }
        }
        // Performing IP based filtering and active groups determination
        // based on current location.
        // Make sure that AuthType=krb5 and IPfiltering=yes in the properties file.
        if ((user.getAllowedips()!= null) && (props.getProperty("AuthType", "krb5").equals("krb5")) && (props.getProperty("IPfiltering", "yes").equals("yes"))) {
            int currentip = getIpInteger(user.getIpAddr());
            // IP based filtering
            cat.info("Performing IP filtering for " + getUserId());
            boolean ipcheck_result = ipRangeCheck(user.getAllowedips(), currentip);
            if (ipcheck_result == false) {
                log(user, "Not authorized from the current IP address.");
                throw new LoginException("Not authorized from the current IP address.");
            }
            // Active groups determination
            cat.info("Determining active groups for " + getUserId());
            boolean faccheck_result;
            // get all groups from LDAPservice
            Set usergrps = user.getGroups();
            if (usergrps!= null && usergrps.size() > 0) {
                // Setup the interface to the LDAP server
                getLdapService();
                //session.setAttribute("ldapservice", lservice);
                Iterator grpit = usergrps.iterator();
                while (grpit.hasNext()) {
                    // Fetch each group's details from LDAP
                    Group grp = (Group) lservice.getGroup(grpit.next().toString());
                    faccheck_result = ipRangeCheck(grp.getAllowedips(), currentip);
                    if (faccheck_result == true) {
                        log(user, "Active group: " + grp.getCn());
                        user.addActivegroup(grp.getCn());
                    }
                }
                if (user.getActivegroups() == null || user.getActivegroups().size() == 0) {
                    log(user, " Accessing from remote location.");
                    user.addActivegroup("remote");
                }
            }
        }
        // end IP based filtering and Active groups determination
        return user;
    }
}

// Login_3Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#authorize()} method.
*/
class Login_3Test {
		private static String userid = "root";
		private static String ipAddr = "192.168.0.10";
		private static String pw = "123456";
		private static String ipAddrAcl = "/test/acl";
		private static Boolean b = Boolean.FALSE;
		private static Boolean isActiveGrp = Boolean.FALSE;
		private static String pw1 = pw;
		private static String user2 = "root2";
		private static String pw2 = "abcdefg";
		private static String pw3 = "asdgefj";
		private static String user3 = "root3";
		private static String pw4 = "asdbgf";
		private File xacmdir;
		private static Boolean cb;
		private static LDAPService lservice;

		/**
		* Initialize the instance variables.
		*/
		public Login_3Test() {
			//set a temporary directory
			String tempdir = System.getProperty("java.io.tmpdir");
			xacmdir = File.createTempFile("A", ".xml", new File(tempdir));
		}

		/**
		* Returns user ids from properties file.
		*
		* @param xml The user ids.
		* @return
		* @precondition The properties file must have at least one user id.
		* @postcondition {@link Properties} contains one instance of {@link Properties} with a single user id.
		*/
		private static String[] getUserIds(String xml) {
			String[] ret = new String[1];
			try {
				ret = xml.split("=");
				Set<String> userids = new HashSet<>();
				setProperties(userids);
				return ret;
			}
			catch (Exception e) {
				e.printStackTrace();
				return new String[0];
			}
		}

		private void setProperties(Set<String> userids) {
			if (userids == null) {
				userids = new HashSet<String>();
			}
			Set<String> unsetUsersIDs = userids;
			userids.remove(userid);
			userid = userids.iterator().next();
			setIn