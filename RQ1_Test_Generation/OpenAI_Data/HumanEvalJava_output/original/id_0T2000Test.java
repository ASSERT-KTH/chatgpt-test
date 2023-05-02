// HasCloseElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

	@Test
	void testHasCloseElements1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0);
		Double threshold = 0.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements2() {
		List<Double> numbers = List.of(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
		Double threshold = 0.3;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements3() {
		List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
		Double threshold = 0.3;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
		Double threshold = 0.05;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements5() {
		List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
		Double threshold = 0.95;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements6() {
		List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
		Double threshold = 0.8;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
		Double threshold = 0.1;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements8() {
		List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
		Double threshold = 1.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements9() {
		List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
		Double threshold = 0.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
		Double threshold = 0.1;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
}

// HasCloseElements.java
package refactored;

import java.util.List;

class HasCloseElements {

    /**
     * Check if in given list of numbers, are any two numbers closer to each other than the given threshold.
     *
     * > hasCloseElements([1.0, 2.0, 3.0], 0.5)
     * false
     * > hasCloseElements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
     * true
     * > hasCloseElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.3)
     * true
     * > hasCloseElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.05)
     * false
     * > hasCloseElements([1.0, 2.0, 5.9, 4.0, 5.0], 0.95)
     * true
     * > hasCloseElements([1.0, 2.0, 5.9, 4.0, 5.0], 0.8)
     * false
     * > hasCloseElements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0], 0.1)
     * true
     * > hasCloseElements([1.1, 2.2, 3.1, 4.1, 5.1], 1.0)
     * true
     * > hasCloseElements([1.1, 2.2, 3.1, 4.1, 5.1], 0.5)
     * false
     */
    public static Boolean hasCloseElements(List<Double> numbers, Double threshold) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) < threshold) {
                    return true;
                }
            }
        }
        return false;
    }
}

// HasCloseElementsTest.java
package refactored;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
		
	@Test
	void testHasCloseElements1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0);
		Double threshold = 0.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements2() {
		List<Double> numbers = List.of(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
		Double threshold = 0.3;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements3() {
		List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
		Double threshold = 0.3;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
		Double threshold = 0.05;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements5() {
		List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
		Double threshold = 0.95;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements6() {
		List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
		Double threshold = 0.8;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseE