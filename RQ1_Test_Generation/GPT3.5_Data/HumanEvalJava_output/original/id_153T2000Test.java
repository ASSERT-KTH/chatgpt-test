// StrongestExtensionTest.java
package updated;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link StrongestExtension}.
 * It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
 */
class StrongestExtensionTest {

    @Test
    void testStrongestExtension() {
        assertEquals("my_class.AA", StrongestExtension.strongestExtension("my_class", Arrays.asList("AA", "Be", "CC")));
        assertEquals("Watashi.eIGHt8OKe", StrongestExtension.strongestExtension("Watashi", Arrays.asList("tEN", "niNE", "eIGHt8OKe")));
        assertEquals("Boku123.YEs.WeCaNe", StrongestExtension.strongestExtension("Boku123", Arrays.asList("nani", "NazeDa", "YEs.WeCaNe", "32145tggg")));
        assertEquals("__YESIMHERE.NuLl__", StrongestExtension.strongestExtension("__YESIMHERE", Arrays.asList("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321")));
        assertEquals("K.TAR", StrongestExtension.strongestExtension("K", Arrays.asList("Ta", "TAR", "t234An", "cosSo")));
        assertEquals("__HAHA.123", StrongestExtension.strongestExtension("__HAHA", Arrays.asList("Tab", "123", "781345", "-_-")));
        assertEquals("YameRore.okIWILL123", StrongestExtension.strongestExtension("YameRore", Arrays.asList("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-")));
        assertEquals("finNNalLLly.WoW", StrongestExtension.strongestExtension("finNNalLLly", Arrays.asList("Die", "NowW", "Wow", "WoW")));
        assertEquals("_.Bb", StrongestExtension.strongestExtension("_", Arrays.asList("Bb", "91245")));
        assertEquals("Sp.671235", StrongestExtension.strongestExtension("Sp", Arrays.asList("671235", "Bb")));
    }
} 

/**
 * You will be given the name of a class (a string) and a list of extensions.
 * The extensions are to be used to load additional classes to the class. The
 * strength of the extension is as follows: Let CAP be the number of the uppercase
 * letters in the extension's name, and let SM be the number of lowercase letters
 * in the extension's name, the strength is given by the fraction CAP - SM.
 * You should find the strongest extension and return a string in this
 * format: ClassName.StrongestExtensionName.
 * If there are two or more extensions with the same strength, you should
 * choose the one that comes first in the list.
 * For example, if you are given "Slices" as the class and a list of the
 * extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
 * return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension
 * (its strength is -1).
 */
class StrongestExtension {

    public static String strongestExtension(String className, List<String> extensions) {
        int max = Integer.MIN_VALUE;
        String result = "";
        for (int i = 0; i < extensions.size(); i++) {
            int cap = 0;
            int sm = 0;
            for (int j = 0; j < extensions.get(i).length(); j++) {
                if (Character.isUpperCase(extensions.get(i).charAt(j))) {
                    cap++;
                } else if (Character.isLowerCase(extensions.get(i).charAt(j))) {
                    sm++;
                }
            }
            if (cap - sm > max) {
                max = cap - sm;
                result = className + "." + extensions.get(i);
            }
        }
        return result;
    }
}