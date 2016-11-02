package com.evgeniia.interestingProblems.projectEuler.task5;

/**
 * Created by evgeniia on 10/31/16.
 */
public class SmallestMultiple {

    private static int[] initializeArray (int from, int to) {
        int length = to - from + 1;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = from + i;
        }
        return array;

    }

    public static long findSmallestMultiple (int min, int max) {

        // only positive arguments are expected
        if ((min > max) || min <= 0) {
            return -1;
        }

        int[] arrayOfMultipliers = initializeArray(min,max);

        long smallestMultiple = 1;
        for (int i = 0; i < arrayOfMultipliers.length; i++) {
            smallestMultiple *= arrayOfMultipliers[i];
            for (int j = 0; j < i; j++) {
                if (arrayOfMultipliers[i] % arrayOfMultipliers[j] == 0) {
                    smallestMultiple /= arrayOfMultipliers[j];
                    arrayOfMultipliers[j] = 1;
                }
            }
            for (int k = arrayOfMultipliers.length - 1; k > i; k--) {
                if (smallestMultiple % arrayOfMultipliers[k] == 0) {
                    arrayOfMultipliers[k] = 1;
                }
            }
        }
        return smallestMultiple;
    }

    public static void main(String[] args) {

        System.out.println(findSmallestMultiple(1,20));
    }
}
