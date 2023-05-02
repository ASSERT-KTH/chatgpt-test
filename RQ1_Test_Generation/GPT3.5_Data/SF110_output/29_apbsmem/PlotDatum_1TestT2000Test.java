// Test class of PlotDatum connected() method
class PlotDatum_1Test {
    
    // Test case 1: Test connected() method when conFlg is true
    @Test
    void testConnectedTrue() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        assertTrue(datum.connected());
    }
    
    // Test case 2: Test connected() method when conFlg is false
    @Test
    void testConnectedFalse() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, false);
        assertFalse(datum.connected());
    }
    
    // Test case 3: Test connected() method when conFlg is true and symbol is not null
    @Test
    void testConnectedTrueWithSymbol() {
        PlotSymbol symbol = new PlotSymbol(PlotSymbol.CIRCLE, Color.RED, 5);
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, symbol);
        assertTrue(datum.connected());
    }
    
    // Test case 4: Test connected() method when conFlg is false and symbol is not null
    @Test
    void testConnectedFalseWithSymbol() {
        PlotSymbol symbol = new PlotSymbol(PlotSymbol.CIRCLE, Color.RED, 5);
        PlotDatum datum = new PlotDatum(1.0, 2.0, false, symbol);
        assertFalse(datum.connected());
    }
    
    // Test case 5: Test connected() method when conFlg is true and line color is not black
    @Test
    void testConnectedTrueWithLineColor() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setLineColor(Color.BLUE);
        assertTrue(datum.connected());
    }
    
    // Test case 6: Test connected() method when conFlg is false and line color is not black
    @Test
    void testConnectedFalseWithLineColor() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, false);
        datum.setLineColor(Color.BLUE);
        assertFalse(datum.connected());
    }
    
    // Test case 7: Test connected() method when conFlg is true and error bar flag is true
    @Test
    void testConnectedTrueWithErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(0.5);
        assertTrue(datum.connected());
    }
    
    // Test case 8: Test connected() method when conFlg is false and error bar flag is true
    @Test
    void testConnectedFalseWithErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, false);
        datum.setYError(0.5);
        assertFalse(datum.connected());
    }
    
    // Test case 9: Test connected() method when conFlg is true and all other flags are true
    @Test
    void testConnectedTrueWithAllFlags() {
        PlotSymbol symbol = new PlotSymbol(PlotSymbol.CIRCLE, Color.RED, 5);
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, symbol);
        datum.setLineColor(Color.BLUE);
        datum.setYError(0.5);
        assertTrue(datum.connected());
    }
    
    // Test case 10: Test connected() method when conFlg is false and all other flags are true
    @Test
    void testConnectedFalseWithAllFlags() {
        PlotSymbol symbol = new PlotSymbol(PlotSymbol.CIRCLE, Color.RED, 5);
        PlotDatum datum = new PlotDatum(1.0, 2.0, false, symbol);
        datum.setLineColor(Color.BLUE);
        datum.setYError(0.5);
        assertFalse(datum.connected());
    }
}