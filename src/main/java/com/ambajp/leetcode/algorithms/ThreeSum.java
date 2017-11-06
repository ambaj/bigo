package com.ambajp.leetcode.algorithms;

import java.util.*;


/**
 * Created by bajpa001 on 10/2/17.
 */
public class ThreeSum {

    public static void main(String args[]) {
        int[] nums = {0,0,0};
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.threeSum(nums));

        String s = "amitbajpai";
        System.out.println(s.indexOf('_'));
        System.out.println((s == null) ? null : (s.indexOf('_') < 0) ? s : s.substring(0, s.indexOf('_')));

    }

    public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        int j = 0;
        int prev = 0;

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> comp = new HashMap<Integer,Integer>();
            sum = 0 - nums[i];
            if (nums[i] == prev && nums[i] + prev != 0)
                continue;

            for(j =  i + 1; j < nums.length; j++) {
                if ( i != j) {
                    if (comp.containsKey(sum - nums[j])) {
                        List<Integer> subList = new ArrayList<Integer>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[comp.get(sum - nums[j])]);
                        res.add(subList);
                    }
                    else {
                        comp.put(nums[j], j);
                    }
                }
            }

            prev = nums[i];
        }

        return res;

    }
}
