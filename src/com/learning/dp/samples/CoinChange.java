/**
 * 
 */
package com.learning.dp.samples;

import java.util.Arrays;

/**
 * @author Mayank
 *
 */
public class CoinChange {

	public static void main(String args[]) {
		int arr[] = {1,2};
		int m = arr.length;
		int n = 3;

		System.out.println(countWays(arr, m, n));
	}

	private static long countWays(int[] arr, int m, int n) {
		//Time complexity of this function: O(mn)
		//Space Complexity of this function: O(n)
		long[] table = new long[n+1];

		//Initialize table values with 0;
		Arrays.fill(table, 0);

		// Base case (If given value is 0)
        table[0] = 1;
		// Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
		for(int i = 0; i < m; i++) {
			for(int j = arr[i]; j <= n; j++) {
				table[j] = table[j] + table[j - arr[i]];
			}
		}
		

		return table[n];
		
	}


}
