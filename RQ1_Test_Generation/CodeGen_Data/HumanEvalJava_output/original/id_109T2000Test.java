// MoveOneBallTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains one unit test case for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
// MoveOneBall.java
package original;

import java.util.List;

class MoveOneBall {

    /**
     * We have an array 'arr' of N integers arr[1], arr[2],..., arr[N].The
     * numbers in the array will be randomly ordered. Your task is to determine if
     * it is possible to get an array sorted in non-decreasing order by performing
     * the following operation on the given array:
     * You are allowed to perform right shift operation any number of times.
     *
     * One right shift operation means shifting all elements of the array by one
     * position in the right direction. The last element of the array will be moved to
     * the starting position in the array i.e. 0th index.
     *
     * If it is possible to obtain the sorted array by performing the above operation
     * then return True else return False.
     * If the given array is empty then return True.
     *
     * Note: The given list is guaranteed to have unique elements.
     *
     * For Example:
     *
     * move_one_ball([3, 4, 5, 1, 2])==>True
     * Explanation: By performing 2 right shift operations, non-decreasing order can
     * be achieved for the given array.
     * move_one_ball([3, 5, 4, 1, 2])==>False
     * Explanation:It is not possible to get non-decreasing order for the given
     * array by performing any number of right shift operations.
     *
     * > moveOneBall([3, 4, 5, 1, 2])
     * true
     * > moveOneBall([3, 5, 10, 1, 2])
     * true
     * > moveOneBall([4, 3, 1, 2])
     * false
     * > moveOneBall([3, 5, 4, 1, 2])
     * false
     * > moveOneBall([])
     * true
     */
    public static Boolean moveOneBall(List<Object> arr) {
        if (arr.size() == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((int) arr.get(i) > (int) arr.get((i + 1) % arr.size())) {
                count++;
            }
        }
        if (count <= 1) {
            return true;
        }
        return false;
    }
}

// MoveOneBallTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains one unit test case for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
		/**
		* This test case shows the following statement:
        *
        * 1st case
        * - It performs an operation as a right shift followed by an operation as a
        *  right shift of number 1.
        *
		* 2nd case
		* - It performs an operation as a right shift followed by an operation as
		*   a right shift of number 4.
		*
		* 3rd case
		* - It performs an operation as a right shift of number 8.
		*
		* 4th case
		* - It performs an operation as a right shift followed by an operation as
		*   a right shift of number 16.
		*
		* 4th case
		* - It performs an operation as a right shift followed by an operation as
		*   a right shift of number 32.
		*
    * @throws UnreachableCodeException if the algorithm fails because of unreachable
    *    code.
    */
    @Test
    public void testMoveOneBall1RightShift2RightShift() {
        final List <Number> args = new ArrayList (new Number [(int) "4"]);
        final List <Number> result = MoveOneBall.moveOneBall(args);
        assertTrue("Result is null", result.get(args.size() - 1)!= null);
        assertEquals("Wrong result value", (Number) 4, result.get(args.size() - 1));
    }
	@Test
    public void testMoveOneBall1RightShift5RightShift() {
		final List <Number> args = new ArrayList (new Number [(int) "8"]);
		final List <Number> result = MoveOneBall.moveOneBall(args);
        assertTrue("Result is null", result.get(args.size() - 1)!= null);
        assertEquals("Wrong result value", (Number)8, result.get(args.size() - 1));
	}
	@Test
    public void testMoveOneBall1RightShift2RightShiftLeftShift() {
        final List <Number> args = new ArrayList (new Number [(int) "16"]);
        final List <Number> result = MoveOneBall.moveOneBall(args);
        assertTrue("Result is null", result.get(args.size() - 1)!= null);
        assertEquals("Wrong result value", (Number)16, result.get(args.size() - 1));
    }
	@Test
    public void testMoveOneBall1RightShift3RightShiftLeftShift() {
		final List <Number> args = new ArrayList (new Number [(int) "32"]);
		final List <Number> result = MoveOneBall.moveOneBall(args);
        assertTrue("Result is null", result.get(args.size() - 1)!= null);
        assertEquals("Wrong result value", (Number)32, result.get(args.size() - 1));
	}

}
