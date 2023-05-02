// SolveTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {

	@Test
	void test1() {
		assertEquals("aBc", Solve.solve("AbC"));
	}
	
	@Test
	void test2() {
		assertEquals("aBc", Solve.solve("aBc"));
	}
	
	@Test
	void test3() {
		assertEquals("aBc", Solve.solve("abc"));
	}
	
	@Test
	void test4() {
		assertEquals("aBc", Solve.solve("ABC"));
	}
	
	@Test
	void test5() {
		assertEquals("aBc", Solve.solve("123"));
	}
	
	@Test
	void test6() {
		assertEquals("aBc", Solve.solve("a1b2c"));
	}
	
	@Test
	void test7() {
		assertEquals("aBc", Solve.solve("a1B2c"));
	}
	
	@Test
	void test8() {
		assertEquals("aBc", Solve.solve("a1b2C"));
	}
	
	@Test
	void test9() {
		assertEquals("aBc", Solve.solve("A1B2C"));
	}
	
	@Test
	void test10() {
		assertEquals("aBc", Solve.solve("12345"));
	}
}