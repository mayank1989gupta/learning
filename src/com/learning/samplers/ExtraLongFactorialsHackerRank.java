/**
 * 
 */
package com.learning.samplers;

import java.math.BigInteger;

/**
 * @author Mayank
 * Hacker Rank: Extra Long Factorial
 */
public class ExtraLongFactorialsHackerRank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int factorial = 25;
        BigInteger product = BigInteger.valueOf(factorial);
        
        for (int i = (factorial - 1); i > 0; i--) {
            product = product.multiply((BigInteger.valueOf(i)));
        }
        
        System.out.println(product);

	}

}
