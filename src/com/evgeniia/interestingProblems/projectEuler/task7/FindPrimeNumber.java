package com.evgeniia.interestingProblems.projectEuler.task7;

/**
 * Created by evgeniia on 11/7/16.
 */
public class FindPrimeNumber {

    public static boolean checkIfPrime(long n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long getPrimeNumber(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 2;

        int i = 2;
        int checkedNumber = 3;
        while (i != n) {
            checkedNumber += 2;
            if (checkIfPrime(checkedNumber)) {
                i++;
            }
        }
        return checkedNumber;
     }

     public static void main(String[] args) {

         System.out.println(getPrimeNumber(10001));
     }
}
