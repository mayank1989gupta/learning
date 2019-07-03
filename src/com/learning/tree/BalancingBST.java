package com.learning.tree;

import java.util.Vector;

public class BalancingBST {

    Node root;
    //Making the inner class static, so main could access
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
         /* Constructed skewed binary tree is
                10
               /
              8
             /
            7
           /
          6
         /
        5   */
        BalancingBST tree = new BalancingBST();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(7);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.left.left = new Node(5);

        tree.root = tree.buildTree(tree.root);
        System.out.println("Preorder traversal of balanced BST is :");
        tree.preOrder(tree.root);
    }


    /**
     * Method to return the root of the balanced tree.</br>
     * 1. Runs an inorder traversal on the given BST --> produces a sorted collection.</br>
     * 2. Builds the balanced tree using the sorted colection from the first.</br>
     *
     * @param root
     * @return
     */
    private static Node buildTree(Node root) {
        Vector<Node> nodes = new Vector<>();
        //populating the nodes -> invking the inorder traversal
        runInOrder(root, nodes);

        int size = nodes.size();//size of the collection <<nodes>>
        return buildTree(nodes, 0, size - 1);
    }

    /**
     * Method to run inorder traversal.</br>
     *
     * @param root
     * @param nodes
     */
    private static void runInOrder(Node root, Vector<Node> nodes) {
        if(null == root) return;
        runInOrder(root.left, nodes);
        nodes.add(root);
        runInOrder(root.right, nodes);
    }

    /**
     * Method to build the tree.</br>
     *
     * @param nodes
     * @param start
     * @param end
     * @return
     */
    private static Node buildTree(Vector<Node> nodes, int start, int end) {
        //base case
        if(start > end) return null;

        //find the middle element and assign as root
        int middle = (start + end) / 2;
        Node node = nodes.get(middle);//root of the tree
        //Using the indexes of inorder traversal -> build the left and right subtrees
        //Left
        node.left = buildTree(nodes, start, middle - 1);
        //right
        node.right = buildTree(nodes, middle + 1, end);

        return node;
    }

    /**
     * MEthod to print the result in preorder.</br>
     *
     * @param root
     */
    private static void preOrder(Node root) {
        if(null == root) return;

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
