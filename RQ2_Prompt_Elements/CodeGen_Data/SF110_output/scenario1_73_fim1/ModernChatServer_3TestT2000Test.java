// ModernChatServer_3Test.java
package osa.ora.server;

import java.net.URISyntaxException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import osa.ora.server.bd.UsersBD;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.IConstant;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.ResultBean;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.ServerSettingBean;
import osa.ora.server.beans.TextMessage;
import osa.ora.server.beans.User;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.threads.SendKickOffByLoginMessageThread;
import osa.ora.server.threads.SendKickOffMessageThread;
import osa.ora.server.threads.SendRefreshContactThread;
import osa.ora.server.threads.SendUserUpdatedStatusThread;
import osa.ora.server.utils.StringEncoder64;
import osa.ora.server.utils.StringEncrypter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModernChatServer}.
* It contains one unit test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_3Test {
// ModernChatServer.java
package osa.ora.server;

import java.net.URISyntaxException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import osa.ora.server.bd.UsersBD;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.IConstant;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.ResultBean;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.ServerSettingBean;
import osa.ora.server.beans.TextMessage;
import osa.ora.server.beans.User;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.threads.SendKickOffByLoginMessageThread;
import osa.ora.server.threads.SendKickOffMessageThread;
import osa.ora.server.threads.SendRefreshContactThread;
import osa.ora.server.threads.SendUserUpdatedStatusThread;
import osa.ora.server.utils.StringEncoder64;
import osa.ora.server.utils.StringEncrypter;

/**
 * @author ooransa
 * Class implements 2 interfaces:
 * 1.Runnable for ping users thread : that ping users periodically to check if they are still connected or not.
 * 2.ServerInterface that extends 2 other interfaces : Admin Interface and Client Interface, both used
 * As the RMI view of the server for the connected client.
 */
public class ModernChatServer implements ServerInterface, Runnable {

    public ResultBean changePassword(String email, String oldPass, String newPass) throws RemoteException {
        email = StringEncoder64.decodeStringUTF8(email);
        oldPass = StringEncrypter.getInstance(secToken).decrypt(oldPass);
        String newOldPass = StringEncrypter.getInstance(oldPass).encrypt(oldPass);
        User user = authenticateUser(email, newOldPass);
        if (user == null) {
            return new ResultBean(false, IConstant.ERROR, "Invalid Password!");
        }
        oldPass = passwordEnc.encrypt(oldPass);
        newPass = StringEncrypter.getInstance(secToken).decrypt(newPass);
        newPass = passwordEnc.encrypt(newPass);
        if (userBD.updatePassword(user.getId(), oldPass, newPass)) {
            passwords.put(user.getId(), newPass);
            return new ResultBean(true, IConstant.SUCCESS, null);
        }
        return new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
    }
}

// ModernChatServer_3Test.java
package osa.ora.server;

import java.net.URISyntaxException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import osa.ora.server.bd.UsersBD;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.IConstant;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.ResultBean;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.ServerSettingBean;
import osa.ora.server.beans.TextMessage;
import osa.ora.server.beans.User;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.threads.SendKickOffByLoginMessageThread;
import osa.ora.server.threads.SendKickOffMessageThread;
import osa.ora.server.threads.SendRefreshContactThread;
import osa.ora.server.threads.SendUserUpdatedStatusThread;
import osa.ora.server.utils.StringEncoder64;
import osa.ora.server.utils.StringEncrypter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModernChatServer}.
* It contains one unit test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_3Test {
		
    private static final int MILLI_CALENDAR_DAYS_FOR_LOGGED_ONS = 30;
    private static final int MILLI_CALENDAR_DAYS_FOR_NODE_OF_SERVER = 10;
    private final String ENTRY_FOLDER = ChatServer.class.getResource("/").toString();
    private final String EXIT_FOLDER = ENTRY_FOLDER + "/";
    private final String DATENAMES = "/datename.dat.txt";
     
    @Test
    void setServerInterface() throws RemoteException {        	
        MainWindow w = new MainWindow(); 		
        new ServerSettingBean();
        new ClientInterface();
    }
    
    @Test
    void sendTestPass() throws Exception {
        System.out.println("1. Send a text message for the Server, with an exception");
        String message = "Hello I am I!";
        System.out.println("2. Login for the Server");
        LoginBean login = new LoginBean();        	
        User user = login.login();
        BinaryMessage b = new BinaryMessage(message);
        b.setUserId(user.getId());
        b.setTimestamp(1);
        
        ResultBean result = sendSendMessage(login, b);       
        if (result.getCode() == IConstant.TIMEOUT) {
            log.warning("Server Time out!");
        }
        System.out.println("3. Validate the message!");
        assertTrue(result.getCode() == IConstant.SUCCESS);
    }   	  
    
    @Test
    void sendTestSendMessage() throws RemoteException {        	        
        System.out.println("1. Send a text message for the Server");
        String message = "Hello I am I!";
        System.out.println("2. Login for the Server");
        LoginBean login = new LoginBean();        	
        User user = login.login();
        
        BinaryMessage b = new BinaryMessage(message);
        b.setUserId(user.getId());
        b.setTimestamp(1);
        
        ResultBean result = sendSendMessage(login, b);                
        
        System.out.println("3. Validate the message!");
        assertFalse(result.getCode() == IConstant.SUCCESS);
        assertTrue(result.getCode() == IConstant.TIMED_OUT);
    }    	  
    
    @Test
    void sendTestSendMessageAndUserUpdateStatus() throws RemoteException {        	
        System.out.println("1. Send a text message for the Server");
        String message = "Hello I am I!";
        System.out.println("2. Login for the Server");
        LoginBean login = new LoginBean();        	
        User user = login