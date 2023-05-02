// TriangleArea1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains one unit test case for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {
/**
		 * A unit test case for {@link TriangleArea1#triangleArea(int, int, int)} method.
		 */
			public void testTriangleArea(
						/** The number of sides of the triangle. */
										int sides,
						/** The lengths of the three sides of the triangle. */
										int lengths,
						/** The sum of all sides of the triangle. */
										int sum,
						/** The area of the triangle rounded to 2 decimal points. */
										Number area,
						/** The area rounded to 2 decimal points. */
										Number roundedArea,
						/** An array to store test cases. */
									long [][] testCases
				) {
				String [] nameValue = new String[] {"Number", "Lengths", "Area"};
				for (int tc = 0; tc < testCases.length; tc++) {
					if (testCases[tc][1] == lengths) {
						for (int index = 0; index < testCases[tc][0]; index++) {
							if (testCases[tc][2] == 1) this.test(nameValue[0], testCases[tc][2], area.doubleValue(), sum + index, roundedArea.doubleValue());
							else if (testCases[tc][2] == -1) this.test(nameValue[0], testCases[tc][2], index, sum, roundedArea.doubleValue());
							else this.test(nameValue[0], testCases[tc][2], area.doubleValue() + index * 100.0, sum + index, roundedArea.doubleValue() * 100.0);
						}
					}
				}
			}

			/**
			 * Tests {@link TriangleArea1#triangleArea(int, int, int)} method.
			 * @param name The name of this test case
			 * @param iArg One argument of the function
			 * @param iArea The area of the triangle
			 * @param iSum The sum of all sides of the triangle
			 * @param iTotal The total sum of the all sides of the triangle
			 * @param iRounded The area rounded to 2 decimal points
			 */
			static void test(String name, Number iValue, double iSum, double iTotal, double iRounded) {
				String testName = name + "(" + iValue + ",\t" + iSum + ",\t" + iTotal + ",\t" + iRounded + ")";
				assertEquals("Error in " + testName, iValue.doubleValue(), triangleArea(iValue.intValue(), iSum.intValue(), iTotal.intValue()), 1e-6);
				// assertEquals("Error in " + testName, iValue.doubleValue(), iRounded, 1e-6);
			}

			/** test cases. */
			static String testValue[] = {
			// Number   Length   Area  Sum   Total   Rounded Area
			// 1      3         2       50	   2       1.5
			"1", "2", "50", "2", "0.5"};
			/**
			 * Tests {@link TriangleArea1#triangleArea(int, int, int)} method.
			 * @param numberOne One argument of the function
			 * @param numberTwo Two argument of the function
			 * @param totalNumber One argument of the function
			 * @param sum The sum of all sides of the triangle
			 * @param roundedArea The area rounded to 2 decimal points
			 */
			static void test(int numberOne, int numberTwo, int totalNumber, int sum, double roundedArea) {
				double p = triangleArea(numberOne, numberTwo, totalNumber);
				if (roundedArea!= 0) assertEquals(
						"Error in " + testValue[1],
						roundedArea,
						p,
						2
				);
				assertEquals(
						"Error in " + testValue[1],
						roundedArea * 0.5,
						p,
						0.5
				);
				assertEquals(
						"Error in " + testValue[0],
						roundedArea * sum,
						p,
						sum,
						totalNumber
				);
			}
}
