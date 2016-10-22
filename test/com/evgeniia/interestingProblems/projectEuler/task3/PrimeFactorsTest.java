package com.evgeniia.interestingProblems.projectEuler.task3;

import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by evgeniia on 10/21/16.
 */
public class PrimeFactorsTest {
    @org.junit.Test
    public void getFactorsOfSmallPositiveNumber() throws Exception {

        PrimeFactors tester = new PrimeFactors();
        ArrayList<Long> expected = new ArrayList<>();

        expected.add(1L);
        expected.add(2L);
        expected.add(3L);
        Assert.assertEquals("the result must be {1,2,3} ", expected, tester.getFactors(6L));

    }

    @org.junit.Test
    public void getFactorsOfSmallNegativeNumber() throws Exception {

        PrimeFactors tester = new PrimeFactors();
        ArrayList<Long> expected = new ArrayList<>();

        expected.add(1L);
        expected.add(2L);
        expected.add(2L);
        Assert.assertEquals("the result must be {1,2,2} ", expected, tester.getFactors(-4L));

    }


    @org.junit.Test
    public void getMaxFactor() throws Exception {

        PrimeFactors tester = new PrimeFactors();
        long actual = tester.getMaxFactor(tester.getFactors(12L));
        assertEquals("The biggest prime factor of 12 is 3", 3L, actual);

    }

}