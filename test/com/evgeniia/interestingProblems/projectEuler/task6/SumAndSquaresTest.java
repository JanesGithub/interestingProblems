package com.evgeniia.interestingProblems.projectEuler.task6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 11/6/16.
 */
public class SumAndSquaresTest {

    @Test
    public void countSumOfSquaresTest() {
        assertEquals(5,SumAndSquares.countSumOfSquares(2));
        assertEquals(0,SumAndSquares.countSumOfSquares(0));
        assertEquals(0,SumAndSquares.countSumOfSquares(-4));
        assertEquals(385,SumAndSquares.countSumOfSquares(10));

    }

    @Test
    public void countSquareOfSumTest() {
        assertEquals(9,SumAndSquares.countSquareOfSum(2));
        assertEquals(0,SumAndSquares.countSquareOfSum(-2));
        assertEquals(0,SumAndSquares.countSquareOfSum(0));
        assertEquals(3025,SumAndSquares.countSquareOfSum(10));

    }
}