package com.xingjiu.jvmtest.chapter7.ClassLoadTests;

/**
 * Created by xingjiu on 5/28/15.
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init");
    }

}

