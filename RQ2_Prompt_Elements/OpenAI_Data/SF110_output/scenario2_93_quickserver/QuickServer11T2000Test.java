// QuickServerTest.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains ten unit test cases for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServerTest {

	@Test
	void testGetSSLContext() throws IOException, NoSuchAlgorithmException, KeyManagementException {
		QuickServer myServer = new QuickServer();
		SSLContext sslc = myServer.getSSLContext(null);
		assertNotNull(sslc);
	}
}

// QuickServer.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;

/**
 * Main class of QuickServer library. This class is used to create
 * multi client servers quickly.
 * <p>
 * Ones a client is connected, it creates {@link ClientHandler} object,
 * which is run using any thread available from the pool of threads
 * maintained by {@link org.quickserver.util.pool.thread.ClientPool}, which
 * handles the client. <br/>
 * QuickServer divides the application logic of its developer over eight
 * class, <br>
 * 	<ul>
 * 	<li>ClientEventHandler<br>
 * 		   &nbsp;Handles client events [Optional Class].
 * 		<li>ClientCommandHandler [#]<br>
 * 		   &nbsp;Handles client character/string commands.
 * 		<li>ClientObjectHandler [#]<br>
 * 		   &nbsp;Handles client interaction - Object commands.
 * 	<li>ClientBinaryHandler [#]<br>
 * 		   &nbsp;Handles client interaction - binary data.
 * 	<li>ClientWriteHandler [Optional Class]<br>
 * 		   &nbsp;Handles client interaction - writing data (Only used in non-blocking mode).
 * 		<li>ClientAuthenticationHandler [Optional Class]<br>
 * 			&nbsp;Used to Authencatet a client.
 * 		<li>ClientData [Optional Class]<br>
 * 			&nbsp;Client data carrier (support class)
 * 	<li>ClientExtendedEventHandler [Optional Class]<br>
 * 		   &nbsp;Handles extended client events.
 * 	</ul>
 *
 * [#] = Any one of these have to be set based on default DataMode for input.
 * The default DataMode for input is String so if not changes you will
 * have to set ClientCommandHandler.
 * </p>
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * package echoserver;
 *
 * import org.quickserver.net.*;
 * import org.quickserver.net.server.*;
 *
 * import java.io.*;
 *
 * public class EchoServer {
 * 	public static void main(String args[])	{
 * 		String cmdHandle = "echoserver.EchoCommandHandler";
 *
 * 		QuickServer myServer = new QuickServer();
 * 		myServer.setClientCommandHandler(cmdHandle);
 * 		myServer.setPort(4123);
 * 		myServer.setName(Echo Server v1.0");
 * 		try {
 * 			myServer.startServer();
 * 		} catch(AppException e) {
 * 			System.err.println("Error in server : "+e);
 * 			e.printStackTrace();
 * 		}
 * 	}
 * }
 * </pre></BLOCKQUOTE></code></p>
 *
 * @version 1.4.8
 * @author Akshathkumar Shetty
 */
public class QuickServer implements Runnable, Service, Cloneable, Serializable {

    /**
     * Returns the <code>SSLContext</code> object that implements the specified
     * secure socket protocol from Secure configuring.
     *
     * @see #loadSSLContext
     * @param protocol the standard name of the requested protocol. If <code>null</code> will use the protocol set in secure configuration of the server.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    public SSLContext getSSLContext(String protocol) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        if (sslc == null)
            loadSSLContext();
        if (protocol != null && secureStoreManager != null) {
            SSLContext _sslc = secureStoreManager.getSSLContext(protocol);
            _sslc.init(km, tm, null);
            return _sslc;
        }
        return sslc;
    }
}

// QuickServerTest.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains ten unit test cases for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServerTest {
		
	@Test
	void testGetSSLContext() throws IOException, NoSuchAlgorithmException, KeyManagementException {
		QuickServer myServer = new QuickServer();
		SSLContext sslc = myServer.getSSLContext(null);
		assertNotNull(sslc);
	}
}

// QuickServer.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import