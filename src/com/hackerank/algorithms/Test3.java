/**
 * 
 */
package com.hackerank.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Mayank
 *
 */
public class Test3 {

	public static void main(String args[]) {
		List<Integer> data = new ArrayList<Integer>();;
		data.add(5);
		data.add(4);
		data.add(3);
		data.add(2);
		data.add(1);
		
		Collections.sort(data, (a, b) -> a - b);
		
		data.stream().forEach(System.out::println);
	}
}
