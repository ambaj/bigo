package com.ambajp.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bajpa001 on 10/22/17.
 */
public class CombinationSum2 {

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        CombinationSum2 cs2 = new CombinationSum2();
        System.out.println(cs2.combinationSum2(candidates, 8));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();

        Arrays.sort(candidates);
        recur(candidates, result, current, 0, target);
        return result;
    }

    public void recur(int[] candidates, List<List<Integer>> result, List<Integer> current, int start, int target) {

        if(target == 0){
            List<Integer> temp = new ArrayList<Integer>(current);
            result.add(temp);
            return;
        }

        int prev = -1;
        for (int i = start; i < candidates.length; i++) {
            if(target < candidates[i])
                return;

            if(candidates[i] != prev) {
                current.add(candidates[i]);
                recur(candidates, result, current, i + 1, target - candidates[i]);
                current.remove(current.size() - 1);
                prev = candidates[i];
            }
        }
    }

}
