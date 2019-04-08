/**
 * 
 */
package com.hackerank.algorithms;

/**
 * @author Mayank
 *
 */
public class GordanWordProblem {

	public static void main(String args[]) {
		
		long startTime = System.currentTimeMillis();
		String text = "i am a chef";
		//result = "*!!!! @M!!!! @!!!! CH*F!!!"
		
		String data = text.toUpperCase().replace(" ", "!!!! ");
		char[] words = data.toCharArray();
		
		char ch;
		for(int i = 0 ; i < words.length  ; i++) {
			ch = words[i];
			if(ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				words[i] = '@'; 
			} else if(ch == 'A') {
				words[i] = '*';
			} 
			
		}
		
		System.out.print(words);
		System.out.print("!!!!");
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time:" + (endTime - startTime));
	}
}
