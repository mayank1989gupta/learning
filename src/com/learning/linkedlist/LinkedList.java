/**
 * 
 */
package com.learning.linkedlist;

/**
 * @author Mayank
 *
 */
public class LinkedList {

	Node head;//Head of the LinkedinList
	
	/**
	 * Making the inner class as static so main can access it.</br>
	 * @author Mayank
	 *
	 */
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.head = new Node(1);//Head to the first node.
		Node second = new Node(2);//Second node
		Node third = new Node(3);//Third Node
		
		//Creating linkages between the nodes.
		list.head.next = second;
		second.next = third;
		
		list.printList();//printing the list.
	}
	
	public void printList() {
		Node node = head;
		
		while(node != null) {
			System.out.println(node.data);//Node Data
			node = node.next;//incrementing to next node.
		}
	}

}
