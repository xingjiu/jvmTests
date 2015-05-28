package com.xingjiu.jvmtest.chapter2.OutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * Created by xingjiu on 5/27/15.
 */
public class RuntimeContantPoolOOM {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }


}
