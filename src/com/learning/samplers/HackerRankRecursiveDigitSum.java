/**
 * 
 */
package com.learning.samplers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Mayank
 *
 * Problem Statement: 
 * super_digit(9875)   	9+8+7+5 = 29 
 * super_digit(29) 	2 + 9 = 11
 * super_digit(11)		1 + 1 = 2
 * super_digit(2)		= 2  
 *
 */
public class HackerRankRecursiveDigitSum {// Complete the superDigit function below.

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		String n = nk[0];

		int k = Integer.parseInt(nk[1]);

		int result = superDigit(n, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	/**
	 * Method which takes the n i.e. the number
	 * &, k number of times the initial sum has to be added.
	 * returns the super digit for the given number.
	 * 
	 * Makes recursive call for fetch the super digit.</br>
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	private static int superDigit(String n, int k) {
		if(n.length() == 1) {
			return Integer.valueOf(n);
		} else {
			long total = 0;
			char[] numbers = n.toCharArray();
			for(char number : numbers) {
				total += Character.getNumericValue(number);
			}

			total = total * k;
			return superDigit(String.valueOf(total), 1);
		}

	}
}
