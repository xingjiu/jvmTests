package com.xingjiu.jvmtest.chapter10;
import org.junit.Test;

import java.util.List;

/**
 * Created by xingjiu on 5/29/15.
 */
public class GenericTypes {


//    public static int method(List<String> list) {
//        return 1;
//    }

    public static String method(List<Integer> list) {
        return String.valueOf(1);
    }

    public static void main(String[] args) {

    }


    @Test
    public void testZhuangxiang() {
        Integer a = 120;
        Integer b = 7;
        Integer c = 127;
        Integer d = 127;
        Integer e = 128;
        Integer f = 128;
        Long g = 127L;

        System.out.println(c == d);                     // true
        System.out.println(e == f);                     // false
        System.out.println(c == (a+b));            // true
        System.out.println(c.equals(a+b));     // true
        System.out.println(g == a+b);               // true
        System.out.println(g.equals(a+b));     // false
    }

}
