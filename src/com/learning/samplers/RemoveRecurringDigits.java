/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class RemoveRecurringDigits {

	public static void main(String args[]) {
		char[] number = "123445677899".toCharArray();
		System.out.println(removeRecurringDigits(number));
	}

	private static String removeRecurringDigits(char[] number) {
		String result = null;
		int j = 0;
		int length = number.length;
		for(int i = 0 ; i < length; i++) {
			number[j++] = number[i];
			
			while(i+1 < length && number[i] == number[i+1]) {
				i++;
			}
		}
		
		result = String.valueOf(number).substring(0, j);
		return result;
	}
}
