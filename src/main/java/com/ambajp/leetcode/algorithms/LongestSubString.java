package com.ambajp.leetcode.algorithms;

import java.util.HashMap;

/**
 * Created by bajpa001 on 9/22/17.
 */
public class LongestSubString {

    public static void main(String args[]) {
        String st = "tmmzuxt";
        LongestSubString ls = new LongestSubString();
        System.out.println(ls.lengthOfLongestSubstring(st));

    }

    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0;
        int[] chrs = new int[128];
        int max = 0;

        for (end = 0; end < s.length(); end++) {
            if (chrs[s.charAt(end)] != 0) {
                max = (end - start > max) ? end - start : max;
                while (s.charAt(start) != s.charAt(end)) {
                    chrs[s.charAt(start)] = 0;
                    start++;
                }
                start++;
            }
            chrs[s.charAt(end)] = 1;
        }

        return (end - start > max) ? end - start : max;
    }
}
