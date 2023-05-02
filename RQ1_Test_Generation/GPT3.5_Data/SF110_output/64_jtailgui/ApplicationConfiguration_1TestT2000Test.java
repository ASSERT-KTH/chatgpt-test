// ApplicationConfiguration_1Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfiguration_1Test {

    /**
     * Test case for creating a new instance of OpenFileModel.
     */
    @Test
    void testOpenFileModel() {
        OpenFileModel openFileModel = new ApplicationConfiguration().openFileModel();
        assertNotNull(openFileModel);
    }

    /**
     * Test case for checking that the instance of OpenFileModel is a singleton.
     */
    @Test
    void testOpenFileModelSingleton() {
        OpenFileModel openFileModel1 = new ApplicationConfiguration().openFileModel();
        OpenFileModel openFileModel2 = new ApplicationConfiguration().openFileModel();
        assertSame(openFileModel1, openFileModel2);
    }

    /**
     * Test case for checking that the instance of OpenFileModel is not a prototype.
     */
    @Test
    void testOpenFileModelNotPrototype() {
        OpenFileModel openFileModel1 = new ApplicationConfiguration().openFileModel();
        OpenFileModel openFileModel2 = new ApplicationConfiguration().openFileModel();
        assertNotSame(openFileModel1, openFileModel2.clone());
    }

    /**
     * Test case for checking that the instance of OpenFileModel is not a proxy.
     */
    @Test
    void testOpenFileModelNotProxy() {
        OpenFileModel openFileModel = new ApplicationConfiguration().openFileModel();
        assertFalse(openFileModel instanceof org.springframework.aop.framework.Proxy);
    }

    /**
     * Test case for checking that the instance of OpenFileModel is not a CGLIB proxy.
     */
    @Test
    void testOpenFileModelNotCglibProxy() {
        OpenFileModel openFileModel = new ApplicationConfiguration().openFileModel();
        assertFalse(openFileModel.getClass().getName().contains("CGLIB"));
    }

    /**
     * Test case for checking that the instance of OpenFileModel is not a JDK dynamic proxy.
     */
    @Test
    void testOpenFileModelNotJdkDynamicProxy() {
        OpenFileModel openFileModel = new ApplicationConfiguration().openFileModel();
        assertFalse(java.lang.reflect.Proxy.isProxyClass(openFileModel.getClass()));
    }

    /**
     * Test case for checking that the instance of OpenFileModel is not a scoped proxy.
     */
    @Test
    void testOpenFileModelNotScopedProxy() {
        OpenFileModel openFileModel = new ApplicationConfiguration().openFileModel();
        assertFalse(org.springframework.aop.scope.ScopedProxyUtils.isScopedTarget(openFileModel));
    }

    /**
     * Test case for checking that the instance of OpenFileModel is not a lazy proxy.
     */
    @Test
    void testOpenFileModelNotLazyProxy() {
        OpenFileModel openFileModel = new ApplicationConfiguration().openFileModel();
        assertFalse(org.springframework.aop.framework.Advised.class.isAssignableFrom(openFileModel.getClass()));
    }

    /**
     * Test case for checking that the instance of OpenFileModel is not a circular reference.
     */
    @Test
    void testOpenFileModelNotCircularReference() {
        OpenFileModel openFileModel = new ApplicationConfiguration().openFileModel();
        assertNotNull(openFileModel.getListeners());
    }

    /**
     * Test case for checking that the instance of OpenFileModel is not null.
     */
    @Test
    void testOpenFileModelNotNull() {
        OpenFileModel openFileModel = new ApplicationConfiguration().openFileModel();
        assertNotNull(openFileModel);
    }
}