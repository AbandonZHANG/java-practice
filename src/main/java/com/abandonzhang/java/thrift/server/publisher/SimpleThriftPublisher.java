package com.abandonzhang.java.thrift.server.publisher;

import com.abandonzhang.java.thrift.server.CountService;
import com.abandonzhang.java.thrift.server.impl.CountServiceImpl;
import org.apache.thrift.TException;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 * @author zhangzhipeng02@meituan.com.
 * <p>
 * 2018/1/15.
 */
public class SimpleThriftPublisher {

    public static void main(String[] args) throws TException {
        CountService.Processor<CountService.Iface> processor = new CountService.Processor<>(new CountServiceImpl());
        TServerTransport transport = new TServerSocket(9001);
        TServer server = new TSimpleServer(new TServer.Args(transport).processor(processor));
        System.out.println("server published...");
        server.serve();
    }
}
