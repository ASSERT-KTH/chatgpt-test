// Test cases for the countActiveRobots() method in Arena class
class ArenaTest {
    
    // Test case 1: When there are no active robots in the arena
    @Test
    void testCountActiveRobotsWithNoActiveRobots() {
        Arena arena = new Arena();
        assertEquals(0, arena.countActiveRobots());
    }
    
    // Test case 2: When there is one active robot in the arena
    @Test
    void testCountActiveRobotsWithOneActiveRobot() {
        Arena arena = new Arena();
        TangibleArenaObject robot = new TangibleArenaObject();
        arena.addRobot(robot);
        assertEquals(1, arena.countActiveRobots());
    }
    
    // Test case 3: When there are multiple active robots in the arena
    @Test
    void testCountActiveRobotsWithMultipleActiveRobots() {
        Arena arena = new Arena();
        TangibleArenaObject robot1 = new TangibleArenaObject();
        TangibleArenaObject robot2 = new TangibleArenaObject();
        TangibleArenaObject robot3 = new TangibleArenaObject();
        arena.addRobot(robot1);
        arena.addRobot(robot2);
        arena.addRobot(robot3);
        assertEquals(3, arena.countActiveRobots());
    }
    
    // Test case 4: When there are both active and inactive robots in the arena
    @Test
    void testCountActiveRobotsWithActiveAndInactiveRobots() {
        Arena arena = new Arena();
        TangibleArenaObject robot1 = new TangibleArenaObject();
        TangibleArenaObject robot2 = new TangibleArenaObject();
        TangibleArenaObject robot3 = new TangibleArenaObject();
        arena.addRobot(robot1);
        arena.addRobot(robot2);
        arena.addRobot(robot3);
        robot2.kill();
        assertEquals(2, arena.countActiveRobots());
    }
    
    // Test case 5: When all robots in the arena are inactive
    @Test
    void testCountActiveRobotsWithAllInactiveRobots() {
        Arena arena = new Arena();
        TangibleArenaObject robot1 = new TangibleArenaObject();
        TangibleArenaObject robot2 = new TangibleArenaObject();
        TangibleArenaObject robot3 = new TangibleArenaObject();
        arena.addRobot(robot1);
        arena.addRobot(robot2);
        arena.addRobot(robot3);
        robot1.kill();
        robot2.kill();
        robot3.kill();
        assertEquals(0, arena.countActiveRobots());
    }
    
    // Test case 6: When there are no robots in the arena
    @Test
    void testCountActiveRobotsWithNoRobots() {
        Arena arena = new Arena();
        assertEquals(0, arena.countActiveRobots());
    }
    
    // Test case 7: When there are only collidable objects in the arena
    @Test
    void testCountActiveRobotsWithOnlyCollidableObjects() {
        Arena arena = new Arena();
        CollidableArenaObject object1 = new CollidableArenaObject();
        CollidableArenaObject object2 = new CollidableArenaObject();
        arena.addCollidable(object1);
        arena.addCollidable(object2);
        assertEquals(0, arena.countActiveRobots());
    }
    
    // Test case 8: When there are only intangible objects in the arena
    @Test
    void testCountActiveRobotsWithOnlyIntangibleObjects() {
        Arena arena = new Arena();
        ArenaObject object1 = new ArenaObject() {
            @Override
            public void accept(ArenaObjectVisitor arenaObjectVisitor) {}
            @Override
            public void update(Duration duration) {}
            @Override
            public boolean isDead() { return false; }
            @Override
            public ArenaObjectSnapshot getSnapshot() { return null; }
        };
        ArenaObject object2 = new ArenaObject() {
            @Override
            public void accept(ArenaObjectVisitor arenaObjectVisitor) {}
            @Override
            public void update(Duration duration) {}
            @Override
            public boolean isDead() { return false; }
            @Override
            public ArenaObjectSnapshot getSnapshot() { return null; }
        };
        arena.addIntangible(object1);
        arena.addIntangible(object2);
        assertEquals(0, arena.countActiveRobots());
    }
    
    // Test case 9: When there are both collidable and intangible objects in the arena
    @Test
    void testCountActiveRobotsWithCollidableAndIntangibleObjects() {
        Arena arena = new Arena();
        CollidableArenaObject object1 = new CollidableArenaObject();
        CollidableArenaObject object2 = new CollidableArenaObject();
        ArenaObject object3 = new ArenaObject() {
            @Override
            public void accept(ArenaObjectVisitor arenaObjectVisitor) {}
            @Override
            public void update(Duration duration) {}
            @Override
            public boolean isDead() { return false; }
            @Override
            public ArenaObjectSnapshot getSnapshot() { return null; }
        };
        ArenaObject object4 = new ArenaObject() {
            @Override
            public void accept(ArenaObjectVisitor arenaObjectVisitor) {}
            @Override
            public void update(Duration duration) {}
            @Override
            public boolean isDead() { return false; }
            @Override
            public ArenaObjectSnapshot getSnapshot() { return null; }
        };
        arena.addCollidable(object1);
        arena.addCollidable(object2);
        arena.addIntangible(object3);
        arena.addIntangible(object4);
        assertEquals(0, arena.countActiveRobots());
    }
    
    // Test case 10: When there are both active robots and intangible objects in the arena
    @Test
    void testCountActiveRobotsWithActiveRobotsAndIntangibleObjects() {
        Arena arena = new Arena();
        TangibleArenaObject robot1 = new TangibleArenaObject();
        TangibleArenaObject robot2 = new TangibleArenaObject();
        ArenaObject object1 = new ArenaObject() {
            @Override
            public void accept(ArenaObjectVisitor arenaObjectVisitor) {}
            @Override
            public void update(Duration duration) {}
            @Override
            public boolean isDead() { return false; }
            @Override
            public ArenaObjectSnapshot getSnapshot() { return null; }
        };
        ArenaObject object2 = new ArenaObject() {
            @Override
            public void accept(ArenaObjectVisitor arenaObjectVisitor) {}
            @Override
            public void update(Duration duration) {}
            @Override
            public boolean isDead() { return false; }
            @Override
            public ArenaObjectSnapshot getSnapshot() { return null; }
        };
        arena.addRobot(robot1);
        arena.addRobot(robot2);
        arena.addIntangible(object1);
        arena.addIntangible(object2);
        assertEquals(2, arena.countActiveRobots());
    }
}