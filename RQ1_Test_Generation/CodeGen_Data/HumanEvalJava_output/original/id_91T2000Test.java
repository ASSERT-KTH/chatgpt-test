// IsBoredTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains one unit test case for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
// IsBored.java
package original;

class IsBored {

    /**
     * You'll be given a string of words, and your task is to count the number
     * of boredoms. A boredom is a sentence that starts with the word "I".
     * Sentences are delimited by '.', '?' or '!'.
     *
     * For example:
     * >>> isBored("Hello world")
     * 0
     * >>> isBored("The sky is blue. The sun is shining. I love this weather")
     * 1
     *
     * > isBored("Hello world")
     * 0
     * > isBored("Is the sky blue?")
     * 0
     * > isBored("I love It!")
     * 1
     * > isBored("bIt")
     * 0
     * > isBored("I feel good today. I will be productive. will kill It")
     * 2
     * > isBored("You and I are going for a walk")
     * 0
     */
    public static int isBored(String s) {
        int count = 0;
        String[] sentences = s.split("[.!?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            boolean firstWord = false;
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                else {
                    firstWord = true;
                    if (word.equals("I")) {
                        count++;
                    }
                }
                if (firstWord)
                    break;
            }
        }
        return count;
    }
}

// IsBoredTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains one unit test case for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
		
	@Test
    public void test1() {
    	//test input
    	assertEquals(0,IsBored.isBored(""));
    }
	
	@Test
	public void test2() {
		//test input
		assertEquals(1,IsBored.isBored("Hello world"));
	}
	
	@Test
    public void test3() {
        //test
        assertEquals(2,IsBored.isBored("Hello world"));
    }
    
	@Test
    public void test4() {
        //test
        assertEquals(3,IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
    }
}

class IsBoredTest2 {
		
	@Test
    public void test1() {
    	//test input
    	assertEquals(1,IsBored.isBored("Hello world"));
    }
	
	@Test
	public void test2() {
		//test input
		assertEquals(2,IsBored.isBored("Hello world"));
	}
	
	@Test
    public void test3() {
        //test
        assertEquals(2,IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
    }
    
	@Test
    public void test4() {
        //test
        assertEquals(1,IsBored.isBored("Hello world"));
    }
}

class IsBoredTest3 {
		
	@Test
    public void test1() {
    	//test input
    	assertEquals(1,IsBored.isBored("Hello world"));
    }
	
	@Test
	public void test2() {
		//test input
		assertEquals(2,IsBored.isBored("Hello world"));
	}
	
	@Test
    public void test3() {
        //test
        assertEquals(2,IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
    }
    
	@Test
    public void test4() {
        //test
        assertEquals(1,IsBored.isBored("Hello world"));
    }
}
