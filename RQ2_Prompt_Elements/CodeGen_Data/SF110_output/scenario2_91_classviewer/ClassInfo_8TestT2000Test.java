// ClassInfo_8Test.java
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
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
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
     * Searches through found methods and returns method at given
     * position, uses anonymous inner class.  If no methods
     * have been searched for it returns null.
     *
     * @param pos position of found methods in array 0 is first.
     * @return MethodData object with information about method
     */
    public MethodData getFoundMethod(final int pos) {
        if (fndMethods == null || pos > fndMethods.length)
            return null;
        return new MethodData() {

            //check to make sure position isn't out of range
            String tempStr = fndMethods[pos], tempStr2;

            String className, methodName;

            int begin, end;

            Class methClass;

            {
                end = tempStr.indexOf(")");
                tempStr = tempStr.substring(0, end + 1);
                begin = tempStr.lastIndexOf(" ");
                tempStr = tempStr.substring(begin + 1, tempStr.length());
                begin = tempStr.indexOf("(");
                end = tempStr.lastIndexOf(".", begin);
                className = tempStr.substring(0, end);
                methodName = tempStr.substring(end + 1, tempStr.length());
                if (debug)
                    System.out.println("className=" + className);
                methClass = ClassInfo.tryClass(className);
                if (debug)
                    System.out.println("methClass=" + methClass);
            }

            public String getMethPackage() {
                if (methClass == null)
                    return null;
                return methClass.getPackage()!= null? methClass.getPackage().getName() : null;
            }

            public String getMethClass() {
                if (methClass == null)
                    return null;
                return methClass.getName();
            }

            public String getMethName() {
                return methodName;
            }
        };
    }
}

// ClassInfo_8Test.java
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
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
		private final static ClassInfo[] CLASS = new ClassInfo[4];
		private final static int[] METHOD = {0, 1, 2, 3};
		static {
			for (int i = 0; i < 4; i++)
				CLASS[i] = new ClassInfo();
		}
		private final static int INNER = 0;
		private final static int FIELD = 1;
		private final static int OUTER = 2;
	
		@Test
		void test1() {
			
			assertNotNull(CLASS);  // test null class  should throw NPE
			for (ClassInfo ci : CLASS) {
				assertNotNull(ci);
				assertNotNull(ci.getFoundMethod());
				
				if (ci.getMethClass().equals("ClassInfo")) {
                    Object v = ci.getFoundMethod(0);
					System.out.println("C1 = " + v);
					
				} else if (ci.getMethClass().equals("MethodInfo")) {
                    Object v = ci.getFoundMethod(0);
					System.out.println("C1 = " + v);
					
				} else if (ci.getMethClass().equals("OuterClass")) {
                    Object v = ci.getFoundMethod(0);
					System.out.println("C1 = " + v);
					
				}
				System.out.println("CInfo = " + ci);
			}
		}
}
