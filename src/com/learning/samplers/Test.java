/**
 * 
 */
package com.learning.samplers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mayank
 *
 */
public class Test {

	public static void main(String[] args) {
		
		int number = 148;
		int remainder = 0;
		while(number > 0) {
			remainder = number % 10;
			number = number /10;
			System.out.println(remainder);
		}
	}

}
