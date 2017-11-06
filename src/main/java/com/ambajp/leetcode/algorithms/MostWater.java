package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 9/26/17.
 */
public class MostWater {

    public static void main(String args[]) {
        int[] height = { 4,8,9,6,3,2};

        MostWater mw = new MostWater();
        System.out.println(mw.maxArea(height));

        String s = "Doctor Strange_TH_FB_Opening Weekend_Moviegoers 13-34_Smoking Hot Review (:15)";
        String creativeName = s.substring(s.lastIndexOf('_')+1);
        System.out.println(creativeName);

        String[] substrs = s.split("_");
        String audience = substrs[substrs.length - 2];
        System.out.println(audience);
    }

    public int maxArea(int[] height) {

        int max = 0;
        int min = 0;
        for (int i = 0; i < height.length - 1; i++) {
            min = (height[i] <= height[i+1]) ? height[i] : height[i+1];
            max = (min > max) ? min : max;
        }

        return max;
    }
}
