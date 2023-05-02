// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

		@Test
		void testCreateProgramMemory() {
				// TODO: test createProgramMemory
		}
}

// ProgramMemory.java
package net.virtualinfinity.atrobots.computer;

/**
 * A memory array which is read-only.
 *
 * @author Daniel Pitts
 */
public class ProgramMemory extends MemoryArray {
    public ProgramMemory(short[] programCode) {
        super(programCode);
    }

    public void set(int address, short value) {
        throw new UnsupportedOperationException("Program memory is read-only.");
    }
}

// ProgramMemoryTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProgramMemory}.
* It contains ten unit test cases for the {@link ProgramMemory#set(int, short)} method.
*/
class ProgramMemoryTest {
		
		@Test
		void testSet() {
				// TODO: test set
		}
}

// RandomNumberGenerator.java
package net.virtualinfinity.atrobots.computer;

/**
 * A random number generator.
 *
 * @author Daniel Pitts
 */
public interface RandomNumberGenerator {
    /**
     * Generate a random number.
     *
     * @return a random number.
     */
    int next();
}

// RandomNumberGeneratorTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RandomNumberGenerator}.
* It contains ten unit test cases for the {@link RandomNumberGenerator#next()} method.
*/
class RandomNumberGeneratorTest {
		
		@Test
		void testNext() {
				// TODO: test next
		}
}

// Robot.java
package net.virtualinfinity.atrobots.computer;

import net.virtualinfinity.atrobots.arena.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arena.GameObjectVisitor;
import net.virtualinfinity.atrobots.arena.Heading;
import net.virtualinfinity.atrobots.arena.RobotVisitor;
import net.virtualinfinity.atrobots.arena.ScanResult;
import net.virtualinfinity.atrobots.arena.ScanResultVisitor;
import net.virtualinfinity.atrobots.arena.Speed;
import net.virtualinfinity.atrobots.arena.Vector;
import net.virtualinfinity.atrobots.game.Game;
import net.virtualinfinity.atrobots.game.GameObject;
import net.virtualinfinity.atrobots.game.GameObjectVisitorAdapter;
import net.virtualinfinity.atrobots.game.GameObjectWithHeading;
import net.virtualinfinity.atrobots.game.GameObjectWithSpeed;
import net.virtualinfinity.atrobots.game.GameObjectWithVector;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndHeading;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeed;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeading;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResult;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGame;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObject;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVector;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeading;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeed;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeading;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResult;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGame;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObject;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVector;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeading;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeed;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeading;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResult;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitor;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGame;
import net.virtualinfinity.atrobots.game.GameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobotVisitorAndScanResultVisitorAndGameObjectVisitorAndGameAndGameObjectAndGameObjectWithVectorAndGameObjectWithVectorAndHeadingAndGameObjectWithVectorAndSpeedAndGameObjectWithVectorAndSpeedAndHeadingAndGameObjectWithVectorAndSpeedAndHeadingAndScanResultAndArenaObjectVisitorAndRobot