package com.evgeniia.interestingProblems.projectEuler.task5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 10/31/16.
 */
public class SmallestMultipleTest {

    @Test
    public void findSmallestMultiple() throws Exception {

        assertEquals(-1,SmallestMultiple.findSmallestMultiple(3,2));
        assertEquals(-1,SmallestMultiple.findSmallestMultiple(-1,2));
        assertEquals(-1,SmallestMultiple.findSmallestMultiple(0,2));

        assertEquals(1,SmallestMultiple.findSmallestMultiple(1,1));
        assertEquals(6,SmallestMultiple.findSmallestMultiple(2,3));
        assertEquals(60,SmallestMultiple.findSmallestMultiple(1,5));
        assertEquals(2520,SmallestMultiple.findSmallestMultiple(1,10));
        assertEquals(27720,SmallestMultiple.findSmallestMultiple(2,11));


    }

}