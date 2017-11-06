package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 9/25/17.
 */
public class ReverseInteger {

    public static void main(String args[]) {
        int x = 1534236469;
        ReverseInteger ri = new ReverseInteger();
        System.out.print(ri.reverse(x));
    }

    public int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = 0 - x;
        }
        int res = 0;

        while (x > 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > 214748364 && x > 0)
                return 0;
        }

        return (neg == true) ? 0 - res : res;
    }
}
