package com.learning.samplers;

import java.util.ArrayList;
import java.util.List;

public class LeastValidTime {

	public static void main(String[] args) {
		System.out.println(minimum24Hour(1, 8, 3, 2, 6, 4));
	}

	/**
	 * Method to fetch the minimum valid time for the given digits.</br>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * @return
	 */
	private static String minimum24Hour(int a, int b, int c, int d, int e, int f) {
		/*int digits = createDigits(a, b, c, d, e, f);
		if (digits < 1000 || digits >= 1000000) {
			return "invalid input";
		}*/
		
		// get all possibles and find the biggest
		int minTime = -1;
		List<String> singles = getDigits(a, b, c, d, e, f);
		List<String> combinations = getPermutations(singles);
		int timeInt = 0;
		int counter = 0;
		for (String timeStr : combinations) {
			timeInt = Integer.parseInt(timeStr);
			if(counter == 0 && isValidTime(timeInt)) {
				minTime = timeInt;
				counter++;
			}
			
			if (isValidTime(timeInt) && timeInt < minTime) {
				minTime = timeInt;
			}
			
			
		}

		// If none is valid
		if (minTime < 0) {
			return "cannot find any valid time";
		}
		// Convert int to time
		int hour = minTime / 10000;
		int mmss = minTime % 10000;
		int min = mmss / 100;
		int ss = mmss % 100;
		
		return (hour < 10 ? "0" + hour : hour) + ":" + (min < 10 ? "0" + min : min) + ":" + (ss < 10 ? "0" + ss : ss);
	}

	private static int createDigits(int a, int b, int c, int d, int e, int f) {
		String digits = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d) + String.valueOf(e) + String.valueOf(f);
		return Integer.valueOf(digits);
	}

	/**
	 * 
	 * 
	 * @param time
	 * @return
	 */
	private static boolean isValidTime(int time) {
		int hour = time / 10000;
		int mmss = time % 10000;
		int min = mmss / 100;
		int ss = mmss % 100;
		return hour <= 23 && min <= 59 && ss <=59;
	}


	/**
	 * Returning all the permutations possible.</br>
	 * 
	 * @param inputs
	 * @return
	 */
	private static List<String> getPermutations(List<String> inputs) {
		if (inputs.size() <= 1) {
			return inputs;
		}

		List<String> result = new ArrayList<>();
		for (int i = 0; i < inputs.size(); ++i) {
			List<String> copy = new ArrayList<>(inputs);
			copy.remove(i);
			List<String> recusive = getPermutations(copy);
			for (String values : recusive) {
				result.add(inputs.get(i) + values);
			}
		}
		return result;
	}

	/**
	 * Adding the given digits to a list.</br>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * @return
	 */
	private static List<String> getDigits(int a, int b, int c, int d, int e, int f) {
		List<String> singleDigits = new ArrayList<>();
		singleDigits.add(String.valueOf(a));
		singleDigits.add(String.valueOf(b));
		singleDigits.add(String.valueOf(c));
		singleDigits.add(String.valueOf(d));
		singleDigits.add(String.valueOf(e));
		singleDigits.add(String.valueOf(f));
		return singleDigits;
	}
}
