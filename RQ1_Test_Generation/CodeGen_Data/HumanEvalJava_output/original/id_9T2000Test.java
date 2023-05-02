// RollingMaxTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains one unit test case for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

	@Test
	public void test() {
		List<Integer> numberList=new ArrayList<Integer>();
		Integer defaultValue=new Integer(0);
		assertEquals(defaultValue,RollingMax.rollingMax(numberList));
				
		numberList.add(2);
		numberList.add(100);
		numberList.add(new Integer(12345));
		assertTrue(RollingMax.rollingMax(numberList).toString().equals(RollingMax.rollingMax(numberList).toString()));
	}
}
