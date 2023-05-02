// SortThirdTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains one unit test case for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {
private SortThirdTest() {
		}
		@Test
		public void test() {

			List<Integer> numbers = new ArrayList<Integer>();

			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
			numbers.add(99);
			// Set a number, which should in sorted order
			numbers.add(5);
			numbers.add(4);
			numbers.add(99);

			Collections.sort(numbers);

			assertEquals(4, numbers.get(0));
            assertEquals(99, numbers.get(1));
               assertEquals(5, numbers.get(2));
               assertEquals(4, numbers.get(3));

            Collections.reverse(numbers);

            Collections.sort(numbers);

            assertEquals(3, numbers.get(0));
            assertEquals(2, numbers.get(1));
            assertEquals(99, numbers.get(2));

            Collections.reverse(numbers);

            Collections.sort(numbers);

			for (int i = 0; i < numbers.size(); i++) {
				if (i % 3 == 0) {
					assertEquals(numbers.get(i), numbers.get(i / 3));
				}
			}
		}
}
		

