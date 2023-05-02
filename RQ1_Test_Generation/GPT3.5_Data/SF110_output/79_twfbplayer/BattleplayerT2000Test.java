// Test cases for Battleplayer.numberOfRounds()
class BattleplayerTest {

    @Test
    void testNumberOfRoundsWithOneRound() {
        // Arrange
        Battleplan plan = new Battleplan();
        plan.addRound(new ArrayList<Combatant>());
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRounds = player.numberOfRounds();

        // Assert
        assertEquals(1, numberOfRounds);
    }

    @Test
    void testNumberOfRoundsWithMultipleRounds() {
        // Arrange
        Battleplan plan = new Battleplan();
        plan.addRound(new ArrayList<Combatant>());
        plan.addRound(new ArrayList<Combatant>());
        plan.addRound(new ArrayList<Combatant>());
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRounds = player.numberOfRounds();

        // Assert
        assertEquals(3, numberOfRounds);
    }

    @Test
    void testNumberOfRoundsWithNoRounds() {
        // Arrange
        Battleplan plan = new Battleplan();
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRounds = player.numberOfRounds();

        // Assert
        assertEquals(0, numberOfRounds);
    }

    @Test
    void testNumberOfRoundsWithNullPlan() {
        // Arrange
        Battleplayer player = new Battleplayer(null);

        // Act
        int numberOfRounds = player.numberOfRounds();

        // Assert
        assertEquals(0, numberOfRounds);
    }

    @Test
    void testNumberOfRoundsWithEmptyPlan() {
        // Arrange
        Battleplan plan = new Battleplan();
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRounds = player.numberOfRounds();

        // Assert
        assertEquals(0, numberOfRounds);
    }

    @Test
    void testNumberOfRoundsWithOneRoundAddedLater() {
        // Arrange
        Battleplan plan = new Battleplan();
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRoundsBefore = player.numberOfRounds();
        plan.addRound(new ArrayList<Combatant>());
        int numberOfRoundsAfter = player.numberOfRounds();

        // Assert
        assertEquals(0, numberOfRoundsBefore);
        assertEquals(1, numberOfRoundsAfter);
    }

    @Test
    void testNumberOfRoundsWithMultipleRoundsAddedLater() {
        // Arrange
        Battleplan plan = new Battleplan();
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRoundsBefore = player.numberOfRounds();
        plan.addRound(new ArrayList<Combatant>());
        plan.addRound(new ArrayList<Combatant>());
        int numberOfRoundsAfter = player.numberOfRounds();

        // Assert
        assertEquals(0, numberOfRoundsBefore);
        assertEquals(2, numberOfRoundsAfter);
    }

    @Test
    void testNumberOfRoundsWithRoundRemovedLater() {
        // Arrange
        Battleplan plan = new Battleplan();
        plan.addRound(new ArrayList<Combatant>());
        plan.addRound(new ArrayList<Combatant>());
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRoundsBefore = player.numberOfRounds();
        plan.removeRound(1);
        int numberOfRoundsAfter = player.numberOfRounds();

        // Assert
        assertEquals(2, numberOfRoundsBefore);
        assertEquals(1, numberOfRoundsAfter);
    }

    @Test
    void testNumberOfRoundsWithRoundRemovedLaterAndNoRoundsLeft() {
        // Arrange
        Battleplan plan = new Battleplan();
        plan.addRound(new ArrayList<Combatant>());
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRoundsBefore = player.numberOfRounds();
        plan.removeRound(0);
        int numberOfRoundsAfter = player.numberOfRounds();

        // Assert
        assertEquals(1, numberOfRoundsBefore);
        assertEquals(0, numberOfRoundsAfter);
    }

    @Test
    void testNumberOfRoundsWithRoundRemovedLaterAndNoRoundsBefore() {
        // Arrange
        Battleplan plan = new Battleplan();
        Battleplayer player = new Battleplayer(plan);

        // Act
        int numberOfRoundsBefore = player.numberOfRounds();
        plan.removeRound(0);
        int numberOfRoundsAfter = player.numberOfRounds();

        // Assert
        assertEquals(0, numberOfRoundsBefore);
        assertEquals(0, numberOfRoundsAfter);
    }
}