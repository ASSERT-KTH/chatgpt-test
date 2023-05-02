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
		expected.add(31);
		expected.add(263130836933693530167218012160000000L);
		expected.add(32);
		expected.add(8683317618811886495518194401280000000L);
		expected.add(33);
		expected.add(295232799039604140847618609643520000000L);
		expected.add(34);
		expected.add(10333147966386144929666651337523200000000L);
		expected.add(35);
		expected.add(371993326789901217467999448150835200000000L);
		expected.add(36);
		expected.add(13763753091226345046315979581580902400000000L);
		expected.add(37);
		expected.add(523022617466601111760007224100074291200000000L);
		expected.add(38);
		expected.add(20397882081197443358640281739902897356800000000L);
		expected.add(39);
		expected.add(815915283247897734345611269596115894272000000000L);
		expected.add(40);
		expected.add(33452526613163807108170062053440751665152000000000L);
		assertEquals(expected, F.f(80));
	}
	
	@Test
	void testF_5() {
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
		expected.add(31);
		expected.add(263130836933693530167218012160000000L);
		expected.add(32);
		expected.add(8683317618811886495518194401280000000L);
		expected.add(33);
		expected.add(295232799039604140847618609643520000000L);
		expected.add(34);
		expected.add(10333147966386144929666651337523200000000L);
		expected.add(35);
		expected.add(371993326789901217467999448150835200000000L);
		expected.add(36);
		expected.add(13763753091226345046315979581580902400000000L);
		expected.add(37);
		expected.add(523022617466601111760007224100074291200000000L);
		expected.add(38);
		expected.add(20397882081197443358640281739902897356800000000L);
		expected.add(39);
		expected.add(815915283247897734345611269596115894272000000000L);
		expected.add(40);
		expected.add(33452526613163807108170062053440751665152000000000L);
		expected.add(41);
		expected.add(1405006117752879898543142606244511569936384000000000L);
		expected.add(42);
		expected.add(60415263063373835637355132068513997507264512000000000L);
		expected.add(43);
		expected.add(2658271574788448768043625811014615890319638528000000000L);
		expected.add(44);
		expected.add(119622220865480194561963161495657715064383733760000000000L);
		expected.add(45);
		expected.add(5502622159812088949850305428800254892961651752960000000000L);
		expected.add(46);