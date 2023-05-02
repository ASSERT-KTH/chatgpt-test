// HasCloseElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains one unit test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
/**
		 * Unit test for {@link HasCloseElements#hasCloseElements(List, Double)}.
		*/
	@Test
	public void testHasCloseElements() {
		// Arrange
		List<Double> numbers = new List<Double>() {
			{
				add(1.0);
				add(2.0);
				add(3.0);
				add(4.0);
				add(5.0);
				add(2.2);
				add(3.2);
				add(4.2);
				add(5.2);
				add(2.2);
				add(3.2);
				add(4.2);
				add(5.2);
				add(2.2);
				add(3.2);
				add(4.2);
				add(5.2);
				add(2.2);
				add(3.2);
				add(4.2);
				add(5.2);
			}
		};
		// Act
		Boolean hasCloseElements = HasCloseElements.hasCloseElements(numbers, 0.5);
		// Assertions
		assertFalse(hasCloseElements);
		assertFalse(hasCloseElements.booleanValue());
		
		// Arrange
		numbers = new List<Double>() {
			{
				add(0.5);
				add(1.0);
				add(2.0);
				add(3.0);
				add(4.0);
				add(5.0);
				add(2.2);
				add(3.2);
				add(4.2);
				add(5.2);
				add(2.2);
				add(3.2);
				add(4.2);
				add(5.2);
				add(2.2);
				add(3.2);
				add(4.2);
				add(5.2);
				add(2.2);
				add(3.2);
				add(4.2);
				add(5.2);
			}
		};
		// Act
		hasCloseElements = HasCloseElements.hasCloseElements(numbers, 0.5);
		// Assertions
		assertTrue(hasCloseElements);
		assertTrue(hasCloseElements.booleanValue());
	}
}