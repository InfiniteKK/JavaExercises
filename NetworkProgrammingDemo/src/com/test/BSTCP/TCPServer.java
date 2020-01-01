package com.test.BSTCP;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);

        while (true) {
            Socket client = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {

                    try{
                        InputStream is = client.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String htmlPath = br.readLine().split(" ")[1].substring(1);
                        System.out.println(htmlPath);

                        FileInputStream fis = new FileInputStream("E:\\Code\\JavaExercises\\"+htmlPath);
                        OutputStream os = client.getOutputStream();
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content‐Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\r\n".getBytes());

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        fis.close();
                        client.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();


        }

    }
}
