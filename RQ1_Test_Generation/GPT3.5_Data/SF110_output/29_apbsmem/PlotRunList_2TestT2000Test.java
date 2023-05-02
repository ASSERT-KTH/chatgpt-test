// Test case for PlotRunList remove() method
public class PlotRunList_2Test {

    // Test removing a run from an empty list
    @Test
    public void testRemoveFromEmptyList() {
        PlotRunList list = new PlotRunList();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(0);
        });
    }

    // Test removing a run from a list with one run
    @Test
    public void testRemoveFromListWithOneRun() {
        PlotRun run = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run);
        assertEquals(run, list.remove(0));
        assertEquals(0, list.size());
    }

    // Test removing a run from a list with multiple runs
    @Test
    public void testRemoveFromListWithMultipleRuns() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        list.add(run3);
        assertEquals(run2, list.remove(1));
        assertEquals(2, list.size());
        assertEquals(run1, list.get(0));
        assertEquals(run3, list.get(1));
    }

    // Test removing a run with an index out of bounds
    @Test
    public void testRemoveWithIndexOutOfBounds() {
        PlotRun run = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(1);
        });
    }

    // Test removing a run with a negative index
    @Test
    public void testRemoveWithNegativeIndex() {
        PlotRun run = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(-1);
        });
    }

    // Test removing a run from a list with null elements
    @Test
    public void testRemoveFromListWithNullElements() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = null;
        PlotRun run3 = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        list.add(run3);
        assertEquals(run2, list.remove(1));
        assertEquals(2, list.size());
        assertEquals(run1, list.get(0));
        assertEquals(run3, list.get(1));
    }

    // Test removing a run from a list with non-PlotRun elements
    @Test
    public void testRemoveFromListWithNonPlotRunElements() {
        PlotRun run1 = new PlotRun();
        String str = "not a PlotRun";
        PlotRun run2 = new PlotRun();
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(str);
        list.add(run2);
        assertThrows(ClassCastException.class, () -> {
            list.remove(1);
        });
        assertEquals(2, list.size());
        assertEquals(run1, list.get(0));
        assertEquals(run2, list.get(1));
    }

    // Test removing a run from a list with only null elements
    @Test
    public void testRemoveFromListWithOnlyNullElements() {
        PlotRunList list = new PlotRunList();
        list.add(null);
        list.add(null);
        list.add(null);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(1);
        });
        assertEquals(3, list.size());
    }

    // Test removing a run from a list with only non-PlotRun elements
    @Test
    public void testRemoveFromListWithOnlyNonPlotRunElements() {
        PlotRunList list = new PlotRunList();
        list.add("not a PlotRun");
        list.add(123);
        list.add(new Object());
        assertThrows(ClassCastException.class, () -> {
            list.remove(1);
        });
        assertEquals(3, list.size());
    }

    // Test removing a run from a list with a single null element
    @Test
    public void testRemoveFromListWithSingleNullElement() {
        PlotRunList list = new PlotRunList();
        list.add(null);
        assertEquals(null, list.remove(0));
        assertEquals(0, list.size());
    }

    // Test removing a run from a list with a single non-PlotRun element
    @Test
    public void testRemoveFromListWithSingleNonPlotRunElement() {
        PlotRunList list = new PlotRunList();
        list.add("not a PlotRun");
        assertThrows(ClassCastException.class, () -> {
            list.remove(0);
        });
        assertEquals(1, list.size());
    }
}