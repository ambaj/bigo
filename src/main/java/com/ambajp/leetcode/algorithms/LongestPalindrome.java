package com.ambajp.leetcode.algorithms;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bajpa001 on 9/24/17.
 */
public class LongestPalindrome {
    public static void main(String args[]) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {

        HashMap<Character, ArrayList<Integer>> map = new HashMap();
        String rs = new String();
        for (int i = 0; i < s.length(); i++)
            rs = s.charAt(i) + rs;

        for (int i = s.length()-1; i >= 0; i--) {
            if (map.containsKey(s.charAt(i))) {
                map.get(s.charAt(i)).add(i);
            } else {
                ArrayList<Integer> ar = new ArrayList<Integer>();
                ar.add(i);
                map.put(s.charAt(i), ar);
            }
        }

        int m = 0, n = 0;
        ArrayList<Integer> temp = null;
        String st = null, rst = null;
        String max = new String();

        for (int i = 0; i < s.length(); i++) {
            temp = map.get(s.charAt(i));
            for(Integer j : temp) {
                if (j >= i) {
                    st = s.substring(i, j+1);
                    rst = rs.substring(rs.length() - j - 1, rs.length() - i);
                    if (st.equals(rst))
                        max = (max == null || max.length() > st.length()) ? max : st;
                }
            }
        }

        return max;
    }
}
