package com.evgeniia.interestingProblems.projectEuler.task7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 11/7/16.
 */
public class FindPrimeNumberVersion2Test {

    @Test
    public void getPrimeNumberTest() throws Exception {
        assertEquals(-1,FindPrimeNumberVersion2.getPrimeNumber(-1));
        assertEquals(2,FindPrimeNumberVersion2.getPrimeNumber(1));
        assertEquals(3,FindPrimeNumberVersion2.getPrimeNumber(2));
        assertEquals(13,FindPrimeNumberVersion2.getPrimeNumber(6));
        assertEquals(17,FindPrimeNumberVersion2.getPrimeNumber(7));

    }
}