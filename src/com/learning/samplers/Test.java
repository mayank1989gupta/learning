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
		
		List<BigDecimal> tester = new ArrayList<>();
		tester.add(new BigDecimal("-100"));
		tester.add(new BigDecimal("-1"));
		tester.add(new BigDecimal("02.65"));
		tester.add(new BigDecimal("90"));
		tester.add(new BigDecimal(".12"));
		
		Collections.sort(tester);
		
		BigDecimal[] test = new BigDecimal[5];
		test[0] = new BigDecimal("-100");
		test[1] = new BigDecimal("-1");
		test[2] = new BigDecimal("02.65");
		test[3] = new BigDecimal("12");
		test[4] = new BigDecimal(".12");
		
		Arrays.sort(null, new Comparator<String>() {
		    @Override
		    public int compare(String o1, String o2) {
			if (o1 == null || o2 == null) {
			    return 0;
			}
			BigDecimal o1bd = new BigDecimal(o1);
			BigDecimal o2bd = new BigDecimal(o2);
			return o2bd.compareTo(o1bd);
		    }
		});
		
		for(BigDecimal data : tester) {
			System.out.println(data);
		}


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

		String abc = "Mayank";

		System.out.println(String.format("%1$-" + 15 + "s", abc));


	}

	private static boolean isPrime(int number) {
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				return false;
		}
		return true; 
	}

}
