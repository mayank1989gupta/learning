/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 * Ques: To find longest substring length in the given valid password.
 * Constraints for the valid substring: </br>
 * 1. should have an Uppercasea alphabet.</br>
 * 2. should have a number.</br>
 */
public class VaadinCodilityLongestSubstringValidPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Sample String
		String s = "a4353a4aaaaaaBbnabahba4NNBBanaba7";
		//Splitting for Numbers.
		String parts[] = s.split("[0-9]+");
       
        int max = 0;//Max Length
        for(int i = 0; i < parts.length; i++) {
        	//Check for Uppercase
            if(parts[i].matches("(.+)?[A-Z](.+)?"))
                max = (parts[i].length() > max ? parts[i].length() : max);//Update the max
        }
        
        
        System.out.println((max == 0 ? -1 : max));//Printing the result.
	}
}
//End of File