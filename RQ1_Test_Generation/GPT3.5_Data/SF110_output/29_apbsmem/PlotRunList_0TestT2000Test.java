// Test the size() method of PlotRunList.

class PlotRunList_0Test {

    // Test case 1: Test an empty PlotRunList.
    @Test
    void testSizeEmpty() {
        PlotRunList list = new PlotRunList();
        assertEquals(0, list.size());
    }

    // Test case 2: Test a PlotRunList with one run.
    @Test
    void testSizeOneRun() {
        PlotRun run = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run);
        assertEquals(1, list.size());
    }

    // Test case 3: Test a PlotRunList with multiple runs.
    @Test
    void testSizeMultipleRuns() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        list.add(run3);
        assertEquals(3, list.size());
    }

    // Test case 4: Test a PlotRunList with null runs.
    @Test
    void testSizeNullRuns() {
        PlotRunList list = new PlotRunList();
        list.add(null);
        list.add(null);
        list.add(null);
        assertEquals(3, list.size());
    }

    // Test case 5: Test a PlotRunList with mixed runs and nulls.
    @Test
    void testSizeMixedRunsAndNulls() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(null);
        list.add(run2);
        assertEquals(3, list.size());
    }

    // Test case 6: Test a PlotRunList with a large number of runs.
    @Test
    void testSizeLargeNumberOfRuns() {
        PlotRunList list = new PlotRunList();
        for (int i = 0; i < 1000; i++) {
            PlotRun run = new PlotRun();
            list.add(run);
        }
        assertEquals(1000, list.size());
    }

    // Test case 7: Test a PlotRunList with a single run added and removed.
    @Test
    void testSizeAddRemoveOneRun() {
        PlotRun run = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run);
        list.remove(run);
        assertEquals(0, list.size());
    }

    // Test case 8: Test a PlotRunList with multiple runs added and removed.
    @Test
    void testSizeAddRemoveMultipleRuns() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        list.add(run3);
        list.remove(run1);
        list.remove(run2);
        assertEquals(1, list.size());
    }

    // Test case 9: Test a PlotRunList with all runs removed.
    @Test
    void testSizeRemoveAllRuns() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        list.add(run3);
        list.clear();
        assertEquals(0, list.size());
    }

    // Test case 10: Test a PlotRunList with a null run removed.
    @Test
    void testSizeRemoveNullRun() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(null);
        list.add(run2);
        list.remove(null);
        assertEquals(2, list.size());
    }
}