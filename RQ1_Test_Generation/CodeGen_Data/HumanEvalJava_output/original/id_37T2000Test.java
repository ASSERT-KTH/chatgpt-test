// SortEvenTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains one unit test case for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {
private SortEven instance = new SortEven();

		/**
		* Method for unit test of the {@link SortEven#sortEven(List)} method.
		*
		* Test of the method, whose parameters are lists consisting of two elements.
		*/
		@Test
		public void testSortEven() {
			/* Parameter 1 of the method */
			List<Integer> l = new ArrayList<Integer>();
			l.add(1);
			l.add(13);
			/* Parameter 2 of the method */
			List<Integer> subl = null;
			subl = instance.sortEven(l);
			assertSame("The list parameter 2 is not correctly set.", subl, l);

		}
}
