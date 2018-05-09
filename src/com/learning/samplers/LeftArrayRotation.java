/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class LeftArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int length = arr.length;
		
		int d = 4;
		
		int mod = d % length;
		System.out.println(mod);

		System.out.println(arrayLeftRotation(arr, length, d));
		 /*for(int i = 0; i < length; ++i)
		        System.out.print(arr[(i + mod) % length]
		                          + " "); */
	}
	
	public static int[] arrayLeftRotation(int[] a, int n, int k) {
	      int mod = k % n;
	      for(int i = 0 ; i < n ; ++i) {
	          a[i] = a[(i+mod)%n];
	      }
	        
	     return a;
	    }

}
