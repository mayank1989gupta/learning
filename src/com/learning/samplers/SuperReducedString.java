/**
 * 
 */
package com.learning.samplers;

import java.util.Stack;

/**
 * @author Mayank
 *
 */
public class SuperReducedString {

	static public String super_reduced_string(String s){
		String result = null;
		Stack<Character> stack = new Stack<>();
		char character;
		for(int i = 0 ; i < s.length() ; i++) {
			character = s.charAt(i);
			if(!stack.isEmpty() && stack.peek() == character) {
				stack.pop();
			} else {
				stack.push(character);
			}
		}
		
		if(stack.isEmpty()) {
			result = "Empty String";
		} else {
			StringBuilder value = new StringBuilder();
			for(char ch : stack) {
				value.append(ch);
			}
			
			result = value.toString();
		}
		
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "aaabccddeee";
		String result = super_reduced_string(s);
		System.out.println(result);
		int charr = 'a';
		System.out.println(charr);
	}

}
