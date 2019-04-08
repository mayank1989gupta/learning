/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class Bitwise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		printAllSubsets(arr);

	}
	
	private static void printAllSubsets(int[] arr) {
	    int size = arr.length;
	    int binaryLimit = (1 << size) - 1;

	    for (int i = 1; i <= binaryLimit; i++) {
	        int index = size - 1;
	        int num = i;
	        while (num > 0) {
	            if ((num & 1) == 1) {
	                System.out.print(arr[index]);
	            }
	            index--;
	            num >>= 1;
	        }
	        System.out.println();
	    }
	}

}
