/**
 * 
 */
package com.learning.stacks;

import java.util.Stack;

/**
 * @author Mayank
 *
 */
public class StackTest {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();

		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);
	}

	private static void stack_search(Stack<Integer> stack, int element) {
		int index = stack.search(element);
		
		if(index == -1) {
			System.out.println("Element not found on Stack.");
		} else {
			System.out.println("Element foudn on Stack at index: " + index);
		}
	}

	private static void stack_peek(Stack<Integer> stack) {
		System.out.println("************* Stack Peek ***************");
		
		System.out.println("Peek: " + stack.peek());
	}

	private static void stack_pop(Stack<Integer> stack) {
		System.out.println("********** Stack Pop **************");

		for(int i = 0; i < 5; i++) {
			//Integer y = (Integer) stack.pop() ;
			System.out.println(stack.pop());
		}
	}

	private static void stack_push(Stack<Integer> stack) {
		for(int i = 1 ; i <= 5; i++) {
			stack.push(i);
		}
	}
}
