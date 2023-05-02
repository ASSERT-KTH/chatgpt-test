// GameModel_0Test.java
package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GameModel}.
 * It contains ten unit test cases for the {@link GameModel#checkForWinner()} method.
 */
class GameModel_0Test {

    /**
     * Test case for a game with no players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testNoPlayers() {
        GameModel gameModel = new GameModel();
        int result = gameModel.checkForWinner();
        assertEquals(-1, result);
    }

    /**
     * Test case for a game with one player.
     * Expected result: player ID of the winner
     */
    @Test
    void testOnePlayer() {
        GameModel gameModel = new GameModel();
        Player player = new Player(1, "Player 1", new Point(0, 0));
        gameModel.addGameObject(1, player);
        int result = gameModel.checkForWinner();
        assertEquals(1, result);
    }

    /**
     * Test case for a game with two players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testTwoPlayers() {
        GameModel gameModel = new GameModel();
        Player player1 = new Player(1, "Player 1", new Point(0, 0));
        Player player2 = new Player(2, "Player 2", new Point(0, 0));
        gameModel.addGameObject(1, player1);
        gameModel.addGameObject(2, player2);
        int result = gameModel.checkForWinner();
        assertEquals(-1, result);
    }

    /**
     * Test case for a game with three players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testThreePlayers() {
        GameModel gameModel = new GameModel();
        Player player1 = new Player(1, "Player 1", new Point(0, 0));
        Player player2 = new Player(2, "Player 2", new Point(0, 0));
        Player player3 = new Player(3, "Player 3", new Point(0, 0));
        gameModel.addGameObject(1, player1);
        gameModel.addGameObject(2, player2);
        gameModel.addGameObject(3, player3);
        int result = gameModel.checkForWinner();
        assertEquals(-1, result);
    }

    /**
     * Test case for a game with four players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testFourPlayers() {
        GameModel gameModel = new GameModel();
        Player player1 = new Player(1, "Player 1", new Point(0, 0));
        Player player2 = new Player(2, "Player 2", new Point(0, 0));
        Player player3 = new Player(3, "Player 3", new Point(0, 0));
        Player player4 = new Player(4, "Player 4", new Point(0, 0));
        gameModel.addGameObject(1, player1);
        gameModel.addGameObject(2, player2);
        gameModel.addGameObject(3, player3);
        gameModel.addGameObject(4, player4);
        int result = gameModel.checkForWinner();
        assertEquals(-1, result);
    }

    /**
     * Test case for a game with five players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testFivePlayers() {
        GameModel gameModel = new GameModel();
        Player player1 = new Player(1, "Player 1", new Point(0, 0));
        Player player2 = new Player(2, "Player 2", new Point(0, 0));
        Player player3 = new Player(3, "Player 3", new Point(0, 0));
        Player player4 = new Player(4, "Player 4", new Point(0, 0));
        Player player5 = new Player(5, "Player 5", new Point(0, 0));
        gameModel.addGameObject(1, player1);
        gameModel.addGameObject(2, player2);
        gameModel.addGameObject(3, player3);
        gameModel.addGameObject(4, player4);
        gameModel.addGameObject(5, player5);
        int result = gameModel.checkForWinner();
        assertEquals(-1, result);
    }

    /**
     * Test case for a game with six players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testSixPlayers() {
        GameModel gameModel = new GameModel();
        Player player1 = new Player(1, "Player 1", new Point(0, 0));
        Player player2 = new Player(2, "Player 2", new Point(0, 0));
        Player player3 = new Player(3, "Player 3", new Point(0, 0));
        Player player4 = new Player(4, "Player 4", new Point(0, 0));
        Player player5 = new Player(5, "Player 5", new Point(0, 0));
        Player player6 = new Player(6, "Player 6", new Point(0, 0));
        gameModel.addGameObject(1, player1);
        gameModel.addGameObject(2, player2);
        gameModel.addGameObject(3, player3);
        gameModel.addGameObject(4, player4);
        gameModel.addGameObject(5, player5);
        gameModel.addGameObject(6, player6);
        int result = gameModel.checkForWinner();
        assertEquals(-1, result);
    }

    /**
     * Test case for a game with seven players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testSevenPlayers() {
        GameModel gameModel = new GameModel();
        Player player1 = new Player(1, "Player 1", new Point(0, 0));
        Player player2 = new Player(2, "Player 2", new Point(0, 0));
        Player player3 = new Player(3, "Player 3", new Point(0, 0));
        Player player4 = new Player(4, "Player 4", new Point(0, 0));
        Player player5 = new Player(5, "Player 5", new Point(0, 0));
        Player player6 = new Player(6, "Player 6", new Point(0, 0));
        Player player7 = new Player(7, "Player 7", new Point(0, 0));
        gameModel.addGameObject(1, player1);
        gameModel.addGameObject(2, player2);
        gameModel.addGameObject(3, player3);
        gameModel.addGameObject(4, player4);
        gameModel.addGameObject(5, player5);
        gameModel.addGameObject(6, player6);
        gameModel.addGameObject(7, player7);
        int result = gameModel.checkForWinner();
        assertEquals(-1, result);
    }

    /**
     * Test case for a game with eight players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testEightPlayers() {
        GameModel gameModel = new GameModel();
        Player player1 = new Player(1, "Player 1", new Point(0, 0));
        Player player2 = new Player(2, "Player 2", new Point(0, 0));
        Player player3 = new Player(3, "Player 3", new Point(0, 0));
        Player player4 = new Player(4, "Player 4", new Point(0, 0));
        Player player5 = new Player(5, "Player 5", new Point(0, 0));
        Player player6 = new Player(6, "Player 6", new Point(0, 0));
        Player player7 = new Player(7, "Player 7", new Point(0, 0));
        Player player8 = new Player(8, "Player 8", new Point(0, 0));
        gameModel.addGameObject(1, player1);
        gameModel.addGameObject(2, player2);
        gameModel.addGameObject(3, player3);
        gameModel.addGameObject(4, player4);
        gameModel.addGameObject(5, player5);
        gameModel.addGameObject(6, player6);
        gameModel.addGameObject(7, player7);
        gameModel.addGameObject(8, player8);
        int result = gameModel.checkForWinner();
        assertEquals(-1, result);
    }

    /**
     * Test case for a game with nine players.
     * Expected result: -1 (game still running)
     */
    @Test
    void testNinePlayers() {
        GameModel gameModel = new GameModel();
        Player player1 = new Player(1, "Player 1", new Point(0, 0));
        Player player2 = new Player(2, "Player 2", new Point(0, 0));
        Player player3 = new Player(3, "Player 3", new Point(