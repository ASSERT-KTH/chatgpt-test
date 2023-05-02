// MedianTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {

	@Test
	void testMedian() {
		List<Integer> l1 = List.of(3, 1, 2, 4, 5);
		List<Integer> l2 = List.of(-10, 4, 6, 1000, 10, 20);
		List<Integer> l3 = List.of(5);
		List<Integer> l4 = List.of(6, 5);
		List<Integer> l5 = List.of(8, 1, 3, 9, 9, 2, 7);
		
		assertEquals(3, Median.median(l1));
		assertEquals(8.0, Median.median(l2));
		assertEquals(5, Median.median(l3));
		assertEquals(5.5, Median.median(l4));
		assertEquals(7, Median.median(l5));
	}
}