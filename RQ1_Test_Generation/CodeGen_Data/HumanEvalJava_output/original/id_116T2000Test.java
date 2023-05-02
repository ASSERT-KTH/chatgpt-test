// SortArrayTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains one unit test case for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
public final SortArrayTest() {
    }
		@Test
	public void test_Sorting1() {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 5; i++) {
				list.add(i);
			}
			Collections.sort(list);
			assertListEquals(list, list);
	}
		@Test
	public void test_Sorting2() {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 50; i++) {
				list.add(i);
			}
			Collections.sort(list, new Comparator<Integer>() {

				@Override
				public int compare(Integer i1, Integer i2) {
					return i1.compareTo(i2);
				}
			});
			assertListEquals(list, list);
	}
		@Test
	public void test_SortingOfListOfNonNegatives() {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 50; i++) {
				list.add(i);
			}
			assertListEquals(sortArray(list), sortArray(list));
	}
		@Test
	public void test_SortingOfArrayOfNonNegatives() {
			Integer[] list = new Integer[listSize];
			for (int i = 0; i < list.length; i++) {
				list[i] = i;
			}
			assertListEquals(sortArray(list), sortArray(list));
	}
		public final List<Integer> list = new ArrayList<Integer>();
		public final List<List<Integer>> listList = new ArrayList<>();
		public final List<Integer[][]> listOfNestedList = new ArrayList<>();
		public final int listSize;

		public SortArrayTest(int listSize) {
			this.listSize = listSize;
		}
}
