package com.evgeniia.interestingProblems.projectEuler.task5;

/**
 * Created by evgeniia on 10/31/16.
 */
public class SmallestMultipleVersion2 {

    public static long findGcd(long x, long y) {

        if (x < 0) x = -x;
        if (y < 0) y = -y;

        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }

    public static long findLcmFor2multipliers(long x, long y) {
        if (x < 0) x = -x;
        if (y < 0) y = -y;

        long gcd = findGcd(x,y);
        long lcm = x * y / gcd;
        return lcm;

    }

    public static long findLcm(int min, int max) {
        //only positive arguments are expected
        if (min > max || min <= 0) {
            return -1;
        }

        long lcm = 1;
        for (int i = min; i <= max; i++) {
            lcm = findLcmFor2multipliers(i,lcm);
        }
        return lcm;
    }

    public static void main(String[] args) {

        System.out.println(findLcm(1,20));
    }

}
