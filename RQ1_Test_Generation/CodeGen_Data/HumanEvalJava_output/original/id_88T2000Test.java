// SortArray1Test.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains one unit test case for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {

	/**
	* test sortArray.
	*/
	@Test
	void testSortArray( ) {
		
		// Arrange
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add(3);

		// Act
		// Check if sort succeeds
		assertArrayEquals(new Object[] {List.EMPTY, 1, 2, 3}, sortArray(list));

		// Check if reverse sort fails
		list = new ArrayList<Object>();
		list.add(3);
		list.add(2);
		list.add(1);
		assertArrayEquals(new Object[] {List.EMPTY, 1, 3, 2}, sortArray(list));

		// Check if reversed sort succeeds
		list = new ArrayList<Object>();
		list.add(2);
		list.add(1);
		list.add(3);
		assertArrayEquals(new Object[] {List.EMPTY, 1, 3, 2}, sortArray(list));

		// Check if descending sort fails
		list = new ArrayList<Object>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		assertArrayEquals(new Object[] {List.EMPTY, 1, 3, 2, 4, 3, 2}, sortArray(list));
	}
	
	/**
	* test SortArray1.
	*/
	@Test
	void testSortArray_2 ( ) {
		
		// Arrange
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add(3);

		// Act
		assertArrayEquals(new Object[] {List.EMPTY, 1, 2, 3, }, sortArray(list));

		// Check if same result
		list = new ArrayList<Object>();
		list.add(3);
		list.add(2);
		list.add(1);
		assertArrayEquals(new Object[] {List.EMPTY, 1, 3, 2, }, sortArray(list));

		// Check if reverse sort succeeds
		list = new ArrayList<Object>();
		list.add(3);
		list.add(2);
		list.add(1);
		assertArrayEquals(new Object[] {List.EMPTY, 1, 3, 2, }, sortArray(list));

		// Check if reversed sort fails
		list = new ArrayList<Object>();
		list.add(3);
		list.add(2);
		list.add(1);
		assertArrayEquals(new Object[] {List.EMPTY, 1, 3, 2, }, sortArray(list));

		// Check if ascending sort fails
		list = new ArrayList<Object>();
		list.add(3);
		list.add(2);
		list.add(1);
		assertArrayEquals(new Object[] {List.EMPTY, 1, 3, 2, }, sortArray(list));
	}
	
	/**
	* test SortArray1.
	*/
	@Test
	void testSortArray_3 ( ) {
		// Arrange
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add(3);

		// Act
		int sum = ((Integer) list.get(0)).intValue()
				+ ((Integer) list.get(1)).intValue()
				+ ((Integer) list.get(2)).intValue();

		// Check if sort succeeds
		assertArrayEquals(new Object[] {3, 2, 1}, sortArray(list));
	}
	
	/**
	* test SortArray1.
	*/
	@Test
	void testSortArray_4 ( ) {
		// Arrange
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add(3);

		// Act
		IntList sortedList = new IntList();
		sortedList.add(1);
		sortedList.add(1);
		sortedList.add(2);
		sortedList.add(3);
		Collections.sort(sortedList);
		
		assertOrderOfList(sortedList, list, false);

		// Check if same result
		assertArrayEquals(new Object[] {1, 2, 3}, sortArray(sortedList));

		// Check if reversing sort succeeds
		sortedList.add(3);
		assertOrderOfList(list, sortedList, true);
	}
	@Test
	void testSortArray_5 ( ) {
		// Arrange
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add(3);

		// Act
		List<Object> sortedList = new ArrayList<Object>();
		list.add(2);
		list.add(1);
		list.add(3);
		Collections.sort(list, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				return (Integer) o2.getClass().getEnclosingClass().getAnnotation(SortAnnotation.class)
						.indexOf(Integer.class);
			}
		