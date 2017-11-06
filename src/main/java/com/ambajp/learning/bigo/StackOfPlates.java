package com.ambajp.learning.bigo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bajpa001 on 8/26/17.
 */
public class StackOfPlates {

    StackList top;
    int stackSize;

    StackOfPlates(int size) {
        this.stackSize = size;
    }

    private class StackNode {
        int data;
        StackNode next;
        int size;

        StackNode(int d) {
            this.data = d;
        }
    }

    public void push(int d) {

    }

    private class StackList {
        StackNode top;
        StackList next;

        StackList(StackNode d) {
            this.top = d;
        }
    }

    private void pushNode(StackNode d) {
        if (top == null)
            top = new StackList(d);
        else {
            StackList sl = new StackList(d);
            sl.next = top;
            top = sl;
        }
    }

    private StackList pull() {
        StackList d = top;
        top = top.next;
        return d;
    }


}
