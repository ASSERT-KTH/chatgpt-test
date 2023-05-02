// MakeAPileTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

		@Test
		void testMakeAPile1() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(1));
		}
		
		@Test
		void testMakeAPile2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				assertEquals(expected, MakeAPile.makeAPile(2));
		}
		
		@Test
		void testMakeAPile3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(5);
				expected.add(7);
				assertEquals(expected, MakeAPile.makeAPile(3));
		}
		
		@Test
		void testMakeAPile4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(4);
				expected.add(6);
				expected.add(8);
				expected.add(10);
				assertEquals(expected, MakeAPile.makeAPile(4));
		}
		
		@Test
		void testMakeAPile5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(7);
				expected.add(9);
				expected.add(11);
				expected.add(13);
				assertEquals(expected, MakeAPile.makeAPile(5));
		}
		
		@Test
		void testMakeAPile6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(6);
				expected.add(8);
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				assertEquals(expected, MakeAPile.makeAPile(6));
		}
		
		@Test
		void testMakeAPile7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(7);
				expected.add(9);
				expected.add(11);
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				assertEquals(expected, MakeAPile.makeAPile(7));
		}
		
		@Test
		void testMakeAPile8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(8);
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				assertEquals(expected, MakeAPile.makeAPile(8));
		}
		
		@Test
		void testMakeAPile9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(9);
				expected.add(11);
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				expected.add(21);
				expected.add(23);
				expected.add(25);
				assertEquals(expected, MakeAPile.makeAPile(9));
		}
		
		@Test
		void testMakeAPile10() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				expected.add(24);
				expected.add(26);
				expected.add(28);
				assertEquals(expected, MakeAPile.makeAPile(10));
		}
}