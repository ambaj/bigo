package com.ambajp.learning.bigo;

/**
 * Created by bajpa001 on 8/26/17.
 */
public class QueueViaStack {

    Node topA;
    Node topB;

    private class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    public void add(int d) {
            pushA(d);
    }

    public int remove() {

        if (topA == null)
            return new Integer(null);

        while (topA.next != null) {
            pushB(topA);
            topA = topA.next;
        }
        int t = topA.data;

        //while (top)
        return t;
    }

    private void pushA(int d) {
        if (topA == null) {
            topA = new Node(d);
        } else {
            Node a = new Node(d);
            a.next = topA;
            topA = a;
        }
    }

    private void pushB(Node n) {
        if (topB == null) {
            topB = n;
        } else {
            n.next = topB;
            topB = n;
        }
    }

    private Node popB() {
        if (topB == null)
            return null;
        else {
            Node t = topB;
            topB = t.next;
            return t;
        }
    }
}
