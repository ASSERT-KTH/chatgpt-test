import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetMaxTriplesTest {

    @Test
    void testGetMaxTriplesWithNEqual5() {
        int expected = 1;
        int actual = GetMaxTriples.getMaxTriples(5);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual6() {
        int expected = 4;
        int actual = GetMaxTriples.getMaxTriples(6);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual10() {
        int expected = 36;
        int actual = GetMaxTriples.getMaxTriples(10);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual100() {
        int expected = 53361;
        int actual = GetMaxTriples.getMaxTriples(100);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual1() {
        int expected = 0;
        int actual = GetMaxTriples.getMaxTriples(1);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual2() {
        int expected = 0;
        int actual = GetMaxTriples.getMaxTriples(2);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual3() {
        int expected = 1;
        int actual = GetMaxTriples.getMaxTriples(3);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual4() {
        int expected = 1;
        int actual = GetMaxTriples.getMaxTriples(4);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual7() {
        int expected = 6;
        int actual = GetMaxTriples.getMaxTriples(7);
        assertEquals(expected, actual);
    }

    @Test
    void testGetMaxTriplesWithNEqual8() {
        int expected = 10;
        int actual = GetMaxTriples.getMaxTriples(8);
        assertEquals(expected, actual);
    }
}