// HistogramTest.java
package original;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains one unit test case for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {
/**
		* Given a string representing a space separated lowercase letters, return a dictionary
		* of the letter with the most repetition and containing the corresponding count.
        * If several letters have the same occurrence, return all of them.
        * @param test a string representing a space separated lowercase letters, as a real
        * data set.
        * @return the map of the letters with a space and occurrence of the count
        */
	public static Map<String, Integer> histogram(String test) {
		String testWithCount = "";
		String[] arr = test.split(" ");
		if (arr.length == 0) {
			return new HashMap<>();
		}
		int count = 1;
		String testItem = null;
		for (int i = 0; i < arr.length; i++) {
			testItem = String.valueOf(arr[i]);
			int oldCount = testItem.length() == 0? 0 : Integer.parseInt(String.valueOf(testItem));
			testItem = String.valueOf(arr[i]);
			String testTemp = testItem;
			String test1 = String.valueOf(testItem);
			if (i > 0 && i < arr.length - 1 && (result.containsKey(testTemp) == result.get(testTemp))) {
				result.put(testTemp, Integer.parseInt(testTemp) + oldCount);
				count++;
				continue;
			}
			result.put(testTemp, Integer.parseInt(testTemp) + oldCount);
			testItem = test1;
			String test2 = String.valueOf(test1);
			if (i == arr.length - 1 && i > 0 && (result.containsKey(test2) == result.get(test2))) {
				result.put(testTemp, Integer.parseInt(testTemp));
				count++;
				continue;
			}
			result.put(testTemp, Integer.parseInt(testTemp));
			test2 = test1;
		}
	//	System.out.println("Test with key "+test);
		int countTested = Integer.parseInt(testWithCount);
		int countInUse = Integer.parseInt(String.valueOf(testWithCount));
		int largestCount = Integer.MAX_VALUE;

		// find the largest count
		for (int i = 0; i < testWithCount.length(); i++) {
			i++;
			if (result.containsKey(testWithCount.charAt(i))) {
				largestCount = result.get(testWithCount.charAt(i));
			}
		}
		if (this.checkCounted(testWithCount.length(), countTested, 0, countInUse, largestCount, testWithCount, count) == false) {
			// this is not a correct test
			return new HashMap<>();
		}

		return result;
	}

//	boolean checkCounted(int keyStart, int keyEnd, int totalKey, int count, String value) {
//		if (keyEnd >= countTested) {
//			if (keyEnd == result.get(value) || (totalKey >= keyStart)) {
//				return false;
//			}
//		}
//		if (keyEnd - keyStart > count) {
//			return false;
//		}
//		if (totalKey < keyStart) {
//			return false;
//		}
//		return true;
//	}

//	void check(int count, String value) {
//		if (count >= countTested || value == null) {
//			fail("Not a correct test. Value is null, count: "+count+" is:"+countTested+". value:"+value);
//		}
//		String value2 = String.valueOf(value);
//	//	if (totalKey == result.size()) {
//	//	//	System.out.println("Found the value: " + value + ", " + keyStart + ".." + (keyEnd-1) + ", count:"+ count);
//	//	} else {
//	//	//	System.out.println("Expected result size:"+ result.size());
//	//	}
//	}
}

