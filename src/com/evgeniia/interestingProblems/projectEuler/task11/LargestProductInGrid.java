package com.evgeniia.interestingProblems.projectEuler.task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by evgeniia on 12/16/16.
 */
public class LargestProductInGrid {

    public static int[][] readGrid(File file, int n) throws FileNotFoundException {
        Scanner s = new Scanner(file);
        if (!s.hasNextLine()) {
            throw new IllegalArgumentException("the file is empty " + file.getAbsolutePath());
        }
        int[][] grid = new int[n][n];
        int i = 0;
        while (s.hasNextLine()) {
           // String line = s.nextLine();
           // String[] split = line.split(" ");
            for (int j = 0; j < n; j++) {
//                grid[i][j] = Integer.parseInt(split[j]);
//                System.out.print((grid[i][j] < 10 ? ("0" + grid[i][j]) : grid[i][j]) + " ");
                grid[i][j] = s.nextInt();
                System.out.print((grid[i][j] < 10 ? ("0" + grid[i][j]) : grid[i][j]) + " ");
            }
            System.out.println();
            i++;
        }
        return grid;
    }

    public static long getLargestProductInRow(int[][] grid, int numberOfFactors) {
        int n = grid.length;
        long largestProduct = 1;
        long product = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - numberOfFactors; j++) {
                for (int k = 0; k < numberOfFactors; k++) {
                    product *= grid[i][j + k];
                }
                if (product > largestProduct) {
                    largestProduct = product;
                }
                product = 1;
            }
        }
        System.out.println(largestProduct);
        return largestProduct;
    }

    public static long getLargestProductInColumn(int[][] grid, int numberOfFactors) {
        int n = grid.length;
        long largestProduct = 1;
        long product = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - numberOfFactors; j++) {
                for (int k = 0; k < numberOfFactors; k++) {
                    product *= grid[j + k][i];
                }
                if (product > largestProduct) {
                    largestProduct = product;
                }
                product = 1;
            }
        }
        System.out.println(largestProduct);
        return largestProduct;
    }

    public static long getLargestProductInDiagonal(int[][] grid, int numberOfFactors) {
        int n = grid.length;
        long largestProduct = 1;
        long product = 1;
        for (int i = numberOfFactors - 1; i < n; i++) {
            for (int j = 0; j <= n - numberOfFactors; j++) {
                for (int k = 0; k < numberOfFactors; k++) {
                    product *= grid[i - k][j + k];
                }
                if (product > largestProduct) {
                    largestProduct = product;
                }
                product = 1;

            }
        }
        System.out.println(largestProduct);
        return largestProduct;
    }

    public static long getLargestProductInReverseDiagonal(int[][] grid, int numberOfFactors) {
        int n = grid.length;
        long largestProduct = 1;
        long product = 1;
        for (int i = 0; i <= n - numberOfFactors; i++) {
            for (int j = 0; j <= n - numberOfFactors; j++) {
                for (int k = 0; k < numberOfFactors; k++) {
                    product *= grid[i + k][j + k];
                }
                if (product > largestProduct) {
                    largestProduct = product;
                }
                product = 1;

            }
        }
        System.out.println(largestProduct);
        return largestProduct;
    }

    public static long getLargestProduct(int[][] grid, int numberOfFactors) {
        long[] p = new long[4];
        p[0] = getLargestProductInRow(grid, numberOfFactors);
        p[1] = getLargestProductInColumn(grid, numberOfFactors);
        p[2] = getLargestProductInDiagonal(grid, numberOfFactors);
        p[3] = getLargestProductInReverseDiagonal(grid, numberOfFactors);

        long largestProduct = p[0];
        for (int i = 1; i < 4; i++) {
            if (largestProduct < p[i]) {
                largestProduct = p[i];
            }
        }
        System.out.println(largestProduct);
        return largestProduct;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[][] grid = readGrid(new File("src/com/evgeniia/interestingProblems/projectEuler/task11/grid20x20.txt"), 20);
        getLargestProduct(grid, 4);
    }

}

