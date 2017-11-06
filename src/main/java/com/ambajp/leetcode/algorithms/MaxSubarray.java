package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/25/17.
 */
public class MaxSubarray {

    public static void main(String[] args) {
        int[] nums = {10,-1,20, 5};
        int[][] nums1 = {{10,-1,20, 5},{1,2,3,45}};
        System.out.println(nums1.length + " : " + nums1[0].length);
        MaxSubarray ms = new MaxSubarray();
        System.out.println(ms.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE, currsum = 0;

        for (int i = 0; i< nums.length; i++) {
            currsum = Math.max(currsum + nums[i], nums[i]);
            maxsum = Math.max(currsum, maxsum);
        }

        return maxsum;
    }
}
