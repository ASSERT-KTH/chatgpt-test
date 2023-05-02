// MedianTest.java
package scenario2;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {

	/**
	 * Test case 1:
	 * 
	 * Test the median method with an empty list.
	 * 
	 * Expected result:
	 * 
	 * The method should return null.
	 */
	@Test
	void testMedianEmptyList() {
		List<Integer> l = Collections.emptyList();
		assertNull(Median.median(l));
	}
	
	/**
	 * Test case 2:
	 * 
	 * Test the median method with a list containing one element.
	 * 
	 * Expected result:
	 * 
	 * The method should return the element.
	 */
	@Test
	void testMedianOneElement() {
		List<Integer> l = Collections.singletonList(1);
		assertEquals(1, Median.median(l));
	}
	
	/**
	 * Test case 3:
	 * 
	 * Test the median method with a list containing two elements.
	 * 
	 * Expected result:
	 * 
	 * The method should return the average of the two elements.
	 */
	@Test
	void testMedianTwoElements() {
		List<Integer> l = List.of(1, 2);
		assertEquals(1.5, Median.median(l));
	}
	
	/**
	 * Test case 4:
	 * 
	 * Test the median method with a list containing three elements.
	 * 
	 * Expected result:
	 * 
	 * The method should return the second element.
	 */
	@Test
	void testMedianThreeElements() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(2, Median.median(l));
	}
	
	/**
	 * Test case 5:
	 * 
	 * Test the median method with a list containing four elements.
	 * 
	 * Expected result:
	 * 
	 * The method should return the average of the two middle elements.
	 */
	@Test
	void testMedianFourElements() {
		List<Integer> l = List.of(1, 2, 3, 4);
		assertEquals(2.5, Median.median(l));
	}
	
	/**
	 * Test case 6:
	 * 
	 * Test the median method with a list containing five elements.
	 * 
	 * Expected result:
	 * 
	 * The method should return the third element.
	 */
	@Test
	void testMedianFiveElements() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		assertEquals(3, Median.median(l));
	}
	
	/**
	 * Test case 7:
	 * 
	 * Test the median method with a list containing six elements.
	 * 
	 * Expected result:
	 * 
	 * The method should return the average of the two middle elements.
	 */
	@Test
	void testMedianSixElements() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
		assertEquals(3.5, Median.median(l));
	}
	
	/**
	 * Test case 8:
	 * 
	 * Test the median method with a list containing seven elements.
	 * 
	 * Expected result:
	 * 
	 * The method should return the fourth element.
	 */
	@Test
	void testMedianSevenElements() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
		assertEquals(4, Median.median(l));
	}
	
	/**
	 * Test case 9:
	 * 
	 * Test the median method with a list containing eight elements.
	 * 
	 * Expected result:
	 * 
	 * The method should return the average of the two middle elements.
	 */
	@Test
	void testMedianEightElements() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		assertEquals(4.5, Median.median(l));
	}
	
	/**
	 * Test case 10:
	 * 
	 * Test the median method with a list containing nine elements.
	 * 
	 * Expected result:
	 * 
	 * The method should return the fifth element.
	 */
	@Test
	void testMedianNineElements() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		assertEquals(5, Median.median(l));
	}
}