// Test case for DownloadQueueBean.clearPackageFileSettings() method
class DownloadQueueBean_4Test {

    // Test case 1: Test if method returns true
    @Test
    void testClearPackageFileSettingsReturnsTrue() {
        DownloadQueueBean queue = new DownloadQueueBean();
        assertTrue(queue.clearPackageFileSettings());
    }

    // Test case 2: Test if packageFileLocation is set to null
    @Test
    void testClearPackageFileSettingsSetsPackageFileLocationToNull() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.setPackageFileLocation("testFileLocation");
        queue.clearPackageFileSettings();
        assertNull(queue.getPackageFileLocation());
    }

    // Test case 3: Test if packageURL is set to null
    @Test
    void testClearPackageFileSettingsSetsPackageURLToNull() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.setPackageURL("testURL");
        queue.clearPackageFileSettings();
        assertNull(queue.getPackageURL());
    }

    // Test case 4: Test if packageModifiedSinceFileCreated is set to true
    @Test
    void testClearPackageFileSettingsSetsPackageModifiedSinceFileCreatedToTrue() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.setPackageFileCreated();
        queue.clearPackageFileSettings();
        assertTrue(queue.isPackageModified());
    }

    // Test case 5: Test if packageFormat is set to -1
    @Test
    void testClearPackageFileSettingsSetsPackageFormatToMinusOne() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.setPackageFormat(1);
        queue.clearPackageFileSettings();
        assertEquals(-1, queue.getPackageFormat());
    }

    // Test case 6: Test if packageFileLocation, packageURL, and packageFormat are set to null and -1 respectively
    @Test
    void testClearPackageFileSettingsSetsPackageFileLocationURLAndFormatToNullAndMinusOne() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.setPackageFileLocation("testFileLocation");
        queue.setPackageURL("testURL");
        queue.setPackageFormat(1);
        queue.clearPackageFileSettings();
        assertNull(queue.getPackageFileLocation());
        assertNull(queue.getPackageURL());
        assertEquals(-1, queue.getPackageFormat());
    }

    // Test case 7: Test if packageModifiedSinceFileCreated is set to true even if it was already true
    @Test
    void testClearPackageFileSettingsSetsPackageModifiedSinceFileCreatedToTrueEvenIfItWasAlreadyTrue() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.clearPackageFileSettings();
        assertTrue(queue.isPackageModified());
    }

    // Test case 8: Test if packageModifiedSinceFileCreated is set to true even if it was false
    @Test
    void testClearPackageFileSettingsSetsPackageModifiedSinceFileCreatedToTrueEvenIfItWasFalse() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.setPackageFileCreated();
        queue.clearPackageFileSettings();
        assertTrue(queue.isPackageModified());
    }

    // Test case 9: Test if packageFileLocation, packageURL, and packageFormat remain null and -1 respectively if they were already null and -1
    @Test
    void testClearPackageFileSettingsDoesNotChangePackageFileLocationURLAndFormatIfTheyWereAlreadyNullAndMinusOne() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.clearPackageFileSettings();
        assertNull(queue.getPackageFileLocation());
        assertNull(queue.getPackageURL());
        assertEquals(-1, queue.getPackageFormat());
    }

    // Test case 10: Test if method returns true even if contentSet is not empty
    @Test
    void testClearPackageFileSettingsReturnsTrueEvenIfContentSetIsNotEmpty() {
        DownloadQueueBean queue = new DownloadQueueBean();
        queue.addToQueue("testContentId");
        assertTrue(queue.clearPackageFileSettings());
    }
}