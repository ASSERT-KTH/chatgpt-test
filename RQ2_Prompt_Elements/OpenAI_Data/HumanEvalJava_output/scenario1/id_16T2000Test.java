// CountDistinctCharactersTest.java
package scenario1;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

	@Test
	void testCountDistinctCharacters_1() {
		String string = "";
		int expected = 0;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_2() {
		String string = "a";
		int expected = 1;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_3() {
		String string = "aa";
		int expected = 1;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_4() {
		String string = "ab";
		int expected = 2;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_5() {
		String string = "abc";
		int expected = 3;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_6() {
		String string = "abcd";
		int expected = 4;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_7() {
		String string = "abcde";
		int expected = 5;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_8() {
		String string = "abcdef";
		int expected = 6;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_9() {
		String string = "abcdefg";
		int expected = 7;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_10() {
		String string = "abcdefgh";
		int expected = 8;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
}

// CountDistinctCharactersTest.java
package scenario1;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters_1() {
		String string = "";
		int expected = 0;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_2() {
		String string = "a";
		int expected = 1;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_3() {
		String string = "aa";
		int expected = 1;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_4() {
		String string = "ab";
		int expected = 2;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_5() {
		String string = "abc";
		int expected = 3;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_6() {
		String string = "abcd";
		int expected = 4;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_7() {
		String string = "abcde";
		int expected = 5;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_8() {
		String string = "abcdef";
		int expected = 6;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_9() {
		String string = "abcdefg";
		int expected = 7;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_10() {
		String string = "abcdefgh";
		int expected = 8;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
}

// CountDistinctCharactersTest.java
package scenario1;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters_1() {
		String string = "";
		int expected = 0;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_2() {
		String string = "a";
		int expected = 1;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_3() {
		String string = "aa";
		int expected = 1;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_4() {
		String string = "ab";
		int expected = 2;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_5() {
		String string = "abc";
		int expected = 3;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDistinctCharacters_6() {
		String string = "abcd";
		int expected = 4;
		int actual = CountDistinctCharacters.countDistinctCharacters(string);
		assertEquals(expected, actual);
	}
	
	@Test