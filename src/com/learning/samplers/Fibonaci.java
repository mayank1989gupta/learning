/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class Fibonaci {

	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		int length = 8;
		int c = 0;
		
		System.out.println(a);
		System.out.println(b);
		for(int i = 0; i < length - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}
