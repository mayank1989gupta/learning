package com.hackerank.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BracketStrings {

    public static void main(String args[]) {
        String input = "employee(id,age(date,month),role)";
        Set<String> result = new HashSet<>();
        Stack<String> stack = new Stack<>();
        String currentString = "";
        for (int i = 0; i < input.length(); i++) {
            while (isAlphabet(input.charAt(i))) {
                currentString += input.charAt(i);
                i++;
            }
            if(input.charAt(i) == '(') {
                currentString += ".";
                stack.push(currentString);
            } else if(input.charAt(i) == ',') {
                result.add(currentString);
                currentString = stack.peek();
            } else if(input.charAt(i) == ')') {
                result.add(currentString);
                stack.pop();
            }
        }
        System.out.println(Arrays.toString(result.toArray()));

    }

    private static boolean isAlphabet(char a) {
        return (a >= 'a' && a <='z') || (a >= 'A' && a <='Z');
    }
}
