package com.ambajp.leetcode.algorithms;


import java.util.List;

public class AddTwoNumbers {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int car = 0;
        ListNode root = null;
        ListNode rootPt = null;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + car;
            car = (sum >= 10) ? 1 : 0;
            ListNode temp = new ListNode((sum >= 10) ? sum - 10 : sum);

            if (root == null) {
                root = temp;
                rootPt = root;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                rootPt.next = temp;
                rootPt = temp;
                l1 = l1.next;
                l2 = l2.next;
            }

        }

        while (l1 != null) {
            sum = l1.val + car;
            car = (sum >= 10) ? 1 : 0;
            ListNode temp = new ListNode((sum >= 10) ? sum - 10 : sum);
            rootPt.next = temp;
            rootPt = temp;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + car;
            car = (sum >= 10) ? 1 : 0;
            ListNode temp = new ListNode((sum >= 10) ? sum - 10 : sum);
            rootPt.next = temp;
            rootPt = temp;
            l2 = l2.next;
        }

        while (car != 0) {
            ListNode temp = new ListNode(1);
            rootPt.next = temp;
            rootPt = temp;
            car = 0;
        }

        return root;
    }

    public static void main(String args[]) {
        int a = 9;
        int b = 99;
        ListNode root_l1 = null;
        ListNode temp_l1 = null;

        ListNode root_l2 = null;
        ListNode temp_l2 = null;
        int temp;


        while (a > 0) {
            temp = a/10;
            ListNode tempNode = new ListNode(a - temp * 10);
            if (root_l1 == null) {
                root_l1 = tempNode;
                temp_l1 = root_l1;
            }
            else {
                temp_l1.next = tempNode;
                temp_l1 = tempNode;
            }
            a = temp;
        }

        ListNode temp1  = root_l1;
        while (temp1 != null) {
            System.out.print(temp1.val + "->");
            temp1 = temp1.next;
        }

        while (b > 0) {
            temp = b/10;
            ListNode tempNode = new ListNode(b - temp * 10);
            if (root_l2 == null) {
                root_l2 = tempNode;
                temp_l2 = root_l2;
            }
            else {
                temp_l2.next = tempNode;
                temp_l2 = tempNode;
            }
            b = temp;
        }

        System.out.println();
        ListNode temp2  = root_l2;
        while (temp2 != null) {
            System.out.print(temp2.val + "->");
            temp2 = temp2.next;
        }

        AddTwoNumbers ad = new AddTwoNumbers();
        ListNode sum = ad.addTwoNumbers(root_l1, root_l2);

        System.out.println();
        while (sum != null) {
            System.out.print(sum.val + "->");
            sum = sum.next;
        }

    }
}
