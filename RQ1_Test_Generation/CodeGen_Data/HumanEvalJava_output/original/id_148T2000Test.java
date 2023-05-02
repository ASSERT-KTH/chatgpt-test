// BfTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains one unit test case for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
  private final String name;

        public BfTest(String name) {
            this.name = name;
        }

        @Test
        public void bfS1() {
				test(name, Bf.bf(name, name));
		}

		@Test
		public void bfS2() {
				test(name, Bf.bf("", name));
		}

		@Test
		public void bfS3() {
				test(name, Bf.bf("", ""));
		}

		@Test
		public void bfS4() {
				test(name, Bf.bf("", " "));
		}

		@Test
		public void bfS5() {
				test(name, Bf.bf(" ", ""));
		}

		@Test
		public void bfS6() {
				test(name, Bf.bf(" "," "));
		}

		@Test
		public void bfS7() {
				test(name, Bf.bf(" ","" ) );
		}

		@Test
		public void bfS8() {
				test(name, Bf.bf(", ", ""));
		}

		@Test
		public void bfS9() {
				test(name, "");
		}

		private void test(String planet1, String planet2) {
				assertTrue(Bf.bf(planet1, planet2)!= null);
		}

}
