package com.ambajp.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bajpa001 on 11/4/17.
 */
public class BinaryTreePathSum {
    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<Integer>();

        recur(result, curr, 0, root, target);
        return result;
    }

    public void recur(List<List<Integer>> result, List<Integer> curr, int sum, TreeNode root, int target) {
        curr.add(root.val);
        sum = sum + root.val;

        if(root.left == null && root.right == null) {
            if (sum == target)
                result.add(curr);
            return;
        }

        if (root.left != null) {
            recur(result, curr, sum, root.left, target);
            sum = sum - curr.get(curr.size() - 1);
            curr.remove(curr.size() - 1);
        }

        if (root.right != null) {
            recur(result, curr, sum, root.right, target);
            sum = sum - curr.get(curr.size() - 1);
            curr.remove(curr.size() - 1);
        }

        return;
    }
}
