package com.evgeniia.interestingProblems.projectEuler.task12;

import java.util.*;

import com.evgeniia.interestingProblems.UtilsPrimeNumber;

/**
 * Created by evgeniia on 1/12/17.
 */
public class TriangularNumber {

    public static int countQuantityOfDivisors(long n) {
        ArrayList<Integer> factors = UtilsPrimeNumber.getFactors(n);
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for(Integer f: factors) {
            Integer count = freqMap.get(f);
            freqMap.put(f, (count==null) ? 1 : ++count);
        }
        int quantity = 1;
        for (int i: freqMap.values()) {
            quantity *= (i + 1);

        }
        quantity /= 2;
        return quantity;
    }

    public static long getTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    //get the first triangular number with over n divisors
    public static long getTNWithDivisors(int numberOfDivisors) {
        int i = 1;
        int n = 1;
        long triangularNumber = 1;
        while (n < numberOfDivisors) {
            triangularNumber = getTriangularNumber(++i);
            n = countQuantityOfDivisors(triangularNumber);
        }
        System.out.println(triangularNumber + " and quantity of divisors =" + n);
        return triangularNumber;
    }

    public static void main(String[] args) {
        getTNWithDivisors(500);
    }
}
