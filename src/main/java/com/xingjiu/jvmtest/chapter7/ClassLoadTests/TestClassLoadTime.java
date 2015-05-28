package com.xingjiu.jvmtest.chapter7.ClassLoadTests;

import org.junit.Test;

/**
 * Created by xingjiu on 5/28/15.
 */
public class TestClassLoadTime {

    @Test
    public void testUnload1() {
        System.out.println(SubClass.value);
    }

    @Test
    public void testUnload2() {
        SuperClass[] superClasses = new SuperClass[20];
    }

    @Test
    public void testUnload3() {
        System.out.println(ConstClass.HELLO);
    }
}
