/**
 * 
 */
package com.learning.samplers;

import java.util.Arrays;

/**
 * @author Mayank
 *
 */
public class Codility2 {

	public static void main(String args[]) {
		int a[] = {1, 2, 3, 4 , 5 , 6, 8, 9};
		int result = 0;
		Arrays.sort(a);
		int counter = 0;
		boolean[] binMap = new boolean[1000000];
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] > 0) {
				counter++;
				binMap[a[i]] = Boolean.TRUE;
			}
			
		}
		
		boolean elementFound = Boolean.FALSE;
		
		if(counter > 0) {
			for(int j = 1 ; j <= binMap.length ; j++) {
				if(!binMap[j]) {
					result = j;
					elementFound = Boolean.TRUE;
					break;
				}
			}
			
			if(!elementFound) {
				result = a[a.length];
			}
		} else {
			//System.out.println(1);
			result = 1;
		}
		
		System.out.println(result);
	}
}
