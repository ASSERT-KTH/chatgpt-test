// BurnTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Test class of {@link Burn}.
 * It contains ten unit test cases for the {@link Burn#BurnToDVD(GUI)} method.
 */
class BurnTest {

    /**
     * Test case for successful DVD burn.
     */
    @Test
    void testBurnToDVDSuccess() {
        GUI gui = new GUI();
        Burn burn = new Burn(true);
        boolean result = burn.BurnToDVD(gui);
        assertFalse(result);
    }

    /**
     * Test case for unsuccessful DVD burn due to missing dependencies.
     */
    @Test
    void testBurnToDVDMissingDependencies() {
        GUI gui = new GUI();
        Burn burn = new Burn(true);
        burn.m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";
        try {
            Process p = Runtime.getRuntime().exec("echo '/bin/sh: growisofs: command not found'");
            BufferedReader err_in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            burn.m_growisofs = err_in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        boolean result = burn.BurnToDVD(gui);
        assertTrue(result);
    }

    /**
     * Test case for unsuccessful DVD burn due to IOException.
     */
    @Test
    void testBurnToDVDIOException() {
        GUI gui = new GUI();
        Burn burn = new Burn(true);
        burn.m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";
        try {
            Process p = Runtime.getRuntime().exec("echo 'test'");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedWriter out = new BufferedWriter(new FileWriter(gui.strOutputDir + "/log/burn.log"));
            out.write("burn.log--->dvd-homevideo");
            out.newLine();
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            in.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        boolean result = burn.BurnToDVD(gui);
        assertTrue(result);
    }

    /**
     * Test case for unsuccessful DVD burn due to InterruptedException.
     */
    @Test
    void testBurnToDVDInterruptedException() {
        GUI gui = new GUI();
        Burn burn = new Burn(true);
        burn.m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";
        try {
            Process p = Runtime.getRuntime().exec("echo 'test'");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedWriter out = new BufferedWriter(new FileWriter(gui.strOutputDir + "/log/burn.log"));
            out.write("burn.log--->dvd-homevideo");
            out.newLine();
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            in.close();
            out.close();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
        boolean result = burn.BurnToDVD(gui);
        assertTrue(result);
    }

    /**
     * Test case for unsuccessful DVD burn due to NullPointerException.
     */
    @Test
    void testBurnToDVDNullPointerException() {
        GUI gui = new GUI();
        Burn burn = new Burn(true);
        burn.m_growisofs = null;
        boolean result = burn.BurnToDVD(gui);
        assertTrue(result);
    }

    /**
     * Test case for unsuccessful DVD burn due to IllegalArgumentException.
     */
    @Test
    void testBurnToDVDIllegalArgumentException() {
        GUI gui = new GUI();
        Burn burn = new Burn(true);
        burn.m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";
        try {
            Process p = Runtime.getRuntime().exec("echo 'test'");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedWriter out = new BufferedWriter(new FileWriter(gui.strOutputDir + "/log/burn.log"));
            out.write("burn.log--->dvd-homevideo");
            out.newLine();
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            in.close();
            out.close();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
        boolean result = burn.BurnToDVD(null);
        assertTrue(result);
    }

    /**
     * Test case for unsuccessful DVD burn due to unknown error.
     */
    @Test
    void testBurnToDVDUnknownError() {
        GUI gui = new GUI();
        Burn burn = new Burn(true);
        burn.m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";
        try {
            Process p = Runtime.getRuntime().exec("echo 'test'");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedWriter out = new BufferedWriter(new FileWriter(gui.strOutputDir + "/log/burn.log"));
            out.write("burn.log--->dvd-homevideo");
            out.newLine();
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            in.close();
            out.close();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
        boolean result = burn.BurnToDVD(gui);
        assertTrue(result);
    }

    /**
     * Test case for successful DVD burn when m_Burn is false.
     */
    @Test
    void testBurnToDVDMBurnFalse() {
        GUI gui = new GUI();
        Burn burn = new Burn(false);
        boolean result = burn.BurnToDVD(gui);
        assertFalse(result);
    }

    /**
     * Test case for unsuccessful DVD burn when m_Burn is false.
     */
    @Test
    void testBurnToDVDMBurnFalseError() {
        GUI gui = new GUI();
        Burn burn = new Burn(false);
        boolean result = burn.BurnToDVD(gui);
        assertFalse(result);
    }

    /**
     * Test case for unsuccessful DVD burn when m_Burn is null.
     */
    @Test
    void testBurnToDVDMBurnNull() {
        GUI gui = new GUI();
        Burn burn = new Burn(null);
        boolean result = burn.BurnToDVD(gui);
        assertFalse(result);
    }
}