package com.evgeniia.interestingProblems.projectEuler.task11;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 12/16/16.
 */
public class LargestProductInGridTest {

    @Test
    public void getLargestProductInRowTest() throws FileNotFoundException {
        long lpRow = LargestProductInGrid.getLargestProductInRow(LargestProductInGrid.readGrid(new File("src/com/evgeniia/interestingProblems/projectEuler/task11/testData"), 4), 2);
        assertEquals(6650, lpRow);
    }

    @Test
    public void getLargestProductInColumnTest() throws FileNotFoundException {
        long lpColumn = LargestProductInGrid.getLargestProductInColumn(LargestProductInGrid.readGrid(new File("src/com/evgeniia/interestingProblems/projectEuler/task11/testData"), 4), 2);
        assertEquals(4212, lpColumn);
    }

    @Test
    public void getLargestProductInDiagonalTest() throws FileNotFoundException {
        long lpDiagonal = LargestProductInGrid.getLargestProductInDiagonal(LargestProductInGrid.readGrid(new File("src/com/evgeniia/interestingProblems/projectEuler/task11/testData"), 4), 2);
        assertEquals(9603, lpDiagonal);
    }

    @Test
    public void getLargestProductInReverseDiagonalTest() throws FileNotFoundException {
        long lpDiagonal = LargestProductInGrid.getLargestProductInReverseDiagonal(LargestProductInGrid.readGrid(new File("src/com/evgeniia/interestingProblems/projectEuler/task11/testData"), 4), 2);
        assertEquals(7227, lpDiagonal);
    }
}