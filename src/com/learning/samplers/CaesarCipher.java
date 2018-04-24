/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class CaesarCipher {

	static String caesarCipher(String s, int k) {
       char[] characters = s.toCharArray();
       StringBuilder result = new StringBuilder();
       int temp = 0;
       char updatedChar;
       boolean isUpperCase = Boolean.FALSE;
       for(int i = 0; i < s.length(); i++) {
    	   if(Character.isUpperCase(characters[i])) {
    		   isUpperCase = Boolean.TRUE;
    		   characters[i] = (char)((int) characters[i] + 32);
    	   }
    	   
    	   if(characters[i] + k <= 'z' && characters[i] >= 'a') {
    		   updatedChar = (char) ((int)characters[i] + k);
    	   } else if(characters[i] + k > 'z') {
    		   temp = k - ('z' - characters[i]);
    		   updatedChar = (char)((int)'a' + (temp -1));
    	   } else {
    		   updatedChar = characters[i];
    	   }
    	   
    	   if(isUpperCase) {
    		   updatedChar = (char) ((int)updatedChar - 32);
    		   isUpperCase = Boolean.FALSE;
    	   }
    	   
    	   result.append(updatedChar);
       }
    		
       return result.toString();
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();*/
    	//String s = "Hello_World!";
    	String s = "middle-Outz";
        String result = caesarCipher(s, 2);
        System.out.println(result);
        
    }

}
