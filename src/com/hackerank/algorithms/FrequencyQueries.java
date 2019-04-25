/**
 * 
 */
package com.hackerank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Mayank
 * Hacker Rank: Frequency Queries
 */
public class FrequencyQueries {
	//Method to calculate the freq query
	static List<Integer> freqQuery(List<List<Integer>> queries) {
		Map<Long, Long> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();

		long operation = 0;
		long value = 0;
		for(List<Integer> query : queries) {
			operation = query.get(0);
			value = query.get(1);
			if(operation == 1) {
				if(map.get(value) == null) {
					map.put(value, 1l);
				} else {
					map.put(value, map.get(value) + 1);
				}
			} else if (operation == 2) {
				if(map.get(value) != null) 
					map.put(value, map.get(value) - 1);
			} else if (operation == 3) {
				//Solution with Streams --
				/*
				 * Stream<Integer> keyStream = keys(map, value); int va =
				 * (int)keyStream.count(); result.add(va > 0 ? 1 : 0); System.out.println(va > 0
				 * ? 1 : 0);
				 */
				//System.out.println(check(value, map) ? 1 : 0);
				result.add(check(value, map) ? 1 : 0);
			}


		}

		map = null;//
		return result;

	}

	/**
	 * Method to check map contains values with given frequency.</br>
	 * 
	 * @param value
	 * @param map
	 * @return
	 */
	private static boolean check(long value, Map<Long, Long> map) {
		boolean result = Boolean.FALSE;
		for(long key : map.keySet()) {
			if(map.get(key) == value) {
				result = Boolean.TRUE;
				break;
			}
		}

		return result;
	}

	static <K, V> Stream<K> keys(Map<K, V> map, V value) {
		Stream<Object> streamSupplier = map
				.entrySet()
				.stream()
				.filter(entry -> value.equals(entry.getValue()))
				.map(Map.Entry::getKey);

		return (Stream<K>) streamSupplier;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<List<Integer>> queries = new ArrayList<>();

		/* IntStream.range(0, q).forEach(i -> {
			try {
				queries.add(
						Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt)
						.collect(toList())
						);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}); */

		List<Integer> ans = freqQuery(queries);

		/*bufferedWriter.write(
				ans.stream()
				.map(Object::toString)
				.collect(joining("\n"))
				+ "\n"
				); */

		bufferedReader.close();
		bufferedWriter.close();
	}
}
