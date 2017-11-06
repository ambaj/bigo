package com.ambajp.leetcode.algorithms;

import java.util.Arrays;

/**
 * Created by bajpa001 on 10/4/17.
 */
public class ThreeSumCloset {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int sum = 0, minSum = 0;

        for (int i = 0; i < nums.length;  i++) {
            int j =  i + 1;

            while (j < nums.length) {
                int k = j + 1;
                while (k < nums.length) {
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum == target || sum > target)
                        return sum;

                    minSum = (Math.abs(sum - target) < minSum) ? Math.abs(sum) : minSum;

                }
            }
        }

        return sum;
    }
}
