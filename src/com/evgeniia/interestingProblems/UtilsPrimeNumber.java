package com.evgeniia.interestingProblems;

import java.util.ArrayList;

/**
 * Created by evgeniia on 1/12/17.
 */
public class UtilsPrimeNumber {

    //count all prime factors with repeats
    public static ArrayList<Integer> getFactors(long n) {

        //zeroNotImplemented

        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(1);

        if (n == 1 || n == -1) {
            return factors;
        }
        int i = 2;

        while (n != 1 && n != -1) {

            while ((n % i) == 0) {
                n = n / i;
                factors.add(i);
            }
            i++;
        }
        return factors;
    }

    //method checks if the given number is prime
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

    //get the n-th prime number
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


}
