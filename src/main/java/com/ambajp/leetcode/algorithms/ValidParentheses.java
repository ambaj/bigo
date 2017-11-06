package com.ambajp.leetcode.algorithms;

import java.util.*;

/**
 * Created by bajpa001 on 10/6/17.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = ")()[]{})";
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid(s));
    }

    public boolean isValid(String s) {
        Map<Character, Character> pair = new HashMap<Character, Character>();
        pair.put(')', '(');
        pair.put(']', '[');
        pair.put('}', '{');

        char[] stack = new char[s.length()];
        int point = -1;

        for(char c : s.toCharArray()) {
            if (pair.containsKey(c)) {
                if (point > -1 && stack[point] == pair.get(c))
                    point--;
                else
                    return false;
            }else {
                point++;
                stack[point] = c;
            }
        }

        if (point > -1)
            return false;
        else
            return true;
    }

}
