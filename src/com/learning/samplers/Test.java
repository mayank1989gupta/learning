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
 */
public class Test {

	public static void main(String[] args) {
		String regex = "\\b([ \\w]+)\\1";
		Pattern p = Pattern.compile(regex);

		String input = "Goodbye bye Bye world world world";
		//String input = "Hello hello Ab aB";
		Matcher m = p.matcher(input);

		// Check for subsequences of input that match the compiled pattern
		while (m.find()) {
			input = input.replaceAll(regex, "$1");
		}

		System.out.println(input);

	}

	public static void checkPrime(int ...numbers) {
		int counter = 0;

		for(int number : numbers) {
			if(number == 0 || number == 1) {
				continue;
			}

			if(isPrime(number)) {
				System.out.print((counter++ > 0 ? " " : "") + number);
			}


		}

		System.out.println();
	}

	private static boolean isPrime(int number) {
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				return false;
		}
		return true; 
	}

}
