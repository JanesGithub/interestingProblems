package com.evgeniia.interestingProblems.projectEuler.task10;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 12/16/16.
 */
public class SumOfPrimesTest {

    @Test
    public void countSumOfPrimesTest() {
        assertEquals(17, SumOfPrimes.countSumOfPrimes(10));
        assertEquals(0, SumOfPrimes.countSumOfPrimes(2));
        assertEquals(2, SumOfPrimes.countSumOfPrimes(3));
    }
}