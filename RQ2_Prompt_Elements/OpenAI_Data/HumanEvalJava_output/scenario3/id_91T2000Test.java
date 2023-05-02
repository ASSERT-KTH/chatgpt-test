// IsBoredTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

	@Test
	void testIsBored() {
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(0, IsBored.isBored("Is the sky blue?"));
		assertEquals(1, IsBored.isBored("I love It !"));
		assertEquals(0, IsBored.isBored("bIt"));
		assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
		assertEquals(0, IsBored.isBored("You and I are going for a walk"));
		assertEquals(0, IsBored.isBored(""));
		assertEquals(0, IsBored.isBored("I"));
		assertEquals(0, IsBored.isBored("I."));
		assertEquals(0, IsBored.isBored("I?"));
		assertEquals(0, IsBored.isBored("I!"));
		assertEquals(0, IsBored.isBored("I.I"));
		assertEquals(0, IsBored.isBored("I?I"));
		assertEquals(0, IsBored.isBored("I!I"));
		assertEquals(1, IsBored.isBored("I.I.I"));
		assertEquals(1, IsBored.isBored("I?I?I"));
		assertEquals(1, IsBored.isBored("I!I!I"));
		assertEquals(1, IsBored.isBored("I.I?I"));
		assertEquals(1, IsBored.isBored("I?I.I"));
		assertEquals(1, IsBored.isBored("I!I?I"));
		assertEquals(1, IsBored.isBored("I?I!I"));
		assertEquals(1, IsBored.isBored("I!I.I"));
		assertEquals(1, IsBored.isBored("I.I!I"));
		assertEquals(1, IsBored.isBored("I.I.I.I"));
		assertEquals(1, IsBored.isBored("I?I?I?I"));
		assertEquals(1, IsBored.isBored("I!I!I!I"));
		assertEquals(1, IsBored.isBored("I.I?I.I"));
		assertEquals(1, IsBored.isBored("I?I.I?I"));
		assertEquals(1, IsBored.isBored("I!I?I!I"));
		assertEquals(1, IsBored.isBored("I?I!I?I"));
		assertEquals(1, IsBored.isBored("I!I.I!I"));
		assertEquals(1, IsBored.isBored("I.I!I.I"));
		assertEquals(1, IsBored.isBored("I.I.I?I"));
		assertEquals(1, IsBored.isBored("I?I.I.I"));
		assertEquals(1, IsBored.isBored("I!I.I?I"));
		assertEquals(1, IsBored.isBored("I?I.I!I"));
		assertEquals(1, IsBored.isBored("I!I.I.I"));
		assertEquals(1, IsBored.isBored("I.I!I?I"));
		assertEquals(1, IsBored.isBored("I?I!I.I"));
		assertEquals(1, IsBored.isBored("I!I!I.I"));
		assertEquals(1, IsBored.isBored("I.I!I!I"));
		assertEquals(1, IsBored.isBored("I.I?I!I"));
		assertEquals(1, IsBored.isBored("I?I!I?I"));
		assertEquals(1, IsBored.isBored("I!I?I.I"));
		assertEquals(1, IsBored.isBored("I.I?I!I"));
		assertEquals(1, IsBored.isBored("I?I!I.I"));
		assertEquals(1, IsBored.isBored("I!I.I?I"));
		assertEquals(1, IsBored.isBored("I.I.I.I.I"));
		assertEquals(1, IsBored.isBored("I?I?I?I?I"));
		assertEquals(1, IsBored.isBored("I!I!I!I!I"));
		assertEquals(1, IsBored.isBored("I.I?I.I?I"));
		assertEquals(1, IsBored.isBored("I?I.I?I.I"));
		assertEquals(1, IsBored.isBored("I!I?I!I?I"));
		assertEquals(1, IsBored.isBored("I?I!I?I!I"));
		assertEquals(1, IsBored.isBored("I!I.I!I.I"));
		assertEquals(1, IsBored.isBored("I.I!I.I!I"));
		assertEquals(1, IsBored.isBored("I.I.I?I.I"));
		assertEquals(1, IsBored.isBored("I?I.I.I?I"));
		assertEquals(1, IsBored.isBored("I!I.I?I.I"));
		assertEquals(1, IsBored.isBored("I?I.I!I.I"));
		assertEquals(1, IsBored.isBored("I!I.I.I?I"));
		assertEquals(1, IsBored.isBored("I.I!I?I.I"));
		assertEquals(1, IsBored.isBored("I?I!I.I?I"));
		assertEquals(1, IsBored.isBored("I!I!I.I?I"));
		assertEquals(1, IsBored.isBored("I.I!I!I?I"));
		assertEquals(1, IsBored.isBored("I.I?I!I.I"));
		assertEquals(1, IsBored.isBored("I?I!I.I?I"));
		assertEquals(1, IsBored.isBored("I!I?I.I!I"));
		assertEquals(1, IsBored.isBored("I.I?I!I?I"));
		assertEquals(1, IsBored.isBored("I?I!I.I?I"));
		assertEquals(1, IsBored.isBored("I!I.I?I!I"));
		assertEquals(1, IsBored.isBored("I.I.I.I.I.I"));
		assertEquals(1, IsBored.isBored("I?I?I?I?I?I"));
		assertEquals(1, IsBored.isBored("I!I!I!I!I!I"));
		assertEquals(1, IsBored.isBored("I.I?I.I?I.I"));
		assertEquals(1, IsBored.isBored("I?I.I?I.I?I"));
		assertEquals(1, IsBored.