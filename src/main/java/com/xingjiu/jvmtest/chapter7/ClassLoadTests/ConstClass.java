package com.xingjiu.jvmtest.chapter7.ClassLoadTests;

/**
 * Created by xingjiu on 5/28/15.
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init");
    }

    public static final String HELLO = "hello world";
}
