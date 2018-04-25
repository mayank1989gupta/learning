/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class Test {

	public static void main(String[] args) {
		checkPrime(2);
		checkPrime(2,1);
		checkPrime(2,1,3);
		checkPrime(2,1,3,4);
		checkPrime(2,1,3,4,5);
	}

	public static void checkPrime(int ...numbers) {
		int counter = 0;

		for(int number : numbers) {
			if(number == 0 || number == 1) {
				continue;
			}
			
			if(isPrime(number)) {
				System.out.print((counter++ > 0 ? " " : "") + number);
			}
			
			
		}
		
		System.out.println();
	}

	private static boolean isPrime(int number) {
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				return false;
		}
		return true; 
	}

}
