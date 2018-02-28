package com.abandonzhang.java.thrift.server.impl;

import com.abandonzhang.java.thrift.server.CountService;
import org.apache.thrift.TException;

/**
 * @author zhangzhipeng02@meituan.com.
 * <p>
 * 2018/1/15.
 */
public class CountServiceImpl implements CountService.Iface {

    private static int v = 0;

    @Override
    public int countAndReturn(int value) throws TException {
        v += value;
        return v;
    }
}
