// IsSortedTest.java
package original;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains one unit test case for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {
@Test
		public void test() {
			String s = "ABCDEFGH;123;456;789;789;789;789\tABCDEFGH;123;456;789;789;789;789";
			System.out.println(isSorted(s));
			assertTrue(isSorted(s));
		}
}

/**
* Main class of JUnit and JDX.
* It contains all test case to be executed in this test suite.
*/
public class TestMain {
		@Test
		public void testIsSorted() {
			List<Object> testLst = new HashMap<>();
			Integer[] integers = new UnsupportedOperationException[0];
			HashMap<Integer, Integer> map = new HashMap<>();
			String[] stringList = new String [ 0];
			Object result;
			try {
				List<Integer> list = ArrayList.class.cast(Integer[].class).newInstance();
				result = testLst = list;
				map = new HashMap();
				strings = new String[0];
				assertResult(false);
			} catch (Exception e) {
			}
			assertResult(true);
			assertIndexOf(0, testLst);
			assertSameItems(testLst);
			assertTrue(testLst == list);
			assertSameItems(new List<Object>(testLst),result);
			assertEquals((int) testLst.get(0),stringList[0]);
			assertNotSameItems(testLst);
			testLst.add("0");
			strings = new String[2];
			strings[0] = "0";
			assertResult(true);
			testLst.add("1");
			strings[1] = "1";
			testLst.add("-5");
			strings[2] = "-5";
			assertResult(true);
			assertIndexOf(0, testLst);
			assertSameItems(testLst);
			assertTrue(testLst == list);
			assertSameItems(new List<Object>,result);
			assertEquals(strings[2],strings[2]);
			assertSameItems(new List<Object>(),list);
			assertIndexOf(1, testLst);
			assertSameItems(testLst);
			testLst.add("-2");
			assertResult(true);
			testLst.add("1");
			assertResult(true);
			testLst.add("-3");
			assertSameItems(testLst);
			testLst.set(0,Integer.valueOf(5));
			assertResult(true);
			testLst.add("1");
			assertResult(true);
			testLst.add("-5");
			assertSameItems(testLst);
			testLst.add("-8");
			testLst.add("-4");
			testLst.add("-1");
			testLst.add("0");
			testLst.add(Integer.valueOf(42));             // no duplicated
			assertSameItems(testLst);
			testLst.add(Integer.valueOf(18));             // adding
			testLst.add(Integer.valueOf(-19));             // adding
			testLst.add(Integer.valueOf(-8));            // adding
			testLst.add(Integer.valueOf(-4));            // adding
			testLst.add(Integer.valueOf(-1));            // adding
			testLst.add(Integer.valueOf(0));             // adding
			testLst.add(Integer.valueOf(1));             // adding
			testLst.add(Integer.valueOf(18));             // adding
			assertResult(true);
			try {
				testLst.get(0);
				fail("IllegalArgumentException expected");
			} catch (IllegalArgumentException e) {
				assertEquals("Cant Get Item 0 of List",e.getMessage());
			}
			try {
				testLst.add(0);
				fail("IllegalArgumentException expected");
			} catch (IllegalArgumentException e) {
				assertEquals("Cant Add Item 0 of List",e.getMessage());
			}
			try {
				testLst.set(0,0);
				fail("IllegalArgumentException expected");
			} catch (IllegalArgumentException e) {
				assertEquals("Cant Set Item 0 of List to 0",e.getMessage());
			}
			try {
				testLst.iterator();
				fail("NoSuchElementException expected");
			} catch (NoSuchElementException e) {
			}
			try {
				testLst.next();
				fail("NoSuchElementException expected");
			} catch (NoSuchElementException e) {
			}
			try {
				testLst.remove();
				fail("NoSuchElementException expected");