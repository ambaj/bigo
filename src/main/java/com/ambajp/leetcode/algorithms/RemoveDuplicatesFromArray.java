package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/10/17.
 */
public class RemoveDuplicatesFromArray {

    public static void main (String[] args) {
        int[] nums = {1,1,2};
        RemoveDuplicatesFromArray ra = new RemoveDuplicatesFromArray();
        System.out.println(ra.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int first = 0, second = 0;
        int temp = 0;

        while (second < nums.length) {
            if (nums[second] == nums[first])
                second++;
            else {
                temp = nums[first + 1];
                nums[first + 1] = nums[second];
                nums[second] = temp;
                first++;
                second++;
            }
        }

        return first + 1;
    }
}
