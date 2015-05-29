package com.xingjiu.Collections;

import org.junit.Test;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by xingjiu on 5/29/15.
 */
public class LinkListTest {

    @Test
    public void testReverse() {

        Node<Integer> currentNode = new Node<Integer>(1);

        Node<Integer> header = currentNode;

        for (int i = 2; i <= 100; i++) {
            Node<Integer> node = new Node<Integer>(i);
            currentNode.setNextNode(node);
            currentNode = node;
        }

        Node<Integer> node = revert(header);
        printNodeList(node);

    }

    @Test
    public void testReverseLinkedList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        System.out.println("list:");

        for (Integer i : list) {
            System.out.print(i+"\t");
        }

        revertList(list);
        System.out.println();
        System.out.println("after revert:");

        for (Integer i : list) {
            System.out.print(i + "\t");
        }

    }

    private void revertList(LinkedList list) {
        ListIterator left = list.listIterator();
        ListIterator right = list.listIterator(list.size());

        for (int i = 0; i < list.size() / 2; i++) {
            Object temp = left.next();
            left.set(right.previous());
            right.set(temp);
        }

    }

    private Node revert(Node node) {
        if (null == node || !node.haveNext()) {
            return node;
        }

        Node preNode = node;
        Node currNode = node.getNextNode();
        Node nextNode;

        do {
            nextNode = currNode.getNextNode();
            currNode.setNextNode(preNode);
            preNode = currNode;
            currNode=nextNode;
        } while (currNode != null);

        node.setNextNode(null);

        return preNode;
    }

    private void printNodeList(Node node) {

        Node head = node;

        if (null == head) {
            return;
        }

        do {
            System.out.println(head.getValue());
            head = head.getNextNode();
        } while (head!=null);

    }

}
