/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class Test {

	public static void main(String[] args) {
		
		String s1 = "abcdrrgh";
		String s2 = "abghcdef";
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		char[] char_s1 = s1.toCharArray();
		char[] char_s2 = s2.toCharArray();
		
		if(s1.length() == s2.length()) {
			for(int i = 0; i < char_s1.length; i++) {
				arr1[char_s1[i] - 'a']++;
				arr2[char_s2[i] - 'a']++;
			}
		}
		
		boolean anagram = Boolean.TRUE;
		for(int i = 0; i < 26; i++) {
			if(arr1[i] != arr2[i]) {
				anagram = Boolean.FALSE;
				break;
			}
		}
		
		if(anagram) {
			System.out.println("Anagram!!");
		} else {
			System.out.println("Not an anagram");
		}
	}

}
