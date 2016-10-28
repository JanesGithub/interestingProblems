package com.evgeniia.interestingProblems.projectEuler.task4;

import java.util.ArrayDeque;
import java.util.Objects;

/**
 * Created by evgeniia on 10/27/16.
 */
public class MaxPalindrome {

    public static boolean checkIfPalindrome(long n) {
        ArrayDeque<Integer> arrayOfDigitsOfNumber = new ArrayDeque<>();

        while (n > 0) {
            arrayOfDigitsOfNumber.add((int) (n % 10));
            n /= 10;
        }
        while (arrayOfDigitsOfNumber.size() > 1) {
            if (arrayOfDigitsOfNumber.pollFirst() != arrayOfDigitsOfNumber.pollLast()) {
                return false;
            }
        }
        return true;
    }

    public static long getMaxPalindromeOfProduction(int minNumber, int maxNumber) {
        //only positive numbers are expected
        if (minNumber < 0 || maxNumber < 0 || (minNumber > maxNumber)) {
            return -1;
        }

        long maxPalindrome = -1;
        for (int i = maxNumber; i >= minNumber; i--) {
            for (int j = i; j >= minNumber; j--) {
                long product = i * j;
                if (checkIfPalindrome(product)) {
                    if (maxPalindrome < product) {
                        maxPalindrome = product;
                    }
                }
            }
        }
        return maxPalindrome;
    }

    public static void main(String[] args) {
        long maxPalindrome = getMaxPalindromeOfProduction(100,999);
        System.out.println(maxPalindrome);
    }


}
