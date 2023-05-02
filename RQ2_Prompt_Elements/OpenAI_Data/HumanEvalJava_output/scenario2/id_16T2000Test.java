// CountDistinctCharactersTest.java
package scenario2;

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
	void testCountDistinctCharacters_EmptyString() {
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
	}
	
	@Test
	void testCountDistinctCharacters_OneCharacter() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoDistinctCharacters() {
		assertEquals(2, CountDistinctCharacters.countDistinctCharacters("ab"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoSameCharacters() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aa"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoSameCharactersWithDifferentCase() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aA"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("abc"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeSameCharacters() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaa"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeSameCharactersWithDifferentCase() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aAa"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharactersWithDifferentCase() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("aBc"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharactersWithDifferentCaseAndSameCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("aBca"));
	}
}

// CountDistinctCharactersTest.java
package scenario2;

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
	void testCountDistinctCharacters_EmptyString() {
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
	}
	
	@Test
	void testCountDistinctCharacters_OneCharacter() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoDistinctCharacters() {
		assertEquals(2, CountDistinctCharacters.countDistinctCharacters("ab"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoSameCharacters() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aa"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoSameCharactersWithDifferentCase() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aA"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("abc"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeSameCharacters() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaa"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeSameCharactersWithDifferentCase() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aAa"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharactersWithDifferentCase() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("aBc"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharactersWithDifferentCaseAndSameCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("aBca"));
	}
}

// CountDistinctCharactersTest.java
package scenario2;

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
	void testCountDistinctCharacters_EmptyString() {
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
	}
	
	@Test
	void testCountDistinctCharacters_OneCharacter() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoDistinctCharacters() {
		assertEquals(2, CountDistinctCharacters.countDistinctCharacters("ab"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoSameCharacters() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aa"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoSameCharactersWithDifferentCase() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aA"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("abc"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeSameCharacters() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaa"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeSameCharactersWithDifferentCase() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aAa"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharactersWithDifferentCase() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("aBc"));
	}
	
	@Test
	void testCountDistinctCharacters_ThreeDistinctCharactersWithDifferentCaseAndSameCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("aBca"));
	}
}

// CountDistinctCharactersTest.java
package scenario2;

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
	void testCountDistinctCharacters_EmptyString() {
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
	}
	
	@Test
	void testCountDistinctCharacters_OneCharacter() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoDistinctCharacters() {
		assertEquals(2, CountDistinctCharacters.countDistinctCharacters("ab"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoSameCharacters() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aa"));
	}
	
	@Test
	void testCountDistinctCharacters_TwoSameCharactersWithDifferentCase() {
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("