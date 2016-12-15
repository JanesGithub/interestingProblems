package com.evgeniia.interestingProblems.projectEuler.task8;

/**
 * Created by evgeniia on 11/20/16.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GreatestProduct {

    static final char ZERO = '0';


    private static char[] getDigits(File file) throws FileNotFoundException {
        Scanner s = new Scanner(file);
        if (!s.hasNextLine()) {
            throw new IllegalArgumentException("the file is empty " + file.getAbsolutePath());
        }

        String number = s.useDelimiter("\\Z").nextLine();
        System.out.println(number);

        return number.toCharArray();
    }

    public static long countGreatestProduct(int numberOfFactors, File file) throws FileNotFoundException {
        final char[] digits = getDigits(file);
        final int n = digits.length;

        if (n < numberOfFactors) {
            throw new IllegalArgumentException("the number of factors must be less or equal than number of digits");
        }

        long product = 1;
        long temp = product;

        for (int j = 0; j < n - numberOfFactors; j++) {
            for (int i = 0; i < numberOfFactors; i++) {
                temp *= digits[j + i] - ZERO;
                System.out.println("temp " + temp);
            }
            if (temp > product) {
                product = temp;
            }
            temp = 1;
        }

        return product;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(countGreatestProduct(13, new File("src/com/evgeniia/interestingProblems/projectEuler/task8/EulerNumber.txt")));
    }

}
