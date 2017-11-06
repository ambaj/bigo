package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 11/2/17.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "a    ";
        LengthOfLastWord lw = new LengthOfLastWord();
        System.out.println(lw.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {

        String[] st = s.split(" ");

        if(s.trim().length() == 0)
            return 0;

        if(st[st.length - 1].trim().length() == 0)
            return st[st.length - 2].trim().length();
        else
            return st[st.length - 1].trim().length();

    }
}
