package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/11/17.
 */
public class ImplementStr {

    public static void main(String[] args) {
        String haystack = "amit";
        String needle = "it";
        ImplementStr is = new ImplementStr();
        System.out.println(is.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int index = 0;
        int len = needle.length();

        while (index + len - 1 < haystack.length()) {
            if (haystack.substring(index, index + len).equals(needle))
                return index;
            else
                index++;
        }
        return -1;
    }
}
