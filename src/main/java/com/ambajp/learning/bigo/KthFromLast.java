package com.ambajp.learning.bigo;

public class KthFromLast {

    public static void main(String args[]) {
        Node root = createLinkedList(20);
        Node head = root;

        while (head.next != null) {
            System.out.print(head.getData() + " --> ");
            head = head.next;
        }
        System.out.print(head.getData());

        System.out.print("\n\n");
        head = reverseLinkedList(root);

        System.out.println("Kth Element: " + getKthElement(head, 5).getData());
    }

    public static Node getKthElement(Node head, int k) {
        int count = 1;

        while (count < k && head.next != null) {
            head = head.next;
            count++;
        }

        return head;
    }

    public static Node reverseLinkedList(Node root) {
        Node head = root;
        Node current = root.next;
        Node prev = root;
        Node temp = null;

        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head.next = null;
        return prev;

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
