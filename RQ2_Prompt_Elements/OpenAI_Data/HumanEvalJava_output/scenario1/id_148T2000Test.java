// BfTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {

		/**
		* Test case 1.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when the first planet is not in the list of planets.
		*/
		@Test
		void testCase1() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Pluto", "Earth");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when the second planet is not in the list of planets.
		*/
		@Test
		void testCase2() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Earth", "Pluto");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when both planets are not in the list of planets.
		*/
		@Test
		void testCase3() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Pluto", "Pluto");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when both planets are the same.
		*/
		@Test
		void testCase4() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Earth", "Earth");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when the first planet is Mercury and the second planet is Venus.
		*/
		@Test
		void testCase5() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Mercury", "Venus");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when the first planet is Venus and the second planet is Mercury.
		*/
		@Test
		void testCase6() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Venus", "Mercury");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when the first planet is Earth and the second planet is Mars.
		*/
		@Test
		void testCase7() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Earth", "Mars");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when the first planet is Mars and the second planet is Earth.
		*/
		@Test
		void testCase8() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Mars", "Earth");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when the first planet is Jupiter and the second planet is Saturn.
		*/
		@Test
		void testCase9() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Jupiter", "Saturn");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The method {@link Bf#bf(String, String)} should return an empty list
		* when the first planet is Saturn and the second planet is Jupiter.
		*/
		@Test
		void testCase10() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Bf.bf("Saturn", "Jupiter");
				assertEquals(expected, actual);
		}
}