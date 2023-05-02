// MoveOneBallTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains one unit test case for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
// MoveOneBall.java
package scenario2;

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
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains one unit test case for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
		
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
     */
	@Test
    public void testMoveOneBall() {
        assertTrue(new MoveOneBall().moveOneBall(Arrays.asList(5)));
    }
 }
