// FTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

	@Test
	void testF() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(24);
		expected.add(4);
		expected.add(120);
		expected.add(5);
		expected.add(720);
		assertEquals(expected, F.f(10));
	}
	
	@Test
	void testF_1() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(24);
		expected.add(4);
		expected.add(120);
		expected.add(5);
		expected.add(720);
		expected.add(6);
		expected.add(5040);
		expected.add(7);
		expected.add(40320);
		expected.add(8);
		expected.add(362880);
		expected.add(9);
		expected.add(3628800);
		expected.add(10);
		expected.add(39916800);
		assertEquals(expected, F.f(20));
	}
	
	@Test
	void testF_2() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(24);
		expected.add(4);
		expected.add(120);
		expected.add(5);
		expected.add(720);
		expected.add(6);
		expected.add(5040);
		expected.add(7);
		expected.add(40320);
		expected.add(8);
		expected.add(362880);
		expected.add(9);
		expected.add(3628800);
		expected.add(10);
		expected.add(39916800);
		expected.add(11);
		expected.add(479001600);
		expected.add(12);
		expected.add(6227020800L);
		expected.add(13);
		expected.add(87178291200L);
		expected.add(14);
		expected.add(1307674368000L);
		expected.add(15);
		expected.add(20922789888000L);
		expected.add(16);
		expected.add(355687428096000L);
		expected.add(17);
		expected.add(6402373705728000L);
		expected.add(18);
		expected.add(121645100408832000L);
		expected.add(19);
		expected.add(2432902008176640000L);
		expected.add(20);
		expected.add(51090942171709440000L);
		assertEquals(expected, F.f(40));
	}
	
	@Test
	void testF_3() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(24);
		expected.add(4);
		expected.add(120);
		expected.add(5);
		expected.add(720);
		expected.add(6);
		expected.add(5040);
		expected.add(7);
		expected.add(40320);
		expected.add(8);
		expected.add(362880);
		expected.add(9);
		expected.add(3628800);
		expected.add(10);
		expected.add(39916800);
		expected.add(11);
		expected.add(479001600);
		expected.add(12);
		expected.add(6227020800L);
		expected.add(13);
		expected.add(87178291200L);
		expected.add(14);
		expected.add(1307674368000L);
		expected.add(15);
		expected.add(20922789888000L);
		expected.add(16);
		expected.add(355687428096000L);
		expected.add(17);
		expected.add(6402373705728000L);
		expected.add(18);
		expected.add(121645100408832000L);
		expected.add(19);
		expected.add(2432902008176640000L);
		expected.add(20);
		expected.add(51090942171709440000L);
		expected.add(21);
		expected.add(1124000727777607680000L);
		expected.add(22);
		expected.add(25852016738884976640000L);
		expected.add(23);
		expected.add(620448401733239439360000L);
		expected.add(24);
		expected.add(15511210043330985984000000L);
		expected.add(25);
		expected.add(403291461126605635584000000L);
		expected.add(26);
		expected.add(10888869450418352160768000000L);
		expected.add(27);
		expected.add(304888344611713860501504000000L);
		expected.add(28);
		expected.add(8841761993739701954543616000000L);
		expected.add(29);
		expected.add(265252859812191058636308480000000L);
		expected.add(30);
		expected.add(8222838654177922817725562880000000L);
		assertEquals(expected, F.f(60));
	}
	
	@Test
	void testF_4() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(24);
		expected.add(4);
		expected.add(120);
		expected.add(5);
		expected.add(720);
		expected.add(6);
		expected.add(5040);
		expected.add(7);
		expected.add(40320);
		expected.add(8);
		expected.add(362880);
		expected.add(9);
		expected.add(3628800);
		expected.add(10);
		expected.add(39916800);
		expected.add(11);
		expected.add(479001600);
		expected.add(12);
		expected.add(6227020800L);
		expected.add(13);
		expected.add(87178291200L);
		expected.add(14);
		expected.add(1307674368000L);
		expected.add(15);
		expected.add(20922789888000L);
		expected.add(16);
		expected.add(355687428096000L);
		expected.add(17);
		expected.add(6402373705728000L);
		expected.add(18);
		expected.add(12