import java.util.Arrays;

class BelowThresholdTest {

    @Test
    void testBelowThresholdAllBelow() {
        assertTrue(BelowThreshold.belowThreshold(Arrays.asList(1, 2, 4, 10), 100));
    }

    @Test
    void testBelowThresholdSomeAbove() {
        assertFalse(BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 5));
    }

    @Test
    void testBelowThresholdAllAbove() {
        assertTrue(BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 21));
        assertTrue(BelowThreshold.belowThreshold(Arrays.asList(1, 20, 4, 10), 22));
    }

    @Test
    void testBelowThresholdSomeEqual() {
        assertTrue(BelowThreshold.belowThreshold(Arrays.asList(1, 8, 4, 10), 11));
        assertFalse(BelowThreshold.belowThreshold(Arrays.asList(1, 8, 4, 10), 10));
    }
}