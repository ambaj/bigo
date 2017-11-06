package com.ambajp.learning.bigo;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    public static void main(String args[]) {

        String input = "Tact Coa";
        System.out.println(palindromeCheck(input.toLowerCase()));

    }

    private static boolean palindromeCheck(String str) {
        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                continue;
            if (chars.containsKey(str.charAt(i))) {
                count = chars.get(str.charAt(i)) + 1;
                chars.put(str.charAt(i), count);
            }

            else
                chars.put(str.charAt(i), 1);
        }

        int check = 0;
        for (Character c : chars.keySet()) {
            if (chars.get(c) % 2 != 0 )
                check ++;
        }

        return (check <= 1 ) ? true : false;
    }
}
