// ASTNode_1Test.java
package com.soops.CEN4010.JMCA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.tree.DefaultMutableTreeNode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ASTNode}.
 * It contains ten unit test cases for the {@link ASTNode#getTree(String)} method.
 */
class ASTNode_1Test {

    /**
     * Test case for reading a valid ASTNode from a file.
     */
    @Test
    void testGetTree_valid() {
        // Create a sample ASTNode and save it to a file
        ASTNode node = new ASTNode("type", "identity", null);
        node.addChild(new ASTNode("type2", "identity2", node));
        node.dump("test.ast");

        // Read the ASTNode from the file and compare it to the original
        ASTNode readNode = ASTNode.getTree("test.ast");
        assertEquals(node, readNode);

        // Clean up the test file
        File file = new File("test.ast");
        file.delete();
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file does not exist.
     */
    @Test
    void testGetTree_fileNotFound() {
        // Attempt to read an ASTNode from a non-existent file
        ASTNode node = ASTNode.getTree("nonexistent.ast");

        // Verify that the returned node is null
        assertNull(node);
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file is empty.
     */
    @Test
    void testGetTree_emptyFile() {
        // Create an empty file
        File file = new File("empty.ast");
        try {
            file.createNewFile();
        } catch (Exception e) {
            fail("Failed to create empty file.");
        }

        // Attempt to read an ASTNode from the empty file
        ASTNode node = ASTNode.getTree("empty.ast");

        // Verify that the returned node is null
        assertNull(node);

        // Clean up the test file
        file.delete();
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file contains an object that is not an ASTNode.
     */
    @Test
    void testGetTree_invalidObject() {
        // Create a sample object and save it to a file
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("invalid.ast"));
            out.writeObject(list);
            out.close();
        } catch (Exception e) {
            fail("Failed to create invalid file.");
        }

        // Attempt to read an ASTNode from the invalid file
        ASTNode node = ASTNode.getTree("invalid.ast");

        // Verify that the returned node is null
        assertNull(node);

        // Clean up the test file
        File file = new File("invalid.ast");
        file.delete();
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file contains an ASTNode with a null parent.
     */
    @Test
    void testGetTree_nullParent() {
        // Create a sample ASTNode with a null parent and save it to a file
        ASTNode node = new ASTNode("type", "identity", null);
        node.addChild(new ASTNode("type2", "identity2", null));
        node.dump("nullParent.ast");

        // Attempt to read the ASTNode from the file
        ASTNode readNode = ASTNode.getTree("nullParent.ast");

        // Verify that the returned node is null
        assertNull(readNode);

        // Clean up the test file
        File file = new File("nullParent.ast");
        file.delete();
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file contains an ASTNode with a null type.
     */
    @Test
    void testGetTree_nullType() {
        // Create a sample ASTNode with a null type and save it to a file
        ASTNode node = new ASTNode(null, "identity", null);
        node.addChild(new ASTNode("type2", "identity2", node));
        node.dump("nullType.ast");

        // Attempt to read the ASTNode from the file
        ASTNode readNode = ASTNode.getTree("nullType.ast");

        // Verify that the returned node is null
        assertNull(readNode);

        // Clean up the test file
        File file = new File("nullType.ast");
        file.delete();
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file contains an ASTNode with a null identity.
     */
    @Test
    void testGetTree_nullIdentity() {
        // Create a sample ASTNode with a null identity and save it to a file
        ASTNode node = new ASTNode("type", null, null);
        node.addChild(new ASTNode("type2", "identity2", node));
        node.dump("nullIdentity.ast");

        // Attempt to read the ASTNode from the file
        ASTNode readNode = ASTNode.getTree("nullIdentity.ast");

        // Verify that the returned node is null
        assertNull(readNode);

        // Clean up the test file
        File file = new File("nullIdentity.ast");
        file.delete();
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file contains an ASTNode with a child that has a null type.
     */
    @Test
    void testGetTree_childNullType() {
        // Create a sample ASTNode with a child that has a null type and save it to a file
        ASTNode node = new ASTNode("type", "identity", null);
        node.addChild(new ASTNode(null, "identity2", node));
        node.dump("childNullType.ast");

        // Attempt to read the ASTNode from the file
        ASTNode readNode = ASTNode.getTree("childNullType.ast");

        // Verify that the returned node is null
        assertNull(readNode);

        // Clean up the test file
        File file = new File("childNullType.ast");
        file.delete();
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file contains an ASTNode with a child that has a null identity.
     */
    @Test
    void testGetTree_childNullIdentity() {
        // Create a sample ASTNode with a child that has a null identity and save it to a file
        ASTNode node = new ASTNode("type", "identity", null);
        node.addChild(new ASTNode("type2", null, node));
        node.dump("childNullIdentity.ast");

        // Attempt to read the ASTNode from the file
        ASTNode readNode = ASTNode.getTree("childNullIdentity.ast");

        // Verify that the returned node is null
        assertNull(readNode);

        // Clean up the test file
        File file = new File("childNullIdentity.ast");
        file.delete();
    }

    /**
     * Test case for reading an invalid ASTNode from a file.
     * The file contains an ASTNode with a child that has a null parent.
     */
    @Test
    void testGetTree_childNullParent() {
        // Create a sample ASTNode with a child that has a null parent and save it to a file
        ASTNode node = new ASTNode("type", "identity", null);
        node.addChild(new ASTNode("type2", "identity2", null));
        node.dump("childNullParent.ast");

        // Attempt to read the ASTNode from the file
        ASTNode readNode = ASTNode.getTree("childNullParent.ast");

        // Verify that the returned node is null
        assertNull(readNode);

        // Clean up the test file
        File file = new File("childNullParent.ast");
        file.delete();
    }

    /**
     * Test case for creating a swing tree structure from an ASTNode.
     */
    @Test
    void testCreateTree() {
        // Create a sample ASTNode
        ASTNode node = new ASTNode("type", "identity", null);
        node.addChild(new ASTNode("type2", "identity2", node));

        // Create a swing tree structure from the ASTNode
        DefaultMutableTreeNode tree = node.createTree();

        // Verify that the tree structure has the correct root and child nodes
        assertEquals("type :: identity", tree.getUserObject().toString());
        assertEquals("type2 :: identity2", tree.getChildAt(0).getUserObject().toString());
    }
}