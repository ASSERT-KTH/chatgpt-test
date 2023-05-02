import org.junit.jupiter.api.DisplayName;

class AnyIntTest {

    @Test
    @DisplayName("Test case 1")
    void test1() {
        assertTrue(AnyInt.anyInt(5, 2, 7));
    }

    @Test
    @DisplayName("Test case 2")
    void test2() {
        assertFalse(AnyInt.anyInt(3, 2, 2));
    }

    @Test
    @DisplayName("Test case 3")
    void test3() {
        assertTrue(AnyInt.anyInt(3, -2, 1));
    }

    @Test
    @DisplayName("Test case 4")
    void test4() {
        assertFalse(AnyInt.anyInt(3.6, -2.2, 2));
    }

    @Test
    @DisplayName("Test case 5")
    void test5() {
        assertTrue(AnyInt.anyInt(2, 3, 1));
    }

    @Test
    @DisplayName("Test case 6")
    void test6() {
        assertFalse(AnyInt.anyInt(2.5, 2, 3));
    }

    @Test
    @DisplayName("Test case 7")
    void test7() {
        assertFalse(AnyInt.anyInt(1.5, 5, 3.5));
    }

    @Test
    @DisplayName("Test case 8")
    void test8() {
        assertFalse(AnyInt.anyInt(2, 6, 2));
    }

    @Test
    @DisplayName("Test case 9")
    void test9() {
        assertTrue(AnyInt.anyInt(4, 2, 2));
    }

    @Test
    @DisplayName("Test case 10")
    void test10() {
        assertFalse(AnyInt.anyInt(2.2, 2.2, 2.2));
    }

    @Test
    @DisplayName("Test case 11")
    void test11() {
        assertTrue(AnyInt.anyInt(-4, 6, 2));
    }

    @Test
    @DisplayName("Test case 12")
    void test12() {
        assertTrue(AnyInt.anyInt(2, 1, 1));
    }

    @Test
    @DisplayName("Test case 13")
    void test13() {
        assertTrue(AnyInt.anyInt(3, 4, 7));
    }

    @Test
    @DisplayName("Test case 14")
    void test14() {
        assertFalse(AnyInt.anyInt(3.0, 4, 7));
    }
}