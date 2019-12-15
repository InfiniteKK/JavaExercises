package com.test.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(12345);
        while (true) {
            byte[] bytes = new byte[1024];
            System.out.println("等待接受数据...");
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            System.out.println("接收数据成功！");
            InetAddress sendAddress = datagramPacket.getAddress();
            System.out.println("发送端：" + sendAddress.getHostName());
            byte[] data = datagramPacket.getData();
            int length = datagramPacket.getLength();
            String receiveMsg = new String(data, 0, length);
            System.out.println("内容：" + receiveMsg);
        }
//        datagramSocket.close();


    }
}
