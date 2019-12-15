package com.test.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据:");
            String sendMsg = scanner.nextLine();
            byte[] bytes = sendMsg.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
            datagramSocket.send(datagramPacket);
            System.out.println("PC-K发送信息成功！");
        }
//        datagramSocket.close();

    }


}
