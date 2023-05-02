// RightAngleTriangleTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains one unit test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
/**
		* Test method for {@link RightAngleTriangle#rightAngleTriangle(int, int, int)}.
		* @throws Exception 
		*/   
    @Test
    public void rightAngleTriangleTest() throws Exception {   // Test method for
        // {@link #rightAngleTriangleTest(java.lang.String[][], java.lang.String[])}.
    	{
    	int l = 0, ul = 0, ull = 0, ll; //l = 0, ul = 0, ull = 0, ll = 0;
        System.out.println("> rightAngleTriangleTest");
        // 1. Test for a unit.
        l = 5;
        ul = 7; ull = 13; ll = 3;
        //ll += 10;
        ul += 10;
        ll += 10;
        System.out.println("l = " + l);
        System.out.println("ul = " + ul);
        System.out.println("ull = " + ull);
        System.out.println("ll = " + ll);
        Boolean result = RightAngleTriangle.rightAngleTriangle(l, ul, ull);
        System.out.println("result = " + result);
            assertEquals(true, result);
        }
	
}