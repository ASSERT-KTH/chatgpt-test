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
* It contains one unit test case for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {
private final int[] values = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
	// Constructors

	// Instance tests

	// Factory methods
	@Test
	void factory() {
		assertArrayEquals(values, Specialfilter.specialfilter(Arrays.asList(values)));
	}
	// Methods

        // Unit tests

        /**
	 * @see Specialfilter#specialfilter(List)
	 */
        @Test
        void specialfilterListTest() {
	        Integer[][] specialFilter = new Integer[][] {
		            {new Integer(1), new Integer(2), new Integer(3), new Integer(4), new Integer(5), new Integer(6), new Integer(7), new Integer(8)},
		            {new Integer(3), new Integer(4), new Integer(2), new Integer(1), new Integer(5), new Integer(-1), new Integer(-2), new Integer(-3)},
		            {new Integer(11), new Integer(-12), new Integer(-13), new Integer(3), new Integer(19), new Integer(60), new Integer(-61), new Integer(7)},
		            {new Integer(12), new Integer(61), new Integer(28), new Integer(45), new Integer(90), new Integer(-61), new Integer(-7), new Integer(-22)},
		            {new Integer(15), new Integer(14), new Integer(21), new Integer(-43), new Integer(9), new Integer(-12), new Integer(-11), new Integer(-4)},
			        {new Integer(73), new Integer(-74), new Integer(12), new Integer(-14), new Integer(5), new Integer(27), new Integer(46), new Integer(45)},
		            {new Integer(8), new Integer(9), new Integer(20), new Integer(-72), new Integer(73), new Integer(-75), new Integer(14), new Integer(3)},
		            {new Integer(7), new Integer(9), new Integer(1), new Integer(-4), new Integer(1), new Integer(0), new Integer(-1), new Integer(7), new Integer(-6, 7)}
	        };

		for (int row = 0; row < 12; row++) {
			for (int col = 0; col <= 14; col++) {
				assertEquals((Integer) Specialfilter.specialfilter(Collections.singletonList(specialFilter[row][col])), Specialfilter.specialfilter(specialFilter[row][col]));
			}
		}
	}

        /**
	 * @see Specialfilter#specialfilter(List)
	 */
        @Test
        void copyTest() {
            Integer[] values = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8};

			Integer[][] copy = Specialfilter.copy(values);

			assertArrayEquals(values, copy);
		}
}
