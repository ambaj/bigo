package com.ambajp.leetcode.algorithms;

/**
 * Created by bajpa001 on 10/8/17.
 */
public class MergeSortedLL {

    public static void main(String[] args) {

        String s = "abcde123(*7%";
        String regex = "[\\x00-\\x7F]+";
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = null;

        if(l1.val < l2.val)
            dummy.next = l1;
        else
            dummy.next = l2;

        head = dummy;

        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
        }

        while(l1 != null) {
            head.next = l1;
            l1 = l1.next;
        }

        while(l2 != null) {
            head.next = l2;
            l2 = l2.next;
        }

        return dummy.next;
    }
}
