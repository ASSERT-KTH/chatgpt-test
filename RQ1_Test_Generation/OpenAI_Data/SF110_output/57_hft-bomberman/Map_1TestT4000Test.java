// Map_1Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#getTile(int, int)} method.
*/
class Map_1Test {

		/**
		* Test case for {@link Map#getTile(int, int)}
		* 
		* @author christian
		*/
		@Test
		void testGetTile() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(0, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(0, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(1, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(1, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(2, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(2, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(3, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(3, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(4, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(4, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(5, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(5, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(6, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(6, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(7, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(7, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(8, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(8, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(9, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(9, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(10, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(10, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(11, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(11, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(12, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(12, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(13, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(13, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(14, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(14, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(15, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(15, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(16, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(16, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(17, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(17, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(18, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(18, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(19, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(19, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(20, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(20, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(21, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(21, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(22, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(22, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(23, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(23, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(24, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(24, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(25, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(25, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(26, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(26, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(27, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(27, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(28, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(28, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(29, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(29, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(30, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(30, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(31, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(31, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(32, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(32, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(33, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(33, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(34, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(34, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(35, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(35, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(36, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(36, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(37, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(37, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(38, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(38, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(39, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(39, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(40, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(40, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(41, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(41, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(42, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(42, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(43, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(43, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(44, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(44, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(45, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(45, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(46, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(46, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(47, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(47, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(48, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(48, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(49, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(49, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(50, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(50, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(51, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(51, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(52, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(52, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(53, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(53, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(54, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(54, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(55, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(55, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(56, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(56, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(57, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(57, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(58, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(58, 1);
				assertEquals(tile.getType(), "wall");
				tile = map.getTile(59, 0);
				assertEquals(tile.getType