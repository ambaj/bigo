package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 9/30/17.
 */
public class LongestCommonPrefix {

    public static void main(String args[]) {

    }

    public String longestCommonPrefix(String[] strs) {

        String common = new String();
        int minLen = 0;
        int pt = 0;

        for (String str : strs) {
            minLen = (minLen == 0 || str.length() < minLen) ? str.length() : minLen;
            common = (common.length() == 0) ? strs[0] : common;
            pt = minLen;
            while (minLen >= 0 && !(str.substring(0, minLen).equals(common.substring(0, minLen))))
                minLen--;
            common = common.substring(0, minLen);
            if (minLen == 0)
                break;
        }

        return common;
    }
}
