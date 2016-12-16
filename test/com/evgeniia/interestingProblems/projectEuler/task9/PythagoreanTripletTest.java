package com.evgeniia.interestingProblems.projectEuler.task9;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 12/15/16.
 */
public class PythagoreanTripletTest {

    @Test
    public void getHypotenuseTest() {
        assertEquals(0, PythagoreanTriplet.getHypotenuse(1,2));
        assertEquals(5, PythagoreanTriplet.getHypotenuse(3,4));

    }

}