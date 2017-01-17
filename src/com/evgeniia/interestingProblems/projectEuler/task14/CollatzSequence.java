package com.evgeniia.interestingProblems.projectEuler.task14;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by evgeniia on 1/17/17.
 */
public class CollatzSequence {

    private static Map<Long, Integer> collatzMap = new HashMap<Long, Integer>();


    public static int countCollatzLength(long n) {
        if (n <= 1) return 1;
        int length = 0;
        Integer tempLength = collatzMap.get(Long.valueOf(n));
        if (tempLength != null) {
            length = tempLength;
            return length;
        } else {
            length++;
            if (n % 2 == 0) {
                length += countCollatzLength(n / 2);
            } else {
                length += countCollatzLength(3 * n + 1);
            }
        }
        collatzMap.put(Long.valueOf(n), Integer.valueOf(length));
        return length;
    }

    public static int findTheLongestCollatz(int N) {
        int longestChain = 0;
        int m = 0;
        int currentChain = 0;
        for (int i = 1; i < N; i++) {
            currentChain = countCollatzLength(i);
            //System.out.println(currentChain);
            if (currentChain > longestChain) {
                longestChain = countCollatzLength(i);
                m = i;
            }
        }
        System.out.println(m + " " + longestChain);
        return m;
    }

    public static void main(String[] args) {
        findTheLongestCollatz(1000000);
    }


}
