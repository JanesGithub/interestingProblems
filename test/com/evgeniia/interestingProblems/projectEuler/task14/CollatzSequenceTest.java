package com.evgeniia.interestingProblems.projectEuler.task14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 1/17/17.
 */
public class CollatzSequenceTest {
    @Test
    public void countCollatzLengthTest() {
        assertEquals(1, CollatzSequence.countCollatzLength(1));
        assertEquals(2, CollatzSequence.countCollatzLength(2));
        assertEquals(8, CollatzSequence.countCollatzLength(3));
        assertEquals(3, CollatzSequence.countCollatzLength(4));
        assertEquals(6, CollatzSequence.countCollatzLength(5));
        assertEquals(9, CollatzSequence.countCollatzLength(6));
        assertEquals(17, CollatzSequence.countCollatzLength(7));

    }

    @Test
    public void findTheLongestCollatzTest() {
        assertEquals(3, CollatzSequence.findTheLongestCollatz(5));
        assertEquals(7, CollatzSequence.findTheLongestCollatz(8));

    }
}