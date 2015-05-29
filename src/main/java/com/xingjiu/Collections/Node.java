package com.xingjiu.Collections;

/**
 * Created by xingjiu on 5/29/15.
 */
public class Node<E> {

    private Node<E> nextNode;
    private E value;

    public Node(E node) {
        this.value = node;
        nextNode = null;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public boolean haveNext() {
        return nextNode != null;
    }
}
