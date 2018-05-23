/**
 * 
 */
package com.learning.samplers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mayank
 *
 */
public class RansomNoteHashTable {

	Map<String, Integer> magazineMap = new HashMap<>();
	Map<String, Integer> noteMap = new HashMap<>();

	public RansomNoteHashTable(String magazine, String note) {
		String[] magazineWords = magazine.split(" ");
		String[] noteWords = note.split(" ");
		
		for(String word : magazineWords) {
			magazineMap.put(word, magazineMap.get(word) == null ? 1 : magazineMap.get(word) + 1);
		}
		
		for(String word : noteWords) {
			noteMap.put(word, noteMap.get(word) == null ? 1 : noteMap.get(word) + 1);
		}
	}

	public boolean solve() {
		boolean result = Boolean.TRUE;
		
		for(String key : noteMap.keySet()) {
			if(noteMap.get(key) != magazineMap.get(key)) {
				result = Boolean.FALSE;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {

		RansomNoteHashTable s = new RansomNoteHashTable("give me one grand today night", "give one grand today");
		//RansomNoteHashTable s = new RansomNoteHashTable("two times three is not four", "two times two is four");

		boolean answer = s.solve();
		if(answer)
			System.out.println("Yes");
		else System.out.println("No");

	}
}
