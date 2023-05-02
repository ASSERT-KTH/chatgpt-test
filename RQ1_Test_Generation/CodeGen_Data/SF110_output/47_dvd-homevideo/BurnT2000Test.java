// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
// Burn.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class burns the DVD file structure previously created by
 * dvd-author to a DVD disc.
 */
public class Burn {

    /**
     * Creates a new instance of Burn
     */
    public Burn() {
    }

    /**
     * Creates a new instance of Burn
     * @param   burnToDVD   boolean value used to determine whether or not to burn to a DVD
     *                      when dvd-homevideo completes
     */
    public Burn(boolean burnToDVD) {
        m_Burn = burnToDVD;
    }

    /**
     * Burn Member Variables
     */
    private boolean m_Burn;

    private String m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";

    private String m_BaseErr = "Burn Error - ";

    /**
     * Optionally burn to DVD when complete and no errors, uses growisofs
     * @param   DVD_GUI    This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean BurnToDVD(GUI DVD_GUI) {
        /* Update growisofs command with the correct paths */
        m_growisofs = m_growisofs.replaceAll("temp", DVD_GUI.strOutputDir);
        /* 
         * Burn object always gets created, so m_Burn will not always be true,
         * must be checked. 
         */
        if (m_Burn == true) {
            try {
                /* Create the growisofs process which actually burns the DVD */
                Process p = Runtime.getRuntime().exec(m_growisofs);
                /* Instantiate input and output readers for dvd-author streams */
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                BufferedReader err_in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/burn.log"));
                BufferedWriter err_out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/burn.err"));
                String line;
                /* We will miss the error without this delay */
                Thread.sleep(50);
                /* 
                 * Check for the case where the necessary dependencies are not
                 * installed, but the user tries to run dvd-homevideo anyway
                 */
                if (err_in.ready()) {
                    line = err_in.readLine();
                    if (line.equals("/bin/sh: growisofs: command not found")) {
                        DVD_GUI.MessageBox("Could not locate growisofs in your path." + "\nPlease install all necessary dependencies" + "\nand rerun dvd-homevideo.", 0);
                        /* Close all open streams */
                        in.close();
                        out.close();
                        err_in.close();
                        err_out.close();
                        /* Indicate that there was an error */
                        return true;
                    } else {
                        DVD_GUI.txtAreaOutput.append(line + "\n");
                        out.write(line);
                        out.newLine();
                    }
                }
                out.write("burn.log--->dvd-homevideo");
                out.newLine();
                /* Write the output to the txtAreaOutput user display */
                while ((line = in.readLine())!= null) {
                    DVD_GUI.txtAreaOutput.append(line + "\n");
                    out.write(line);
                    out.newLine();
                }
                /*
                 * close() throws an IOException
                 */
                in.close();
                out.close();
                err_in.close();
                err_out.close();
                /*
                 * p.waitFor() throws an InterruptedException
                 */
                p.waitFor();
            } catch (IOException ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "IO Error\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            } catch (InterruptedException ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "dvd-homevideo thread was interrupted\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            } catch (NullPointerException ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "Error executing Runtime.getRuntime().exec()\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            } catch (IllegalArgumentException ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "Illegal argument sent to Runtime.getRuntime().exec()\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            } catch (Exception ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "Unknown Error occurred\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            }
        }
        if (m_Burn)
            return DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/burn.log");
        return false;
    }
}

// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		
    private String m_BaseErr = "Error running burn.";
    
    /**
     * Loads the given input file and executes burn
     * @param   inputFile    File string to be read from
     * @return           A boolean value
     */
    private static boolean LOAD(String inputFile) throws IOException{
        /*
         * This should work without a try-catch (at least with the
         * OSJVM), but not with the SunJVM, but with JREs
         */
        try {
            /* Create an input and output stream */
            FileWriter fout = new FileWriter(inputFile, false);
            BufferedWriter out = new BufferedWriter(fout);
            /*
            * Start over by copying the first line as the output stream.
            */
            out.write("Burn to DVD\n");

            /* Loop till we have the first line read; this allows us to
            * check the output. No line with a newline is added to the
            * output. This is the expected behaviour.
            */
            while ((line = in.readLine())!= null) {
                out.write(line);
            }
            fout.flush();
            out.write("Burn Complete\n");
            out.flush();
            out.close();

            /*
            * Close a temporary file if we opened it.
            * This seems to be necessary because the first line we read
            * is the standard output of the dvd-author script.
            */
            out.close();
            return true;
        }
        /*
         * If we got here, the input was not null
         */
        catch (FileNotFoundException ex) {
            return false;
        }
        catch (IOException ex) {
            return false;
        }
    }
    /**
     * Dictionnary of strings used by Burn.
     */
    private static BufferedWriter m_Writer;

    /**
     * Function to execute burn with GUI.
