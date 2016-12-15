package com.evgeniia.interestingProblems.projectEuler.task8;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 11/20/16.
 */
public class GreatestProductTest {

    @Test
    public void countGreatestProductTest() throws FileNotFoundException {
        //assertEquals(9,GreatestProduct.countGreatestProduct(1, new File("src/com/evgeniia/interestingProblems/projectEuler/task8/number.txt")));
        //assertEquals(81,GreatestProduct.countGreatestProduct(2, new File("src/com/evgeniia/interestingProblems/projectEuler/task8/number.txt")));
        //assertEquals(729,GreatestProduct.countGreatestProduct(3, new File("src/com/evgeniia/interestingProblems/projectEuler/task8/number.txt")));

        assertEquals(5832,GreatestProduct.countGreatestProduct(4, new File("src/com/evgeniia/interestingProblems/projectEuler/task8/EulerNumber.txt")));
    }


}