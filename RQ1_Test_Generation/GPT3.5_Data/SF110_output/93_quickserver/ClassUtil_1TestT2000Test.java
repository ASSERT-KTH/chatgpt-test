// ClassUtil_1Test.java
package org.quickserver.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

/**
 * Test class of {@link ClassUtil}.
 * It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
 */
class ClassUtil_1Test {

    @Test
    void testGetClassLoaderFromJars() throws Exception {
        String jarDir = "test/jars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithInvalidDir() throws Exception {
        String jarDir = "invalid/dir";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithEmptyDir() throws Exception {
        String jarDir = "test/empty";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithNonJarFiles() throws Exception {
        String jarDir = "test/nonjars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithOneJar() throws Exception {
        String jarDir = "test/onejar";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithMultipleJars() throws Exception {
        String jarDir = "test/multiplejars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithDuplicateJars() throws Exception {
        String jarDir = "test/duplicatejars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithNestedJars() throws Exception {
        String jarDir = "test/nestedjars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithInvalidJars() throws Exception {
        String jarDir = "test/invalidjars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testLoadClass() throws Exception {
        String jarDir = "test/jars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        String[] classNames = {"org.quickserver.util.ClassUtil"};
        Map classMap = ClassUtil.loadClass(classLoader, classNames);
        assertNotNull(classMap);
        assertEquals(1, classMap.size());
        assertTrue(classMap.containsKey("org.quickserver.util.ClassUtil"));
    }
}