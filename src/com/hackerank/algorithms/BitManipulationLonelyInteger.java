/**
 * 
 */
package com.hackerank.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mayank
 * HackerRank: Bit Manipulation Lonely Integer --> Finding the unique eement
 */
public class BitManipulationLonelyInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//int[] arr = {10,20,30,10,20,30,40};
		int[] arr = {1,2,3,1,2};
		System.out.println(lonelyInteger(arr));
	}

	private static int lonelyInteger(int[] a) {
		int result = 0;
		int length = a.length;
		Set<Integer> data = new HashSet<>();
		int sumArr = 0;
		int sumUniqueIntegers = 0;
		for(int i = 0 ; i < length; i++) {
			sumArr += a[i];//Total Sum
			
			if(data.add(a[i])) sumUniqueIntegers += a[i];//Sum of unique integers
		}
		
		/**
		 * As the integers appear 2 times in the array
		 */
		result = (2 * sumUniqueIntegers) - sumArr;
		
		return result;
	}

}
