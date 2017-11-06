package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 9/26/17.
 */
public class IsIntegerPalindrome {
    public static void main(String args[]) {
        int x = 12321;
        IsIntegerPalindrome pal = new IsIntegerPalindrome();
        System.out.println(pal.isPalindrome(x));
    }
    public boolean isPalindrome(int x) {

        int org = x;
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x%10;
            x = x/10;
        }

        return (org == rev) ? true : false;
    }
}
