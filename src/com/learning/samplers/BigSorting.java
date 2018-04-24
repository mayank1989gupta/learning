/**
 * 
 */
package com.learning.samplers;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Mayank
 *
 */
public class BigSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = {"1","4","5","6","12345678755"};

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String a1, String a2) {
				return stringToIntCompare(a1, a2);
			}

			
		});
		
		//Printing the result
		for(String data : arr) {
			System.out.println(data);
		}
	}
	
	/**
	 * Method to compare the String as integers and return the result.</br>
	 * 
	 * @param a1
	 * @param a2
	 * @return
	 */
	private static int stringToIntCompare(String a1, String a2) {
		if(a1.length() < a2.length()) return -1;
		if(a1.length() > a2.length()) return 1;
		
		for(int i = 0 ; i < a1.length(); i++) {
			if((int)a1.charAt(i) < (int)a2.charAt(i)) return -1;
			if((int)a1.charAt(i) > (int)a2.charAt(i)) return 1;
		}
		
		return 0;
	}

}
