package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/11/17.
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        RemoveElement re = new RemoveElement();
        System.out.println(re.removeElement(nums, 3));
    }

    public int removeElement(int[] nums, int val) {
        int first = 0, second = 0;
        int temp = 0;

        while(second < nums.length) {
            if (nums[second] != val) {
                temp = nums[second];
                nums[second] = nums[first];
                nums[first] = temp;
                first++;
                second++;
            } else
                second++;
        }

        return first;
    }
}
