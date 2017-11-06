package com.ambajp.learning.bigo;


public class URLify {

    public static void main(String args[]) {

        String input = "Mr John Smith    ";
        int trueLen = 13;

        System.out.println(newURL(input, trueLen));
    }

    private static String newURL(String input, int len) {

        String temp = "";

        for(int i = 0; i < len; i ++) {
            if (input.charAt(i) == 32) {
                temp = temp + "%20";
            } else {
                temp = temp + input.charAt(i);
            }
        }

        return temp;
    }
}
