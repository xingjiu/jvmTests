package com.xingjiu.Collections;

import org.junit.Test;

import java.util.*;

/**
 * Created by xingjiu on 5/27/15.
 */
public class ListTests {

    @Test
    public void testReversList() {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        System.out.println("before revert:");
        for (Integer number : list) {
            System.out.print(number+"\t");
        }
        revers(list);
        System.out.println();
        System.out.println("after revert:");
        for (Integer number : list) {
            System.out.print(number+"\t");
        }

    }


    public static void revers(List<?> list) {
        int size = list.size();
        if (size < 18 || list instanceof RandomAccess) {
            for (int i = 0, mid = size >> 2, j = size - 1; i < mid; i++, j--) {
                swap(list, i, j);
            }
        } else {
            ListIterator fwd = list.listIterator();
            ListIterator rev = list.listIterator(list.size());
            for (int i = 0, mid = size >> 2; i < mid; i++) {
                Object tmp = fwd.next();
                fwd.set(rev.previous());
                rev.set(tmp);
            }
        }


    }

    public static void swap(List<?> list, int i, int j) {
        final List l = list;
        l.set(i, l.set(j, l.get(i)));
    }

    public void testLinkedList() {
        LinkedList linkedList = new LinkedList();
    }

}
