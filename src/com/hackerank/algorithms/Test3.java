/**
 * 
 */
package com.hackerank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Mayank
 *
 */
public class Test3 {

	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int k = 3;

		System.out.println(Arrays.stream(arr).sorted().skip(arr.length - k).findFirst().getAsInt());
	}
}
