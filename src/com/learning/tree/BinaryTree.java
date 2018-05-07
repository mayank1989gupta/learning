/**
 * 
 */
package com.learning.tree;

/**
 * @author Mayank
 *
 */
public class BinaryTree {

	Node root;
	/**
	 * Making the inner class as static so main can access it.</br>
	 * @author Mayank
	 *
	 */
	static class Node {
		int data;
		Node right;
		Node left;

		public Node(int data) {
			this.data = data;
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		//DFS - starts from Leaves --> Need extra space for height O(h). --> this is mainly recursive
		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder(tree.root);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder(tree.root);

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder(tree.root);
	}



	/**
	 * Method to print Pre-Order --> Root -> Left -> Right
	 * 
	 * @param node
	 */
	private void printPreorder(Node node) {
		if(node == null) {
			return;
		}
		//As pre Order --> Print data of the node i.e. root
		System.out.println(node.data);
		//Recursing on Left Subtree
		printPreorder(node.left);
		//Recursing on Right Subtree
		printPreorder(node.right);
	}

	/**
	 * Method to print InOrder traversal --> Left -> Root -> Right
	 * 
	 * @param node
	 */
	private void printInorder(Node node) {
		if(node == null) {
			return;
		}
		//Recursing on Left Subtree
		printInorder(node.left);
		//Printing the 
		System.out.println(node.data);
		//Recursing on Right Subtree
		printInorder(node.right);

	}

	/**
	 * Method to print PostOrder traversal --> Left -> Right --> Root
	 * 
	 * @param node
	 */
	private void printPostorder(Node node) {
		if(node == null) {
			return;
		}
		//Recursing on Left Subtree
		printPostorder(node.left);

		//Recursing on Right Subtree
		printPostorder(node.right);

		//Printing the data
		System.out.println(node.data);
	}

}
