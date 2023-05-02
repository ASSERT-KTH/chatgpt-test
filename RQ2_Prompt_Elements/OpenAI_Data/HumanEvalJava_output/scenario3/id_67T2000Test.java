// FruitDistributionTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

	@Test
	void testFruitDistribution() {
		assertEquals(8, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19));
		assertEquals(10, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21));
		assertEquals(2, FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3));
		assertEquals(2, FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3));
		assertEquals(95, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100));
		assertEquals(0, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5));
		assertEquals(19, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120));
	}
}

// FruitDistribution.java
package scenario3;

class FruitDistribution {

    /**
     * * In this task, you will be given a string that represents a number of apples and oranges
     * that are distributed in a basket of fruit this basket contains
     * apples, oranges, and mango fruits. Given the string that represents the total number of
     * the oranges and apples and an integer that represent the total number of the fruits
     * in the basket return the number of the mango fruits in the basket.
     * For example:
     * fruitDistribution("5 apples and 6 oranges", 19) ->19 - 5 - 6 = 8
     * fruitDistribution("0 apples and 1 oranges",3) -> 3 - 0 - 1 = 2
     * fruitDistribution("2 apples and 3 oranges", 100) -> 100 - 2 - 3 = 95
     * fruitDistribution("100 apples and 1 oranges",120) -> 120 - 100 - 1 = 19
     *
     * > fruitDistribution("5 apples and 6 oranges", 19)
     * 8
     * > fruitDistribution("5 apples and 6 oranges", 21)
     * 10
     * > fruitDistribution("0 apples and 1 oranges", 3)
     * 2
     * > fruitDistribution("1 apples and 0 oranges", 3)
     * 2
     * > fruitDistribution("2 apples and 3 oranges", 100)
     * 95
     * > fruitDistribution("2 apples and 3 oranges", 5)
     * 0
     * > fruitDistribution("1 apples and 100 oranges", 120)
     * 19
     */
    public static int fruitDistribution(String s, int n) {
        String[] fruits = s.split(" ");
        int apples = Integer.parseInt(fruits[0]);
        int oranges = Integer.parseInt(fruits[3]);
        return n - apples - oranges;
    }
}

// FruitDistributionTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
		
	@Test
	void testFruitDistribution() {
		assertEquals(8, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19));
		assertEquals(10, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21));
		assertEquals(2, FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3));
		assertEquals(2, FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3));
		assertEquals(95, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100));
		assertEquals(0, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5));
		assertEquals(19, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120));
	}
}

// FruitDistribution.java
package scenario3;

class FruitDistribution {

    /**
     * * In this task, you will be given a string that represents a number of apples and oranges
     * that are distributed in a basket of fruit this basket contains
     * apples, oranges, and mango fruits. Given the string that represents the total number of
     * the oranges and apples and an integer that represent the total number of the fruits
     * in the basket return the number of the mango fruits in the basket.
     * For example:
     * fruitDistribution("5 apples and 6 oranges", 19) ->19 - 5 - 6 = 8
     * fruitDistribution("0 apples and 1 oranges",3) -> 3 - 0 - 1 = 2
     * fruitDistribution("2 apples and 3 oranges", 100) -> 100 - 2 - 3 = 95
     * fruitDistribution("100 apples and 1 oranges",120) -> 120 - 100 - 1 = 19
     *
     * > fruitDistribution("5 apples and 6 oranges", 19)
     * 8
     * > fruitDistribution("5 apples and 6 oranges", 21)
     * 10
     * > fruitDistribution("0 apples and 1 oranges", 3)
     * 2
     * > fruitDistribution("1 apples and 0 oranges", 3)
     * 2
     * > fruitDistribution("2 apples and 3 oranges", 100)
     * 95
     * > fruitDistribution("2 apples and 3 oranges", 5)
     * 0
     * > fruitDistribution("1 apples and 100 oranges", 120)
     * 19
     */
    public static int fruitDistribution(String s, int n) {
        String[] fruits = s.split(" ");
        int apples = Integer.parseInt(fruits[0]);
        int oranges = Integer.parseInt(fruits[3]);
        return n - apples - oranges;
    }
}

// FruitDistributionTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
		
	@Test
	void testFruitDistribution() {
		assertEquals(8, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19));
		assertEquals(10, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21));
		assertEquals(2, FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3));
		assertEquals(2, FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3));
		assertEquals(95, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100));
		assertEquals(0, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5));
		assertEquals(19, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120));
	}
}

// FruitDistribution.java
package scenario3;

class FruitDistribution {

    /**
     * * In this task, you will be given a string that represents a number of apples and oranges
     * that are distributed in a basket of fruit this basket contains
     * apples, oranges, and mango fruits. Given the string that represents the total number of
     * the oranges and apples and an integer that represent the total number of the fruits
     * in the basket return the number of the mango fruits in the basket.
     * For example:
     * fruitDistribution("5 apples and 6 oranges", 19) ->19 - 5 - 6 = 8
     * fruitDistribution("0 apples and 1 oranges",3) -> 3 - 0 - 1 = 2
     * fruitDistribution("2 apples and 3 oranges", 100) -> 100 - 2 - 3 = 95
     * fruitDistribution("100 apples and 1 oranges",120) -> 120 - 100 - 1 = 19
     *
     * > fruitDistribution("5 apples and 6 oranges", 19)
     * 8
     * > fruitDistribution("5 apples and 6 oranges", 21)
     * 10
     * > fruitDistribution("0 apples and 1 oranges", 3)
     * 2
     * > fruitDistribution("1 apples and 0 oranges", 3)
     * 2
     * > fruitDistribution("2 apples and 3 oranges", 100)
     * 95
     * > fruitDistribution("2 apples and 3 oranges", 5)
     * 0
     * > fruitDistribution("1 apples and 100 oranges", 120)
     * 19
