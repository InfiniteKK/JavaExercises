package com.test.TCP;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException{
        Socket client = new Socket("127.0.0.1",12345);
        client.getOutputStream().write("你好，我是PC-K！".getBytes());
        System.out.println("向服务器发送数据成功！");

        //读取服务器发送过来的反馈信息
        InputStream inputStream = client.getInputStream();
        byte[] bytes = new byte[1024];
        int length = inputStream.read(bytes);
        System.out.println("服务器内容："+new String(bytes,0,length));
        client.close();
    }
}
