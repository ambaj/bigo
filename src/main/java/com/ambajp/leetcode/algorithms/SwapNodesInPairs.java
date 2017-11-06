package com.ambajp.leetcode.algorithms;

public class SwapNodesInPairs {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = null;
        ListNode second = null;

        while (head != null && head.next != null) {
            first = head;
            second = head.next;
            head = head.next.next;
            second.next = first;
            first.next = head;
        }

        return dummy.next;
    }
}
