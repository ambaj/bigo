package com.ambajp.learning.graphs;

public class Node {

    private Node[] adjacent;
    private String vertex;
    private int adjacentCount;
    private int state;

    Node(String data, int maxAdjacents) {
        this.vertex = data;
        this.adjacent = new Node[maxAdjacents];
        this.adjacentCount = 0;
    }

    public void addAdjacent(Node a) {
        if (adjacentCount > adjacent.length) {
            System.out.println("Reached the max adjacents size");
        } else {
            this.adjacent[adjacentCount] = a;
            adjacentCount++;
        }
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}
