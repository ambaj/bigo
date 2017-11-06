package com.ambajp.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String args[]) {
        int[] nums = {-5,-1,-1,0,2,2,4};

        //int[] nums = {-5,-5,-3,-1,0,2,4,5};

        FourSum fs = new FourSum();
        System.out.println(fs.fourSum(nums, 3));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < nums.length; j++) {

                int k = j + 1, l = nums.length - 1;

                while (k < l && k < nums.length) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        List<Integer> ls = new ArrayList<Integer>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[k]);
                        ls.add(nums[l]);
                        res.add(ls);
                        found = true;
                    }

                    if (sum < target) {
                        k++;
                        while(k < l && nums[k] == nums[k-1])
                            k++;
                    } else {
                        l--;
                        while(nums[l] == nums[l + 1] && k < l)
                            l--;
                    }
                }
                while(j < nums.length -1 && nums[j] == nums[j+1])
                    j++;
            }
            while(i < nums.length -1 && nums[i] == nums[i+1] && found == true)
                i++;
        }
        return res;

    }
}
