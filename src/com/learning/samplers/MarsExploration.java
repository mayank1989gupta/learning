/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class MarsExploration {

	public static void main(String args[]) {
		String s = "SOSSPSSQSSOR";
		System.out.println(marsExploration(s));
	}

	static int marsExploration(String s) {
		int length = s.length();
		int counter = 0;
		for(int i = 0 ; i < length; i+=3) {
			if(s.charAt(i) != 'S') {
				counter++;
			}

			if(s.charAt(i + 1) != 'O') {
				counter++;
			}

			if(s.charAt(i + 2) != 'S') {
				counter++;
			}
		}

		return counter;
	}
}
