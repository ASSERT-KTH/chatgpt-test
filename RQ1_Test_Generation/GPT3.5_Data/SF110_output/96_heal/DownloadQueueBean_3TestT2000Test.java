import org.junit.jupiter.api.BeforeEach;

class DownloadQueueBean_3Test {

    private DownloadQueueBean downloadQueueBean;

    @BeforeEach
    void setUp() {
        downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.addToQueue("contentId3");
    }

    @Test
    void testRemoveAllFromQueue() {
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueIsEmpty() {
        downloadQueueBean.removeAllFromQueue();
        assertFalse(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasOneItem() {
        downloadQueueBean.removeFromQueue("contentId1");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasTwoItems() {
        downloadQueueBean.removeFromQueue("contentId1");
        downloadQueueBean.removeFromQueue("contentId2");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasThreeItems() {
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasDuplicateItems() {
        downloadQueueBean.addToQueue("contentId1");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasNullItems() {
        downloadQueueBean.addToQueue(null);
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasMixedItems() {
        downloadQueueBean.addToQueue(null);
        downloadQueueBean.addToQueue("contentId4");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasNonStringItems() {
        downloadQueueBean.addToQueue(123);
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }
}