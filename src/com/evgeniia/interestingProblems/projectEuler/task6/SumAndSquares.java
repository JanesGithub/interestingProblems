package com.evgeniia.interestingProblems.projectEuler.task6;

/**
 * Created by evgeniia on 11/6/16.
 */
public class SumAndSquares {

    public static long countSquareOfSum(int n) {
        if (n <= 0) return 0;
        long sum = (n * (n + 1)) / 2;
        return sum * sum;
    }

    public static long countSumOfSquares(int n) {
        if (n <= 0) return 0;
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static long countDifference(int n) {

        return countSquareOfSum(n) - countSumOfSquares(n);
    }

    public static void main(String[] args) {

        System.out.println(countDifference(100));
    }


}
