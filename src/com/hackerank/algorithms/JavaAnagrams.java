/**
 * 
 */
package com.hackerank.algorithms;

import java.util.Scanner;

/**
 * @author Mayank
 *
 * Hacker Rank: Java Anagrams
 */
public class JavaAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	/**
	 * Method to check for anagrams.</br> 
	 * @param a
	 * @param b
	 * @return
	 */
	private static boolean isAnagram(String a, String b) {
		boolean result = Boolean.TRUE;
		if(a.length() == b.length()) {
			int n = a.length();
			a = a.toLowerCase();//Lowercase conversion
			b = b.toLowerCase();
			int[] a_char = new int[26];
			int[] b_char = new int[26];
			//populating the above arrays/
			for(int i = 0 ; i < n; i++) {
				a_char[a.charAt(i) - 'a']++;
				b_char[b.charAt(i) - 'a']++;
			}

			//Array comparison
			for(int i = 0; i < a_char.length; i++) {
				if(a_char[i] != b_char[i]) {
					result = Boolean.FALSE;
					break;
				}
			}
		} else {
			result = Boolean.FALSE;//Length not equal case
		}

		return result;//result
	}

}
