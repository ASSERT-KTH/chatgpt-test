// ModernChatServer_5Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
*/
class ModernChatServer_5Test {
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

    public boolean sendSecureTextMessage(TextMessage msg) throws RemoteException {
        if (msg.getTargetType() == IConstant.USER_CHAT) {
            ClientInterface cf = connectedClients.get(msg.getToUserId());
            return sendSecureTextMessageToUser(msg, cf);
        } else if (msg.getTargetType() == IConstant.GROUP_CHAT) {
            Vector<User> tempUsers = null;
            ClientInterface cf = null;
            for (int i = 0; i < getGroups().size(); i++) {
                if (getGroups().get(i).getId() == msg.getToUserId()) {
                    tempUsers = getGroups().get(i).getUsers();
                    break;
                }
            }
            if (tempUsers!= null && tempUsers.size() > 0) {
                //loop on users
                boolean success = false;
                for (int i = 0; i < tempUsers.size(); i++) {
                    if (tempUsers.get(i).getId()!= msg.getFromUserId()) {
                        cf = connectedClients.get(tempUsers.get(i).getId());
                        if (sendSecureTextMessageToUser(msg, cf)) {
                            success = true;
                        }
                    }
                }
                if (success) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (msg.getTargetType() == IConstant.ROOM_CHAT) {
            int[] tempUsers = null;
            ClientInterface cf = null;
            for (int i = 0; i < getRooms().size(); i++) {
                if (getRooms().get(i).getId() == msg.getToUserId()) {
                    tempUsers = getRooms().get(i).getUserId();
                    break;
                }
            }
            if (tempUsers!= null && tempUsers.length > 0) {
                boolean success = false;
                //loop on users
                for (int i = 0; i < tempUsers.length; i++) {
                    if (tempUsers[i]!= msg.getFromUserId()) {
                        cf = connectedClients.get(tempUsers[i]);
                        if (sendSecureTextMessageToUser(msg, cf)) {
                            success = true;
                        }
                    }
                }
                if (success) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

// ModernChatServer_5Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
*/
class ModernChatServer_5Test {
		/**
		* Main method of the test class.
		*/
    @Test
    void test() throws UnauthorizedException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException, RemoteException, URISyntaxException {
        ServerSettingBean defaultSetting = new ServerSettingBean();
        
		ServerSettings settings = ServerSettings.get(defaultSetting);

        int port = settings.getPort();
        if (port < 1024) {
            port = 2048;
        }
		
        boolean isSecureChat = port == 54321;
        
		Hashtable<String, Object> properties = new Hashtable<>();
        properties.put("org.apache.log4j.PropertyConfigurator", "com.caucho.log4j.PropertyConfigurator");
        properties.put("log_name", "TestLog");
        properties.put("log_level",Level.INFO);
        SimpleFormatter formatter = new SimpleFormatter();
        properties.put("log_formatter",formatter);
        properties.put("log_file", "" + ("log4j.properties"));
        properties.put("log_path", "" + "log");
        properties.put("log_file_size", "" + "" + "" + "");
        properties.put("log_file_is_file", "" + "" + "" + "");
        properties.put("log_enable_std_out", "" + "" + "" +