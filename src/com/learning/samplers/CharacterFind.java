package com.learning.samplers;

public class CharacterFind {
	
	public static void main(String args[]) {
		/*String word = "hello";
		Map<Character, Integer> store = new TreeMap<>();
        for (char ch : word.toCharArray()) {
           Integer check = (null != store.get(ch) ? store.put(ch, store.get(ch) + 1) : store.put(ch, 1));
        }

        for(Character key : store.keySet()) {
        	if(store.get(key) > 0) {
        		break
        	}
        }*/
		
		String word = "helo";
		int[] occurrences = new int[26];
        for (char ch : word.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 1; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }
        
        System.out.println(Character.toString(best_char));
	}
}
