// ModernChatServer_2Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {
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

    public LoginBean signIn(ClientInterface cf, String emailAddr, String password, String ipAddress) throws RemoteException {
        LoginBean loginBean = null;
        //authenticate User
        //DB authentication....
        if (emailAddr!= null && password!= null && ipAddress!= null) {
            String email = StringEncoder64.decodeStringUTF8(emailAddr);
            //System.out.println("email="+email);
            User user = authenticateUser(email, password);
            if (user!= null) {
                ipAddress = StringEncoder64.decodeStringUTF8(ipAddress);
                //System.out.println("ip="+ipAddress);
                ClientInterface oldOne = connectedClients.get(user.getId());
                if (oldOne!= null) {
                    String ipAdd = connectedClientsIPs.get(user.getId());
                    if (ipAdd!= null && ipAdd.equals(ipAddress)) {
                        SendKickOffByLoginMessageThread sendKickOffByLoginMessageThread = new SendKickOffByLoginMessageThread(oldOne, true);
                        sendKickOffByLoginMessageThread.start();
                    } else {
                        SendKickOffByLoginMessageThread sendKickOffByLoginMessageThread = new SendKickOffByLoginMessageThread(oldOne, false);
                        sendKickOffByLoginMessageThread.start();
                    }
                }
                connectedClients.put(user.getId(), cf);
                connectedClientsIPs.put(user.getId(), ipAddress);
                getLogger().log(Level.FINE, "User " + email + " has logged in.");
                loginBean = new LoginBean();
                loginBean.setUser(user);
                String orignalPass = passwordEnc.decrypt(passwords.get(user.getId()));
                String tokenUsed = StringEncrypter.getInstance(orignalPass).encrypt(secToken);
                loginBean.setSecureToken(tokenUsed);
                loginBean.setAuthToken(clientAuthToken);
                return loginBean;
            } else {
                getLogger().log(Level.FINE, "User " + email + " is not valid!");
                return null;
            }
        } else {
            getLogger().log(Level.WARNING, "Credentials is null!");
            return null;
        }
    }
}

// ModernChatServer_2Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {
		
	//
    @Test
    public void test() throws Exception {
        new JOptionPane(new JTextMessage("Welcome to " + getClass().getSimpleName() + "!")).setVisible(true);
        ClientInterface cf = new ClientInterface(false, false, null);
        ClientInterface oldClientInterface = null;
        try {
	        String hostName = java.net.InetAddress.getByName(org.junit.platform.comm.nio.naming.NamingConstants.JUNIT_HOSTNAME)
	               .getHostAddress();
            System.out.println("Host Address for the JVM : " + hostName);
            StringEncoder64.decodeString("Test Test Message");
            System.out.println();

            String addr = "localhost";
            String host = hostName;

            String encryptionKey = StringEncrypter.getInstance("*_PASSWORD").encrypt('*');
            int port = 2468;
            String encryptedPass = StringEncrypter.getInstance("*_PASSWORD").encrypt(passwordEnc.decrypt(encryptionKey));

            //set connection parameters
            Registry reg = LocateRegistry.getRegistry2(addr, port);

            //set the key
            String newEncryptionKey = StringEncrypter.getInstance("Test Test Message").decrypt(encryptionKey);

            //set encryption key
            System.out.println("New encryption key " + newEncryptionKey);

            //set the cipher
            System.setProperty("crypto.dh.p", newEncryptionKey);

            //server setting.
            ServerSettingBean settingBean = new ServerSettingBean();


