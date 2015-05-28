package com.xingjiu.Collections;

import java.util.List;

/**
 * Created by xingjiu on 2015/3/22.
 */
public class MyThread extends Thread {

    private List<Integer> list;

    public MyThread(String name, List<Integer> list) {
        this.setName(name);
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            if (list.size() > 0) {
                int num = list.remove(0);
                System.out.println(Thread.currentThread().getName()+" : " + num);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " : exit" );
                break;
            }
        }

    }
}
