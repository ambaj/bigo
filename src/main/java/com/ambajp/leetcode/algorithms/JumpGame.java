package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/30/17.
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int[] memo = new int[nums.length];
        return dp(0, nums, memo);
    }

    public boolean dp(int pos, int[] nums, int[] memo) {
        if (pos == nums.length -1) {
            memo[pos] = 2;
            return true;
        }

        if(memo[pos] == 1)
            return false;
        else {
            if(memo[pos] == 2)
                return true;
            else{
                int maxjump = Math.min(nums[pos] + pos, nums.length - 1);
                for(int i = pos + 1; i <= maxjump;  i++) {
                    boolean flag = dp(i, nums, memo);
                    if(flag == true) {
                        memo[pos] = 2;
                        return true;
                    }
                }
            }
        }

        memo[pos] = 1;
        return false;
    }
}
