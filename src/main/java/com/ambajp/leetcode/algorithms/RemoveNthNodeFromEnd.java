package com.ambajp.leetcode.algorithms;

import java.util.ArrayList;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {
        int[] nums = {1,2};

        ListNode root = new ListNode(nums[0]);
        ListNode dummy = root;

        for (int i = 1; i < nums.length; i++) {
            ListNode a = new ListNode(nums[i]);
            root.next = a;
            root = a;
        }

        root = dummy;
        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.next;
        }

        RemoveNthNodeFromEnd re = new RemoveNthNodeFromEnd();

        System.out.println();
        root = dummy;
        root = re.removeNthFromEnd(root, 2);
        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.next;
        }

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        if (first.next == null)
            return null;
        int len = 0;

        while(len < n) {
            first = first.next;
            len++;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
