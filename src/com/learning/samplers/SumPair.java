package com.learning.samplers;

public class SumPair {

	public static void main(String args[]) {
		int[] arr = {5, 4, 2, 1};
		boolean[] binMap = new boolean[10000];//Integer of max could be taken.
		int sum = 6;
		int numberOfPairs = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			int temp = sum - arr[i];
			
			if(temp >= 0 && binMap[temp]) {
				numberOfPairs++;
				System.out.println("Pair: " + temp + ", " + arr[i]);
			}
			
			binMap[arr[i]] = Boolean.TRUE;
		}
		
		if(numberOfPairs == 0) {
			System.out.println("No pairs found.");
		}
	}
}
