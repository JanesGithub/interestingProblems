package com.evgeniia.interestingProblems.projectEuler.task2;

/**
 * Created by evgeniia on 10/25/16.
 */
public class FindSumOfFibonacci {

    public static long findSumOfFibonacci(long maxNumber, boolean even) {

        if (maxNumber < 1) return 0;

        final int remainder = even ? 0 : 1;

        long fib2 = 1;
        long fib = 1;
        long sum = 0;

        while (fib <= maxNumber) {
            if (fib % 2 == remainder) {
                sum += fib;
            }
            long temp = fib2;
            fib2 = fib;
            fib = fib + temp;
        }
        return sum;
    }

    public static void main (String[] args) {
        System.out.println(findSumOfFibonacci(4000000,true));
    }

}
