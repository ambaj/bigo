package com.ambajp.learning.bigo;

public class StringRotation {

    public static void main(String args[]) {

        String s1 = "waterwbottle";
        String s2 = "erwbottlewat";

        String parString = rotatestring(s1, s2) + s2;
        System.out.println(parString.indexOf(s1) >= 0);

    }

    private static String rotatestring(String s1, String s2) {

        int s1index = 0;
        int s2index = s2.indexOf(s1.charAt(0));
        //boolean flag = true;
        String partString = "";

         while (s2index < s1.length() && s2index != -1) {

             if (s1.charAt(s1index) == s2.charAt(s2index)) {
                 partString = partString + s2.charAt(s2index);
                 s1index++;
                 s2index++;
             } else {
                 s2index = s2.indexOf(s1.charAt(0), s2index);
                 s1index = 0;
                 partString = "";
             }
         }

         return partString;
    }
}
