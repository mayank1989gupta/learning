/**
 * 
 */
package com.learning.linkedlist;

/**
 * @author Mayank
 *
 */
public class LinkedListInsertion {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String args[]) {
		LinkedListInsertion list = new LinkedListInsertion();

		list.head = new Node(3);//Head --> First Node
		Node second = new Node(5);//New Node
		Node third = new Node(4);//new node
		Node fourth = new Node(2);//new node
		
		list.head.next = second;//Linking the node to second
		second.next = third;//Linking the node to third
		third.next = fourth;//Linking the node to fourth

		list.insertAtFront();//inserting at the front
		list.insertAtIndex(1, 10);//inserting at the given index
		list.insertAtEnd(9);
		list.printList();//printing the list
		
		//Print the nth from last
		list.printNthFromLast(2);
		
		//Print the middle of the linkedlist
		list.middleElement();
		
		//Reversing the list
		list.reverseList();
		
		//To detect a loop
		list.detectLoop();
	}



	/**
	 * Method to print the list.</br>
	 */
	public void printList() {
		Node node = head;

		while(node != null) {
			System.out.println(node.data);//Node Data
			node = node.next;//incrementing to next node.
		}
	}

	/**
	 * Method to insert the New Node at the front.
	 */
	public void insertAtFront() {
		Node temp = head;

		head = new Node(10);//Head is changed to new Node.
		head.next = temp;
	}

	/**
	 * Method to insert a new node at the given index.</br>
	 * 
	 * @param index
	 * @param data
	 */
	private void insertAtIndex(int index, int data) {
		int counter = 0;//counter
		Node newNode = new Node(data);//New Node
		Node node = head;//Head
		while(counter < index) {
			counter++;//incrementing the counter

			if(index - counter == 0) {
				newNode.next = node.next;//new node pointing to next node
				node.next = newNode;//pointing to new node
			}
			node = node.next;//pointing to next node
		}
	}

	/**
	 * Method to insert a node at the end.</br>
	 * 
	 * @param data
	 */
	private void insertAtEnd(int data) {
		Node node = head;
		while(node.next != null) {
			node = node.next;//incrementing to next node.
		}
		node.next = new Node(9);
	}

	/**
	 * Method to print the Nth element from last.</br>
	 * Running two iterations --> first one till given index.
	 * Next iteration will have total - N times from 1st.
	 * 
	 * For eg.: total elements 10 --> to find the 3rd Last the first one traverses 3 times.
	 * The next would be first from 3 and second one from 1.
	 * 
	 * @param index
	 */
	private void printNthFromLast(int index) {
		System.out.println("********Printing Nth from Last *******************");
		Node main_Node = head;
		Node ref_Node = head;
		int counter = 0;
		while(counter < index) {
			ref_Node = ref_Node.next;
			counter++;
		}
		
		while(ref_Node != null) {
			main_Node = main_Node.next;
			ref_Node = ref_Node.next;
		}
		
		System.out.println(index + "th from last: " + main_Node.data);
	}
	
	/**
	 * Method to print the middle of the LinkedList.</br>
	 */
	private void middleElement() {
		System.out.println("**************** Printing Middle Element ***************");
		Node slow_Node = head;
		Node fast_Node = head;
		
		if(head != null) {
			while(fast_Node != null) {
				fast_Node = fast_Node.next.next;
				slow_Node = slow_Node.next;
			}
			
			System.out.println("Middle element of the given list: " + slow_Node.data);
		}
	}
	
	/**
	 * 
	 * Method to reverse a linkedlist.</br>
	 * 1. Store the next element --> next = current.next.</br>
	 * 2. Reverse the current->next to prev --> current.next = prev.</br>
	 * 3. increment prev and current --> prev=current & current = next.</br>
	 * 
	 */
	private void reverseList() {
		System.out.println("********Reversing the list***********************");
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			//store the next
			next = current.next;
			
			//reverse it with the previoud
			current.next = prev;
			
			//set prev to current
			prev = current;
			//set current to neext;
			current = next;
		}
		
		head = prev;//Head.
		printList();
	}
	
	/**
	 * Method to detect a loop.</br>
	 * Fastest to achieve this --> Floyd's Cycle Finding algo.</br>
	 * Move one pointer by one and other pointer by two.  If these pointers meet at some node then there is a loop.
	 * If pointers do not meet then linked list doesn’t have loop.
	 */
	private void detectLoop() {
		System.out.println("***************** Detecting Loop *************************");
		
		Node slow_Node = head;
		Node fast_Node = head;
		boolean loopFound = Boolean.FALSE;
		while(null != slow_Node && null != fast_Node && null != fast_Node.next) {
			slow_Node = slow_Node.next;
			fast_Node = fast_Node.next.next;
			
			if(slow_Node == fast_Node) {
				loopFound = Boolean.TRUE;
				break;
			}
		}
		//Printing the result.
		if(loopFound) {
			System.out.println("Look Found.");
		} else {
			System.out.println("No Loop Found");
		}
	}
}
