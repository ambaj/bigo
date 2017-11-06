package com.ambajp.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {
    public static void main(String args[]) {
        String digits = "23";
        LetterCombinations lc = new LetterCombinations();
        System.out.println(lc.letterCombinations(digits));
    }

    public List<String> letterCombinations(String digits) {

        char[] alpha = {' ',' ',' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        List<String> res = new ArrayList<String>();

        double rec = Math.pow(3,2);
        System.out.println(rec);

        return null;
    }

    public void letterComb(String digits, int[] letters, int pos, int count) {
        if (pos == digits.length()) {
            System.out.println(Arrays.asList(letters));
            return;
        }
        else{
            letterComb(digits, letters, pos + 1, count);
        }
    }

}
