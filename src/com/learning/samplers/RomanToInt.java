package com.learning.samplers;

public class RomanToInt {

    public static void main(String args[]) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int number = 10;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < values.length; i++) {
            while(number >= values[i]) {
                number -= values[i];
                result.append(numerals[i]);
            }
        }

        System.out.println(result.toString());
    }
}
