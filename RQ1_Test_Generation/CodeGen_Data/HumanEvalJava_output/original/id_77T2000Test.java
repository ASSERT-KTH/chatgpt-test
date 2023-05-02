// IscubeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains one unit test case for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {

    private int countDownCount = 0;
    private boolean countDown = false;

    @Test
    void iscope() throws InterruptedException {
		
        countDown = false;
        iscope(new Iscube());
        assertTrue("countDown should be False", countDown);

        countDown = true;
        iscope(new Iscube());
        assertFalse("countDown should be False", countDown);
    }

    @Test
    void iscopeException() throws InterruptedException {
    
        final int count = 100;
        final boolean first = false;
    
        countDown = false;
        // start a countdown thread
        new Thread() {
            public void run() {
                for (int i = 0; i < count; i++) {
                    countDownCount++;
                    if (countDown) {
                        return;
                    }
                    if (first) {
                        countDown = true;
                        return;
                    }
                }
            }
        }
       .start();
    
        // run the method
        iscope(new Iscube());
        assertFalse("countDown should be False", countDown);
        
        // The test is now done, since no error is expected
        assertEquals("countDown should be False", 1, countDownCount);
    }
}