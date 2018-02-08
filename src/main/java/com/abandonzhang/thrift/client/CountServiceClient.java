package com.abandonzhang.thrift.client;

import com.abandonzhang.thrift.server.CountService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * @author zhangzhipeng02@meituan.com.
 * <p>
 * 2018/1/15.
 */
public class CountServiceClient {

    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 9001;

    public static void main(String[] args) throws TException {
        TTransport transport = new TSocket(SERVER_HOST, SERVER_PORT);
        transport.open();
        TProtocol protocol = new TBinaryProtocol(transport);
        CountService.Iface client = new CountService.Client(protocol);
        int i = 0;
        while (i < 100) {
            i = client.countAndReturn(1);
            System.out.println(i);
        }
    }
}
