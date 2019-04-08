/**
 * 
 */
package com.hackerank.algorithms;

import java.util.Scanner;

/**
 * @author Mayank
 *
 * Hacker Rank: To find whether the given username is valid or, not.</br>
 * 1. The username consists of 8 to 30 characters inclusive. If the username 
 * consists of less than 8 or greater than 30 characters, then it is an invalid username.</br>
 * 2. The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters 
 * describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
 * 3. The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] 
 * or uppercase character [A-Z].
 */
public class HackerRankValidUsername {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";//Regex --> This needs to be changed.
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(regex)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}           
		}

	}

}
