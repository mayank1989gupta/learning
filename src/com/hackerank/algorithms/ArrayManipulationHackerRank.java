/**
 * 
 */
package com.hackerank.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Mayank
 *
 */
public class ArrayManipulationHackerRank {


	/**
	 * Method to manipulate the array.
	 * Takes the input as length of the array &, queries.
	 * 
	 * After the queries returns the maximum from the array.</br>
	 * 
	 * @param n
	 * @param queries
	 * @return
	 */
	static int arrayManipulation(int n, int[][] queries) {
		int[] arr = new int[n];

		int startIndex;
		int endIndex;
		int tee1 = 0;
		int temp = 0;
		int max = 0;
		for(int i = 0 ; i < queries.length; i++) {
			tee1++;
			startIndex = (queries[i][0]) - 1;//Starting Index
			endIndex = (queries[i][1]) - 1;//End Index
			temp = (queries[i][2]);//value to be added
			while(startIndex <= endIndex) {
				arr[startIndex] += temp;//adding to the existing value
				if(arr[startIndex] > max) {
					max = arr[startIndex];//max
				}
				startIndex++;//incrementing the index.
			}
		}

		System.out.println(tee1);

		return max;//Result
	}

	/** Below code is the from the question.**/
	/**You are given a list(1-indexed) of size , initialized with zeroes. You have to perform  operations on the list and output the maximum of final values of all the  elements in the list. For every operation, you are given three integers ,  and  and you have to add value  to all the elements ranging from index  to (both inclusive).

    For example, consider a list  of size . The initial list would be  = [, , ] and after performing the update  = , the new list would be  = [, , ]. Here, we've added value 30 to elements between indices 2 and 3. Note the index of the list starts from 1.

    Input Format

    The first line will contain two integers  and  separated by a single space.
    Next  lines will contain three integers ,  and  separated by a single space.
    Numbers in list are numbered from  to .

	 **/
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0].trim());

		int m = Integer.parseInt(nm[1].trim());

		int[][] queries = new int[m][3];

		for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");

			for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
				int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
				queries[queriesRowItr][queriesColumnItr] = queriesItem;
			}
		}

		int result = arrayManipulation(n, queries);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}
}
