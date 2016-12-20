package com.evgeniia.interestingProblems.projectEuler.task10;

/**
 * Created by evgeniia on 12/16/16.
 */
public class SumOfPrimes {

    public static boolean checkIfPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long countSumOfPrimes(int max) {
        long sum = 0;
        if (max > 2) sum = 2;

        for (int i = 3; i < max; i += 2) {
            if (checkIfPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        countSumOfPrimes(2000000);
    }
}
