// Test cases for JWBF.getPartId(Class)
class JWBF_1Test {

    @Test
    void testGetPartIdWithJWBFClass() {
        assertEquals("jwbf-core", JWBF.getPartId(JWBF.class));
    }

    @Test
    void testGetPartIdWithJWBFExceptionClass() {
        assertEquals("jwbf-core", JWBF.getPartId(JWBFException.class));
    }

    @Test
    void testGetPartIdWithWikiBotClass() {
        assertEquals("jwbf-mediawiki", JWBF.getPartId(WikiBot.class));
    }

    @Test
    void testGetPartIdWithWikiBotExceptionClass() {
        assertEquals("jwbf-mediawiki", JWBF.getPartId(WikiBotException.class));
    }

    @Test
    void testGetPartIdWithHttpBotClass() {
        assertEquals("jwbf-http", JWBF.getPartId(HttpBot.class));
    }

    @Test
    void testGetPartIdWithHttpBotExceptionClass() {
        assertEquals("jwbf-http", JWBF.getPartId(HttpBotException.class));
    }

    @Test
    void testGetPartIdWithLiveBotClass() {
        assertEquals("jwbf-live", JWBF.getPartId(LiveBot.class));
    }

    @Test
    void testGetPartIdWithLiveBotExceptionClass() {
        assertEquals("jwbf-live", JWBF.getPartId(LiveBotException.class));
    }

    @Test
    void testGetPartIdWithXmlBotClass() {
        assertEquals("jwbf-xml", JWBF.getPartId(XmlBot.class));
    }

    @Test
    void testGetPartIdWithXmlBotExceptionClass() {
        assertEquals("jwbf-xml", JWBF.getPartId(XmlBotException.class));
    }
}