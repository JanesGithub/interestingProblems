package com.evgeniia.interestingProblems.projectEuler.task7;

/**
 * Created by evgeniia on 11/7/16.
 */
public class FindPrimeNumberVersion2 {

        public static boolean checkIfPrime(long n, long[] primes) {
            if (n <= 1) return false;
            if (n == 2) return true;

            for (int i = 0; primes[i] <= Math.sqrt(n) && i < primes.length; i++) {
                if (n % primes[i] == 0) {
                    return false;
                }
            }
            return true;
        }

        public static long getPrimeNumber(int n) {
            if (n <= 0) return -1;

            long[] primes = new long[n];
            primes[0] = 2;

            int i = 1;
            int checkedNumber = 3;
            while (i < n) {
                if (checkIfPrime(checkedNumber, primes)) {
                    primes[i] = checkedNumber;
                    i++;
                }
                checkedNumber += 2;
            }
            return primes[n-1];
        }

        public static void main(String[] args) {
            System.out.println(getPrimeNumber(10001));
        }
}
