package com.evgeniia.interestingProblems.projectEuler.task7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 11/7/16.
 */
public class FindPrimeNumberTest {

    @Test
    public void checkIfPrimeTest() throws Exception {
        assertTrue(FindPrimeNumber.checkIfPrime(2));
        assertFalse(FindPrimeNumber.checkIfPrime(1));
        assertFalse(FindPrimeNumber.checkIfPrime(-5));
        assertTrue(FindPrimeNumber.checkIfPrime(19));
        assertTrue(FindPrimeNumber.checkIfPrime(29));

    }

    @Test
    public void getPrimeNumberTest() throws Exception {
        assertEquals(0,FindPrimeNumber.getPrimeNumber(-1));
        assertEquals(2,FindPrimeNumber.getPrimeNumber(1));
        assertEquals(3,FindPrimeNumber.getPrimeNumber(2));
        assertEquals(13,FindPrimeNumber.getPrimeNumber(6));
        assertEquals(17,FindPrimeNumber.getPrimeNumber(7));

    }
}