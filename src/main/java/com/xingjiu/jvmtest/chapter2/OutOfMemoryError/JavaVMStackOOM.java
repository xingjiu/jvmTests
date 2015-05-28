package com.xingjiu.jvmtest.chapter2.OutOfMemoryError;

/**
 * Created by xingjiu on 5/27/15.
 */

/**
 * JVM Args: -Xss1M
 */
public class JavaVMStackOOM {

    private void dontStop() {
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
