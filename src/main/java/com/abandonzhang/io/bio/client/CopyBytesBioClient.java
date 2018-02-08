package com.abandonzhang.io.bio.client;

import java.io.*;
import java.net.Socket;

/**
 * @author zhangzhipeng02@meituan.com.
 * <p>
 * 2018/1/15.
 */
public class CopyBytesBioClient {

    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 10001;

    public static void main(String[] args) throws IOException {
        System.out.println(System.in.getClass());
        Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
        OutputStream outputStream = socket.getOutputStream();
        socket.getInputStream();
        byte[] outputBytes = {1,2,3,4,5};
        outputStream.write(outputBytes);
    }
}
