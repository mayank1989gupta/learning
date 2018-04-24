/**
 * 
 */
package com.learning.samplers;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Mayank
 *
 * Problem: Print number in ascending order which contains 1, 2 and 3 in their digits.
 */
public class Ascending123 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {123, 1232, 456, 234, 32145};
		Set<Integer> data = new TreeSet<>(); 
		
		String temp = null;
		for(int number : numbers) {
			temp = String.valueOf(number);
			if(temp.contains("1") && temp.contains("2") && temp.contains("3")) {
				data.add(number);
			}
		}
		
		for(int result : data) {
			System.out.println(result);
		}

	}

}
