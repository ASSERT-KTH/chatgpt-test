// SpecialfilterTest.java
package original;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains ten unit test cases for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {

	@Test
	void testSpecialfilter() {
		assertEquals(0, Specialfilter.specialfilter(Arrays.asList(5, -2, 1, -5)));
		assertEquals(1, Specialfilter.specialfilter(Arrays.asList(15, -73, 14, -15)));
		assertEquals(2, Specialfilter.specialfilter(Arrays.asList(33, -2, -3, 45, 21, 109)));
		assertEquals(4, Specialfilter.specialfilter(Arrays.asList(43, -12, 93, 125, 121, 109)));
		assertEquals(3, Specialfilter.specialfilter(Arrays.asList(71, -2, -33, 75, 21, 19)));
		assertEquals(0, Specialfilter.specialfilter(Arrays.asList(1)));
		assertEquals(0, Specialfilter.specialfilter(Arrays.asList()));
		assertEquals(0, Specialfilter.specialfilter(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
		assertEquals(1, Specialfilter.specialfilter(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)));
		assertEquals(2, Specialfilter.specialfilter(Arrays.asList(21, 22, 23, 24, 25, 26, 27, 28, 29, 30)));
	}
}