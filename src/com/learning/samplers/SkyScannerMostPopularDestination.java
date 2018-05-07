/**
 * 
 */
package com.learning.samplers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Mayank
 * Skyscanner Ques 1: To find the most popular destination.</br>
 */
public class SkyScannerMostPopularDestination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = Integer.parseInt(in.nextLine());

		outputMostPopularDestination(count, in);//function call

	}

	/**
	 * Method to find the most popular destination.</br>
	 * 
	 * @param count
	 * @param in
	 */
	private static void outputMostPopularDestination(int count, Scanner in) {
		Map<String, Integer> data = new HashMap<>();
		String enteredString = null;
		//Putting data into the map.
		for(int i = 0 ; i < count ; i++) {
			enteredString = in.nextLine();
			data.put(enteredString, data.get(enteredString) == null ? 1 : data.get(enteredString) + 1);
		}
		
		//identifying the most popular destination.
		String result = null;
		int max = 0;
		for(String key : data.keySet()) {
			if(data.get(key) > max) {
				max = data.get(key);
				result = key;
			}
		}
		
		System.out.println(result);//Result
	}
}
