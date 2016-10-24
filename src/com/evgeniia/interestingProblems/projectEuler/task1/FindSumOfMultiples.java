package com.evgeniia.interestingProblems.projectEuler.task1;

import java.util.ArrayList;


/**
 * Created by evgeniia on 10/23/16.
 */
public class FindSumOfMultiples {

//only natural numbers are expected for method getMultiples

    public static ArrayList<Long> getMultiples(long n, long ... multiplierArray) {

        ArrayList<Long> multiples = new ArrayList<>();
        for (long i = 1; i < n; i++) {
            for (Long multiplier : multiplierArray) {
                if (i % multiplier == 0) {
                    multiples.add(i);
                }
            }
        }
        return multiples;
    }

    public static long getSumOfMultiples(long n, long ... multiplierArray) {

        ArrayList<Long> multiples = getMultiples(n, multiplierArray);
        if (multiples == null) {
            return 0;
        }
        long sum = 0;
        for (Long multiple : multiples) {
            sum += multiple;
        }
        return sum;
    }

    public static void main(String[] args) {

        long sum = getSumOfMultiples(1000, 3, 5);
        System.out.println(sum);
    }

}




