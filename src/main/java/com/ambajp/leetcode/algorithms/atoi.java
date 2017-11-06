package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 9/26/17.
 */
public class atoi {
    public static void main(String args[]) {
        String a = "-2147483649";

        atoi at = new atoi();
        System.out.println(at.myAtoi(a));

    }

    public int myAtoi(String str) {
        boolean neg = false;
        int res = 0;
        str = str.trim();

        for (int c = 0; c < str.length(); c++) {
            if (c == 0 && str.charAt(c) == 45) {
                neg = true;
                continue;
            }

            if (c == 0 && str.charAt(c) == 43) {
                continue;
            }

            int maxLast = (neg == true) ? 8 : 7;

            if (str.charAt(c) >= 48 && str.charAt(c) <= 57) {
                res = res * 10 + (str.charAt(c) - 48);
                if (res >= 214748364 && c < str.length() - 1 && ((str.charAt(c + 1) - 48) >= 0 && (str.charAt(c + 1) - 48) <= 9))
                    if (!(res == 214748364 && (str.charAt(c + 1) - 48) <= maxLast))
                        return (neg == true) ? -2147483648 : 2147483647;
            } else {
                break;
            }
        }

        return (neg == true) ? 0 - res : res;
    }
}
