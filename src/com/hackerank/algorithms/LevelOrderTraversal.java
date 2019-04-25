/**
 * 
 */
package com.hackerank.algorithms;

/**
 * @author Mayank
 * Hacker Rank: Level Order Traversal.
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class LevelOrderTraversal {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	//Solution
	public static void levelOrder(Node root) {
      
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);

      while(!queue.isEmpty()) {
          Node tempNode = queue.poll();
          System.out.print(tempNode.data + " ");

          if(null != tempNode.left) 
              queue.add(tempNode.left);
          
          if(null != tempNode.right)
            queue.add(tempNode.right);
      }
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}