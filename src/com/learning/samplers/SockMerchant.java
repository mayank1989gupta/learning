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
public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		int result = 0;
		Map<Integer, Integer> data = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			data.put(ar[i], data.get(ar[i]) == null ? 1 : data.get(ar[i]) + 1);
		}

		for(Integer key : data.keySet()) {
			result = result + (data.get(key)/2);
		}

		return result;
	}

	public static void main(String[] args) {
		int n = 9;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}
