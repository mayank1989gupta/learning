/**
 * 
 */
package com.learning.sorting;

import java.util.concurrent.Exchanger;

/**
 * @author Mayank
 *
 */
public class QuickSort {

	public static void main(String args[]) {
		int[] data = {24,2,45,20,56,75,2,56,99,53,12};
		
		sort(data);
		
		for(int val : data) {
			System.out.println(val);
		}
	}

	private static void sort(int[] data) {
		if(data == null || data.length == 0) {
			return;
		}
		
		int lenght = data.length;
		quickSort(data, 0, lenght -1);
		
	}

	private static void quickSort(int[] data, int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = data[lowerIndex + ((higherIndex - lowerIndex)/2)];
		
		while(i <= j) {
			
			while(data[i] < pivot) {
				i++;
			}
			
			while(data[j] > pivot) {
				j--;
			}
			
			if(i <= j) {
				exchangeNumber(data, i, j);
				i++;
				j--;
			}
		}
		
		if(lowerIndex < j) {
			quickSort(data, lowerIndex, j);
		}
		
		if(i < higherIndex) {
			quickSort(data, i, higherIndex);
		}
		
	}

	private static void exchangeNumber(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		
	}
}
