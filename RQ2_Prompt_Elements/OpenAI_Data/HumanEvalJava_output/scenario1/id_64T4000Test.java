// VowelsCountTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {

		@Test
		void testVowelsCount() {
			assertEquals(0, VowelsCount.vowelsCount(""));
			assertEquals(0, VowelsCount.vowelsCount("b"));
			assertEquals(1, VowelsCount.vowelsCount("a"));
			assertEquals(1, VowelsCount.vowelsCount("e"));
			assertEquals(1, VowelsCount.vowelsCount("i"));
			assertEquals(1, VowelsCount.vowelsCount("o"));
			assertEquals(1, VowelsCount.vowelsCount("u"));
			assertEquals(1, VowelsCount.vowelsCount("A"));
			assertEquals(1, VowelsCount.vowelsCount("E"));
			assertEquals(1, VowelsCount.vowelsCount("I"));
			assertEquals(1, VowelsCount.vowelsCount("O"));
			assertEquals(1, VowelsCount.vowelsCount("U"));
			assertEquals(1, VowelsCount.vowelsCount("y"));
			assertEquals(1, VowelsCount.vowelsCount("Y"));
			assertEquals(2, VowelsCount.vowelsCount("ae"));
			assertEquals(2, VowelsCount.vowelsCount("ai"));
			assertEquals(2, VowelsCount.vowelsCount("ao"));
			assertEquals(2, VowelsCount.vowelsCount("au"));
			assertEquals(2, VowelsCount.vowelsCount("ea"));
			assertEquals(2, VowelsCount.vowelsCount("ei"));
			assertEquals(2, VowelsCount.vowelsCount("eo"));
			assertEquals(2, VowelsCount.vowelsCount("eu"));
			assertEquals(2, VowelsCount.vowelsCount("ia"));
			assertEquals(2, VowelsCount.vowelsCount("ie"));
			assertEquals(2, VowelsCount.vowelsCount("io"));
			assertEquals(2, VowelsCount.vowelsCount("iu"));
			assertEquals(2, VowelsCount.vowelsCount("oa"));
			assertEquals(2, VowelsCount.vowelsCount("oe"));
			assertEquals(2, VowelsCount.vowelsCount("oi"));
			assertEquals(2, VowelsCount.vowelsCount("ou"));
			assertEquals(2, VowelsCount.vowelsCount("ua"));
			assertEquals(2, VowelsCount.vowelsCount("ue"));
			assertEquals(2, VowelsCount.vowelsCount("ui"));
			assertEquals(2, VowelsCount.vowelsCount("uo"));
			assertEquals(2, VowelsCount.vowelsCount("Ay"));
			assertEquals(2, VowelsCount.vowelsCount("Ey"));
			assertEquals(2, VowelsCount.vowelsCount("Iy"));
			assertEquals(2, VowelsCount.vowelsCount("Oy"));
			assertEquals(2, VowelsCount.vowelsCount("Uy"));
			assertEquals(2, VowelsCount.vowelsCount("ya"));
			assertEquals(2, VowelsCount.vowelsCount("ye"));
			assertEquals(2, VowelsCount.vowelsCount("yi"));
			assertEquals(2, VowelsCount.vowelsCount("yo"));
			assertEquals(2, VowelsCount.vowelsCount("yu"));
			assertEquals(2, VowelsCount.vowelsCount("Ya"));
			assertEquals(2, VowelsCount.vowelsCount("Ye"));
			assertEquals(2, VowelsCount.vowelsCount("Yi"));
			assertEquals(2, VowelsCount.vowelsCount("Yo"));
			assertEquals(2, VowelsCount.vowelsCount("Yu"));
			assertEquals(3, VowelsCount.vowelsCount("aei"));
			assertEquals(3, VowelsCount.vowelsCount("aeo"));
			assertEquals(3, VowelsCount.vowelsCount("aeu"));
			assertEquals(3, VowelsCount.vowelsCount("aie"));
			assertEquals(3, VowelsCount.vowelsCount("aio"));
			assertEquals(3, VowelsCount.vowelsCount("aiu"));
			assertEquals(3, VowelsCount.vowelsCount("aoe"));
			assertEquals(3, VowelsCount.vowelsCount("aoi"));
			assertEquals(3, VowelsCount.vowelsCount("aou"));
			assertEquals(3, VowelsCount.vowelsCount("aue"));
			assertEquals(3, VowelsCount.vowelsCount("aui"));
			assertEquals(3, VowelsCount.vowelsCount("auo"));
			assertEquals(3, VowelsCount.vowelsCount("eai"));
			assertEquals(3, VowelsCount.vowelsCount("eao"));
			assertEquals(3, VowelsCount.vowelsCount("eau"));
			assertEquals(3, VowelsCount.vowelsCount("eia"));
			assertEquals(3, VowelsCount.vowelsCount("eio"));
			assertEquals(3, VowelsCount.vowelsCount("eiu"));
			assertEquals(3, VowelsCount.vowelsCount("eoa"));
			assertEquals(3, VowelsCount.vowelsCount("eoi"));
			assertEquals(3, VowelsCount.vowelsCount("eou"));
			assertEquals(3, VowelsCount.vowelsCount("eua"));
			assertEquals(3, VowelsCount.vowelsCount("eui"));
			assertEquals(3, VowelsCount.vowelsCount("euo"));
			assertEquals(3, VowelsCount.vowelsCount("iae"));
			assertEquals(3, VowelsCount.vowelsCount("iao"));
			assertEquals(3, VowelsCount.vowelsCount("iau"));
			assertEquals(3, VowelsCount.vowelsCount("iea"));
			assertEquals(3, VowelsCount.vowelsCount("ieo"));
			assertEquals(3, VowelsCount.vowelsCount("ieu"));
			assertEquals(3, VowelsCount.vowelsCount("ioa"));
			assertEquals(3, VowelsCount.vowelsCount("ioe"));
			assertEquals(3, VowelsCount.vowelsCount("iou"));
			assertEquals(3, VowelsCount.vowelsCount("iua"));
			assertEquals(3, VowelsCount.vowelsCount("iue"));
			assertEquals(3, VowelsCount.vowelsCount("iuo"));
			assertEquals(3, VowelsCount.vowelsCount("oae"));
			assertEquals(3, VowelsCount.vowelsCount("oai"));
			assertEquals(3, VowelsCount.vowelsCount("oau"));
			assertEquals(3, VowelsCount.vowelsCount("oea"));
			assertEquals(3, VowelsCount.vowelsCount("oei"));
			assertEquals(3, VowelsCount.vowelsCount("oeu"));
			assertEquals(3, VowelsCount.vowelsCount("oia"));
			assertEquals(3, VowelsCount.vowelsCount("oie"));
			assertEquals(3, VowelsCount.vowelsCount("oiu"));
			assertEquals(3, VowelsCount.vowelsCount("oua"));
			assertEquals(3, VowelsCount.vowelsCount("oue"));
			assertEquals(3, VowelsCount.vowelsCount("oui"));
			assertEquals(3, VowelsCount.vowelsCount("uae"));
			assertEquals(3, VowelsCount.vowelsCount("uai"));
			assertEquals(3, VowelsCount.vowelsCount("uao"));
			assertEquals(3, VowelsCount.vowelsCount("uea"));
			assertEquals(3, VowelsCount.vowelsCount("uei"));
			assertEquals(3, VowelsCount.vowelsCount("ueo"));
			assertEquals(3, VowelsCount.vowelsCount("uia"));
			assertEquals(3, VowelsCount.vowelsCount("uie"));
			assertEquals(3, VowelsCount.vowelsCount("uio"));
			assertEquals(3, VowelsCount.vowelsCount("uoa"));
			assertEquals(3, VowelsCount.vowelsCount("uoe"));
			assertEquals(3, VowelsCount.vowelsCount("uoi"));
			assertEquals(3, VowelsCount.vowelsCount("Aey"));
			assertEquals(3, VowelsCount.vowelsCount("Aiy"));
			assertEquals(3, VowelsCount.vowelsCount("Aoy"));
			assertEquals(3, VowelsCount.vowelsCount("Auy"));
			assertEquals(3, VowelsCount.vowelsCount("Eay"));
			assertEquals(3, VowelsCount.vowelsCount("Eiy"));
			assertEquals(3, VowelsCount.vowelsCount("Eoy"));
			assertEquals(3, VowelsCount.vowelsCount("Euy"));
			assertEquals(3, VowelsCount.vowelsCount("Iay"));
			assertEquals(3, VowelsCount.vowelsCount("Iey"));
			assertEquals(3, VowelsCount.vowelsCount("Ioy"));
			assertEquals(3, VowelsCount.vowelsCount("Iuy"));
			assertEquals(3, VowelsCount.vowelsCount("Oay"));
			assertEquals(3, VowelsCount.vowelsCount("Oey"));
			assertEquals(3, VowelsCount.vowelsCount("Oiy"));
			assertEquals(3, VowelsCount.vowelsCount("Ouy"));
			assertEquals(3, VowelsCount.vowelsCount("Uay"));
			assertEquals(3, VowelsCount.vowelsCount("Uey"));
			assertEquals(3, VowelsCount.vowelsCount("Uiy"));
			assertEquals(3, VowelsCount.vowelsCount("Uoy"));
			assertEquals(3, VowelsCount.vowelsCount("Yae"));
			assertEquals(3, VowelsCount.vowelsCount("Yai"));
			assertEquals(3, VowelsCount.vowelsCount("Yao"));
			assertEquals(3, VowelsCount.vowelsCount("Yea"));
			assertEquals(3, VowelsCount.vowelsCount("Yei"));
			assertEquals(3, VowelsCount.vowelsCount("Yeo"));
			assertEquals(3, VowelsCount.vowelsCount("Yia"));
			assertEquals(3, VowelsCount.vowelsCount("Yie"));
			assertEquals(3, VowelsCount.vowelsCount("Yio"));
			assertEquals(3, VowelsCount.vowelsCount("Yoa"));
			assertEquals(3, VowelsCount.vowelsCount("Yoe"));
			assertEquals(3, VowelsCount.vowelsCount("Yoi"));
			assertEquals(3, VowelsCount.vowelsCount("Yua"));
			assertEquals(3, VowelsCount.vowelsCount("Yue"));
			assertEquals(3, VowelsCount.vowelsCount("Yui"));
			assertEquals(3, VowelsCount.vowelsCount("Yuo"));
			assertEquals(3, VowelsCount.vowelsCount("yae"));
			assertEquals(3, VowelsCount.vowelsCount("yai"));
			assertEquals(3, VowelsCount.vowelsCount("yao"));
			assertEquals(3, VowelsCount.vowelsCount("yea"));
			assertEquals(3, VowelsCount.vowelsCount("yei"));
			assertEquals(3, VowelsCount.vowelsCount("yeo"));
			assertEquals(3, VowelsCount.vowelsCount("yia"));
			assertEquals(3, VowelsCount.vowelsCount("yie"));
			assertEquals(3, VowelsCount.vowelsCount("yio"));
			assertEquals(3, VowelsCount.vowelsCount("yoa"));
			assertEquals(3, VowelsCount.vowelsCount("yoe"));
			assertEquals(3, VowelsCount.vowelsCount("yoi"));
			assertEquals(3, VowelsCount.vowelsCount("yua"));
			assertEquals(3, VowelsCount.vowelsCount("yue"));
			assertEquals(3, VowelsCount.vowelsCount("yui"));
			assertEquals(3, VowelsCount.vowelsCount("yuo"));
			assertEquals(3, VowelsCount.vowelsCount("Yae"));
			assertEquals(3, VowelsCount.vowelsCount("Yai"));
			assertEquals(3, VowelsCount.vowelsCount("Yao"));
			assertEquals(3, VowelsCount.vowelsCount("Yea"));
			assertEquals(3, VowelsCount.vowelsCount("Yei"));
			assertEquals(3, VowelsCount.vowelsCount("Yeo"));
			assertEquals(3, VowelsCount.vowelsCount("Yia")