package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 11/5/17.
 */
public class MergeArray {

    public int[] myFunction(int[] list1, int[] list2) {
        int p1 = 0, p2 = 0, count = 0;
        int[] result = new int[list1.length + list2.length - 1];

        while(p1 < list1.length && p2 < list2.length) {
            if(list1[p1] < list2[p2]) {
                result[count++] = list1[p1++];
            }else {
                result[count++] = list2[p2++];
            }
        }

        while (p1 < list1.length -1)
            result[count++] = list1[p1++];
        while(p2 < list2.length -1)
            result[count++] = list1[p2++];

        return result;

        //return "running with " + arg;
    }
    public static void main(String[] args) {
        // run your function through some test cases here
        // remember: debugging is half the battle!

        int[] list1 = {3, 4, 6, 10, 11, 15};
        int[] list2 = {1, 5, 8, 12, 14, 19};
        String testInput = "test input";

        MergeArray ma = new MergeArray();
        int[] result = ma.myFunction(list1, list2);
        for(int i : result)
            System.out.print(i + " ");
        //System.out.println(myFunction(testInput));
    }
}
