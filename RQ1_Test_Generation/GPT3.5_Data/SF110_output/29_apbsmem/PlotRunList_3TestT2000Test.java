// Test case for PlotRunList iterator method
class PlotRunList_3Test {

    // Test case 1: Test iterator on an empty PlotRunList
    @Test
    void testEmptyIterator() {
        PlotRunList list = new PlotRunList();
        Iterator iterator = list.iterator();
        assertFalse(iterator.hasNext());
    }

    // Test case 2: Test iterator on a PlotRunList with one run
    @Test
    void testSingleRunIterator() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(2, 3), new PlotDatum(3, 4)};
        PlotRun run = new PlotRun(data);
        PlotRunList list = new PlotRunList();
        list.add(run);
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run, iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case 3: Test iterator on a PlotRunList with multiple runs
    @Test
    void testMultipleRunIterator() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(4, 5), new PlotDatum(5, 6), new PlotDatum(6, 7)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(run2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case 4: Test iterator on a PlotRunList with nested PlotRunLists
    @Test
    void testNestedRunListIterator() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(4, 5), new PlotDatum(5, 6), new PlotDatum(6, 7)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRunList nestedList = new PlotRunList();
        nestedList.add(run1);
        nestedList.add(run2);
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(nestedList);
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(nestedList, iterator.next());
        Iterator nestedIterator = nestedList.iterator();
        assertTrue(nestedIterator.hasNext());
        assertEquals(run1, nestedIterator.next());
        assertTrue(nestedIterator.hasNext());
        assertEquals(run2, nestedIterator.next());
        assertFalse(nestedIterator.hasNext());
        assertFalse(iterator.hasNext());
    }

    // Test case 5: Test iterator on a PlotRunList with non-PlotRun objects
    @Test
    void testNonPlotRunIterator() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(2, 3), new PlotDatum(3, 4)};
        PlotRun run = new PlotRun(data);
        List nonRunList = new ArrayList();
        nonRunList.add("not a run");
        nonRunList.add(run);
        PlotRunList list = new PlotRunList(nonRunList);
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run, iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case 6: Test iterator on a PlotRunList with null elements
    @Test
    void testNullElementIterator() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(2, 3), new PlotDatum(3, 4)};
        PlotRun run = new PlotRun(data);
        List nullList = new ArrayList();
        nullList.add(null);
        nullList.add(run);
        PlotRunList list = new PlotRunList(nullList);
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run, iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case 7: Test iterator on a PlotRunList with a single null element
    @Test
    void testSingleNullElementIterator() {
        List nullList = new ArrayList();
        nullList.add(null);
        PlotRunList list = new PlotRunList(nullList);
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertNull(iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case 8: Test iterator on a PlotRunList with multiple null elements
    @Test
    void testMultipleNullElementIterator() {
        List nullList = new ArrayList();
        nullList.add(null);
        nullList.add(null);
        PlotRunList list = new PlotRunList(nullList);
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertNull(iterator.next());
        assertTrue(iterator.hasNext());
        assertNull(iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case 9: Test iterator on a cloned PlotRunList
    @Test
    void testClonedIterator() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(2, 3), new PlotDatum(3, 4)};
        PlotRun run = new PlotRun(data);
        PlotRunList list = new PlotRunList();
        list.add(run);
        PlotRunList clonedList = (PlotRunList) list.clone();
        Iterator iterator = clonedList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run, iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case 10: Test iterator on a modified PlotRunList
    @Test
    void testModifiedIterator() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(4, 5), new PlotDatum(5, 6), new PlotDatum(6, 7)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(run2, iterator.next());
        assertFalse(iterator.hasNext());
        PlotDatum[] data3 = {new PlotDatum(7, 8), new PlotDatum(8, 9), new PlotDatum(9, 10)};
        PlotRun run3 = new PlotRun(data3);
        list.add(run3);
        assertTrue(iterator.hasNext());
        assertEquals(run3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}