package com.test.TCPFileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket client = server.accept();
        InputStream is = client.getInputStream();
        File file = new File("E:\\Code\\JavaExercises\\NetworkProgrammingDemo\\Figures(Server)");
        if (!file.exists()) {
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(file+"\\Fig01.png");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        OutputStream os = client.getOutputStream();
        os.write("上传成功！".getBytes());

        client.close();
        server.close();
        fos.close();


    }
}
