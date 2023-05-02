// StartsOneEndsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains one unit test case for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {

	@Test
	void test() {
		int N = 6;
		int result = startsOneEnds(N);
		assertEquals(N + 1, result);
	}
}