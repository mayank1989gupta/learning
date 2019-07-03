package com.learning.tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public static void main(String args[]) {
        List<Integer> data = new ArrayList<>();
        TreeNode node = new TreeNode();
        populateData(node, data);
        int k = 2;
        System.out.println(data.get(k - 1));
    }

    /**
     * Method will use the In order traversal
     * as this is BST, in order will result in sorted data set
     * @param node
     * @param data
     */
    private static void populateData(TreeNode node, List<Integer> data) {
        if(node == null) return;

        populateData(node.left, data);
        data.add(node.val);
        populateData(node.right, data);
    }
}
