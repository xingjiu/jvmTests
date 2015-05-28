package com.xingjiu.jvmtest.chapter2.OutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingjiu on 5/27/15.
 */


/**
 * VM Args: -Xms2m -Xmx2m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
