package com.evgeniia.interestingProblems.projectEuler.task12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 1/12/17.
 */
public class TriangularNumberTest {

    @Test
    public void countQuantityOfDivisorsTest() {
        assertEquals(2, TriangularNumber.countQuantityOfDivisors(3));
        assertEquals(2, TriangularNumber.countQuantityOfDivisors(7));
        assertEquals(4, TriangularNumber.countQuantityOfDivisors(10));
        assertEquals(4, TriangularNumber.countQuantityOfDivisors(15));
        assertEquals(6, TriangularNumber.countQuantityOfDivisors(28));
    }

    @Test
    public void getTriangularNumberTest() {
        assertEquals(3, TriangularNumber.getTriangularNumber(2));
        assertEquals(6, TriangularNumber.getTriangularNumber(3));
        assertEquals(10, TriangularNumber.getTriangularNumber(4));
        assertEquals(15, TriangularNumber.getTriangularNumber(5));
        assertEquals(21, TriangularNumber.getTriangularNumber(6));
        assertEquals(28, TriangularNumber.getTriangularNumber(7));
    }

    @Test
    public void getTNWithDivisorsTest() {
        assertEquals(1, TriangularNumber.getTNWithDivisors(1));
        assertEquals(3, TriangularNumber.getTNWithDivisors(2));
        assertEquals(6, TriangularNumber.getTNWithDivisors(3));
        assertEquals(6, TriangularNumber.getTNWithDivisors(4));
        assertEquals(28, TriangularNumber.getTNWithDivisors(5));
    }
}