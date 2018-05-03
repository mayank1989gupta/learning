/**
 * 
 */
package com.learning.samplers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mayank
 *
 * Hacker Rank: Remove duplicate words from a given String using regex.</br>
 */
public class RemoveDuplicateWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String regex = "\\b(\\w+)(\\s+\\1\\b)+";//regex
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);//pattern

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());//Number of cases

		String input = null;
		while (numSentences-- > 0) {
			input = in.nextLine();//input
			Matcher matcher = pattern.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (matcher.find()) {
				input = input.replaceAll(matcher.group(), matcher.group(1));//replacing the duplicates.
			}

			// Output
			System.out.println(input);
		}

		in.close();

	}

}
