/**
 * 
 */
package com.hackerank.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mayank
 *
 */
public class TwoStringsHackerRank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(twoStrings("Hello", "World"));
		System.out.println(twoStrings("b", "asdfghjklnzmznhs"));
	}

	private static String twoStrings(String s1, String s2) {
		String result = "NO";
		char[] char_s1 = s1.toCharArray();
		char[] char_s2 = s2.toCharArray();
		
		Set<Character> chars = new HashSet<>();
		for(Character c : char_s1) {
			chars.add(c);
		}
		
		for(Character c : char_s2) {
			if(chars.contains(c)) {
				result = "YES";
				break;
			}
		}
		
		return result;
	}

}
