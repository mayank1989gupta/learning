/**
 * 
 */
package com.learning.samplers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Mayank
 *
 */
public class HackerRankDS1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> test = new HashSet<>();
		test.add(1);
		test.add(2);
		test.add(9);
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(1);
		test.add(4);
		test.add(1);
		test.add(5);
		test.add(7);
		
		List<Integer> list = new ArrayList<>();
		list.addAll(test);
		
		Collections.sort(list);
		
		for(int a : list) {
			System.out.println(a);
		}

	}

}
