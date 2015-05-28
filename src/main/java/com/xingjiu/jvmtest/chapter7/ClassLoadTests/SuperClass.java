package com.xingjiu.jvmtest.chapter7.ClassLoadTests;

/**
 * Created by xingjiu on 5/28/15.
 */
public class SuperClass {
    static {
        System.out.println("Super Class init");
    }

    public static int value = 123;
}
