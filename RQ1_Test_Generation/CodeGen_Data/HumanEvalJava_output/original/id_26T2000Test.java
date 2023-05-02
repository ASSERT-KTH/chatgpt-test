// RemoveDuplicatesTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains one unit test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

	/**
	 * Test the method {@link RemoveDuplicates#removeDuplicates(List)} that works.
	*/
	@Test
	public void testRemoveDuplicates() {
		assertEquals(new ArrayList<Object>(), new RemoveDuplicates().removeDuplicates(new ArrayList<Object>()).toArray());
		assertEquals(new ArrayList<Object>(), new RemoveDuplicates().removeDuplicates(null).toArray());
		assertTrue(new RemoveDuplicates().removeDuplicates(new ArrayList<Object>()).isEmpty());
		assertTrue(new RemoveDuplicates().removeDuplicates(new ArrayList<Object>()).isEmpty());
	}
}
