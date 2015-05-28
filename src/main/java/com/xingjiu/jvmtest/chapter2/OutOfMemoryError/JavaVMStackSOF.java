package com.xingjiu.jvmtest.chapter2.OutOfMemoryError;

/**
 * Created by xingjiu on 5/27/15.
 */

/**
 * VM Args:-Xss64k
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }

    }
}
