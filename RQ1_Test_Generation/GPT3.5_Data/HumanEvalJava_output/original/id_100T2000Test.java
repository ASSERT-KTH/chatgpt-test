// MakeAPile.java
package updated;

import java.util.ArrayList;
import java.util.List;

public class MakeAPile {

    /**
     * Given a positive integer n, you have to make a pile of n levels of stones.
     * The first level has n stones.
     * The number of stones in the next level is:
     * - the next odd number if n is odd.
     * - the next even number if n is even.
     * Return the number of stones in each level in a list, where element at index
     * i represents the number of stones in the level (i+1).
     *
     * Examples:
     * >>> makeAPile(3)
     * [3, 5, 7]
     *
     * > makeAPile(3)
     * [3, 5, 7]
     * > makeAPile(4)
     * [4, 6, 8, 10]
     * > makeAPile(5)
     * [5, 7, 9, 11, 13]
     * > makeAPile(6)
     * [6, 8, 10, 12, 14, 16]
     * > makeAPile(8)
     * [8, 10, 12, 14, 16, 18, 20, 22]
     */
    public static List<Integer> makeAPile(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 1;
        while (i <= n) {
            if (i == 1) {
                result.add(n);
            } else {
                if (n % 2 == 0) {
                    result.add(result.get(i - 2) + 2);
                } else {
                    result.add(result.get(i - 2) + 2*i-1);
                }
            }
            i++;
        }
        return result;
    }
}

// MakeAPileTest.java
package updated;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {
    
    @Test
    void testMakeAPileWithThree() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, MakeAPile.makeAPile(3));
    }
    
    @Test
    void testMakeAPileWithFour() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        assertEquals(expected, MakeAPile.makeAPile(4));
    }
    
    @Test
    void testMakeAPileWithFive() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);
        assertEquals(expected, MakeAPile.makeAPile(5));
    }
    
    @Test
    void testMakeAPileWithSix() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        assertEquals(expected, MakeAPile.makeAPile(6));
    }
    
    @Test
    void testMakeAPileWithEight() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        expected.add(22);
        assertEquals(expected, MakeAPile.makeAPile(8));
    }
    
    @Test
    void testMakeAPileWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, MakeAPile.makeAPile(1));
    }
    
    @Test
    void testMakeAPileWithZero() {
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, MakeAPile.makeAPile(0));
    }
    
    @Test
    void testMakeAPileWithNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            MakeAPile.makeAPile(-1);
        });
    }
    
    @Test
    void testMakeAPileWithLargeNumber() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1000000);
        expected.add(1000002);
        expected.add(1000004);
        expected.add(1000006);
        expected.add(1000008);
        expected.add(1000010);
        expected.add(1000012);
        expected.add(1000014);
        expected.add(1000016);
        expected.add(1000018);
        expected.add(1000020);
        expected.add(1000022);
        expected.add(1000024);
        expected.add(1000026);
        expected.add(1000028);
        expected.add(1000030);
        expected.add(1000032);
        expected.add(1000034);
        expected.add(1000036);
        expected.add(1000038);
        expected.add(1000040);
        expected.add(1000042);
        expected.add(1000044);
        expected.add(1000046);
        expected.add(1000048);
        expected.add(1000050);
        expected.add(1000052);
        expected.add(1000054);
        expected.add(1000056);
        expected.add(1000058);
        expected.add(1000060);
        expected.add(1000062);
        expected.add(1000064);
        expected.add(1000066);
        expected.add(1000068);
        expected.add(1000070);
        expected.add(1000072);
        expected.add(1000074);
        expected.add(1000076);
        expected.add(1000078);
        expected.add(1000080);
        expected.add(1000082);
        expected.add(1000084);
        expected.add(1000086);
        expected.add(1000088);
        expected.add(1000090);
        expected.add(1000092);
        expected.add(1000094);
        expected.add(1000096);
        expected.add(1000098);
        expected.add(1000100);
        expected.add(1000102);
        expected.add(1000104);
        expected.add(1000106);
        expected.add(1000108);
        expected.add(1000110);
        expected.add(1000112);
        expected.add(1000114);
        expected.add(1000116);
        expected.add(1000118);
        expected.add(1000120);
        expected.add(1000122);
        expected.add(1000124);
        expected.add(1000126);
        expected.add(1000128);
        expected.add(1000130);
        expected.add(1000132);
        expected.add(1000134);
        expected.add(1000136);
        expected.add(1000138);
        expected.add(1000140);
        expected.add(1000142);
        expected.add(1000144);
        expected.add(1000146);
        expected.add(1000148);
        expected.add(1000150);
        expected.add(1000152);
        expected.add(1000154);
        expected.add(1000156);
        expected.add(1000158);
        expected.add(1000160);
        expected.add(1000162);
        expected.add(1000164);
        expected.add(1000166);
        expected.add(1000168);
        expected.add(1000170);
        expected.add(1000172);
        expected.add(1000174);
        expected.add(1000176);
        expected.add(1000178);
        expected.add(1000180);
        expected.add(1000182);
        expected.add(1000184);
        expected.add(1000186);
        expected.add(1000188);
        expected.add(1000190);
        expected.add(1000192);
        expected.add(1000194);
        expected.add(1000196);
        expected.add(1000198);
        expected.add(1000200);
        assertEquals(expected, MakeAPile.makeAPile(1000000));
    }
}