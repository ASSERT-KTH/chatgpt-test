// VowelsCountTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {

	@Test
	void testVowelsCount() {
		assertEquals(2, VowelsCount.vowelsCount("abcde"));
		assertEquals(3, VowelsCount.vowelsCount("Alone"));
		assertEquals(2, VowelsCount.vowelsCount("key"));
		assertEquals(1, VowelsCount.vowelsCount("bye"));
		assertEquals(2, VowelsCount.vowelsCount("keY"));
		assertEquals(1, VowelsCount.vowelsCount("bYe"));
		assertEquals(3, VowelsCount.vowelsCount("ACEDY"));
		assertEquals(2, VowelsCount.vowelsCount("aeiou"));
		assertEquals(0, VowelsCount.vowelsCount("bcdfghjklmnpqrstvwxyz"));
		assertEquals(5, VowelsCount.vowelsCount("aeiouy"));
	}
}
```

## Scenario 4

```java
// VowelsCount.java
package scenario4;

class VowelsCount {

    /**
     * Write a function vowels_count which takes a string representing
     * a word as input and returns the number of vowels in the string.
     * Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
     * vowel, but only when it is at the end of the given word.
     *
     * > vowelsCount("abcde")
     * 2
     * > vowelsCount("Alone")
     * 3
     * > vowelsCount("key")
     * 2
     * > vowelsCount("bye")
     * 1
     * > vowelsCount("keY")
     * 2
     * > vowelsCount("bYe")
     * 1
     * > vowelsCount("ACEDY")
     * 3
     */
    public static int vowelsCount(String s) {
    }
}

// VowelsCountTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
		
	@Test
	void testVowelsCount() {
		assertEquals(2, VowelsCount.vowelsCount("abcde"));
		assertEquals(3, VowelsCount.vowelsCount("Alone"));
		assertEquals(2, VowelsCount.vowelsCount("key"));
		assertEquals(1, VowelsCount.vowelsCount("bye"));
		assertEquals(2, VowelsCount.vowelsCount("keY"));
		assertEquals(1, VowelsCount.vowelsCount("bYe"));
		assertEquals(3, VowelsCount.vowelsCount("ACEDY"));
		assertEquals(2, VowelsCount.vowelsCount("aeiou"));
		assertEquals(0, VowelsCount.vowelsCount("bcdfghjklmnpqrstvwxyz"));
		assertEquals(5, VowelsCount.vowelsCount("aeiouy"));
	}
}
```

## Scenario 5

```java
// VowelsCount.java
package scenario5;

class VowelsCount {

    /**
     * Write a function vowels_count which takes a string representing
     * a word as input and returns the number of vowels in the string.
     * Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
     * vowel, but only when it is at the end of the given word.
     *
     * > vowelsCount("abcde")
     * 2
     * > vowelsCount("Alone")
     * 3
     * > vowelsCount("key")
     * 2
     * > vowelsCount("bye")
     * 1
     * > vowelsCount("keY")
     * 2
     * > vowelsCount("bYe")
     * 1
     * > vowelsCount("ACEDY")
     * 3
     */
    public static int vowelsCount(String s) {
    }
}

// VowelsCountTest.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
		
	@Test
	void testVowelsCount() {
		assertEquals(2, VowelsCount.vowelsCount("abcde"));
		assertEquals(3, VowelsCount.vowelsCount("Alone"));
		assertEquals(2, VowelsCount.vowelsCount("key"));
		assertEquals(1, VowelsCount.vowelsCount("bye"));
		assertEquals(2, VowelsCount.vowelsCount("keY"));
		assertEquals(1, VowelsCount.vowelsCount("bYe"));
		assertEquals(3, VowelsCount.vowelsCount("ACEDY"));
		assertEquals(2, VowelsCount.vowelsCount("aeiou"));
		assertEquals(0, VowelsCount.vowelsCount("bcdfghjklmnpqrstvwxyz"));
		assertEquals(5, VowelsCount.vowelsCount("aeiouy"));
	}
}
```

## Scenario 6

```java
// VowelsCount.java
package scenario6;

class VowelsCount {

    /**
     * Write a function vowels_count which takes a string representing
     * a word as input and returns the number of vowels in the string.
     * Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
     * vowel, but only when it is at the end of the given word.
     *
     * > vowelsCount("abcde")
     * 2
     * > vowelsCount("Alone")
     * 3
     * > vowelsCount("key")
     * 2
     * > vowelsCount("bye")
     * 1
     * > vowelsCount("keY")
     * 2
     * > vowelsCount("bYe")
     * 1
     * > vowelsCount("ACEDY")
     * 3
     */
    public static int vowelsCount(String s) {
    }
}

// VowelsCountTest.java
package scenario6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
		
	@Test
	void testVowelsCount() {
		assertEquals(2, VowelsCount.vowelsCount("abcde"));
		assertEquals(3, VowelsCount.vowelsCount("Alone"));
		assertEquals(2, VowelsCount.vowelsCount("key"));
		assertEquals(1, VowelsCount.vowelsCount("bye"));
		assertEquals(2, VowelsCount.vowelsCount("keY"));
		assertEquals(1, VowelsCount.vowelsCount("bYe")