package com.ambajp.learning.bigo;

/**
 * Created by bajpa001 on 8/26/17.
 */
public class MinElement {

    private int min;
    private StackNode top = null;

    public static void main(String args[]) {
        MinElement min = new MinElement();
        for (int i = 0; i < 20; i++) {
            min.push(randomNumber());
        }

        System.out.println("Minimum Value: " + min.getMin());
        min.printStack();
    }

    private void printStack() {
        StackNode head = top;

        while (head.next != null) {
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.print(head.data);
    }

    private void push(int n) {
        StackNode t = new StackNode(n);
        if (top == null) {
            top = t;
        } else {
            t.setMin(top.min);
            t.next = top;
            top = t;
        }
    }

    private int pop() {
        int t = top.data;
        top = top.next;
        return t;
    }

    private int getMin() {
        return top.min;
    }

    private int peek() {
        return top.data;
    }

    private class StackNode {
        int data;
        int min;
        StackNode next;

        StackNode(int n) {
            data = n;
            min = n;
        }

        public void setMin(int min) {
            this.min = (this.data < min) ? this.data : min;
        }
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100) + 12;
    }
}
