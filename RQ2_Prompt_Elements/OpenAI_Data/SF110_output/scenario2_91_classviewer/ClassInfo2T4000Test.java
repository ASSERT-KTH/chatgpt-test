// ClassInfoTest.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {

		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has no public methods.
		*/
		@Test
		void testPrintMethods1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] data = ci.printMethods(0);
				assertNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods2() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods3() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods4() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods5() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods6() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods7() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods8() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods9() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods10() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
}

// ClassInfo.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;

/**
 * Obtains the interfaces as well as the public constructors, methods
 * and fields from a Class object.
 * <p>
 * This class is for obtaining data and handling.
 *
 * @author James Harris
 * @version 2.0a
 */
public class ClassInfo {

    /**
     * Returns an array of strings that contain the public methods for
     * the class excluding inherited methods. The data is pulled from
     * the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @param param (not currently implemented) selects whether inherited
     *               objects are returned
     * @return string array of public methods
     */
    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.') != -1)
                tempList.add(cMethods[i]);
        }
        if (!tempList.isEmpty())
            data = tempList.toArray();
        else
            data = null;
        if (debug && data == null)
            System.out.println("No public methods.");
        else {
            printArray(data);
        }
        return data;
    }
}

// ClassInfoTest.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has no public methods.
		*/
		@Test
		void testPrintMethods1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] data = ci.printMethods(0);
				assertNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods2() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods3() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods4() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods5() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods6() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods7() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods8() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods9() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods10() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
}

// ClassInfo.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;

/**
 * Obtains the interfaces as well as the public constructors, methods
 * and fields from a Class object.
 * <p>
 * This class is for obtaining data and handling.
 *
 * @author James Harris
 * @version 2.0a
 */
public class ClassInfo {

    /**
     * Returns an array of strings that contain the public methods for
     * the class excluding inherited methods. The data is pulled from
     * the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @param param (not currently implemented) selects whether inherited
     *               objects are returned
     * @return string array of public methods
     */
    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.') != -1)
                tempList.add(cMethods[i]);
        }
        if (!tempList.isEmpty())
            data = tempList.toArray();
        else
            data = null;
        if (debug && data == null)
            System.out.println("No public methods.");
        else {
            printArray(data);
        }
        return data;
    }
}

// ClassInfoTest.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has no public methods.
		*/
		@Test
		void testPrintMethods1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] data = ci.printMethods(0);
				assertNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods2() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods3() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods4() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods5() {
				ClassInfo ci = new ClassInfo(StringList.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
	