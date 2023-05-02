// IsMultiplyPrimeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

	@Test
	void testIsMultiplyPrime() {
		assertTrue(IsMultiplyPrime.isMultiplyPrime(2));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(3));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(5));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(7));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(11));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(13));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(17));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(19));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(23));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(29));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(31));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(37));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(41));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(43));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(47));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(53));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(59));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(61));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(67));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(71));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(73));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(79));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(83));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(89));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(97));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(6));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(10));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(14));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(15));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(21));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(22));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(33));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(34));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(35));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(38));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(39));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(46));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(51));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(55));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(57));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(65));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(69));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(77));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(85));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(91));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(93));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(95));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(42));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(70));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(78));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(86));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(110));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(130));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(154));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(182));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(210));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(330));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(462));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(770));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(906));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(966));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(990));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1330));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1806));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(1930));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(2210));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(2310));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(2730));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(3006));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(3102));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(3430));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(3570));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(3870));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(3970));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(4270));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(4506));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(5102));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(5346));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(5490));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(5730));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(6270));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(6702));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(6930));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(7290));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(7490));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(8190));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(8270));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(9102));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(9270));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(9470));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(9690));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(9930));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(10302));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(10590));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(11170));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(11490));
		assertTrue(IsMultip