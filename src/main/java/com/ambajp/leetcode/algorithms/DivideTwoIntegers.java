package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/11/17 - Not Completed
 */
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        int quotient = 1;
        int remainder = 0;
        int digits = 0;
        int temp = divisor;

        while(temp > 0) {
            temp = temp/10;
            digits++;
        }

        return 0;
    }
}
