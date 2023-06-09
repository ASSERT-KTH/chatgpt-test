// MediaWikiBot_3Test.java
package net.sourceforge.jwbf.mediawiki.bots;

import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.editing.GetRevision;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostDelete;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLogin;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLoginOld;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetUserinfo;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetVersion;
import net.sourceforge.jwbf.mediawiki.actions.meta.Siteinfo;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWikiBot}.
* It contains ten unit test cases for the {@link MediaWikiBot#getArticle(String)} method.
*/
class MediaWikiBot_3Test {

		private static final String WIKI_URL = "http://localhost/w/";
		private static final String USERNAME = "username";
		private static final String PASSWORD = "password";
		private static final String DOMAIN = "domain";
		private static final String TITLE = "title";
		private static final String TEXT = "text";
		private static final String SUMMARY = "summary";
		private static final String MINOR = "minor";
		private static final String BOT = "bot";
		private static final String NEW_TEXT = "new text";
		private static final String NEW_SUMMARY = "new summary";
		private static final String NEW_MINOR = "new minor";
		private static final String NEW_BOT = "new bot";
		private static final String NEW_TITLE = "new title";
		private static final String NEW_USERNAME = "new username";
		private static final String NEW_PASSWORD = "new password";
		private static final String NEW_DOMAIN = "new domain";
		private static final String NEW_WIKI_URL = "http://localhost/new/";
		private static final String NEW_WIKI_URL_2 = "http://localhost/new2/";
		private static final String NEW_WIKI_URL_3 = "http://localhost/new3/";
		private static final String NEW_WIKI_URL_4 = "http://localhost/new4/";
		private static final String NEW_WIKI_URL_5 = "http://localhost/new5/";
		private static final String NEW_WIKI_URL_6 = "http://localhost/new6/";
		private static final String NEW_WIKI_URL_7 = "http://localhost/new7/";
		private static final String NEW_WIKI_URL_8 = "http://localhost/new8/";
		private static final String NEW_WIKI_URL_9 = "http://localhost/new9/";
		private static final String NEW_WIKI_URL_10 = "http://localhost/new10/";
		private static final String NEW_WIKI_URL_11 = "http://localhost/new11/";
		private static final String NEW_WIKI_URL_12 = "http://localhost/new12/";
		private static final String NEW_WIKI_URL_13 = "http://localhost/new13/";
		private static final String NEW_WIKI_URL_14 = "http://localhost/new14/";
		private static final String NEW_WIKI_URL_15 = "http://localhost/new15/";
		private static final String NEW_WIKI_URL_16 = "http://localhost/new16/";
		private static final String NEW_WIKI_URL_17 = "http://localhost/new17/";
		private static final String NEW_WIKI_URL_18 = "http://localhost/new18/";
		private static final String NEW_WIKI_URL_19 = "http://localhost/new19/";
		private static final String NEW_WIKI_URL_20 = "http://localhost/new20/";
		private static final String NEW_WIKI_URL_21 = "http://localhost/new21/";
		private static final String NEW_WIKI_URL_22 = "http://localhost/new22/";
		private static final String NEW_WIKI_URL_23 = "http://localhost/new23/";
		private static final String NEW_WIKI_URL_24 = "http://localhost/new24/";
		private static final String NEW_WIKI_URL_25 = "http://localhost/new25/";
		private static final String NEW_WIKI_URL_26 = "http://localhost/new26/";
		private static final String NEW_WIKI_URL_27 = "http://localhost/new27/";
		private static final String NEW_WIKI_URL_28 = "http://localhost/new28/";
		private static final String NEW_WIKI_URL_29 = "http://localhost/new29/";
		private static final String NEW_WIKI_URL_30 = "http://localhost/new30/";
		private static final String NEW_WIKI_URL_31 = "http://localhost/new31/";
		private static final String NEW_WIKI_URL_32 = "http://localhost/new32/";
		private static final String NEW_WIKI_URL_33 = "http://localhost/new33/";
		private static final String NEW_WIKI_URL_34 = "http://localhost/new34/";
		private static final String NEW_WIKI_URL_35 = "http://localhost/new35/";
		private static final String NEW_WIKI_URL_36 = "http://localhost/new36/";
		private static final String NEW_WIKI_URL_37 = "http://localhost/new37/";
		private static final String NEW_WIKI_URL_38 = "http://localhost/new38/";
		private static final String NEW_WIKI_URL_39 = "http://localhost/new39/";
		private static final String NEW_WIKI_URL_40 = "http://localhost/new40/";
		private static final String NEW_WIKI_URL_41 = "http://localhost/new41/";
		private static final String NEW_WIKI_URL_42 = "http://localhost/new42/";
		private static final String NEW_WIKI_URL_43 = "http://localhost/new43/";
		private static final String NEW_WIKI_URL_44 = "http://localhost/new44/";
		private static final String NEW_WIKI_URL_45 = "http://localhost/new45/";
		private static final String NEW_WIKI_URL_46 = "http://localhost/new46/";
		private static final String NEW_WIKI_URL_47 = "http://localhost/new47/";
		private static final String NEW_WIKI_URL_48 = "http://localhost/new48/";
		private static final String NEW_WIKI_URL_49 = "http://localhost/new49/";
		private static final String NEW_WIKI_URL_50 = "http://localhost/new50/";
		private static final String NEW_WIKI_URL_51 = "http://localhost/new51/";
		private static final String NEW_WIKI_URL_52 = "http://localhost/new52/";
		private static final String NEW_WIKI_URL_53 = "http://localhost/new53/";
		private static final String NEW_WIKI_URL_54 = "http://localhost/new54/";
		private static final String NEW_WIKI_URL_55 = "http://localhost/new55/";
		private static final String NEW_WIKI_URL_56 = "http://localhost/new56/";
		private static final String NEW_WIKI_URL_57 = "http://localhost/new57/";
		private static final String NEW_WIKI_URL_58 = "http://localhost/new58/";
		private static final String NEW_WIKI_URL_59 = "http://localhost/new59/";
		private static final String NEW_WIKI_URL_60 = "http://localhost/new60/";
		private static final String NEW_WIKI_URL_61 = "http://localhost/new61/";
		private static final String NEW_WIKI_URL_62 = "http://localhost/new62/";
		private static final String NEW_WIKI_URL_63 = "http://localhost/new63/";
		private static final String NEW_WIKI_URL_64 = "http://localhost/new64/";
		private static final String NEW_WIKI_URL_65 = "http://localhost/new65/";
		private static final String NEW_WIKI_URL_66 = "http://localhost/new66/";
		private static final String NEW_WIKI_URL_67 = "http://localhost/new67/";
		