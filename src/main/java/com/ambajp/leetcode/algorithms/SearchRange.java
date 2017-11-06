package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/18/17.
 */
public class SearchRange {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        SearchRange sr = new SearchRange();
        int[] result = sr.searchRange(nums, 8);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {

        int[] result = searchRange(nums, 0, nums.length - 1, target);
        return result;
    }

    public int[] searchRange(int[] nums, int left, int right, int target) {

        int mid = (left + right)/2;
        int[] result = {-1,-1};

        if (nums == null)
            return null;

        if (nums.length == 0)
            return result;

        if (left > right)
            return result;

        if (nums[left] == target && nums[right] == target) {
            result[0] = left;
            result[1] = right;
            return result;
        }

        if (target > nums[mid])
            result = searchRange(nums, mid + 1, right, target);
        else {
            if (target < nums[mid])
                result = searchRange(nums, left, mid - 1, target);
            else {
                result[0] = mid;
                result[1] = mid;
                int t = mid;
                while (t >= left && nums[t] == target) {
                    result[0] = t;
                    t--;
                }

                t = mid;
                while (t <= right && nums[t] == target) {
                    result[1] = t;
                    t++;
                }
            }
        }
        return result;
    }
}
