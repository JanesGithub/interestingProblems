package com.evgeniia.interestingProblems.projectEuler.task9;


/**
 * Created by evgeniia on 12/15/16.
 */
public class PythagoreanTriplet {

    public static int getHypotenuse(int a, int b) {
        double c = Math.sqrt((double) a * a + b * b);

        if (c == Math.floor(c) && !Double.isInfinite(c)) {
            return (int) c;
        }
        else return 0;
    }

    public static void searchSpecialPythagorean(int n, int sum) {
        int c;
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                c = getHypotenuse(a, b);
                if (c > 0) { //if we found a Pythagorean triplet, then check the sum of its components
                    if (a + b + c == sum) {
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                        System.out.println(a * b * c);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        searchSpecialPythagorean(1000, 1000);
    }

}
