// FruitDistributionTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains one unit test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

	/**
	 * This method tests the fruitDistribution method.
	 */
	@Test
    public void test(){
		
		double expected;
		expected = 121 * 121 + 30 * 30 + 15 * 15;
		
		assertEquals(expected, fruitDistribution("apple", 20), 1E-5);
		
		expected = 121 * 30;
		assertEquals(expected, fruitDistribution("apple", 7), 1E-5);
		
		expected = 10 * 10 + 5 * 5;
		assertEquals(expected, fruitDistribution("apple", 19), 1E-5);
		
		expected = 121 * 5;
		assertEquals(expected, fruitDistribution("orange", 120), 1E-5);
		
		expected = 121 * 7;
		assertEquals(expected, fruitDistribution("orange", 19), 1E-5);
				
		expected = 120 * 30;
		assertEquals(expected, fruitDistribution("orange", 7), 1E-5);		
		
		expected = 121 * 30;
		assertEquals(expected, fruitDistribution("orange", 19), 1E-5);			
    }
}
