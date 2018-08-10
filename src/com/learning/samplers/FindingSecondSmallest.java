/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 * Class: solution to find the second smallest in the given array.
 */
public class FindingSecondSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {10,9,8,4,3,2,1,1};
		System.out.println(findSecondSmallest(arr));
	}

	/**
	 * Method to find the second smallest in the given array.</br>
	 * @param arr
	 * @return
	 */
	private static int findSecondSmallest(int[] arr) {
		if(arr.length < 2) {
			return -1;
		}
		int first = Integer.MAX_VALUE; 
		int second = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] < first) {
				second = first;
				first = arr[i];
			} else if(arr[i] <= second && arr[i] != first) {
				second = arr[i];
			}
		}
		
		return second;//second largest
	}

}
