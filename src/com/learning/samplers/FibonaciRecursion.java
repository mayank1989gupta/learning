/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class FibonaciRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 8;
		System.out.println(fibonacci(number));

	}
	/**
	 * Method to calculate the result of the fibonacci series.</br>
	 * @param number
	 * @return
	 */
	private static int fibonacci(int number) {
		if(number == 0) return 0;
		if(number <= 2) return 1;
		
		int result = fibonacci(number - 1) + fibonacci(number - 2);
		return result;//result
	}

}
