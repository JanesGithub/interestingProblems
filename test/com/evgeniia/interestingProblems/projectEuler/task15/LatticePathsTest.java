package com.evgeniia.interestingProblems.projectEuler.task15;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 1/20/17.
 */
public class LatticePathsTest {

    @Test
    public void countLatticePathsTest() {
        assertEquals(0, LatticePaths.countLatticePaths(0));
        assertEquals(2, LatticePaths.countLatticePaths(1));
        assertEquals(6, LatticePaths.countLatticePaths(2));
    }
}