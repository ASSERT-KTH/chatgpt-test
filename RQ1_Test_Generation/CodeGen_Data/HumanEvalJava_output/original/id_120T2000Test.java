// Maximum1Test.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains one unit test case for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

	List<Integer> arr = new ArrayList<Integer>();
	List<Object> list = new ArrayList<Object>();

	/**
	 * The constructor of {@link Maximum1Test}.
	 * @throws Exception Exception.
	 */
	@Test
	public void test() throws Exception{

		// 1. The test cases are executed
		//    1.1
		list = maximum(arr, 3);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				
		// 1.2
		list = maximum(arr, 0);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				

		// 1.3
		list = maximum(arr, 1);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				
		// 1.4
		list = maximum(arr, -1);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				
		// 1.5
		list = maximum(arr, -2);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				
		// 1.6
		list = maximum(arr, -400);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
		
		// 1.7
		list = maximum(arr, 10);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
		
		// 1.8
		list = maximum(arr, 1);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				
		// 1.9
		list = maximum(arr, 3);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				

		// 1.10
		list = maximum(arr, 4);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
		assertNotNull(list.get(3));
		
		// 1.11
		list = maximum(arr, -10);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
		assertNotNull(list.get(3));
	}



	/**
	 * The {@link Maximum1#maximumFromIterator(Iterator, int)} method is executed.
	 * It is a test of an unoptimized version as part of a later version of this algorithm.
	 * We are using the static constructors of Iterator classes as it also can do faster.
	 * @throws Exception Exception.
	 */
	@Test
	public void testIterator() throws Exception{

		// 1.1
		list = maximumFromIterator(arr.iterator(), 3);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				
		// 1.2
		list = maximumFromIterator(arr.iterator(), 0);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
				

		// 1.3
		list = maximumFromIterator(arr.iterator(), 1);
		assertNotNull(list);
		assertNotNull(list.get(0));
		assertNotNull(list.get(1