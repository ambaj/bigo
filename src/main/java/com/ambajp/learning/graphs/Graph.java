package com.ambajp.learning.graphs;

/**
 * Created by bajpa001 on 8/27/17.
 */
public class Graph {
    private Node[] vertices;
    private int count;
    private int maxNodes = 10;

    Graph() {
        this.vertices = new Node[10];
        count = 0;
    }

    public void addNode(Node a) {
        if (count > vertices.length) {
            System.out.println("No more Nodes!");
        } else {
            vertices[count] = a;
            count++;
        }
    }

    public Node[] getVertices() {
        return this.vertices;
    }
}
