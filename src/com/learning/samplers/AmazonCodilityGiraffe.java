package com.learning.samplers;

public class AmazonCodilityGiraffe {


	public static void main(String args[]) {
		int arr[] = {1,5,4,9,8,7,12,13,14};
		//int arr[] = {4,3,2,6,1};
		int n = arr.length;  
		int counter = 0;
		int max = arr[0];
		if(arr[0] < arr[1]) {
			counter++;
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] > max) {
				max = arr[i];
				counter++;
			}
		}
		
		
		
		System.out.println("Result : " + counter);
	}
}
