package com.ambajp.learning.bigo;

public class PartitionLinkedList {


    public static void main(String args[]) {
        Node root = createLinkedList(20);
        Node head = root;
        while (head.next != null) {
            System.out.print(head.getData() + " --> ");
            head = head.next;
        }
        System.out.print(head.getData());
        System.out.println("\n\n");

        head = root;
        Node prev = root;
        int parition = 50;

        while (head != null) {
            if (head.getData() < parition && head != root) {
                prev.setNext(head.next);
                head.setNext(root);
                root = head;
                head = prev.next;
            } else {
                prev = head;
                head = head.next;
            }
        }

        head = root;
        while (head.next != null) {
            System.out.print(head.getData() + " --> ");
            head = head.next;
        }
        System.out.print(head.getData());
    }

    private static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void setNext(Node n) {
            next = n;
        }

        public int getData() {
            return data;
        }
    }


    public static Node createLinkedList(int n) {
        Node root = new Node(randomNumber());
        Node head = root;
        int count = 1;
        while (count < n) {
            Node node = new Node(randomNumber());
            head.setNext(node);
            head = node;
            count++;
        }

        head.next = null;
        return root;
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100) + 12;
    }

}
