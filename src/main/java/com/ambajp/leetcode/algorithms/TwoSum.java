package com.ambajp.leetcode.algorithms;

import java.util.HashMap;

/**
 * Created by bajpa001 on 9/20/17.
 */
public class TwoSum {

    public static void main(String args[]) {
        TwoSum ts = new TwoSum();
        int[] nums = {3,2,4};
        int target = 9;
        int[] result =  ts.twoSum(nums, target);

        System.out.println("Index: " + result[0] + "," + result[1]);
    }

    private int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> suppNums = new HashMap();
        int[] result = new int[2];

        for (int i=0; i <= nums.length; i++) {
            if (suppNums.get(nums[i]) != null) {
                result[0] = i;
                result[1] = suppNums.get(nums[i]);
                break;
            } else {
                suppNums.put(target - nums[i], i);
            }
        }

        return result;
    }
}
