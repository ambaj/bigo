package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/21/17.
 */
public class CountandSay {
    public static void main(String[] args) {
        int n = 3;
        CountandSay cs = new CountandSay();
        System.out.println(cs.countAndSay(n));
    }
    public String countAndSay(int n) {
        String s = "1";
        String s1 = "";
        int c = 1;

        while(c < n){
            int count = 1;
            s1 = "";
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) == s.charAt(i))
                    count++;
                else {
                    s1 = s1 + count + s.charAt(i - 1);
                    count = 1;
                }
            }
            s1 = s1 + count + s.charAt(s.length() - 1);
            s = s1;
            c++;
        }

        return s;
    }
}
