// AntiShuffleTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

	@Test
	void testAntiShuffle() {
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle.antiShuffle("abc"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bac"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cab"));
		assertEquals("a b c", AntiShuffle.antiShuffle("acb"));
		assertEquals("a b c", AntiShuffle.antiShuffle("bca"));
		assertEquals("a b c", AntiShuffle.antiShuffle("cba"));
		assertEquals("a b c", AntiShuffle