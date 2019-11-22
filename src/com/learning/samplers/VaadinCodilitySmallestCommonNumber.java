/**
 *
 */
package com.learning.samplers;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mayank
 *
 * Ques: WAP to compare and find the minimum common in the given arrays.</br>
 */
public class VaadinCodilitySmallestCommonNumber {

	public static void main(String rags[]) {
		//Samples
		int a[] = {1, 4, 5};
		int b[] = {4, 3, 2, 6};

		//int a[] = {1, 3, 2, 1};
		//int b[] = {4, 2, 5, 3, 2};

		//System.out.println(solution(a,b));//calling the method
	}

	/**
	 * Method to compare and find the minimum 
	 * common in the given arrays.</br>
	 *
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	private static int solution(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;;
		Arrays.sort(arr1);//Sorting Array 1
		Arrays.sort(arr2);//Sorting Array 2
		int i = 0;
		for (int k = 0; k < n; k++) {
			while(i < m - 1 && arr2[i] < arr1[k])
				i++;
			if (arr1[k] == arr2[i])
				return arr1[k];//result
		}
		return -1;//result
	}
}
