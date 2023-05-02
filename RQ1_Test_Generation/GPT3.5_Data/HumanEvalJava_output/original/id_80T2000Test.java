import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsHappyTest {

    @Test
    void testIsHappyWithSingleLetter() {
        assertFalse(IsHappy.isHappy("a"));
    }

    @Test
    void testIsHappyWithTwoSameLetters() {
        assertFalse(IsHappy.isHappy("aa"));
    }

    @Test
    void testIsHappyWithThreeDistinctLetters() {
        assertTrue(IsHappy.isHappy("abc"));
    }

    @Test
    void testIsHappyWithThreeSameLetters() {
        assertFalse(IsHappy.isHappy("aaa"));
    }

    @Test
    void testIsHappyWithThreeLettersWithTwoSame() {
        assertFalse(IsHappy.isHappy("abb"));
    }

    @Test
    void testIsHappyWithFourDistinctLetters() {
        assertTrue(IsHappy.isHappy("abcd"));
    }

    @Test
    void testIsHappyWithFourLettersWithTwoSame() {
        assertFalse(IsHappy.isHappy("aabb"));
    }

    @Test
    void testIsHappyWithFourLettersWithThreeSame() {
        assertFalse(IsHappy.isHappy("aaab"));
    }

    @Test
    void testIsHappyWithFiveDistinctLetters() {
        assertTrue(IsHappy.isHappy("abcde"));
    }

    @Test
    void testIsHappyWithFiveLettersWithTwoSame() {
        assertFalse(IsHappy.isHappy("abccd"));
    }
}