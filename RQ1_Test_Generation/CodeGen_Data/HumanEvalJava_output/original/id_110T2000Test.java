// ExchangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains one unit test case for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
// Exchange.java
package original;

import java.util.List;

class Exchange {

    /**
     * In this problem, you will implement a function that takes two lists of numbers,
     * and determines whether it is possible to perform an exchange of elements
     * between them to make lst1 a list of only even numbers.
     * There is no limit on the number of exchanged elements between lst1 and lst2.
     * If it is possible to exchange elements between the lst1 and lst2 to make
     * all the elements of lst1 to be even, return "YES".
     * Otherwise, return "NO".
     * For example:
     * exchange([1, 2, 3, 4], [1, 2, 3, 4]) => "YES"
     * exchange([1, 2, 3, 4], [1, 5, 3, 4]) => "NO"
     * It is assumed that the input lists will be non-empty.
     *
     * > exchange([1, 2, 3, 4], [1, 2, 3, 4])
     * "YES"
     * > exchange([1, 2, 3, 4], [1, 5, 3, 4])
     * "NO"
     * > exchange([1, 2, 3, 4], [2, 1, 4, 3])
     * "YES"
     * > exchange([5, 7, 3], [2, 6, 4])
     * "YES"
     * > exchange([5, 7, 3], [2, 6, 3])
     * "NO"
     * > exchange([3, 2, 6, 1, 8, 9], [3, 5, 5, 1, 1, 1])
     * "NO"
     * > exchange([100, 200], [200, 200])
     * "YES"
     */
    public static String exchange(List<Integer> lst1, List<Integer> lst2) {
        int count = 0;
        for (int i = 0; i < lst1.size(); i++) {
            if (lst1.get(i) % 2!= 0) {
                count++;
            }
        }
        for (int i = 0; i < lst2.size(); i++) {
            if (lst2.get(i) % 2 == 0) {
                count--;
            }
        }
        if (count <= 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

// ExchangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains one unit test case for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
		@Test
        public void test_2_of_5() {
		  final List<Integer> _list = Util.list(1, 2, 3, 4, 5, 6, 7, 8);
		  assertEquals("Exchange([1, 2, 3, 4, 5, 6, 7, 8], [1, 2, 3, 4, 5, 6, 7, 8])", exchange(_list, _list).toString());
        }

        @Test
        public void test_2_of_8() {
		  final List<Integer> _list = Util.list(1, 4, 8);
		  assertEquals("Exchange([" + _list.toString() + "], [" + _list.toString() + "])", exchange(_list, _list).toString());
        }

        @Test
        public void test_2_of_8_with_2() {
		  final List<Integer> _list_1 = Util.list(4, 9, 18);
		  final List<Integer> _list_2 = Util.list(15, 9, 18, 5, 18);
		  assertEquals("Exchange([1, 2], [" + _list_1.toString() + "," + _list_2.toString() + "])", exchange(_list_1, _list_2).toString());
        }

        @Test
        public void test_with_only_evens_lst1_to_lst2() {
		  final List<Integer> _list_1 = Util.list(1, 4, 5, 5, 6, 3);
		  final List<Integer> _list_2 = Util.list(2, 6, 3, 4, 5, 6, 3, 7);
		  final List<Integer> _list_3 = Util.list(8, 5, 2);
		  final List<Integer> _list_4 = Util.list(8, 2);
		  assertEquals("Exchange([" + _list_1.toString() + "], [" + _list_2.toString() + "])", exchange(_list_1, _list_2).toString());
		  assertEquals("Exchange([1, 2], [" + _list_3.toString() + "])", exchange(_list_1, _list_3).toString());
		  assertEquals("Exchange([" + _list_2.toString() + "], [" + _list_4.toString() + "])", exchange(_list_2, _list_4).toString());
        }

        private static final String EXPECTED = "#exchange([1, 2], [1, 2])";
        public static final String _exchange = EXPECTED;

        @Test
        public void test_without_lst1_lst2_when_single_element_exchange() {
            assertEquals("UNEXPECTED#exchange([2, 4, 9, 5, 8, 18], [1, 2])", _exchange);
        }

        @Test
        public void test_without_lst1_list_when_single_element_exchange() {
            assertEquals("UNEXPECTED#exchange([" + _exchange + "], [1, 2])", _exchange);
        }

        public static final String _exchange_list = "exchange([" +_exchange + "], [" + _exchange + "])";
        @Test
        public void test_without_list_when_single_element_exchange() {
            assertEquals("UNEXPECTED#exchange([1, 2], [1, 2])", _exchange_list);
        }

  private static final String _toString = "UNEXPECTED#toString()";
        @Test
        public void test_with_no_exchanges_when_single_element_exchange() {
            assertEquals(_toString + "#exchange([" + _toString + "], [" +_toString + "])", _exchange_list);
        }

        @Test
        public void test_with_only_evens_element_exchange_when_single_element_exchange() {
            assertEquals(_toString + "#exchange([1, 2], [" + _toString + "])", _exchange_list);
        }


}
