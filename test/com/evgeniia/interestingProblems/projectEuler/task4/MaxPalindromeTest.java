package com.evgeniia.interestingProblems.projectEuler.task4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgeniia on 10/27/16.
 */
public class MaxPalindromeTest {

    @Test
    public void checkIfPalindromeTest() throws Exception {
        assertEquals("88 is a palindrome ", true, MaxPalindrome.checkIfPalindrome(88));

        assertEquals("100020001 is a palindrome ", true, MaxPalindrome.checkIfPalindrome(100020001));

        assertEquals("1 is a palindrome ", true, MaxPalindrome.checkIfPalindrome(1));

        assertEquals("12 is not a palindrome ", false, MaxPalindrome.checkIfPalindrome(12));

        assertEquals("12466757 is not a palindrome ", false, MaxPalindrome.checkIfPalindrome(12466757));


    }

    @Test
    public void getMaxPalindromeTest() throws Exception {
        assertEquals("0 for min=0,max=0 ", 0, MaxPalindrome.getMaxPalindromeOfProduction(0,0));

        assertEquals("-1 for min>max ", -1, MaxPalindrome.getMaxPalindromeOfProduction(3,1));

        assertEquals("-1 for min=-4,max=9 ", -1, MaxPalindrome.getMaxPalindromeOfProduction(-4,9));

        assertEquals("9 for min=0,max=3 ", 9, MaxPalindrome.getMaxPalindromeOfProduction(0,3));

        assertEquals("9009 for min=10,max=99 ", 9009, MaxPalindrome.getMaxPalindromeOfProduction(10,99));


    }
}