// Test case for Queue.maxCapacityExceeded() method
class Queue_2Test {
    
    // Test case 1: Test with maxCapacity = NO_MAXIMUM and numItems = 0
    @Test
    void testMaxCapacityExceeded1() {
        Queue queue = new Queue(Queue.NO_MAXIMUM);
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 2: Test with maxCapacity = NO_MAXIMUM and numItems = 5
    @Test
    void testMaxCapacityExceeded2() {
        Queue queue = new Queue(Queue.NO_MAXIMUM);
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 3: Test with maxCapacity = 5 and numItems = 0
    @Test
    void testMaxCapacityExceeded3() {
        Queue queue = new Queue(5);
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 4: Test with maxCapacity = 5 and numItems = 3
    @Test
    void testMaxCapacityExceeded4() {
        Queue queue = new Queue(5);
        for (int i = 0; i < 3; i++) {
            queue.enqueue(i);
        }
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 5: Test with maxCapacity = 5 and numItems = 5
    @Test
    void testMaxCapacityExceeded5() {
        Queue queue = new Queue(5);
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 6: Test with maxCapacity = 5 and numItems = 6
    @Test
    void testMaxCapacityExceeded6() {
        Queue queue = new Queue(5);
        for (int i = 0; i < 6; i++) {
            queue.enqueue(i);
        }
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 7: Test with maxCapacity = 1 and numItems = 0
    @Test
    void testMaxCapacityExceeded7() {
        Queue queue = new Queue(1);
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 8: Test with maxCapacity = 1 and numItems = 1
    @Test
    void testMaxCapacityExceeded8() {
        Queue queue = new Queue(1);
        queue.enqueue(1);
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 9: Test with maxCapacity = 1 and numItems = 2
    @Test
    void testMaxCapacityExceeded9() {
        Queue queue = new Queue(1);
        queue.enqueue(1);
        queue.enqueue(2);
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 10: Test with maxCapacity = 3 and numItems = 3
    @Test
    void testMaxCapacityExceeded10() {
        Queue queue = new Queue(3);
        for (int i = 0; i < 3; i++) {
            queue.enqueue(i);
        }
        assertFalse(queue.maxCapacityExceeded());
    }
}