/**
 * 
 */
package com.learning.samplers;

import java.util.Scanner;

/**
 * @author Mayank
 *
 */
public class BonAppétit {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int[] master = new int[2];
		for(int i = 0 ; i < 2;i++) {
			master[i] = in.nextInt();
		}

		int n = master.length;
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}

		int amountTaken = in.nextInt();
		int sum = 0;
		for(int j = 0 ; j < master[0]; j++) {
			if(j != master[1]) {
				sum = sum + ar[j];
			}
		}
		
		if(sum == amountTaken) {
			System.out.println("Bon Appetit");
		} else if(sum > amountTaken) {
			System.out.println();
		} else {
			System.out.println(amountTaken - sum);
		}
	}
}
