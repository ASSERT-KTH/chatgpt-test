// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import org.junit.jupiter.api.Test;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.jdom.Element;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IFXEncoder}.
 * It contains ten unit test cases for the {@link IFXEncoder#encode(IFXObject)} method.
 */
class IFXEncoderTest {

    @Test
    void testEncodeWithNullObject() {
        IFXEncoder encoder = new IFXEncoder();
        assertThrows(IFXException.class, () -> encoder.encode(null));
    }

    @Test
    void testEncodeWithInvalidObject() {
        IFXEncoder encoder = new IFXEncoder();
        assertThrows(IFXException.class, () -> encoder.encode(new Object()));
    }

    @Test
    void testEncodeWithValidObject() throws IFXException {
        IFXEncoder encoder = new IFXEncoder();
        Element element = encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return "Value1"; }
            public String getElement2() { return "Value2"; }
        });
        assertNotNull(element);
        assertEquals("IFXObject", element.getName());
        assertEquals("Value1", element.getChild("Element1", Namespace.NO_NAMESPACE).getText());
        assertEquals("Value2", element.getChild("Element2", Namespace.NO_NAMESPACE).getText());
    }

    @Test
    void testEncodeWithValidObjectAndNamespace() throws IFXException {
        IFXEncoder encoder = new IFXEncoder("ifx", "http://www.example.com/ifx");
        Element element = encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return "Value1"; }
            public String getElement2() { return "Value2"; }
        });
        assertNotNull(element);
        assertEquals("IFXObject", element.getName());
        assertEquals("Value1", element.getChild("Element1", Namespace.getNamespace("http://www.example.com/ifx")).getText());
        assertEquals("Value2", element.getChild("Element2", Namespace.getNamespace("http://www.example.com/ifx")).getText());
    }

    @Test
    void testEncodeWithValidObjectAndNullNamespacePrefix() throws IFXException {
        IFXEncoder encoder = new IFXEncoder(null, "http://www.example.com/ifx");
        Element element = encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return "Value1"; }
            public String getElement2() { return "Value2"; }
        });
        assertNotNull(element);
        assertEquals("IFXObject", element.getName());
        assertEquals("Value1", element.getChild("Element1", Namespace.getNamespace("http://www.example.com/ifx")).getText());
        assertEquals("Value2", element.getChild("Element2", Namespace.getNamespace("http://www.example.com/ifx")).getText());
    }

    @Test
    void testEncodeWithValidObjectAndMissingResourceBundle() throws IFXException {
        IFXEncoder encoder = new IFXEncoder();
        Element element = encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return "Value1"; }
            public String getElement2() { return "Value2"; }
        });
        assertNotNull(element);
        assertEquals("IFXObject", element.getName());
        assertNull(element.getChild("Element1", Namespace.NO_NAMESPACE));
        assertNull(element.getChild("Element2", Namespace.NO_NAMESPACE));
    }

    @Test
    void testEncodeWithValidObjectAndEmptyResourceBundle() throws IFXException {
        IFXEncoder encoder = new IFXEncoder();
        Element element = encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return "Value1"; }
            public String getElement2() { return "Value2"; }
        });
        assertNotNull(element);
        assertEquals("IFXObject", element.getName());
        assertNull(element.getChild("Element1", Namespace.NO_NAMESPACE));
        assertNull(element.getChild("Element2", Namespace.NO_NAMESPACE));
    }

    @Test
    void testEncodeWithValidObjectAndMissingElementName() {
        IFXEncoder encoder = new IFXEncoder();
        assertThrows(IFXException.class, () -> encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return "Value1"; }
            public String getElement2() { return "Value2"; }
        }));
    }

    @Test
    void testEncodeWithValidObjectAndNullElementValue() throws IFXException {
        IFXEncoder encoder = new IFXEncoder();
        Element element = encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return null; }
            public String getElement2() { return "Value2"; }
        });
        assertNotNull(element);
        assertEquals("IFXObject", element.getName());
        assertNull(element.getChild("Element1", Namespace.NO_NAMESPACE));
        assertEquals("Value2", element.getChild("Element2", Namespace.NO_NAMESPACE).getText());
    }

    @Test
    void testEncodeWithValidObjectAndArrayElementValue() throws IFXException {
        IFXEncoder encoder = new IFXEncoder();
        Element element = encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return "Value1"; }
            public IFXObject[] getElement2() {
                return new IFXObject[] {
                        new IFXObject() {
                            public static final String[] ELEMENTS = {"SubElement1", "SubElement2"};
                            public String[] getElements() { return ELEMENTS; }
                            public String getSubElement1() { return "SubValue1"; }
                            public String getSubElement2() { return "SubValue2"; }
                        },
                        new IFXObject() {
                            public static final String[] ELEMENTS = {"SubElement1", "SubElement2"};
                            public String[] getElements() { return ELEMENTS; }
                            public String getSubElement1() { return "SubValue3"; }
                            public String getSubElement2() { return "SubValue4"; }
                        }
                };
            }
        });
        assertNotNull(element);
        assertEquals("IFXObject", element.getName());
        assertEquals("Value1", element.getChild("Element1", Namespace.NO_NAMESPACE).getText());
        assertEquals("SubValue1", element.getChild("Element2", Namespace.NO_NAMESPACE).getChild("SubElement1", Namespace.NO_NAMESPACE).getText());
        assertEquals("SubValue2", element.getChild("Element2", Namespace.NO_NAMESPACE).getChild("SubElement2", Namespace.NO_NAMESPACE).getText());
        assertEquals("SubValue3", element.getChild("Element2", Namespace.NO_NAMESPACE).getChild("SubElement1", Namespace.NO_NAMESPACE).getText());
        assertEquals("SubValue4", element.getChild("Element2", Namespace.NO_NAMESPACE).getChild("SubElement2", Namespace.NO_NAMESPACE).getText());
    }

    @Test
    void testEncodeWithValidObjectAndSingleElementValue() throws IFXException {
        IFXEncoder encoder = new IFXEncoder();
        Element element = encoder.encode(new IFXObject() {
            public static final String[] ELEMENTS = {"Element1", "Element2"};
            public String[] getElements() { return ELEMENTS; }
            public String getElement1() { return "Value1"; }
            public IFXObject getElement2() {
                return new IFXObject() {
                    public static final String[] ELEMENTS = {"SubElement1", "SubElement2"};
                    public String[] getElements() { return ELEMENTS; }
                    public String getSubElement1() { return "SubValue1"; }
                    public String getSubElement2() { return "SubValue2"; }
                };
            }
        });
        assertNotNull(element);
        assertEquals("IFXObject", element.getName());
        assertEquals("Value1", element.getChild("Element1", Namespace.NO_NAMESPACE).getText());
        assertEquals("SubValue1", element.getChild("Element2", Namespace.NO_NAMESPACE).getChild("SubElement1", Namespace.NO_NAMESPACE).getText());
        assertEquals("SubValue2", element.getChild("Element2", Namespace.NO_NAMESPACE).getChild("SubElement2", Namespace.NO_NAMESPACE).getText());
    }
}