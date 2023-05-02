// Test case 1: Test getting the first element of an empty PlotRunList.
@Test
public void testGetFirstElementEmptyList() {
    PlotRunList list = new PlotRunList();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        list.get(0);
    });
}

// Test case 2: Test getting an element at an index greater than the size of the PlotRunList.
@Test
public void testGetElementIndexGreaterThanSize() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = new PlotRun();
    PlotRun run2 = new PlotRun();
    list.add(run1);
    list.add(run2);
    assertThrows(IndexOutOfBoundsException.class, () -> {
        list.get(2);
    });
}

// Test case 3: Test getting the first element of a non-empty PlotRunList.
@Test
public void testGetFirstElement() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = new PlotRun();
    PlotRun run2 = new PlotRun();
    list.add(run1);
    list.add(run2);
    assertEquals(run1, list.get(0));
}

// Test case 4: Test getting the last element of a non-empty PlotRunList.
@Test
public void testGetLastElement() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = new PlotRun();
    PlotRun run2 = new PlotRun();
    list.add(run1);
    list.add(run2);
    assertEquals(run2, list.get(1));
}

// Test case 5: Test getting an element in the middle of a non-empty PlotRunList.
@Test
public void testGetMiddleElement() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = new PlotRun();
    PlotRun run2 = new PlotRun();
    PlotRun run3 = new PlotRun();
    list.add(run1);
    list.add(run2);
    list.add(run3);
    assertEquals(run2, list.get(1));
}

// Test case 6: Test getting an element from a PlotRunList with only one element.
@Test
public void testGetSingleElement() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = new PlotRun();
    list.add(run1);
    assertEquals(run1, list.get(0));
}

// Test case 7: Test getting an element from a PlotRunList with multiple elements of the same object.
@Test
public void testGetSameElements() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = new PlotRun();
    list.add(run1);
    list.add(run1);
    list.add(run1);
    assertEquals(run1, list.get(2));
}

// Test case 8: Test getting an element from a PlotRunList with multiple elements of different objects.
@Test
public void testGetDifferentElements() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = new PlotRun();
    PlotRun run2 = new PlotRun();
    PlotRun run3 = new PlotRun();
    list.add(run1);
    list.add(run2);
    list.add(run3);
    assertEquals(run2, list.get(1));
}

// Test case 9: Test getting an element from a PlotRunList with null elements.
@Test
public void testGetNullElements() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = null;
    PlotRun run2 = new PlotRun();
    PlotRun run3 = null;
    list.add(run1);
    list.add(run2);
    list.add(run3);
    assertEquals(run2, list.get(1));
}

// Test case 10: Test getting an element from a PlotRunList with mixed elements.
@Test
public void testGetMixedElements() {
    PlotRunList list = new PlotRunList();
    PlotRun run1 = null;
    PlotRun run2 = new PlotRun();
    PlotRun run3 = new PlotRun();
    PlotRun run4 = null;
    list.add(run1);
    list.add(run2);
    list.add(run3);
    list.add(run4);
    assertEquals(run2, list.get(1));
}
}