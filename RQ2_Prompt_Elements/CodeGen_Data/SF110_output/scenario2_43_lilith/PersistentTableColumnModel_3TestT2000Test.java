// PersistentTableColumnModel_3Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersistentTableColumnModel}.
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_3Test {
// PersistentTableColumnModel.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/**
 * This class is based on code and ideas from Stephen Kelvin (mail at StephenKelvin.de) and Thomas Darimont.
 */
public class PersistentTableColumnModel extends DefaultTableColumnModel {

    /**
     * Returns the position of the first column whose identifier equals <code>identifier</code>.
     * Position is the the index in all visible columns if <code>onlyVisible</code> is true or
     * else the index in all columns.
     *
     * @return the index of the first column whose identifier
     *         equals <code>identifier</code>
     * @throws IllegalArgumentException if <code>identifier</code>
     *                                  is <code>null</code>, or if no
     *                                  <code>TableColumn</code> has this
     *                                  <code>identifier</code>
     * @param identifier the identifier object to search for
     * @param onlyVisible if set searches only visible columns
     * @see #getColumn
     */
    public int getColumnIndex(Object identifier, boolean onlyVisible) {
        if (identifier == null) {
            throw new IllegalArgumentException("Identifier is null");
        }
        List<TableColumn> columns = (onlyVisible? tableColumns : allTableColumns);
        int noColumns = columns.size();
        TableColumn column;
        for (int columnIndex = 0; columnIndex < noColumns; ++columnIndex) {
            column = columns.get(columnIndex);
            if (identifier.equals(column.getIdentifier())) {
                return columnIndex;
            }
        }
        throw new IllegalArgumentException("Identifier not found");
    }
}

// PersistentTableColumnModel_3Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersistentTableColumnModel}.
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_3Test {
		/**
	 * Test method with no visible columns.
	 */
	@Test
	void getColumnIndex_0_noVisColumns() {
		try {
			PersistentTableColumnModel model = new PersistentTableColumnModel();
			assertSame(model.getColumnCount(), 0);
		} catch (IllegalArgumentException e) {
			fail("Test method doesn't throw IllegalArgumentException");
		}
	}
}
// PersistentTableColumnModel_3Test.java