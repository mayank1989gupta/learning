package com.hackerank.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to generate Parenthesis.
 * Sample: if n = 3:
 * Result: ["((()))","(()())","(())()","()(())","()()()"]
 */
public class GenerateParenthesis {

    public static void main(String args[]) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    private static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        populateResult(result, "", n, n);

        return result;
    }

    private static void populateResult(List<String> result, String str, int left, int right) {
        if(left > right) return;
        if(left == 0 && right == 0) {
            result.add(str);
            return;
        }

        if(left > 0) populateResult(result, str + "(", left - 1, right);
        if(right > 0) populateResult(result, str + ")", left, right - 1);
    }


}
