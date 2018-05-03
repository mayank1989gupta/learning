/**
 * 
 */
package com.learning.samplers;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Mayank
 * Hacker Rank: To find smallest and largest substring.</br>
 */
public class HackerRankSubstringComparisons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "welcometojava";
		int k = 3;
		int n = str.length() - k;//n
		char[] data = str.toCharArray();//to char array
		Set<String> set = new TreeSet<>();//tree set --> to maintain the order.
		for(int i = 0 ; i <= n ; i++) {
			set.add(String.valueOf(data, i, k));//Adding to the String
		}
		
		Object[] result = set.toArray();
		System.out.println(result[0] + "/" + result[set.size() -1]);//Printing the result
	}

}
