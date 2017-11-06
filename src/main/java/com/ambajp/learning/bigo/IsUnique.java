package com.ambajp.learning.bigo;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    public static void main(String args[]) {
        String input = "AMIT  ";
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        boolean flag = true;

        for (char c : input.trim().toCharArray()) {
            if (charMap.containsKey(c)) {
                flag = false;
                break;
            } else {
                charMap.put(c,1);
            }
        }

        if (flag == true)
            System.out.println("Unique");
        else
            System.out.println("Not Unique");
    }
}

