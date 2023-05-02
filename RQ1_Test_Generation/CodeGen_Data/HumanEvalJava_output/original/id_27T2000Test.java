// FlipCaseTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains one unit test case for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
@Test
		void test1() {
			assertEquals("Hello", String.valueOf(FlipCase.flipCase("Hello")));
		}

		@Test
		void test2() {
			assertEquals("hELLO", String.valueOf(FlipCase.flipCase("hELLO")));
		}

		@Test
		void test3() {
			assertEquals("The violent delights have violent ends",
				   String.valueOf(FlipCase.flipCase("The violent delights have violent ends")));
		}

}