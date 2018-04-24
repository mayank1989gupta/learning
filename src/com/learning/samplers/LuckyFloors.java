/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class LuckyFloors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 20;

		findLuckyFloor(n);


	}



	private static void findLuckyFloor(int n) {
		int counter = 0;
		//boolean result = Boolean.FALSE;
		int realFloorCounter = 0;
		while(realFloorCounter <= n) {
			realFloorCounter++;
			counter++;
			if(counter%10 == 4 || counter%100 == 13) {
				counter++;
			}
		}


		System.out.println(counter);
	}

}
