// ApplicationConfiguration_0Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ApplicationConfiguration}.
 * It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainModel()} method.
 */
class ApplicationConfiguration_0Test {

    /**
     * Test case to verify that the JTailMainModel instance is not null.
     */
    @Test
    void testJTailMainModelNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertNotNull(model);
    }

    /**
     * Test case to verify that the JTailMainModel instance is a singleton.
     */
    @Test
    void testJTailMainModelSingleton() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertSame(model1, model2);
    }

    /**
     * Test case to verify that the JTailMainModel instance is not a prototype.
     */
    @Test
    void testJTailMainModelNotPrototype() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model1 = configuration.jTailMainModel();
        JTailMainModel model2 = configuration.jTailMainModel();
        assertNotSame(model1, model2.clone());
    }

    /**
     * Test case to verify that the JTailMainModel instance is not a proxy.
     */
    @Test
    void testJTailMainModelNotProxy() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertFalse(model instanceof org.springframework.aop.framework.Proxy);
    }

    /**
     * Test case to verify that the JTailMainModel instance is not a CGLIB proxy.
     */
    @Test
    void testJTailMainModelNotCglibProxy() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertFalse(model.getClass().getName().contains("$$"));
    }

    /**
     * Test case to verify that the JTailMainModel instance is not a JDK dynamic proxy.
     */
    @Test
    void testJTailMainModelNotJdkDynamicProxy() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertFalse(java.lang.reflect.Proxy.isProxyClass(model.getClass()));
    }

    /**
     * Test case to verify that the JTailMainModel instance is not a scoped proxy.
     */
    @Test
    void testJTailMainModelNotScopedProxy() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertFalse(org.springframework.aop.scope.ScopedProxyUtils.isScopedTarget(model));
    }

    /**
     * Test case to verify that the JTailMainModel instance is not a lazy proxy.
     */
    @Test
    void testJTailMainModelNotLazyProxy() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertFalse(org.springframework.aop.framework.Advised.class.isAssignableFrom(model.getClass()));
    }

    /**
     * Test case to verify that the JTailMainModel instance is not a circular reference.
     */
    @Test
    void testJTailMainModelNotCircularReference() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertFalse(org.springframework.aop.framework.CircularReferenceException.class.isAssignableFrom(model.getClass()));
    }

    /**
     * Test case to verify that the JTailMainModel instance is not a null object.
     */
    @Test
    void testJTailMainModelNotNullObject() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainModel model = configuration.jTailMainModel();
        assertNotNull(model.toString());
    }
}