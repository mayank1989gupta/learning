/**
 * 
 */
package com.learning.samplers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Mayank
 * HackerRank: Sort the given set of Strings using BigDecimals.</br>
 */
public class HackerRankJavaBigDecimal {

	public static void main(String args[]) {
		//Input
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String []s=new String[n+2];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		sc.close();

		/********************* Solution ********************************/
		//Sorting the given array
		Arrays.sort(s, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				if(s1 == null || s2 == null) {
					return 0;
				}

				BigDecimal a = new BigDecimal(s1);
				BigDecimal b = new BigDecimal(s2);

				return b.compareTo(a);//for sorting in the Desc order
			}
		});


		//Output
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}
