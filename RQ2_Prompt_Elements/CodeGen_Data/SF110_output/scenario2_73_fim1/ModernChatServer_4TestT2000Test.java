// ModernChatServer_4Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServer_4Test {
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

    /**
     * Change admin password
     *
     * @param emailAddr : email of the admin
     * @param oldPass : current password
     * @param newPass : new password
     * @return ResultBean : return status
     * @throws RemoteException
     */
    public ResultBean changeAdminPassword(String emailAddr, String oldPass, String newPass) throws RemoteException {
        oldPass = StringEncrypter.getInstance(secToken).decrypt(oldPass);
        String newOldPass = StringEncrypter.getInstance(oldPass).encrypt(oldPass);
        LoginBean loginBean = signInAsAdmin(emailAddr, newOldPass);
        if (loginBean == null) {
            return new ResultBean(false, IConstant.ERROR, "Invalid Password!");
        }
        oldPass = passwordEnc.encrypt(oldPass);
        newPass = StringEncrypter.getInstance(secToken).decrypt(newPass);
        newPass = passwordEnc.encrypt(newPass);
        if (userBD.updatePassword(adminUser.getId(), oldPass, newPass)) {
            passwords.put(adminUser.getId(), newPass);
            return new ResultBean(true, IConstant.SUCCESS, null);
        }
        return new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
    }
}

// ModernChatServer_4Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServer_4Test {
		
    @Test
    void test_ServerInterface() {
        Registry registry = LocateRegistry.getRegistry();
        BinaryMessage response = (BinaryMessage) UnicastRemoteObject.exportObject("BinaryMessage", 2, null);
        BinaryMessage response2 = (BinaryMessage) UnicastRemoteObject.exportObject("BinaryMessage", 2, null);
        try {
            registry.rebind("serverInterface", new GenericServer(null));
        } catch (Exception e) {
            // nothing to be done here.
        }
        log.log(Level.INFO, "BinaryMessage = " + binaryMessage);
        log.log(Level.INFO, "BinaryMessage2 = " + binaryMessage2);
        log.log(Level.INFO, "ServerInterface = " + registry.lookup("serverInterface"));

    }

    
    @Test
    void test_ServerInterface_1() {
        LocateRegistry registry = LocateRegistry.getRegistry();
        log.log(Level.INFO, "Server Interface lookup = " + registry.lookup("serverInterface"));

    }
    
    @Test
    void test_sendPkChangeAdmin_success() {

        boolean login = false;
        Boolean status = new Boolean(false);
        try {
            int index = 0;
            // test
            String result2 = changeAdminPassword("admin", "admin", "admin").getCode();
            System.out.println("Index: " + index);
            // change Admin password by administrator
            log.log(Level.INFO, "Test changeAdminPassword");
            status = UsersBD.changeAdminPassword("admin@localhost", "admin", "admin"), new Boolean(status);
            log.log(Level.INFO, "Change password by Administrator: success = " + status);
        } catch (Exception e) {
            System.out.println("LoginError");
            if (login) {
                log.log(Level.INFO, "LoginError: Try Again!");
                login = false;
            }
            log.log(Level.INFO, "Try again, status = " + status);
        }
    }
    
    @Test
    void test_sendPkChangeAdmin_failed() {

        String result = sendPkChangeAdmin("admin", "admin", "admin"), StringEncoder64.decrypt("admin");
        log.log(Level.INFO, "changeAdminPassword result = " + result);
        if (result.equals("ok")) {

        }
    }
    
    @Test
    void test_sendRefreshContact_success() {

        String result = refreshContact(), StringEncoder