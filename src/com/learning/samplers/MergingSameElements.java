package com.learning.samplers;

import java.util.Arrays;

public class MergingSameElements {

	public static void main(String args[]) {
		int arr[] = {5,5,5,7,7,3,4,7}; 

		int temp = arr[0];
		int packedCounter = 0;
		
		String[] result = new String[arr.length];
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(temp == arr[i]) {
				counter++;
				result[packedCounter] = arr[i] + ":" + counter;
			} else {
				counter = 1;
				packedCounter++;
				temp = arr[i];
				if(counter == 1) {
					result[packedCounter] = String.valueOf(arr[i]);
				} else {
					result[packedCounter] = arr[i] + ":" + counter;
				}
				
			}
			
		}
		
		//Converting to result arrays
		result = Arrays.stream(result)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);    
		
		for(String data : result) {
			System.out.println(data);//Priting the result
		}
		
	}
}
