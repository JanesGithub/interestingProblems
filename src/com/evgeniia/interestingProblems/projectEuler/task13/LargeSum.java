package com.evgeniia.interestingProblems.projectEuler.task13;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.*;
import java.util.Scanner;

/**
 * Created by evgeniia on 1/13/17.
 */
public class LargeSum {
    public static BigInteger[] readFile(File file, int n) throws FileNotFoundException {
        Scanner s = new Scanner(file);
        if (!s.hasNextLine()) {
            throw new IllegalArgumentException("the file is empty " + file.getAbsolutePath());
        }
        BigInteger[] bigNumbers = new BigInteger[n];
        int i = 0;
        while (s.hasNextLine()) {
            bigNumbers[i] = s.nextBigInteger();
            i++;
        }

        return bigNumbers;
    }

    public static BigInteger countSum(BigInteger[] bigNumbers) {
        int n = bigNumbers.length;
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            sum = sum.add(bigNumbers[i]);
        }
        System.out.println("the result is " + sum);
        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {
        countSum(readFile(new File("src/com/evgeniia/interestingProblems/projectEuler/task13/data"), 100));
    }
}
