/**
 * 
 */
package com.learning.samplers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mayank
 *
 */
public class ReversingWithoutVariable {

	public static void main(String args[]) throws IOException {
		System.out.print("Enter Text: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		
		char[] c = name.toCharArray();
		
		for(int i = c.length - 1 ; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}
}
