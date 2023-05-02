import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IscubeTest {

    @Test
    void testPositiveCube() {
        assertTrue(Iscube.iscube(1));
        assertTrue(Iscube.iscube(8));
        assertTrue(Iscube.iscube(27));
        assertTrue(Iscube.iscube(64));
        assertTrue(Iscube.iscube(125));
        assertTrue(Iscube.iscube(1000));
    }

    @Test
    void testNegativeCube() {
        assertTrue(Iscube.iscube(-1));
        assertTrue(Iscube.iscube(-8));
        assertTrue(Iscube.iscube(-27));
        assertTrue(Iscube.iscube(-64));
        assertTrue(Iscube.iscube(-125));
        assertTrue(Iscube.iscube(-1000));
    }

    @Test
    void testNonCube() {
        assertFalse(Iscube.iscube(2));
        assertFalse(Iscube.iscube(10));
        assertFalse(Iscube.iscube(180));
        assertFalse(Iscube.iscube(1729));
    }

    @Test
    void testZero() {
        assertTrue(Iscube.iscube(0));
    }
}