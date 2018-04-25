/**
 * 
 */
package com.learning.samplers;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Mayank
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Set<String> test = new TreeSet<>();
		test.add("bde");
		test.add("abc");
		test.add("xyz");
		String s = "mayankgupta";
		char[] data = s.toCharArray();
		System.out.println(String.valueOf(data, 0, 3));
		

		//Scanner sc=new Scanner(System.in);
		String a="vuut";
		String b="vuuuuu";

		int size_a = a.length();
		int size_b = b.length();
		System.out.println(size_a + size_b);
		System.out.println(compare(a, b) < 1 ? "No" : "Yes");

		char[] chars_a = a.toCharArray();
		chars_a[0] = Character.toUpperCase(chars_a[0]);

		char[] chars_b = b.toCharArray();
		chars_b[0] = Character.toUpperCase(chars_b[0]);

		System.out.print(chars_a);
		System.out.print(" ");
		System.out.print(chars_b);

	}

	public static int compare(String a1, String a2) {
		if(a1.length() < a2.length()) return -1;
		if(a1.length() > a2.length()) return 1;

		for(int i = 0 ; i < a1.length(); i++) {
			if((int)a1.charAt(i) < (int)a2.charAt(i)) return -1;
			if((int)a1.charAt(i) > (int)a2.charAt(i)) return 1;
		}

		return 0;
	}

}
