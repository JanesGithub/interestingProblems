package com.evgeniia.interestingProblems.projectEuler.task15;

/**
 * Created by evgeniia on 1/20/17.
 */
public class LatticePaths {

    private static long[][] createGrid(int n) {
        long[][] grid = new long[n + 1][n + 1];
        grid[0][0] = 0;
        for (int i = 1; i < n + 1; i++) {
            grid[0][i] = 1;
            grid[i][0] = 1;
        }
        return grid;
    }

    public static long countLatticePaths(int n) {
        long[][] grid = createGrid(n);
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
                System.out.println(grid[i][j]);
            }
        }
        System.out.println(grid[n][n]);
        return grid[n][n];
    }

    public static void main(String[] args) {
        countLatticePaths(20);
    }

}
