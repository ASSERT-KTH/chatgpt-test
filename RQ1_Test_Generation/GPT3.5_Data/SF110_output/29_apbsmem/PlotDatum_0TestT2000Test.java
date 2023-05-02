// Test the hasErrorBar() method of the PlotDatum class.
class PlotDatum_0Test {
    
    // Test case 1: Test when yErr is 0.
    @Test
    void testHasErrorBar1() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(0.0);
        assertFalse(datum.hasErrorBar());
    }
    
    // Test case 2: Test when yErr is positive.
    @Test
    void testHasErrorBar2() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(0.5);
        assertTrue(datum.hasErrorBar());
    }
    
    // Test case 3: Test when yErr is negative.
    @Test
    void testHasErrorBar3() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(-0.5);
        assertTrue(datum.hasErrorBar());
    }
    
    // Test case 4: Test when yErr is NaN.
    @Test
    void testHasErrorBar4() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(Double.NaN);
        assertTrue(datum.hasErrorBar());
    }
    
    // Test case 5: Test when yErr is positive infinity.
    @Test
    void testHasErrorBar5() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(Double.POSITIVE_INFINITY);
        assertTrue(datum.hasErrorBar());
    }
    
    // Test case 6: Test when yErr is negative infinity.
    @Test
    void testHasErrorBar6() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(Double.NEGATIVE_INFINITY);
        assertTrue(datum.hasErrorBar());
    }
    
    // Test case 7: Test when yErr is a very small positive value.
    @Test
    void testHasErrorBar7() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(1e-10);
        assertTrue(datum.hasErrorBar());
    }
    
    // Test case 8: Test when yErr is a very small negative value.
    @Test
    void testHasErrorBar8() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(-1e-10);
        assertTrue(datum.hasErrorBar());
    }
    
    // Test case 9: Test when yErr is a very large positive value.
    @Test
    void testHasErrorBar9() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(1e10);
        assertTrue(datum.hasErrorBar());
    }
    
    // Test case 10: Test when yErr is a very large negative value.
    @Test
    void testHasErrorBar10() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(-1e10);
        assertTrue(datum.hasErrorBar());
    }
}