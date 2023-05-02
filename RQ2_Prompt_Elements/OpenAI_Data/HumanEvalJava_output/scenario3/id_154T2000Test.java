// CycpatternCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {

	@Test
	void testCycpatternCheck() {
		assertFalse(CycpatternCheck.cycpatternCheck("abcd","abd"));
		assertTrue(CycpatternCheck.cycpatternCheck("hello","ell"));
		assertFalse(CycpatternCheck.cycpatternCheck("whassup","psus"));
		assertTrue(CycpatternCheck.cycpatternCheck("abab","baa"));
		assertFalse(CycpatternCheck.cycpatternCheck("efef","eeff"));
		assertTrue(CycpatternCheck.cycpatternCheck("himenss","simen"));
		assertFalse(CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
		assertTrue(CycpatternCheck.cycpatternCheck("yello", "ell"));
		assertFalse(CycpatternCheck.cycpatternCheck("whattup", "ptut"));
		assertTrue(CycpatternCheck.cycpatternCheck("efef", "fee"));
		assertFalse(CycpatternCheck.cycpatternCheck("abab", "aabb"));
		assertTrue(CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
	}
}

// CycpatternCheck.java
package scenario3;

class CycpatternCheck {

    /**
     * You are given 2 words. You need to return True if the second word or any of its rotations is a substring in the first word
     * cycpatternCheck("abcd","abd") => False
     * cycpatternCheck("hello","ell") => True
     * cycpatternCheck("whassup","psus") => False
     * cycpatternCheck("abab","baa") => True
     * cycpatternCheck("efef","eeff") => False
     * cycpatternCheck("himenss","simen") => True
     *
     * > cycpatternCheck("xyzw", "xyw")
     * false
     * > cycpatternCheck("yello", "ell")
     * true
     * > cycpatternCheck("whattup", "ptut")
     * false
     * > cycpatternCheck("efef", "fee")
     * true
     * > cycpatternCheck("abab", "aabb")
     * false
     * > cycpatternCheck("winemtt", "tinem")
     * true
     */
    public static Boolean cycpatternCheck(String a, String b) {
        if (a.length() < b.length()) {
            return false;
        }
        for (int i = 0; i < b.length(); i++) {
            if (a.contains(b.substring(i) + b.substring(0, i))) {
                return true;
            }
        }
        return false;
    }
}

// CycpatternCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
		
	@Test
	void testCycpatternCheck() {
		assertFalse(CycpatternCheck.cycpatternCheck("abcd","abd"));
		assertTrue(CycpatternCheck.cycpatternCheck("hello","ell"));
		assertFalse(CycpatternCheck.cycpatternCheck("whassup","psus"));
		assertTrue(CycpatternCheck.cycpatternCheck("abab","baa"));
		assertFalse(CycpatternCheck.cycpatternCheck("efef","eeff"));
		assertTrue(CycpatternCheck.cycpatternCheck("himenss","simen"));
		assertFalse(CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
		assertTrue(CycpatternCheck.cycpatternCheck("yello", "ell"));
		assertFalse(CycpatternCheck.cycpatternCheck("whattup", "ptut"));
		assertTrue(CycpatternCheck.cycpatternCheck("efef", "fee"));
		assertFalse(CycpatternCheck.cycpatternCheck("abab", "aabb"));
		assertTrue(CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
	}
}

// CycpatternCheck.java
package scenario3;

class CycpatternCheck {

    /**
     * You are given 2 words. You need to return True if the second word or any of its rotations is a substring in the first word
     * cycpatternCheck("abcd","abd") => False
     * cycpatternCheck("hello","ell") => True
     * cycpatternCheck("whassup","psus") => False
     * cycpatternCheck("abab","baa") => True
     * cycpatternCheck("efef","eeff") => False
     * cycpatternCheck("himenss","simen") => True
     *
     * > cycpatternCheck("xyzw", "xyw")
     * false
     * > cycpatternCheck("yello", "ell")
     * true
     * > cycpatternCheck("whattup", "ptut")
     * false
     * > cycpatternCheck("efef", "fee")
     * true
     * > cycpatternCheck("abab", "aabb")
     * false
     * > cycpatternCheck("winemtt", "tinem")
     * true
     */
    public static Boolean cycpatternCheck(String a, String b) {
        if (a.length() < b.length()) {
            return false;
        }
        for (int i = 0; i < b.length(); i++) {
            if (a.contains(b.substring(i) + b.substring(0, i))) {
                return true;
            }
        }
        return false;
    }
}

// CycpatternCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
		
	@Test
	void testCycpatternCheck() {
		assertFalse(CycpatternCheck.cycpatternCheck("abcd","abd"));
		assertTrue(CycpatternCheck.cycpatternCheck("hello","ell"));
		assertFalse(CycpatternCheck.cycpatternCheck("whassup","psus"));
		assertTrue(CycpatternCheck.cycpatternCheck("abab","baa"));
		assertFalse(CycpatternCheck.cycpatternCheck("efef","eeff"));
		assertTrue(CycpatternCheck.cycpatternCheck("himenss","simen"));
		assertFalse(CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
		assertTrue(CycpatternCheck.cycpatternCheck("yello", "ell"));
		assertFalse(CycpatternCheck.cycpatternCheck("whattup", "ptut"));
		assertTrue(CycpatternCheck.cycpatternCheck("efef", "fee"));
		assertFalse(CycpatternCheck.cycpatternCheck("abab", "aabb"));
		assertTrue(CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
	}
}

// CycpatternCheck.java
package scenario3;

class CycpatternCheck {

    /**
     * You are given 2 words. You need to return True if the second word or any of its rotations is a substring in the first word
     * cycpatternCheck("abcd","abd") => False
     * cycpatternCheck("hello","ell") => True
     * cycpatternCheck("whassup","psus") => False
     * cycpatternCheck("