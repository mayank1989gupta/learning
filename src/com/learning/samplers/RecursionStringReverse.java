/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class RecursionStringReverse {

	public static void main(String args[]) {
		String name = "testing";
		System.out.println(reverse(name));
	}

	private static String reverse(String name) {
		if(null == name || name.isEmpty()) {
			return name;
		} else {
			return name.charAt(name.length() - 1) + reverse(name.substring(0, name.length() - 1));
		}
	}
}
