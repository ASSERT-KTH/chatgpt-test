// SkjkasdkdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains one unit test case for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {
static boolean isPrime(int n) {
			if (n == 1) {
				return true;
			}
			if(isPrime(n/2)){
				return true;
			}
			return false;
		}
		@Test
		public void test1() {
			System.out.println("skjkasdkd Test 1");
			List<Integer> list = new Skjkasdkd().skjkasdkd(new int[] {8191 });
			System.out.println("List result: " + list + "; count: " + list.size());
			List<Integer> result = new Skjkasdkd().skjnasdkd(2);//2
			assertEquals(result.size(), list.size() - 2);//+1
			System.out.println(result);
		}
		@Test
		public void test2() {
			System.out.println("skjkasdkd Test 2");
			List<Integer> list = new Skjkasdkd().skjkasdkd(new int[] {8191 });
			List<Integer> result = new Skjkasdkd().skjnasdkd(1);//1
			assertEquals(result.size(), list.size());

		}
		@Test
		public void test3() {
			System.out.println("skjkasdkd Test 3");
			List<Integer> list = new Skjkasdkd().skjkasdkd(new int[] {8191 });
			System.out.println("List result: " + list + "; count: " + list.size());
			List<Integer> result = new Skjkasdkd().skjnasdkd(2);//2
			assertEquals(list.size(), new Skjkasdkd().skjnasdkd(result).size());//2
			System.out.println(result);
		}
	}
