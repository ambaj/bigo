package com.ambajp.leetcode.algorithms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bajpa001 on 10/16/17.
 */
public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {5,1,2,3,4};
        RotatedSortedArray ra = new RotatedSortedArray();
        System.out.println(ra.search(nums, 1));

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String currentDate = dateFormat.format(date);

        System.out.println(currentDate);
    }

    public int search(int[] nums, int target) {
        return binarysearch(nums, 0, nums.length - 1, target);
    }

    public int binarysearch(int[] nums, int first, int end, int target) {

        int mid = (first + end)/2;
        int result = -1;

        if (first > end)
            return -1;

        if(nums[mid] == target)
            return mid;

        if (nums[first] < nums[mid] && nums[mid] < nums[end]) {
            if (nums[mid] < target)
                result = binarysearch(nums, mid + 1, end, target);
            else
                result = binarysearch(nums, first, mid - 1, target);
        }else {
            if(nums[first] < nums[mid] && nums[mid] > nums[end]) {
                if (target < nums[first])
                    result = binarysearch(nums, first, mid - 1, target);
                else
                    result = binarysearch(nums, mid + 1, end, target);
            } else {
                if (target > nums[mid] && target < nums[end])
                    result = binarysearch(nums, mid + 1, end, target);
                else
                    result = binarysearch(nums, first, mid - 1, target);
            }
        }

        return result;

    }
}
