// SwingToolsTest.java
package com.eteks.sweethome3d.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.text.JTextComponent;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SwingTools}.
* It contains one unit test case for the {@link SwingTools#getDropableComponentBorder()} method.
*/
class SwingToolsTest {


    @Test
    public void testGetDropableComponentBorderUnsupported() {
        assertThrows(UnsupportedOperationException.class, 					     // should not be thrown
                     () -> 
                     SwingTools.getDropableComponentBorder("unsupported"));
    }

    @Test
    public void testGetMenu() throws IOException {
        assertTrue(OperatingSystem.isWindows());
        assertTrue(OperatingSystem.isLinux());
        
        assertTrue(new JMenu("menu1").isVisible());
        assertTrue(new JMenu("menu2").isVisible());
        assertTrue(new JMenu("menu2").isSeparator());
        
        assertTrue(new JMenuBar("mbar").isVisible());
        assertTrue(new JMenu("menu3").isVisible());
    }

    @Test
    public void testGet() throws IOException {
        assertNull(SwingTools.get() instanceof BasicService);

        InputStream inputStream = getClass().getResourceAsStream("basic.properties");
        assertNotNull(inputStream);
        
        BasicService.returnObjectInstance(inputStream, BasicService.class);
        BasicService.returnObjectInstance(new URLClassLoader(new URL[]{new URL("file:///etc/basic.properties")}),"BasicService");

        assertFalse(SwingTools.get("") instanceof BasicService);
        
        BasicService.returnObjectInstance(new URLClassLoader(new URL[]{