package com.learning.samplers;

import java.util.Arrays;
import java.util.List;

public class SmallestCommonNumber {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 4, 5, 8, 10);
        List<Integer> list2 = Arrays.asList(8, 3, 2, 6, 10);
        // Java8
        int result = list1.stream().filter(list2::contains).distinct().
                sorted().skip(0).limit(1).findFirst().orElse(Integer.MIN_VALUE);
        System.out.println(result); //Output: 8 -> Smallest common in the 2 lists
    }
}
