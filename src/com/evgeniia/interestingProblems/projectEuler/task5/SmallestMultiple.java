package com.evgeniia.interestingProblems.projectEuler.task4;

/**
 * Created by evgeniia on 10/31/16.
 */
public class SmallestMultiple {

    public static long findSmallestMultiple (int min, int max) {

        // only positive arguments are expected
        if ((min > max) || min <= 0) {
            return -1;
        }

        int numberOfMultipliers = max - min;
        int[] arrayOfMultipliers = new int[numberOfMultipliers];

        // if some multiplier can be divided 
        for (int i = numberOfMultipliers - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayOfMultipliers[i] % arrayOfMultipliers[j] == 0) {
                    arrayOfMultipliers[j] = 1;
                }
            }
        }

        long smallestMultiple = 1;
        for (int i = 0; i < numberOfMultipliers; i++) {
            smallestMultiple *= arrayOfMultipliers[i];
        }
        return smallestMultiple;
    }
}
