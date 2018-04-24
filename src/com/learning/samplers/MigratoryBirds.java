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
public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) {
		int result = 0;

		Map<Integer, Integer> data = new HashMap<>();
		for(int i = 0 ; i < n; i++) {
			data.put(ar[i], null == data.get(ar[i]) ? 1 : data.get(ar[i])+1);
		}
		int temp = 0;
		for(Integer key : data.keySet()) {
			if(data.get(key) > temp) {
				temp = data.get(key);
				result = key;
			} else if(data.get(key) == temp) {
				if(result > key) {
					result = key;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}*/
		int n = 6;
		int[] ar = {1, 4, 4, 3, 5, 3};
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
