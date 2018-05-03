/**
 * 
 */
package com.learning.samplers;

import java.util.Scanner;

/**
 * @author Mayank
 *
 * Sample to find whether the given IP Address is valid or, not.</br>
 */
public class ValidIPAddressRegex {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		
		Scanner in = new Scanner(System.in);
		String ipAddress = null;
		while(in.hasNext()){
			ipAddress = in.next();
			System.out.println(ipAddress.matches(pattern));//Checks whether the given pattern matches or, not.
		}

	}

}
