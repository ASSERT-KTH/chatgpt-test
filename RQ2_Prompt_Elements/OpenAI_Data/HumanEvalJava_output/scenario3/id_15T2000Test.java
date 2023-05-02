// StringSequenceTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {

	@Test
	void testStringSequence0() {
		assertEquals("0", StringSequence.stringSequence(0));
	}
	
	@Test
	void testStringSequence1() {
		assertEquals("0 1", StringSequence.stringSequence(1));
	}
	
	@Test
	void testStringSequence2() {
		assertEquals("0 1 2", StringSequence.stringSequence(2));
	}
	
	@Test
	void testStringSequence3() {
		assertEquals("0 1 2 3", StringSequence.stringSequence(3));
	}
	
	@Test
	void testStringSequence4() {
		assertEquals("0 1 2 3 4", StringSequence.stringSequence(4));
	}
	
	@Test
	void testStringSequence5() {
		assertEquals("0 1 2 3 4 5", StringSequence.stringSequence(5));
	}
	
	@Test
	void testStringSequence6() {
		assertEquals("0 1 2 3 4 5 6", StringSequence.stringSequence(6));
	}
	
	@Test
	void testStringSequence7() {
		assertEquals("0 1 2 3 4 5 6 7", StringSequence.stringSequence(7));
	}
	
	@Test
	void testStringSequence8() {
		assertEquals("0 1 2 3 4 5 6 7 8", StringSequence.stringSequence(8));
	}
	
	@Test
	void testStringSequence9() {
		assertEquals("0 1 2 3 4 5 6 7 8 9", StringSequence.stringSequence(9));
	}
	
	@Test
	void testStringSequence10() {
		assertEquals("0 1 2 3 4 5 6 7 8 9 10", StringSequence.stringSequence(10));
	}
}

// StringSequenceTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {
		
	@Test
	void testStringSequence0() {
		assertEquals("0", StringSequence.stringSequence(0));
	}
	
	@Test
	void testStringSequence1() {
		assertEquals("0 1", StringSequence.stringSequence(1));
	}
	
	@Test
	void testStringSequence2() {
		assertEquals("0 1 2", StringSequence.stringSequence(2));
	}
	
	@Test
	void testStringSequence3() {
		assertEquals("0 1 2 3", StringSequence.stringSequence(3));
	}
	
	@Test
	void testStringSequence4() {
		assertEquals("0 1 2 3 4", StringSequence.stringSequence(4));
	}
	
	@Test
	void testStringSequence5() {
		assertEquals("0 1 2 3 4 5", StringSequence.stringSequence(5));
	}
	
	@Test
	void testStringSequence6() {
		assertEquals("0 1 2 3 4 5 6", StringSequence.stringSequence(6));
	}
	
	@Test
	void testStringSequence7() {
		assertEquals("0 1 2 3 4 5 6 7", StringSequence.stringSequence(7));
	}
	
	@Test
	void testStringSequence8() {
		assertEquals("0 1 2 3 4 5 6 7 8", StringSequence.stringSequence(8));
	}
	
	@Test
	void testStringSequence9() {
		assertEquals("0 1 2 3 4 5 6 7 8 9", StringSequence.stringSequence(9));
	}
	
	@Test
	void testStringSequence10() {
		assertEquals("0 1 2 3 4 5 6 7 8 9 10", StringSequence.stringSequence(10));
	}
}

// StringSequence.java
package scenario3;

class StringSequence {

    /**
     * Return a string containing space-delimited numbers starting from 0 up to n inclusive.
     *
     * > stringSequence(0)
     * "0"
     * > stringSequence(5)
     * "0 1 2 3 4 5"
     * > stringSequence(0)
     * "0"
     * > stringSequence(3)
     * "0 1 2 3"
     * > stringSequence(10)
     * "0 1 2 3 4 5 6 7 8 9 10"
     */
    public static String stringSequence(int n) {
        String result = "";
        for (int i = 0; i <= n; i++) {
            result += i + " ";
        }
        return result.trim();
    }
}

// StringSequenceTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {
		
	@Test
	void testStringSequence0() {
		assertEquals("0", StringSequence.stringSequence(0));
	}
	
	@Test
	void testStringSequence1() {
		assertEquals("0 1", StringSequence.stringSequence(1));
	}
	
	@Test
	void testStringSequence2() {
		assertEquals("0 1 2", StringSequence.stringSequence(2));
	}
	
	@Test
	void testStringSequence3() {
		assertEquals("0 1 2 3", StringSequence.stringSequence(3));
	}
	
	@Test
	void testStringSequence4() {
		assertEquals("0 1 2 3 4", StringSequence.stringSequence(4));
	}
	
	@Test
	void testStringSequence5() {
		assertEquals("0 1 2 3 4 5", StringSequence.stringSequence(5));
	}
	
	@Test
	void testStringSequence6() {
		assertEquals("0 1 2 3 4 5 6", StringSequence.stringSequence(6));
	}
	
	@Test
	void testStringSequence7() {
		assertEquals("0 1 2 3 4 5 6 7", StringSequence.stringSequence(7));
	}
	
	@Test
	void testStringSequence8() {
		assertEquals("0 1 2 3 4 5 6 7 8", StringSequence.stringSequence(8));
	}
	
	@Test
	void testStringSequence9() {
		assertEquals("0 1 2 3 4 5 6 7 8 9", StringSequence.stringSequence(9));
	}
	
	@Test
	void testStringSequence10() {
		assertEquals("0 1 2 3 4 5 6 7 8 9 10", StringSequence.stringSequence(10));
	}
}

// StringSequence.java
package scenario3;

class StringSequence {

    /**
     * Return a string containing space-delimited numbers starting from 0 up to n inclusive.
     *
     * > stringSequence(0)
     * "0"
     * > stringSequence(5)
     * "0 1 2 3 4 5"
     * > stringSequence(0)
     * "0"
     * > stringSequence(3)
     * "0 1 2 3"
     * > stringSequence(10)
     * "0 1 2 3 4 5 6 7 8 9 10"
     */
    public static String stringSequence(int n) {
        String result = "";
        for (int i