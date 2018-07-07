/**
 * 
 */
package com.learning.samplers;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Mayank
 *
 */
public class StacksBalancedBrackets {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String expression = scanner.nextLine();
			checkBalanceBrackets(expression);
		}*/

		
		System.out.println(checkBalanceBrackets("{}("));
		scanner.close();
		
		//System.out.println(checkBalanceBrackets("[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]"));
	}

	private static String checkBalanceBrackets(String expression) {
		int expressionLength = expression.length();
		String result = "YES";
		if(expressionLength == 0 || expressionLength % 2 != 0) {
			result = "NO";//For empty string or, odd length string
		} else {
			Stack<Character> stack = new Stack<>();
			
			for(Character character : expression.toCharArray()) {
				if(character == '(' || character == '{' || character == '[') {
					stack.push(character);
				} else {
					if (stack.isEmpty()) {
						return "NO";
					}
					
					char top = stack.pop();
					if(!((character == ')' && top == '(')
							|| character == '}' && top == '{'
							|| character == ']' && top == '[')) {
						result = "NO";
					}
				}
			}
			
		}
		return result;//result
	}
}
