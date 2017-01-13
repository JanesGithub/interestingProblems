package com.evgeniia.interestingProblems.projectEuler.task13;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 1/13/17.
 */
public class LargeSumTest {

    @Test
    public void countSumTest() throws FileNotFoundException {
        BigInteger[] data = LargeSum.readFile(new File("test/com/evgeniia/interestingProblems/projectEuler/task13/testData"),5);
        assertEquals(new BigInteger("500000000000000000000010"), LargeSum.countSum(data));
    }
}