package com.evgeniia.interestingProblems.projectEuler.task5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 10/31/16.
 */
public class SmallestMultipleVersion2Test {

    @Test
    public void findSmallestMultiple() throws Exception {

        assertEquals(-1,SmallestMultipleVersion2.findLcm(3,2));
        assertEquals(-1,SmallestMultipleVersion2.findLcm(-1,2));
        assertEquals(-1,SmallestMultipleVersion2.findLcm(0,2));

        assertEquals(1,SmallestMultipleVersion2.findLcm(1,1));
        assertEquals(6,SmallestMultipleVersion2.findLcm(2,3));
        assertEquals(60,SmallestMultipleVersion2.findLcm(1,5));
        assertEquals(2520,SmallestMultipleVersion2.findLcm(1,10));
        assertEquals(27720,SmallestMultipleVersion2.findLcm(2,11));

    }
}