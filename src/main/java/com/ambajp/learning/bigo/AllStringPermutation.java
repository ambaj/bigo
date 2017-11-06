package com.ambajp.learning.bigo;


public class AllStringPermutation {

    public static void main(String args[]) {
        AllStringPermutation str = new AllStringPermutation();
        str.permutation("AMITBA");
    }

    private void permutation(String str) {
        permutation(str, "");
    }

    private void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
