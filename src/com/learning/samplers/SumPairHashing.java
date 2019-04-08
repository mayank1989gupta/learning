/**
 * 
 */
package com.learning.samplers;

import java.util.HashSet;
import java.util.Set;

/**
 * @author MGupta
 *
 */
public class SumPairHashing {

	public static void main(String args[]) {
		//sample array
		int[] data = new int[]{1,2,3,4,5,6};
		int sum = 7;
		
		//find pairs with sum 7
		findSumPairs(data, sum);
	}

	/**
	 * Method to find the sum of pairs.</br>
	 * 
	 * @param data
	 * @param sum
	 */
	private static void findSumPairs(int[] data, int sum) {
		Set<Integer> tempData = new HashSet<Integer>();
		int temp = 0;
		
		for(int value : data) {
			temp = sum - value;
			
			if(tempData.contains(temp)) {
				System.out.println("Pair found: " + temp + " &, " + value);
			}
			
			tempData.add(value);
		}
	}
}
