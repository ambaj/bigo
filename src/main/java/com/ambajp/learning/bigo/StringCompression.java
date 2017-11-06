package com.ambajp.learning.bigo;


public class StringCompression {

    public static void main(String args[]) {
        String input = "aabcccccaaadeef";
        System.out.println(compress(input));
    }

    private static String compress(String a) {

        String compressString = "";
        char previous = a.toCharArray()[0];
        int count = 0;
        for (char c : a.toCharArray()) {
            if (c == previous) {
                count++;
            } else {
                compressString = compressString + previous + count;
                previous = c;
                count = 1;
            }
        }
        compressString = compressString + previous + count;
        return compressString;
    }
}
