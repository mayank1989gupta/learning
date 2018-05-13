/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class Test {

	public static void main(String[] args) {
		/*String regex = "\\b([ \\w]+)\\1";
		Pattern p = Pattern.compile(regex);

		String input = "Goodbye bye Bye world world world";
		//String input = "Hello hello Ab aB";
		Matcher m = p.matcher(input);

		// Check for subsequences of input that match the compiled pattern
		while (m.find()) {
			input = input.replaceAll(regex, "$1");
		}

		System.out.println(input);*/


		/*Set<Integer> result = new LinkedHashSet<>();

		for(int i = 0; i <= 9 ; i++) {
			if(i%2 != 0) {
				result.add(i);
			}
		}
		//int[] data = result.stream().toArray(Integer[]::new);
		int[] data = result.toArray();

		for(int val : data) {
			System.out.println(val);
		}*/

		//String abc = "Mayank";

		//System.out.println(String.format("%1$" + 15 + "s", abc));
		System.out.println('(' - ')');

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
