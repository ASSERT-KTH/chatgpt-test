// BelowZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1, 2, -3, 1, 2, -3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5, 6)));
		assertFalse(BelowZero.belowZero(List.of(1, -1, 2, -2, 5, -5, 4, -4)));
		assertTrue(BelowZero.belowZero(List.of(1, -1, 2, -2, 5, -5, 4, -5)));
		assertTrue(BelowZero.belowZero(List.of(1, -2, 2, -2, 5, -5, 4, -4)));
	}
}
```

## Scenario 4

```java
// SumOfDigits.java
package scenario4;

import java.util.List;

class SumOfDigits {

    /**
     * You're given a list of numbers. Your task is to return the sum of all digits in the list.
     *
     * > sumOfDigits([1, 2, 3])
     * 6
     * > sumOfDigits([1, 2, -3])
     * 6
     * > sumOfDigits([1, 2, -3, -4])
     * 6
     * > sumOfDigits([1, 2, -3, -4, 5])
     * 11
     * > sumOfDigits([1, 2, -3, -4, 5, -6])
     * 11
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7])
     * 18
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7, -8])
     * 18
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7, -8, 9])
     * 27
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7, -8, 9, -10])
     * 27
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7, -8, 9, -10, 11])
     * 38
     */
    public static Integer sumOfDigits(List<Object> numbers) {
    }
}

// SumOfDigitsTest.java
package scenario4;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumOfDigits}.
* It contains eleven unit test cases for the {@link SumOfDigits#sumOfDigits(List)} method.
*/
class SumOfDigitsTest {
		
	@Test
	void testSumOfDigits() {
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, 3)));
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, -3)));
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4)));
		assertEquals(11, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5)));
		assertEquals(11, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6)));
		assertEquals(18, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6, 7)));
		assertEquals(18, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6, 7, -8)));
		assertEquals(27, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6, 7, -8, 9)));
		assertEquals(27, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6, 7, -8, 9, -10)));
		assertEquals(38, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6, 7, -8, 9, -10, 11)));
	}
}
```

## Scenario 5

```java
// SumOfDigits.java
package scenario5;

import java.util.List;

class SumOfDigits {

    /**
     * You're given a list of numbers. Your task is to return the sum of all digits in the list.
     *
     * > sumOfDigits([1, 2, 3])
     * 6
     * > sumOfDigits([1, 2, -3])
     * 6
     * > sumOfDigits([1, 2, -3, -4])
     * 6
     * > sumOfDigits([1, 2, -3, -4, 5])
     * 11
     * > sumOfDigits([1, 2, -3, -4, 5, -6])
     * 11
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7])
     * 18
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7, -8])
     * 18
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7, -8, 9])
     * 27
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7, -8, 9, -10])
     * 27
     * > sumOfDigits([1, 2, -3, -4, 5, -6, 7, -8, 9, -10, 11])
     * 38
     */
    public static Integer sumOfDigits(List<Object> numbers) {
    }
}

// SumOfDigitsTest.java
package scenario5;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumOfDigits}.
* It contains eleven unit test cases for the {@link SumOfDigits#sumOfDigits(List)} method.
*/
class SumOfDigitsTest {
		
	@Test
	void testSumOfDigits() {
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, 3)));
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, -3)));
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4)));
		assertEquals(11, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5)));
		assertEquals(11, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6)));
		assertEquals(18, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6, 7)));
		assertEquals(18, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6, 7, -8)));
		assertEquals(27, SumOfDigits.sumOfDigits(List.of(1, 2, -3, -4, 5, -6, 7, -8, 9)));
		assertEquals