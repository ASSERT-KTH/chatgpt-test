// ParseMusicTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains one unit test case for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {
// ParseMusic.java
package original;

import java.util.ArrayList;
import java.util.List;

class ParseMusic {

    /**
     * Input to this function is a string representing musical notes in a special ASCII format.
     * Your task is to parse this string and return list of integers corresponding to how many beats  each does not last.
     * Here is a legend:
     * 'o' - whole note, lasts four beats
     * 'o|' - half note, lasts two beats
     * '.|' - quarter note, lasts one beat
     *
     * > parseMusic("o o|.| o| o|.|.|.|.| o o")
     * [4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4]
     * > parseMusic("")
     * []
     * > parseMusic("o o o o")
     * [4, 4, 4, 4]
     * > parseMusic(".|.|.|.|")
     * [1, 1, 1, 1]
     * > parseMusic("o| o|.|.| o o o o")
     * [2, 2, 1, 1, 4, 4, 4, 4]
     * > parseMusic("o|.| o|.| o o| o o|")
     * [2, 1, 2, 1, 4, 2, 4, 2]
     */
    public static List<Object> parseMusic(String musicString) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < musicString.length(); i++) {
            if (musicString.charAt(i) == 'o') {
                if (i < musicString.length() - 1 && musicString.charAt(i + 1) == '|') {
                    result.add(2);
                    i++;
                } else {
                    result.add(4);
                }
            } else if (musicString.charAt(i) == '.') {
                result.add(1);
                i++;
            }
        }
        return result;
    }
}

// ParseMusicTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains one unit test case for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {
		/**
		 * Check the return value of {@link ParseMusic#parseMusic(String)} method for empty string
		 */
		@Test
		public void isEmpty() {
			assertNotNull("Empty string.");
			assertEquals("Empty string.", null, ParseMusic.parseMusic(""));
		}
		
		/**
		 * Check the return value of {@link ParseMusic#parseMusic(String)} method for null string
		 */
		@Test
		public void isNull() {
			assertNotNull("Null string.");
			assertEquals("Null string.", null, ParseMusic.parseMusic((String)null));
		}
		
		/**
		 * Check the return value of {@link ParseMusic#parseMusic(String)} method for empty list
		 */
		@Test
		public void isEmptyList() {
			assertNotNull("Empty list.");
			assertEquals("Empty list", null, ParseMusic.parseMusic("["));
		}
		
		/**
		 * Check the return value of {@link ParseMusic#parseMusic(String)} method for list that is empty
		 */
		@Test
		public void isListEmpty() {
			assertNotNull("List is empty.");
			assertEquals("List size is [].",new ArrayList(), ParseMusic.parseMusic("[]"));
		}
		
		/**
		 * Check the return value of {@link ParseMusic#parseMusic(String)} method for list that is not empty
		 */
		@Test
		public void isListNotEmpty() {
			assertNotNull("List doesn't contains empty string.");
			assertEquals("List has the size [2].", new ArrayList(2), ParseMusic.parseMusic("[2]"));
		}
		
		/**
		* Check the return value of {@link ParseMusic#parseMusic(String)} method for list with the same element twice
		*/
		@Test
		public void isExistingElement() {
			assertNotNull("List should not be null.");
			assertNotNull("Element should be not null.");
			assertEquals("List size[0] should be [2]", 2, ParseMusic.parseMusic("[2]"));
		}
	}
