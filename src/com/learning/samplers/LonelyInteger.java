package com.learning.samplers;

import java.util.Arrays;

public class LonelyInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};
        System.out.println(Arrays.stream(arr).reduce(0, (x, y) -> x ^ y));
    }
}
