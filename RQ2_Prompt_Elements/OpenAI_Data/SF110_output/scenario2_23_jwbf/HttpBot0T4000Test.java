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

		/**
		* Test method for {@link HttpBot#getInstance()}.
		*/
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
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.core.internal.Checked;
import net.sourceforge.jwbf.core.internal.Nonnull;
import net.sourceforge.jwbf.core.internal.Nullable;
import net.sourceforge.jwbf.core.internal.QuietCloser;
import net.sourceforge.jwbf.core.internal.SimpleHttp;
import net.sourceforge.jwbf.core.internal.SimpleHttp.Response;
import net.sourceforge.jwbf.core.internal.SimpleHttp.ResponseHandler;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactory;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl2;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl3;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl4;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl5;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl6;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl7;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl8;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl9;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl10;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl11;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl12;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl13;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl14;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl15;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl16;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl17;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl18;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl19;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl20;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl21;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl22;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl23;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl24;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl25;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl26;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl27;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl28;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl29;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl30;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl31;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl32;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl33;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl34;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl35;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl36;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl37;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl38;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl39;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl40;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl41;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl42;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl43;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl44;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl45;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl46;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl47;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl48;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl49;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl50;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl51;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl52;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl53;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl54;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl55;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl56;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl57;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl58;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl59;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl60;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl61;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl62;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl63;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl64;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl65;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl66;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl67;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl68;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl69;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl70;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl71;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl72;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl73;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl74;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl75;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl76;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl77;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl78;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl79;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl80;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl81;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl82;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl83;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl84;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl85;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl86;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl87;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl88;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl89;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl90;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl91;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl92;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl93;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl94;
import net.sourceforge.jwbf.core.internal.SimpleHttp.SimpleHttpFactoryBuilder.SimpleHttpFactoryBuilderImpl.SimpleHttpFactoryBuilderImpl95;
import net.sourceforge.j