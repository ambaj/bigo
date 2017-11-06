package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/21/17.
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3};
        SearchInsertPosition sip = new SearchInsertPosition();
        System.out.println(sip.searchInsert(nums, 0));
    }
    public int searchInsert(int[] nums, int target) {
        return binarysearch(nums, 0, nums.length - 1, target);

    }

    public int binarysearch(int[] nums, int left, int right, int target) {
        int mid = (left + right)/2;
        int result = -1;

        if(nums[mid] == target)
            return mid;

        if (left == right || right < left) {
            if (nums[left] > target)
                return left;
            else
                return left + 1;
        }

        if(target > nums[mid])
            result = binarysearch(nums, mid + 1, right, target);
        else
            result = binarysearch(nums, left, mid - 1, target);

        return result;
    }
}
