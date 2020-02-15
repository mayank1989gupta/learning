package com.learning.tree;

//Program to check if the given BST is height balanced
public class BinaryTreeHeightBalanced {

    Node root;//root
    //static class with tree definition
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }


    public static void main(String args[]) {
        BinaryTreeHeightBalanced tree = new BinaryTreeHeightBalanced();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);

        if(tree.isBalanced(tree.root)) System.out.println("Tree is balanced");
        else System.out.println("Tree is not balanced");
    }

    /**
     * Method to check for height balance.</br>
     *
     * @param root
     * @return
     */
    private static boolean isBalanced(Node root) {
        int lHeight;
        int rHeight;
        //Base case
        if(null == root) return true;

        lHeight = height(root.left);
        rHeight = height(root.right);
        //Check the diff between left &, right subtree
        if(Math.abs(lHeight - rHeight) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right)) return true;

        return false;
    }

    //Method to calculate the hoght of the given tree.
    private static int height(Node node) {
        if(node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
