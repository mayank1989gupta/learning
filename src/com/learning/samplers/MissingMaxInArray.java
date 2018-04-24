/**
 * 
 */
package com.learning.samplers;

import java.util.Arrays;

/**
 * @author Mayank
 *
 */
public class MissingMaxInArray {

	public static void main(String args[]) {
		int arr[] = {1, 3, 4, 6, 9};
		int result = 0;
		Arrays.sort(arr);
		
		int largestElement = arr[arr.length - 1];
		
		boolean[] binMap = new boolean[100000];
		int counter = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] > 0) {
				counter++;
				binMap[arr[i]] = true;
			}
		}
		
		boolean elementFound = Boolean.FALSE;
		int temp = largestElement;
		if(counter > 0) {
			while(largestElement > 0) {
				if(binMap[largestElement]) {
					largestElement--;
				} else {
					elementFound = Boolean.TRUE;
					//System.out.println(largestElement);
					result = largestElement;
					break;
				}
			}
			
			if(!elementFound) {
				//System.out.println(temp + 1);
				result = temp + 1;
			}
			
		} else {
			//System.out.println(1);
			result = 1;
		}
		
		System.out.println("Result: " + result);
	}
	
	
}
