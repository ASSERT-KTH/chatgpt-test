// Test class of JWBF.java
class JWBF_2Test {

    @Test
    void testGetVersion() {
        // Test case 1: Test if the returned version is not null
        assertNotNull(JWBF.getVersion());

        // Test case 2: Test if the returned version is of type Map
        assertTrue(JWBF.getVersion() instanceof Map);

        // Test case 3: Test if the returned version map is not empty
        assertFalse(JWBF.getVersion().isEmpty());

        // Test case 4: Test if the returned version map contains the key "jwbf-core"
        assertTrue(JWBF.getVersion().containsKey("jwbf-core"));

        // Test case 5: Test if the returned version map contains the key "jwbf-mediawiki"
        assertTrue(JWBF.getVersion().containsKey("jwbf-mediawiki"));

        // Test case 6: Test if the returned version map contains the key "jwbf-generic"
        assertTrue(JWBF.getVersion().containsKey("jwbf-generic"));

        // Test case 7: Test if the returned version map contains the value "1.1.10" for the key "jwbf-core"
        assertEquals("1.1.10", JWBF.getVersion().get("jwbf-core"));

        // Test case 8: Test if the returned version map contains the value "1.1.10" for the key "jwbf-mediawiki"
        assertEquals("1.1.10", JWBF.getVersion().get("jwbf-mediawiki"));

        // Test case 9: Test if the returned version map contains the value "1.1.10" for the key "jwbf-generic"
        assertEquals("1.1.10", JWBF.getVersion().get("jwbf-generic"));

        // Test case 10: Test if the returned version map is unmodifiable
        assertThrows(UnsupportedOperationException.class, () -> JWBF.getVersion().put("test", "test"));
    }
}