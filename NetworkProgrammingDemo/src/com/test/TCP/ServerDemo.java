package com.test.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("等待客户端连接...");
        Socket client = serverSocket.accept();
        System.out.println("客户端IP："+client.getInetAddress().getHostAddress());
        InputStream inputStream = client.getInputStream();
        byte[] bytes = new byte[1024];
        int length = inputStream.read(bytes);
        System.out.println("内容："+new String(bytes,0,length));

        //向客户端反馈
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("收到消息！".getBytes());
        System.out.println("给客户端反馈信息发送成功！");
        serverSocket.close();
        client.close();
    }
}
