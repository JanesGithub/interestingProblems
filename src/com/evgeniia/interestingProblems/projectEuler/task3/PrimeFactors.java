package com.evgeniia.interestingProblems.projectEuler.task3;

import java.util.ArrayList;

/**
 * Created by evgeniia on 10/20/16.
 */

public class PrimeFactors {

    public static ArrayList<Long> getFactors(long n) {

        //zeroNotImplemented

        ArrayList<Long> factors = new ArrayList<>();
        factors.add(1L);

        if (n == 1 || n == -1) {
            return factors;
        }
        long i = 2;

        while (n != 1 && n != -1) {

            while ((n % i) == 0) {
                n = n / i;
                factors.add(i);
            }
            i++;
        }
        return factors;
    }

    public static long getMaxFactor(ArrayList<Long> factors) {

        int lastIndex = factors.size() - 1;
        return factors.get(lastIndex);
    }

    public static void main(String[] args) {

        long p = 600851475143L;
        long maxPrimeFactor4 = getMaxFactor(getFactors(p));
        System.out.println(maxPrimeFactor4);
    }

}

