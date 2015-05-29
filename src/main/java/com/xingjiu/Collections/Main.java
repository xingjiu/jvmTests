package com.xingjiu.Collections;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xingjiu on 2015/3/22.
 */
public class Main {

    ArrayList<Integer> list = null;

    @Before
    public void init() {
        list = new ArrayList<Integer>();
        list.add(2);
        list.add(-5);
        list.add(6);
        list.add(0);
        list.add(3);
        list.add(8);
        list.add(3);
    }

    @Test
    public void testResize() {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(100);
        arrayList.trimToSize();
    }

    @Test
    public void testCollections() {
        System.out.println("list="+list);

        Collections.reverse(list);
        System.out.println("after reverse : " + list);
        Collections.sort(list);
        System.out.println("after sort : " + list);
        Collections.shuffle(list);
        System.out.println("after shuffle : " + list);
        System.out.println("3出现的次数为 : " + Collections.frequency(list, 3));
    }

    @Test
    public void testSynchronizedList() {

        List<Integer> unsynList = new ArrayList<Integer>(100);

        List<Integer> synList = Collections.synchronizedList(new ArrayList<Integer>(100));

        List<Integer> list = synList;

        for (int i=1;i<=100;i++) {
            list.add(i);
        }

        MyThread thread1 = new MyThread("thread1", list);
        MyThread thread2 = new MyThread("thread2", list);
        MyThread thread3 = new MyThread("thread3", list);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
