// ClosestIntegerTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {

	@Test
	void testClosestInteger() {
		assertEquals(10, ClosestInteger.closestInteger("10"));
		assertEquals(15, ClosestInteger.closestInteger("15.3"));
		assertEquals(15, ClosestInteger.closestInteger("14.5"));
		assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
		assertEquals(0, ClosestInteger.closestInteger("0"));
		assertEquals(0, ClosestInteger.closestInteger("-0"));
		assertEquals(0, ClosestInteger.closestInteger("0.0"));
		assertEquals(0, ClosestInteger.closestInteger("-0.0"));
		assertEquals(0, ClosestInteger.closestInteger("0.5"));
		assertEquals(-1, ClosestInteger.closestInteger("-0.5"));
	}
}
```

## Scenario 4

```java
// ClosestInteger.java
package scenario4;

class ClosestInteger {

    /**
     * Create a function that takes a value (string) representing a number
     * and returns the closest integer to it. If the number is equidistant
     * from two integers, round it away from zero.
     *
     * Examples
     * >>> closestInteger("10")
     * 10
     * >>> closestInteger("15.3")
     * 15
     *
     * Note:
     * Rounding away from zero means that if the given number is equidistant
     * from two integers, the one you should return is the one that is the
     * farthest from zero. For example closest_integer("14.5") should
     * return 15 and closest_integer("-14.5") should return -15.
     *
     * > closestInteger("10")
     * 10
     * > closestInteger("14.5")
     * 15
     * > closestInteger("-15.5")
     * -16
     * > closestInteger("15.3")
     * 15
     * > closestInteger("0")
     * 0
     */
    public static int closestInteger(String value) {
        double number = Double.parseDouble(value);
        return (int) Math.round(number);
    }
}

// ClosestIntegerTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
		
	@Test
	void testClosestInteger() {
		assertEquals(10, ClosestInteger.closestInteger("10"));
		assertEquals(15, ClosestInteger.closestInteger("15.3"));
		assertEquals(15, ClosestInteger.closestInteger("14.5"));
		assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
		assertEquals(0, ClosestInteger.closestInteger("0"));
		assertEquals(0, ClosestInteger.closestInteger("-0"));
		assertEquals(0, ClosestInteger.closestInteger("0.0"));
		assertEquals(0, ClosestInteger.closestInteger("-0.0"));
		assertEquals(1, ClosestInteger.closestInteger("0.5"));
		assertEquals(-1, ClosestInteger.closestInteger("-0.5"));
	}
}
```

## Scenario 5

```java
// ClosestInteger.java
package scenario5;

class ClosestInteger {

    /**
     * Create a function that takes a value (string) representing a number
     * and returns the closest integer to it. If the number is equidistant
     * from two integers, round it away from zero.
     *
     * Examples
     * >>> closestInteger("10")
     * 10
     * >>> closestInteger("15.3")
     * 15
     *
     * Note:
     * Rounding away from zero means that if the given number is equidistant
     * from two integers, the one you should return is the one that is the
     * farthest from zero. For example closest_integer("14.5") should
     * return 15 and closest_integer("-14.5") should return -15.
     *
     * > closestInteger("10")
     * 10
     * > closestInteger("14.5")
     * 15
     * > closestInteger("-15.5")
     * -16
     * > closestInteger("15.3")
     * 15
     * > closestInteger("0")
     * 0
     */
    public static int closestInteger(String value) {
        double number = Double.parseDouble(value);
        return (int) Math.round(number);
    }
}

// ClosestIntegerTest.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
		
	@Test
	void testClosestInteger() {
		assertEquals(10, ClosestInteger.closestInteger("10"));
		assertEquals(15, ClosestInteger.closestInteger("15.3"));
		assertEquals(15, ClosestInteger.closestInteger("14.5"));
		assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
		assertEquals(0, ClosestInteger.closestInteger("0"));
		assertEquals(0, ClosestInteger.closestInteger("-0"));
		assertEquals(0, ClosestInteger.closestInteger("0.0"));
		assertEquals(0, ClosestInteger.closestInteger("-0.0"));
		assertEquals(1, ClosestInteger.closestInteger("0.5"));
		assertEquals(-1, ClosestInteger.closestInteger("-0.5"));
	}
}
```

## Scenario 6

```java
// ClosestInteger.java
package scenario6;

class ClosestInteger {

    /**
     * Create a function that takes a value (string) representing a number
     * and returns the closest integer to it. If the number is equidistant
     * from two integers, round it away from zero.
     *
     * Examples
     * >>> closestInteger("10")
     * 10
     * >>> closestInteger("15.3")
     * 15
     *
     * Note:
     * Rounding away from zero means that if the given number is equidistant
     * from two integers, the one you should return is the one that is the
     * farthest from zero. For example closest_integer("14.5") should
     * return 15 and closest_integer("-14.5") should return -15.
     *
     * > closestInteger("10")
     * 10
     * > closestInteger("14.5")
     * 15
     * > closestInteger("-15.5")
     * -16
     * > closestInteger("15.3")
     * 15
     * > closestInteger("0")
     * 0
     */
    public static int closestInteger(String value) {
        double number = Double.parseDouble(value);
        return (int) Math.round(number);
    }
}

// ClosestIntegerTest.java
package scenario6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
