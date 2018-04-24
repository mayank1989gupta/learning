/**
 * 
 */
package com.learning.samplers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mayank
 *
 */
public class CircularArrayRotation {

	static Integer[] circularArrayRotation(int[] a, int[] m) {
		Integer[] result = new Integer[a.length];
		int arrayLength = m[0];
		int rotations = m[1];
		int indexes = m[2];
		/*int counter = 0;
		while(counter < rotations) {
			int temp = a[a.length - 1];
			int i = 0;
			for(i = arrayLength - 1 ; i > 0 ; i--) {
				a[i] = a[i-1];
			}
			a[i] = temp;
			
			counter++;
		}*/
		
		List<Integer> test = new ArrayList<>();
		for(int i = a.length - rotations; i <= a.length -1 ; i++) {
			test.add(a[i]);
		}
		
		for(int j = 0 ; j < a.length - rotations ; j++) {
			test.add(a[j]);
		}
		
		result = test.toArray(result);
		
		return result;
	}

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }*/
		int a[] = {1,2,3};
		int m[] = {3,2,3};
		Integer[] result = circularArrayRotation(a, m);
		for (int i = 0; i < m[2]; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
	}
}
