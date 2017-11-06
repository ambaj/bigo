package com.ambajp.leetcode.algorithms;

import java.util.*;

public class IntToRoman {

    public static void main(String args[]) {
        int num = 79;
        IntToRoman tr = new IntToRoman();
        System.out.println(tr.intToRoman(num));
    }

    public String intToRoman(int num) {

        Map<Integer, String> romchar = new HashMap<Integer, String>(){{
            put(1000, "M");
            put(500, "D");
            put(100, "C");
            put(50, "L");
            put(10, "X");
            put(5, "V");
            put(1, "I");
        }};

        List<Integer> romval = new ArrayList<Integer>() {{
            add(1000);
            add(500);
            add(100);
            add(50);
            add(10);
            add(5);
            add(1);
        }};

        Iterator<Integer> itr = romval.iterator();

        List<Integer> digits = new ArrayList<Integer>() {{
            add(1000);
            add(100);
            add(10);
            add(1);
        }};

        int div = 0;
        int rem = num;
        String rom = new String();

        int val = itr.next();

        for (int x : digits) {
            div = num/x * x;
            num = num - div;

            while (div > 0 ) {
                rom =  rom + romchar.get(val);
                div = div - val;
                val = itr.next();
            }

            if (romchar.containsKey(val - num) && val - num != val/2)
                rom =  rom + romchar.get(val - num) + romchar.get(val);

        }
        return rom;
    }
}
