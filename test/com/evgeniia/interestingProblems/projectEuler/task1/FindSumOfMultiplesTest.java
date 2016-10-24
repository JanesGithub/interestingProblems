package com.evgeniia.interestingProblems.projectEuler.task1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 10/23/16.
 */
public class FindSumOfMultiplesTest {
    @Test
    public void getSumOfMultiples() throws Exception {

        long actualPositive = FindSumOfMultiples.getSumOfMultiples(10L, 3L, 5L);
        assertEquals("Sum of multiples of 3 and 5 below 10 must be 23 ", 23, actualPositive);

        long actualNegative = FindSumOfMultiples.getSumOfMultiples(-10L, 3L, 5L);
        assertEquals("there are no natural multiples of 3 and 5 for -1 ", 0, actualNegative);

        long actualMin = FindSumOfMultiples.getSumOfMultiples(3L, 3L, 5L);
        assertEquals("there are no natural multiples of 3 and 5 below 3 ", 0, actualNegative);
    }

}