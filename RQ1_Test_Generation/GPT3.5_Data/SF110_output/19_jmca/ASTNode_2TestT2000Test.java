// ASTNode_2Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ASTNode}.
 * It contains ten unit test cases for the {@link ASTNode#createTree()} method.
 */
class ASTNode_2Test {
    
    /**
     * Test case for an empty ASTNode.
     */
    @Test
    void testCreateTreeEmpty() {
        ASTNode node = new ASTNode();
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("null :: null", tree.getUserObject().toString());
        assertEquals(0, tree.getChildCount());
    }
    
    /**
     * Test case for an ASTNode with only a type.
     */
    @Test
    void testCreateTreeWithType() {
        ASTNode node = new ASTNode();
        node.setType("type");
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("type :: null", tree.getUserObject().toString());
        assertEquals(0, tree.getChildCount());
    }
    
    /**
     * Test case for an ASTNode with only an identity.
     */
    @Test
    void testCreateTreeWithIdentity() {
        ASTNode node = new ASTNode();
        node.setIdentity("identity");
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("null :: identity", tree.getUserObject().toString());
        assertEquals(0, tree.getChildCount());
    }
    
    /**
     * Test case for an ASTNode with both type and identity.
     */
    @Test
    void testCreateTreeWithTypeAndIdentity() {
        ASTNode node = new ASTNode();
        node.setType("type");
        node.setIdentity("identity");
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("type :: identity", tree.getUserObject().toString());
        assertEquals(0, tree.getChildCount());
    }
    
    /**
     * Test case for an ASTNode with one child.
     */
    @Test
    void testCreateTreeWithOneChild() {
        ASTNode node = new ASTNode();
        node.addChild(new ASTNode("childType", "childIdentity", node));
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("null :: null", tree.getUserObject().toString());
        assertEquals(1, tree.getChildCount());
        DefaultMutableTreeNode child = (DefaultMutableTreeNode) tree.getChildAt(0);
        assertEquals("childType :: childIdentity", child.getUserObject().toString());
        assertEquals(0, child.getChildCount());
    }
    
    /**
     * Test case for an ASTNode with multiple children.
     */
    @Test
    void testCreateTreeWithMultipleChildren() {
        ASTNode node = new ASTNode();
        node.addChild(new ASTNode("childType1", "childIdentity1", node));
        node.addChild(new ASTNode("childType2", "childIdentity2", node));
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("null :: null", tree.getUserObject().toString());
        assertEquals(2, tree.getChildCount());
        DefaultMutableTreeNode child1 = (DefaultMutableTreeNode) tree.getChildAt(0);
        assertEquals("childType1 :: childIdentity1", child1.getUserObject().toString());
        assertEquals(0, child1.getChildCount());
        DefaultMutableTreeNode child2 = (DefaultMutableTreeNode) tree.getChildAt(1);
        assertEquals("childType2 :: childIdentity2", child2.getUserObject().toString());
        assertEquals(0, child2.getChildCount());
    }
    
    /**
     * Test case for an ASTNode with nested children.
     */
    @Test
    void testCreateTreeWithNestedChildren() {
        ASTNode node = new ASTNode();
        ASTNode child1 = new ASTNode("childType1", "childIdentity1", node);
        node.addChild(child1);
        ASTNode child2 = new ASTNode("childType2", "childIdentity2", child1);
        child1.addChild(child2);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("null :: null", tree.getUserObject().toString());
        assertEquals(1, tree.getChildCount());
        DefaultMutableTreeNode child1Node = (DefaultMutableTreeNode) tree.getChildAt(0);
        assertEquals("childType1 :: childIdentity1", child1Node.getUserObject().toString());
        assertEquals(1, child1Node.getChildCount());
        DefaultMutableTreeNode child2Node = (DefaultMutableTreeNode) child1Node.getChildAt(0);
        assertEquals("childType2 :: childIdentity2", child2Node.getUserObject().toString());
        assertEquals(0, child2Node.getChildCount());
    }
    
    /**
     * Test case for an ASTNode with multiple nested children.
     */
    @Test
    void testCreateTreeWithMultipleNestedChildren() {
        ASTNode node = new ASTNode();
        ASTNode child1 = new ASTNode("childType1", "childIdentity1", node);
        node.addChild(child1);
        ASTNode child2 = new ASTNode("childType2", "childIdentity2", child1);
        child1.addChild(child2);
        ASTNode child3 = new ASTNode("childType3", "childIdentity3", child2);
        child2.addChild(child3);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("null :: null", tree.getUserObject().toString());
        assertEquals(1, tree.getChildCount());
        DefaultMutableTreeNode child1Node = (DefaultMutableTreeNode) tree.getChildAt(0);
        assertEquals("childType1 :: childIdentity1", child1Node.getUserObject().toString());
        assertEquals(1, child1Node.getChildCount());
        DefaultMutableTreeNode child2Node = (DefaultMutableTreeNode) child1Node.getChildAt(0);
        assertEquals("childType2 :: childIdentity2", child2Node.getUserObject().toString());
        assertEquals(1, child2Node.getChildCount());
        DefaultMutableTreeNode child3Node = (DefaultMutableTreeNode) child2Node.getChildAt(0);
        assertEquals("childType3 :: childIdentity3", child3Node.getUserObject().toString());
        assertEquals(0, child3Node.getChildCount());
    }
    
    /**
     * Test case for an ASTNode with multiple children and nested children.
     */
    @Test
    void testCreateTreeWithMultipleAndNestedChildren() {
        ASTNode node = new ASTNode();
        node.addChild(new ASTNode("childType1", "childIdentity1", node));
        ASTNode child2 = new ASTNode("childType2", "childIdentity2", node);
        node.addChild(child2);
        ASTNode child3 = new ASTNode("childType3", "childIdentity3", child2);
        child2.addChild(child3);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("null :: null", tree.getUserObject().toString());
        assertEquals(2, tree.getChildCount());
        DefaultMutableTreeNode child1 = (DefaultMutableTreeNode) tree.getChildAt(0);
        assertEquals("childType1 :: childIdentity1", child1.getUserObject().toString());
        assertEquals(0, child1.getChildCount());
        DefaultMutableTreeNode child2Node = (DefaultMutableTreeNode) tree.getChildAt(1);
        assertEquals("childType2 :: childIdentity2", child2Node.getUserObject().toString());
        assertEquals(1, child2Node.getChildCount());
        DefaultMutableTreeNode child3Node = (DefaultMutableTreeNode) child2Node.getChildAt(0);
        assertEquals("childType3 :: childIdentity3", child3Node.getUserObject().toString());
        assertEquals(0, child3Node.getChildCount());
    }
}