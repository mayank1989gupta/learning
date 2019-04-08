/**
 * 
 */
package com.learning.samplers;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



/**
 * @author Mayank
 *
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, List<Integer>> data = new TreeMap<>();
		
		int[][] input = {{8,1}, {4,2}, {5,6}, {3,1}, {4,3}, {6,3}};
		
		for(int i = 0; i < input.length; i++) {
			if(data.containsKey(input[i][0] + input[i][1])) {
				data.get(input[i][0] + input[i][1]).add(i+1);
			} else {
				List<Integer> list = new LinkedList<Integer>();
				list.add(i+1);
				data.put(input[i][0] + input[i][1], list);
			}
		}
		
		List<Integer> result = new LinkedList<Integer>();
		for(Map.Entry<Integer, List<Integer>> customer : data.entrySet()) {
			result.addAll(customer.getValue());
		}
		
		Integer[] resultData = result.toArray(new Integer[result.size()]);
		System.out.println(resultData);
	}

}
