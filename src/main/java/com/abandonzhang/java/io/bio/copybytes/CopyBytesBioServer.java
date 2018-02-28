package com.abandonzhang.java.io.bio.copybytes;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhangzhipeng02@meituan.com.
 * <p>
 * 2018/1/15.
 */
public class CopyBytesBioServer {

    private static final int SERVER_PORT = 10001;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
        System.out.println("Server listened port: " + SERVER_PORT);
        for (;;) {
            Socket clientSocket = serverSocket.accept();
            handleSockets(clientSocket);
        }
    }

    public static void handleSockets(Socket socket) throws IOException {
        if (socket == null) {
            return;
        }
        InputStream inputStream = socket.getInputStream();
        int c;
        try {
            while ((c = inputStream.read()) != -1) {
                System.out.print(c);
            }
        } finally {
            System.out.println("socket close.");
            socket.close();
        }
    }
}
