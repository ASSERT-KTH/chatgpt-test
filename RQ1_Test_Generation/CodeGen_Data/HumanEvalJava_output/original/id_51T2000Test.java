// RemoveVowelsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains one unit test case for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
// RemoveVowels.java
package original;

class RemoveVowels {

    /**
     * removeVowels is a function that takes string and returns string without vowels.
     *
     * > removeVowels("abcdef")
     * "bcdf"
     * > removeVowels("aaaaa")
     * ""
     * > removeVowels("aaBAA")
     * "B"
     * > removeVowels("zbcd")
     * "zbcd"
     * > removeVowels("")
     * ""
     * > removeVowels("abcdef\nghijklm")
     * "bcdf\nghjklm"
     * > removeVowels("fedcba")
     * "fdcb"
     * > removeVowels("eeeee")
     * ""
     * > removeVowels("acBAA")
     * "cB"
     * > removeVowels("EcBOO")
     * "cB"
     * > removeVowels("ybcd")
     * "ybcd"
     */
    public static String removeVowels(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c!= 'a' && c!= 'e' && c!= 'i' && c!= 'o' && c!= 'u' && c!= 'A' && c!= 'E' && c!= 'I' && c!= 'O' && c!= 'U') {
                result += c;
            }
        }
        return result;
    }
}

// RemoveVowelsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains one unit test case for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
		
	/**
     * removeVowelsTest - it tests the removeVowels method.
     */
	@Test
	void removeVowelsTest() {
		assertTrue(new String("acBAA").removeVowels("ac"));
	}
	
}
