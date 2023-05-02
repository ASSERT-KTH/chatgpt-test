// HttpAnalyzerApp.java
/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 3, 29 June 2007
 *
 * Copyright (C) 2010, vlad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * HttpAnalyzerApp.java
 */
package httpanalyzer;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class HttpAnalyzerApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override
    protected void startup() {
        show(new HttpAnalyzerView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override
    protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of HttpAnalyzerApp
     */
    public static HttpAnalyzerApp getApplication() {
        return Application.getInstance(HttpAnalyzerApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(HttpAnalyzerApp.class, args);
    }
}

// HttpAnalyzerAppTest.java
package httpanalyzer;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpAnalyzerApp}.
* It contains ten unit test cases for the {@link HttpAnalyzerApp#getApplication()} method.
*/
class HttpAnalyzerAppTest {
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication2() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication3() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication4() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication5() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication6() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication7() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication8() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication9() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getApplication method, of class HttpAnalyzerApp.
     */
    @Test
    void testGetApplication10() {
        HttpAnalyzerApp expResult = Application.getInstance(HttpAnalyzerApp.class);
        HttpAnalyzerApp result = HttpAnalyzerApp.getApplication();
        assertEquals(expResult, result);
    }
}