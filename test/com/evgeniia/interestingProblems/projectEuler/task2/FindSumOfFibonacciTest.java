package com.evgeniia.interestingProblems.projectEuler.task2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 10/25/16.
 */
public class FindSumOfFibonacciTest {

    @Test
    public void findSumOfEvenFibonacci() throws Exception {

        assertEquals("2 for maxNumber=2 ", 2, FindSumOfFibonacci.findSumOfFibonacci(2,true));

        assertEquals("the sum of even fibonacci numbers <= 10 must be 10 ", 10, FindSumOfFibonacci.findSumOfFibonacci(10,true));
    }

    @Test
    public void findSumOfOddFibonacci() throws Exception {

        assertEquals("2 for maxNumber=2 ", 1, FindSumOfFibonacci.findSumOfFibonacci(2,false));

        assertEquals("the sum of odd fibonacci numbers <= 10 must be 9 ", 9, FindSumOfFibonacci.findSumOfFibonacci(10,false));
    }

}