package com.learning.dp.samples;

import java.util.Arrays;

public class ClimbingStairs {

    public static void main(String args[]) {
        int n = 2;
        int[] steps = {1, 2};

        int[] ways = new int[n+1];
        ways[0] = 1;

        for(int i = 0; i < steps.length; i++) {
            for(int j = steps[i]; j <= n; j++)
                ways[j] += ways[j - steps[i]];
        }

        System.out.println(ways[n]);
    }

    private static void countWays(int[] steps, int n) {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)
        long[] table = new long[n + 1];

        //Initialize table values with 0;
        Arrays.fill(table, 0);

        // Base case (If given value is 0)
        table[0] = 1;
        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i = 0; i < steps.length; i++) {
            for (int j = steps[i]; j <= n; j++) {
                table[j] = table[j] + table[j - steps[i]];
            }
        }

        System.out.println(table[(int) n]);
    }
}
