/**
 * 
 */
package com.hackerank.algorithms;

/**
 * @author Mayank
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] T = {5, -2, 3, 8, 6};
		int[] t = {-5, -5, -5, -42, 6, 12};
		
		int maxLeft = Integer.MIN_VALUE;
		int startIndex = 0;
		boolean negativeFound = false;
		for(int i = 0; i < t.length; i++) {
			if(!negativeFound) {
				if(t[i] > maxLeft && t[i] > 0) maxLeft = t[i];
				
				if(t[i] < 0) negativeFound = true;
				else continue;
			}

			if(negativeFound && t[i] > 0) {
				startIndex = i;
				break;
			}
		}
		
		System.out.println(maxLeft + ", " + startIndex);
		
		int result = 0;
		if(maxLeft < 0) result = startIndex;
		else {
			for(int i = startIndex; i < t.length; i++) {
				if(t[i] > maxLeft) {
					result = i;
					break;
				}
			}
		}
		
		System.out.println(result);
	}

}
