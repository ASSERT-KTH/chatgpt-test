// MainTest.java
package visu.handball.moves;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import visu.handball.moves.actions.AboutAction;
import visu.handball.moves.actions.ChangeColorsAction;
import visu.handball.moves.actions.CloseAction;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.DeleteEventAction;
import visu.handball.moves.actions.NewAction;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.actions.NewSequenceAction;
import visu.handball.moves.actions.OpenAction;
import visu.handball.moves.actions.PauseAnimationAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.actions.SaveAction;
import visu.handball.moves.actions.SetMoveNameAction;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.actions.StartOneSequenceAnimationAction;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.controller.CommentController;
import visu.handball.moves.controller.JMenuHelper;
import visu.handball.moves.controller.MouseController;
import visu.handball.moves.model.ColorModel;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.TableHandballModel;
import visu.handball.moves.model.TableSelectionListener;
import visu.handball.moves.resources.Resources;
import visu.handball.moves.views.CommentView;
import visu.handball.moves.views.EventTableCellDelayEditor;
import visu.handball.moves.views.EventTableCellRenderer;
import visu.handball.moves.views.Field;
import visu.handball.moves.views.PlayerToolBar;
import visu.handball.moves.views.StatusBar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getColorModel()} method.
*/
class MainTest {

	/**
	* Test case for {@link Main#getColorModel()}.
	*/
	@Test
	void testGetColorModel() {
		// TODO: Implement test case
	}
}

// MouseController.java
package visu.handball.moves.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.Player;
import visu.handball.moves.model.PlayerEvent;
import visu.handball.moves.model.PlayerEventType;
import visu.handball.moves.model.PlayerPosition;
import visu.handball.moves.model.PlayerPositionType;
import visu.handball.moves.model.Sequence;
import visu.handball.moves.views.Field;

/**
 * Controller für die Maus-Events
 *
 * @author tommy
 */
public class MouseController implements MouseListener, MouseMotionListener {

    private HandballModel model;
    private Field field;
    private PlayerPositionType playerPositionType;
    private PlayerPosition playerPosition;
    private PlayerEventType playerEventType;
    private PlayerEvent playerEvent;
    private Player player;
    private Sequence sequence;
    private int x;
    private int y;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;
    private int x5;
    private int y5;
    private int x6;
    private int y6;
    private int x7;
    private int y7;
    private int x8;
    private int y8;
    private int x9;
    private int y9;
    private int x10;
    private int y10;
    private int x11;
    private int y11;
    private int x12;
    private int y12;
    private int x13;
    private int y13;
    private int x14;
    private int y14;
    private int x15;
    private int y15;
    private int x16;
    private int y16;
    private int x17;
    private int y17;
    private int x18;
    private int y18;
    private int x19;
    private int y19;
    private int x20;
    private int y20;
    private int x21;
    private int y21;
    private int x22;
    private int y22;
    private int x23;
    private int y23;
    private int x24;
    private int y24;
    private int x25;
    private int y25;
    private int x26;
    private int y26;
    private int x27;
    private int y27;
    private int x28;
    private int y28;
    private int x29;
    private int y29;
    private int x30;
    private int y30;
    private int x31;
    private int y31;
    private int x32;
    private int y32;
    private int x33;
    private int y33;
    private int x34;
    private int y34;
    private int x35;
    private int y35;
    private int x36;
    private int y36;
    private int x37;
    private int y37;
    private int x38;
    private int y38;
    private int x39;
    private int y39;
    private int x40;
    private int y40;
    private int x41;
    private int y41;
    private int x42;
    private int y42;
    private int x43;
    private int y43;
    private int x44;
    private int y44;
    private int x45;
    private int y45;
    private int x46;
    private int y46;
    private int x47;
    private int y47;
    private int x48;
    private int y48;
    private int x49;
    private int y49;
    private int x50;
    private int y50;
    private int x51;
    private int y51;
    private int x52;
    private int y52;
    private int x53;
    private int y53;
    private int x54;
    private int y54;
    private int x55;
    private int y55;
    private int x56;
    private int y56;
    private int x57;
    private int y57;
    private int x58;
    private int y58;
    private int x59;
    private int y59;
    private int x60;
    private int y60;
    private int x61;
    private int y61;
    private int x62;
    private int y62;
    private int x63;
    private int y63;
    private int x64;
    private int y64;
    private int x65;
    private int y65;
    private int x66;
    private int y66;
    private int x67;
    private int y67;
    private int x68;
    private int y68;
    private int x69;
    private int y69;
    private int x70;
    private int y70;
    private int x71;
    private int y71;
    private int x72;
    private int y72;
    private int x73;
    private int y73;
    private int x74;
    private int y74;
    private int x75;
    private int y75;
    private int x76;
    private int y76;
    private int x77;
    private int y77;
    private int x78;
    private int y78;
    private int x79;
    private int y79;
    private int x80;
    private int y80;
    private int x81;
    private int y81;
    private int x82;
    private int y82;
    private int x83;
    private int y83;
    private int x84;
    private int y84;
    private int x85;
    private int y85;
    private int x86;
    private int y86;
    private int x87;
    private int y87;
    private int x88;
    private int y88;
    private int x89;
    private int y89;
    private int x90;
    private int y90;
    private int x91;
    private int y91;
    private int x92;
    private int y92;
    private int x93;
    private int y93;
    private int x94;
    private int y94;
    private int x95;
    private int y95;
    private int x96;
    private int y96;
    private int x97;
    private int y97;
    private int x98;
    private int y98;
    private int x99;
    private int y99;
    private int x100;
    private int y100;
    private int x101;
    private int y101;
    private int x102;
    private int y102;
    private int x103;
    private int y103;
    private int x104;
    private int y104;
    private int x105;
    private int y105;
    private int x106;
    private int y106;
    private int x107;
    private int y107;
    private int x108;
    private int y108;
    private int x109;
    private int y109;
    private int x110;
    private int y110;
    private int x111;
    private int y111;
    private int x112;
    private int y112;
    private int x113;
    private int y113;
    private int x114;
    private int y114;
    private int x115;
    private int y115;
    private int x116;
    private int y116;
    private int x117;
    private int y117;
    private int x118;
    private int y118;
    private int x119;
    private int y119;