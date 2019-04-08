/**
 * 
 */
package com.hackerank.algorithms;

import java.util.Scanner;

/**
 * @author Mayank
 *
 */
public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int result = 0;

		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i < j && ((ar[i] + ar[j]) % k == 0)) {
					System.out.println(ar[i] + ", " + ar[j]);
					result++;

				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();*/
		int n = 6;
		int k = 3;
		/*int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }*/
		int ar[] = {1,3,2,6,1,2};
		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);
	}
}
