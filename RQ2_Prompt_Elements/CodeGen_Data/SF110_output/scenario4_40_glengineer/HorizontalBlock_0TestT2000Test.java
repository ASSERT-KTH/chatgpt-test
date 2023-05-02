// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {
// HorizontalBlock.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;

/**
 * An implementation of the abstract class {@code Block}
 * used for horizontal layouting.
 */
public class HorizontalBlock extends Block {

    public HorizontalBlock(Scheme scheme, int x1, int y1, int x2, int y2) {
    }

    public HorizontalBlock(Scheme scheme, CharPosition p1, CharPosition p2) {
    }

    public HorizontalBlock(Scheme scheme) {
    }

    public HorizontalBlock(Block b) {
    }

    public HorizontalBlock(Block block, int x1, int y1, int x2, int y2) {
    }

    public Block subblock(int x1, int y1, int x2, int y2);

    public HorizontalBlock cloneWith(CharPosition1 p1);

    /**
     * Divides the current block into a set of sequential subblocks,
     * optimizes these subblocks and returns them as a linked list.
     *
     * @return	a list of optimized sequential subblocks.
     */
    public List<Block> extractSequentialSubblocks();

    /**
     * Extracts the left subblock of this block.
     * <p>
     * The required block is chosen so that its last exclusive vertical line
     * does not contain elements of components, gaps, or horizontal lines
     * starting on the left from the line.
     * <p>
     * The algorithm just finds the most left entity
     * (an element of a component, gap, or horizontal line)
     * using simple search along the scheme,
     * identifies the horizontal element containing the entity found,
     * checks whether the last exclusive vertical line of the element
     * matches the requirement for the boundary of the required block,
     * and, if does not, takes the detaining horizontal element
     * and continues the cycle.
     */
    private Block extractFirstSequentialSubblock();

    /**
     * Searches down and to the right from the beginning of this block
     * for the first occurrence of an entity.
     * @return	the position of the entity found.
     * @throws	IllegalArgumentException if this block
     * 			does not contain entities.
     */
    private CharPosition firstEntity();

    /**
     * Finds the first entity below the specified position.
     * @return	the y-coordinate of the entity found or y2 if not found.
     */
    private int firstEntityBelow(int x, int y);

    /**
     * Verifies whether the character under the cell
     * determined by the specified coordinates
     * is a word character or a horizontal line character.
     */
    private boolean entityAt(int x, int y);

    /**
     * Returns a word which starts not righter than the right end of the
     * {@code currentWord} but ends strictly righter
     * (or null if does not exist).
     */
    private HWordPosition findAWordExtendingSubblockToTheRightFrom(HWordPosition currentWord);

    /**
     * Divides the current block into a set of parallel subblocks,
     * optimizes these subblocks and returns them as a linked list.
     * <p>
     * If the block has horizontal lines,
     * this method divides the block by the maximal horizontal lines only.
     * <p>
     * If there are no horizontal lines, the block is divided into
     * usual parallel subblocks.
     */
    public List<Block> extractParallelSubblocks();

    /**
     * Returns the set of all horizontal lines intersecting this block.
     */
    private Set<HWordPosition> getIntersectingHLines();

    /**
     * Divides the current block into a set of parallel subblocks
     * by its most long horizontal lines,
     * optimizes these subblocks, and returns them as a linked list.
     */
    protected List<Block> extractParallelSubblocksSeparatedByLines(Set<HWordPosition> hLines);

    /**
     * Finds the longest lines in the specified set of horizontal lines
     * and then removes from it all other elements.
     * <p>
     * Note that, more formally, this method considers the lengths
     * of <i>intersections</i> of the lines with this block.
     */
    private void removeSmallHLinesFrom(Set<HWordPosition> hLines);

    /**
     * Returns a list of the specified horizontal lines' vertical coordinates.
     */
    private List<Integer> sortedYsOf(Set<HWordPosition> hLines);

    private List<Block> extractParallelSubblocksSeparatedBy(List<Integer> ySeparators);

    /**
     * Divides the current block without horizontal lines
     * into a set of parallel subblocks, optimizes these subblocks
     * and returns them as a linked list.
     */
    protected List<Block> extractParallelSubblocksWithoutLines();
}

// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {
		private ScanState current;
		private HWordPosition firstEntity;
		private List<Block> subblocks;
		private List<Block> parallelSubblocks;
		private Map<Integer, Integer> ySorted;
		private List<Integer> ySeparators;
		private String name ;
		private Block b;

	private void init(String name ) {
		this.name = name;
	}

	@Test
	void test() {
		init(name);
		this.b = this.subblocks.get(0);
		this.current = this.firstEntity = this.firstEntityBelow(0,0);

		// 1. extract first sequential subblock
		this.subblocks = this.b.extractSequentialSubblocks();

		assertFalse(this.subblocks.isEmpty());
		assertTrue(this.current.isEmpty());

		this.subblocks.removeAll(this.current);

		assertFalse(this.subblocks.isEmpty());
		assertTrue(this.current.isEmpty());

		// 2. extract parallel subblocks
		this.parallelSubblocks = this.b.extractParallelSubblocks();

		assertFalse(this.parallelSubblocks.isEmpty());
		assertTrue(this.current.isEmpty());

		// 3. extract parallel subblocks
		this.subblocks.removeAll(this.current);

		assertFalse(this.subblocks.isEmpty());
		this.subblocks.clear();
		this.current.clear();

		// 4. extract parallel subblocks separated by lines;
		this.parallelSubblocks = this.b.extractParallelSubblocksSeparatedByLines(this.subblocks);

		assertFalse(this.parallelSubblocks.isEmpty());
		assertTrue(this.current.isEmpty());

		// 5. optimize parallel subblocks
		this.b.optimizeParallelSubblocks();

		assertFalse(this.parallelSubblocks.isEmpty());
		assertFalse(this.current.isEmpty());

		this.ySeparators = this.b.sortedYsOf(this.current);

		assertFalse(this.ySeparators.isEmpty());
		assertFalse(this.current.isEmpty());

	}

}
