// CountUpToTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

	@Test
	void testCountUpTo_1() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		assertEquals(expected, CountUpTo.countUpTo(10));
	}
	
	@Test
	void testCountUpTo_2() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		assertEquals(expected, CountUpTo.countUpTo(20));
	}
	
	@Test
	void testCountUpTo_3() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		assertEquals(expected, CountUpTo.countUpTo(100));
	}
	
	@Test
	void testCountUpTo_4() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		expected.add(101);
		expected.add(103);
		expected.add(107);
		expected.add(109);
		expected.add(113);
		expected.add(127);
		expected.add(131);
		expected.add(137);
		expected.add(139);
		expected.add(149);
		expected.add(151);
		expected.add(157);
		expected.add(163);
		expected.add(167);
		expected.add(173);
		expected.add(179);
		expected.add(181);
		expected.add(191);
		expected.add(193);
		expected.add(197);
		expected.add(199);
		assertEquals(expected, CountUpTo.countUpTo(200));
	}
	
	@Test
	void testCountUpTo_5() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		expected.add(101);
		expected.add(103);
		expected.add(107);
		expected.add(109);
		expected.add(113);
		expected.add(127);
		expected.add(131);
		expected.add(137);
		expected.add(139);
		expected.add(149);
		expected.add(151);
		expected.add(157);
		expected.add(163);
		expected.add(167);
		expected.add(173);
		expected.add(179);
		expected.add(181);
		expected.add(191);
		expected.add(193);
		expected.add(197);
		expected.add(199);
		expected.add(211);
		expected.add(223);
		expected.add(227);
		expected.add(229);
		expected.add(233);
		expected.add(239);
		expected.add(241);
		expected.add(251);
		expected.add(257);
		expected.add(263);
		expected.add(269);
		expected.add(271);
		expected.add(277);
		expected.add(281);
		expected.add(283);
		expected.add(293);
		expected.add(307);
		expected.add(311);
		expected.add(313);
		expected.add(317);
		expected.add(331);
		expected.add(337);
		expected.add(347);
		expected.add(349);
		expected.add(353);
		expected.add(359);
		expected.add(367);
		expected.add(373);
		expected.add(379);
		expected.add(383);
		expected.add(389);
		expected.add(397);
		expected.add(401);
		expected.add(409);
		expected.add(419);
		expected.add(421);
		expected.add(431);
		expected.add(433);
		expected.add(439);
		expected.add(443);
		expected.add(449);
		expected.add(457);
		expected.add(461);
		expected.add(463);
		expected.add(467);
		expected.add(479);
		expected.add(487);
		expected.add(491);
		expected.add(499);
		expected.add(503);
		expected.add(509);
		expected.add(521);
		expected.add(523);
		expected.add(541);
		assertEquals(expected, CountUpTo.countUpTo(550));
	}
	
	@Test
	void testCountUpTo_6() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);