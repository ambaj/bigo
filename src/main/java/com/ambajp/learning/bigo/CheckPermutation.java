package com.ambajp.learning.bigo;


import java.util.Arrays;

public class CheckPermutation {

    public static void main(String args[]) {
        String inputA = "AMITBA";
        String inputB = "ITBAMA";

        if (charsort(inputA).equals(charsort(inputB)))
            System.out.println("Same Permutation string");
        else
            System.out.println("NOT Same Permutation string");

    }

    public static String charsort(String input) {
        char[] charstr = input.toCharArray();
        Arrays.sort(charstr);
        return new String(charstr);
    }
}
