// DigitsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains one unit test case for the {@link Digits#digits(int)} method.
*/
class DigitsTest {
// Digits.java
package original;

class Digits {

    /**
     * Given a positive integer n, return the product of the odd digits.
     * Return 0 if all digits are even.
     * For example:
     * digits(1)  == 1
     * digits(4)  == 0
     * digits(235) == 15
     *
     * > digits(5)
     * 5
     * > digits(54)
     * 5
     * > digits(120)
     * 1
     * > digits(5014)
     * 5
     * > digits(98765)
     * 315
     * > digits(5576543)
     * 2625
     * > digits(2468)
     * 0
     */
    public static int digits(int n) {
        int res = 1;
        boolean hasOdd = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                res *= digit;
                hasOdd = true;
            }
            n /= 10;
        }
        return hasOdd? res : 0;
    }
}

// DigitsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains one unit test case for the {@link Digits#digits(int)} method.
*/
class DigitsTest {
		
	public DigitsTest() {}
	
	@Test
	void test1() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("Can't generate digits([5]) because all digits are even.");
		expectedException.expectMessage("5");
		expectedException.expectMessage("[5]");
		expectedException.expectMessage("25");
		expectedException.expectMessage("[234]");
		expectedException.expectMessage("0");
		expectedException.expectMessage("0");
		expectedException.expectMessage("test");
		expectedException.expectMessage(new NumberFormatException());
		expectedException.expectMessage(0);
		expectedException.expectMessage(0);
		expectedException.expectMessage(0);

		int n = 234;
		final int digits = Digits.digits(n);
		assertEquals(1, digits);

		assertFalse(Digits.hasOddEven(n));
	}

	// TODO: add more test cases

	@Test
	void test2() {

		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("Negative digits");

		int n = -3;

		final int expectedResult = 5;
		final int result = Digits.digits(n);
		assertEquals(expectedResult, result);

		n = 5;
		final int expectedResult2 = 10;
		final int result2 = Digits.digits(n);
		assertEquals(expectedResult2, result2);
	}
}