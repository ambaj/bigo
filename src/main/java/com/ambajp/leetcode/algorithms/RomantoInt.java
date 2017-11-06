package com.ambajp.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bajpa001 on 9/30/17.
 */
public class RomantoInt {
    public static void main(String args[]) {
        RomantoInt rt = new RomantoInt();
        String s = "DCXXI";
        System.out.println(rt.romanToInt(s));
    }

    public int romanToInt(String s) {

        Map<Character, Integer> rom = new HashMap<Character, Integer>() {{
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }};

        int val = 0;

        for(int c = 0; c < s.length(); c++) {
            if (c < s.length()-1 && rom.get(s.charAt(c+1)) > rom.get(s.charAt(c))) {
                val = val + (rom.get(s.charAt(c+1)) - rom.get(s.charAt(c)));
                c++;
            } else {
                val = val + rom.get(s.charAt(c));
            }
        }

        return val;
    }
}
