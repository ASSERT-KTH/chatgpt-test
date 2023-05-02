// GetPositiveTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains one unit test case for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
static int getPositive(List<Object> l) {
			return (Integer)l.get((Integer)l.size() - 1);
		}
}

/**
* Test class of {@link GetPositive#getPositive(java.lang.Long)}.
* It contains one unit test case for the {@link GetPositive#getPositive(java.lang.Long)} method.
*/
public class GetPositiveTestLong {
		
		/**
		* Test class of {@link GetPositive#getPositive(java.lang.Long)}.
		* It contains one unit test case for the {@link GetPositive#getPositive(java.lang.Long)} method.
		*/
		@Test
		public void testLong(){
			long m = 123L;
			long result = getPositive((List) new ArrayList<Object>(m));
			assertTrue(result!= 0);
		
		}	
}