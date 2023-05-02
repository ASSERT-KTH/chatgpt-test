// Add1Test.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains one unit test case for the {@link Add1#add(List)} method.
*/
class Add1Test {

	/**
	 * Verify {@link Add1#add(List)}
	 * Example:
	 * add([2,3,6,7],8,12) ==> 24
	 *
	 * > add([-4,3,6,7,8,0,0,2,12,1,-1])
	 * 0
	 */
	@Test
    public void verifyAddition() {
		assertEquals((24), Add1.add(new List<Integer>(){{add(-4);}}));
	}
	
}
