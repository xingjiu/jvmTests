package com.xingjiu.jvmtest.chapter10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xingjiu on 5/29/15.
 */
public class TestTemplete {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "world");
        System.out.println(map.get("hello"));
    }

}
