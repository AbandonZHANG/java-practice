package com.abandonzhang.java.io.bio.bytestreams;

import java.io.InputStream;

/**
 * @author zhangzhipeng02@meituan.com.
 * <p>
 * 2018/2/9.
 */
public class SystemInOutClass {
    public static void main(String[] args) {
        System.out.println("System.in.class = " + System.in.getClass());
        // 通过断点调试观察 is 中的 in 对象类型（BufferedInputStream 中有一个 InputStream 的对象）
        InputStream is = System.in;
        System.out.println("System.out.class = " + System.in.getClass());
    }
}
