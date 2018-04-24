/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class MergeArray {

	public static void main(String args[]) {
		int[] arr1 = {3, 4};
		int[] arr2 = {1, 2};
		
		mergeArrays(arr1, arr2, arr1.length, arr2.length);
	}

	private static void mergeArrays(int[] arr1, int[] arr2, int arr1Length, int arr2Length) {
		int result[] = new int[arr1Length + arr2Length];

		int i = 0;
		int j = 0;
		int k = 0;

		while(i < arr1Length && j < arr2Length) {
			if(arr1[i] < arr2[j]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}

		while(i < arr1Length) {
			result[k++] = arr1[i++];
		}

		while(j < arr2Length) {
			result[k++] = arr2[j++];
		}

		for(int val : result) {
			System.out.println(val);
		}
	}
}
