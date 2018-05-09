/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 * Hacker Rank: Print a single integer denoting the number of characters 
 * you must delete to make the two strings anagrams of each other.
 */
public class MakingAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String firstStr = "aace";
		String secondStr = "aaaace";
		
		System.out.println(numberNeeded(firstStr, secondStr));//Making anagrams

	}
	
	private static int numberNeeded(String first, String second) {
	   int result = 0;
	   int n1 = first.length();
	   int n2 = second.length();
	   char[] firstChars = first.toCharArray();
	   char[] secondChars = second.toCharArray();
	   
	   int[] arr_first = new int[26];
	   int[] arr_second = new int[26];
	   
	   for(int i = 0 ; i < n1; i++) {
		   arr_first[firstChars[i] - 'a']++;
	   }
	   
	   for(int i = 0 ; i < n2; i++) {
		   arr_second[secondChars[i] - 'a']++;
	   }
	   
	   for(int i = 0; i < arr_first.length; i++) {
			if(arr_first[i] != arr_second[i]) {
				if(arr_first[i] == 0 || arr_second[i] == 0) {
					result = result + arr_first[i] + arr_second[i];  
				} else {
					result = (arr_first[i] > arr_second[i] ? result + (arr_first[i] - arr_second[i]) : result + (arr_second[i] - arr_first[i]));
				}
			}
		}
	   
	   return result;
    }

}
