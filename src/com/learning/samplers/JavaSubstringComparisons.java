/**
 * 
 */
package com.learning.samplers;

import java.util.Scanner;

/**
 * @author Mayank
 * 
 * HackerRank --> Java Substring Comparisons
 */
public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		char[] data = s.toCharArray();
		int n = s.length() - 2;
		String temp = null;
		for(int i = 0; i < n; i++) {
			temp = String.valueOf(data, i, 3);

			if(i == 0) {
				//initializing with the first value
				smallest = temp;
				largest = temp;
				continue;
			}

			if(compare(temp, smallest) < 0) {
				smallest = temp;//Setting the smallest
			} else if(compare(largest, temp) < 0) {
				largest = temp;//setting the largest.
			}
		}

		return smallest + "\n" + largest;
	}

	/**
	 * Method to compare the given Strings.</br>
	 * 
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static int compare(String a1, String a2) {
		if(a1.length() < a2.length()) return -1;
		if(a1.length() > a2.length()) return 1;

		for(int i = 0 ; i < a1.length(); i++) {
			if((int)a1.charAt(i) < (int)a2.charAt(i)) return -1;
			if((int)a1.charAt(i) > (int)a2.charAt(i)) return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
