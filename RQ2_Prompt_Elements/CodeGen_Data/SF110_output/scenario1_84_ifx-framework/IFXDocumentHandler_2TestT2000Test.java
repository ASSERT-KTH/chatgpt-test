// IFXDocumentHandler_2Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains one unit test case for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {
// IFXDocumentHandler.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;

/**
 * The IFXDocumentHandler provides methods for formatting and validating
 * IFX XML Documents.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.2 $
 */
public class IFXDocumentHandler {

    public static Document read(InputStream istream, boolean validate, Map validationProperties) throws IFXException {
        SAXBuilder builder = null;
        if (validate) {
            builder = new SAXBuilder("org.apache.xerces.parsers.SAXParser", true);
            builder.setFeature("http://apache.org/xml/features/validation/schema", true);
            if (validationProperties!= null) {
                Iterator propIter = validationProperties.keySet().iterator();
                StringBuffer buf = new StringBuffer();
                int i = 0;
                while (propIter.hasNext()) {
                    String key = (String) propIter.next();
                    String value = (String) validationProperties.get(key);
                    if (i > 0) {
                        buf.append(" ");
                    }
                    buf.append(key).append(" ").append(value);
                    i++;
                }
                builder.setProperty("http://apache.org/xml/properties/schema/external-schemaLocation", buf.toString());
            }
        } else {
            builder = new SAXBuilder();
        }
        Document doc = null;
        try {
            doc = builder.build(istream);
        } catch (Exception e) {
            throw new IFXException("Error reading Document", e);
        }
        return doc;
    }
}

// IFXDocumentHandler_2Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains one unit test case for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {
		private static String BASE_VERSION = Configuration.BASE_VERSION;
		
		@Test
		public void readXML() throws IOException {
			if (Configuration.IS_VERSION_2) {
				Configuration.isVersion(2);
				Configuration.SCHEMA_LOCATION = Configuration.SCHEMA_URL;
				assertEquals(BASE_VERSION, Configuration.getBaseVersion());
			}
			InputStream irstream = Configuration.class.getResourceAsStream("IFXschema_1.0_schema.xsd");
			Document document = read(irstream);
			XMLOutputter docOut = new XMLOutputter();
			OutputStream dostream = Configuration.class.getResourceAsStream("IFXschema_1.0_doc.xml");
			try {
				docOut.write(document, dostream);
			} catch (IOException e) {
				dostream.close();
				assertTrue(false);
			}
		}
	}
}