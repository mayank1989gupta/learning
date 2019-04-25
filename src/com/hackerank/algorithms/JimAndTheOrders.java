/**
 * 
 */
package com.hackerank.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Mayank
 * Hacker Rank: Jim and the Orders
 *
 */
public class JimAndTheOrders {

    // Complete the jimOrders function below.
    static Integer[] jimOrders(int[][] input) {
        
        Map<Integer, List<Integer>> data = new TreeMap<>();
        
        for(int i = 0; i < input.length; i++) {
            if(data.containsKey(input[i][0] + input[i][1])) {
                data.get(input[i][0] + input[i][1]).add(i+1);
            } else {
                List<Integer> list = new LinkedList<Integer>();
                list.add(i+1);
                data.put(input[i][0] + input[i][1], list);
            }
        }
        
        List<Integer> result = new LinkedList<>();
        for(Map.Entry<Integer, List<Integer>> customer : data.entrySet()) {
            result.addAll(customer.getValue());
        }
        
        Integer[] resultData = result.toArray(new Integer[result.size()]);
        
        return resultData;
    }

    //Part of the question.
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] orders = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int ordersItem = Integer.parseInt(ordersRowItems[j]);
                orders[i][j] = ordersItem;
            }
        }

        Integer[] result = jimOrders(orders);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
