/**
 * 
 */
package com.learning.samplers;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mayank
 *
 */
public class Pangrams {

	public static void main(String args[]) {
		String s = "We promptly judged antique ivory buckles for the prize  ";
		System.out.println(pangrams(s));
	}

	static String pangrams(String s) {
		String result = null;
		s = s.replace(" ", "").toLowerCase();
		int length = s.length();
		Set<Character> set = new HashSet<>();
		
		for(int i = 0 ; i < length ; i++) {
			set.add(s.charAt(i));
		}
		
		if(set.size() == 26) {
			result = "pangram";
		} else {
			result = "not pangram";
		}
		
		return result;

	}
}
