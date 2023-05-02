// WordsStringTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains one unit test case for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
// WordsString.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WordsString {

    /**
     * * You will be given a string of words separated by commas or spaces. Your task is
     * to split the string into words and return an array of the words.
     *
     * For example:
     * wordsString("Hi, my name is John") == ["Hi", "my", "name", "is", "John"]
     * wordsString("One, two, three, four, five, six") == ["One", "two", "three", "four", "five", "six"]
     *
     * > wordsString("Hi, my name is John")
     * ["Hi", "my", "name", "is", "John"]
     * > wordsString("One, two, three, four, five, six")
     * ["One", "two", "three", "four", "five", "six"]
     * > wordsString("Hi, my name")
     * ["Hi", "my", "name"]
     * > wordsString("One,, two, three, four, five, six,")
     * ["One", "two", "three", "four", "five", "six"]
     * > wordsString("")
     * []
     * > wordsString("ahmed    , gamal")
     * ["ahmed", "gamal"]
     */
    public static List<Object> wordsString(String s) {
        if (s.length() == 0)
            return new ArrayList<Object>();
        String[] words = s.split("[, ]+");
        return Arrays.asList(words);
    }
}

// WordsStringTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains one unit test case for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
		/**
		* Test for {@link WordsString#wordsString(String)}.
		*/
    @Test
    void testWordsString() {
        List<Object> words = Arrays.asList("1","2","3","4","5");
        Object result = new WordsString().wordsString("1,2,3,4,5");
        assertAllEquals(new List<Object>(), words, result);
    }
}