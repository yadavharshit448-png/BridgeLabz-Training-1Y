package com.logisticRouterTracker;

public class Node<T extends Checkpoint> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
