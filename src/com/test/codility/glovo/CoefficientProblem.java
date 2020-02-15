package com.test.codility.glovo;

import java.math.BigInteger;

public class CoefficientProblem {

    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }

    public static int solution(int N, int K) {
        if(N == 0 || K == N) return -1;

        BigInteger max = new BigInteger("1000000000");
        BigInteger factNK = factorial(1, N - K, new BigInteger("1"));
        BigInteger factK = factorial((N - K) + 1, K, factNK);
        BigInteger factN = factorial(K + 1, N, factK);

        BigInteger coefficient = null;
        try {
            coefficient = factN.divide(factK.multiply(factNK));
            if(coefficient.compareTo(max) > 0) return -1;
        } catch (ArithmeticException exception) {
            return -1;
        }

        return coefficient.intValue();
    }

    /**
     * Method to get the factorial of given number
     */
    private static BigInteger factorial (int start, int end, BigInteger fact) {
        for(int i = start; i <= end; i++) fact = fact.multiply(new BigInteger(String.valueOf(i)));

        return fact;
    }
}
