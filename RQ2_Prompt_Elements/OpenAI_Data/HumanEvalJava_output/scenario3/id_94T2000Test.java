// SkjkasdkdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains ten unit test cases for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {

	@Test
	void test1() {
		List<Integer> lst = List.of(0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3);
		assertEquals(10, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test2() {
		List<Integer> lst = List.of(1,0,1,8,2,4597,2,1,3,40,1,2,1,2,4,2,5,1);
		assertEquals(25, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test3() {
		List<Integer> lst = List.of(1,3,1,32,5107,34,83278,109,163,23,2323,32,30,1,9,3);
		assertEquals(13, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test4() {
		List<Integer> lst = List.of(0,724,32,71,99,32,6,0,5,91,83,0,5,6);
		assertEquals(11, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test5() {
		List<Integer> lst = List.of(0,81,12,3,1,21);
		assertEquals(3, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test6() {
		List<Integer> lst = List.of(0,8,1,2,1,7);
		assertEquals(7, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test7() {
		List<Integer> lst = List.of(8191);
		assertEquals(19, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test8() {
		List<Integer> lst = List.of(8191, 123456, 127, 7);
		assertEquals(19, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test9() {
		List<Integer> lst = List.of(127, 97, 8192);
		assertEquals(10, Skjkasdkd.skjkasdkd(lst));
	}
	
	@Test
	void test10() {
		List<Integer> lst = List.of(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,