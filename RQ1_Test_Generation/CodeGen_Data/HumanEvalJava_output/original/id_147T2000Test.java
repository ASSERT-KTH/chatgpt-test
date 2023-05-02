// GetMaxTriplesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains one unit test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
int i;
		boolean b;

		/**
         * Constructor.
         * @param i int value which defines the number of possible triple
         * @param b boolean value to control if triples should be returned
         */
		public GetMaxTriplesTest(int i,boolean b) {
			this.i = i;
			this.b = b;
            assertTrue(this.b+"!= true, i = " + i + ", b = " + b, b+"!= true, i = "+i);
        }

    @Test
	/** Test cases for the {@link GetMaxTriples#getMaxTriples(int)} method. **/
    public void test01() {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 100;
        a[2] = 4;
        
        // for each number of valid triple to get maximum of a[a[i] % 3]
        for (int testCase = 0; testCase < 3;testCase++) {
            // if not found, skip the test case
            if (GetMaxTriples.getMaxTriples(testCase)!= testCase){
                continue;
            }
            
            // Test the case
            if(testCase == 0){
                // a[a[i] % 3] = a[i] + a[i] + a[i]
                assertEquals( GetMaxTriples.getMaxTriples(a[i]), a[i] + a[i] + a[i], i* i +(testCase-1)*a[i], "getMax(a[i]) = " + GetMaxTriples.getMaxTriples(a[i]) );
            }else if(testCase == 1){
                // 0 <= a[i] % 3 < a[i] < 2
                int max = (0 >= GetMaxTriples.getMaxTriples(a[i]))?GetMaxTriples.getMaxTriples(a[i]) : GetMaxTriples.getMaxTriples(a[i]);
                // a[1] = 2
                assertTrue(2 == max, "Should have found a[1]. ");
                
                // a[i] = a[i] + 2
                assertEquals( GetMaxTriples.getMaxTriples(a), GetMaxTriples.getMaxTriples(a), i* i +(testCase-1)*a[i], "getMax(a[i]) = " + GetMaxTriples.getMaxTriples(a) );


            }else if(testCase == 2){
                // 0 <= a[1] % 3 < a[1] < a[2]
                int max3 = ((0 >= GetMaxTriples.getMaxTriples(a[1]))?GetMaxTriples.getMaxTriples(a):"")+ ((0 >= GetMaxTriples.getMaxTriples(a[2]))?GetMaxTriples.getMaxTriples(a):"");
                assertEquals( max3, GetMaxTriples.getMaxTriples(a), i* i +(testCase-1)*a[i], "getMax(a[1]) = " + GetMaxTriples.getMaxTriples(a) + ", getMax(a[2]) = " + GetMaxTriples.getMaxTriples(a)); //TODO(dwj) why is this case?

            }
            int m = ((0 >= GetMaxTriples.getMaxTriples(a[i]))?GetMaxTriples.getMaxTriples(a):GetMaxTriples.getMaxTriples(a));
            assertEquals(m, GetMaxTriples.getMaxTriples(a), i* i +(testCase-1)*a[i], (testCase==0? "getMax() should be equal to" : "getMax() should not be equal to") + " getMax(a[" + i + "]) = " + m );
            assertEquals(m, GetMaxTriples.getMaxTriples(a), i* i +(testCase==1? "getMax() should be lower " : "getMax() should be equal to") + " getMax(a[" + i + "]) = " + m );
            assertEquals(m, GetMaxTriples.getMaxTriples(a));


        }
    }
}

// [
        


