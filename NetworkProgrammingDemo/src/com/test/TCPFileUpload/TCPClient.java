package com.test.TCPFileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Code\\JavaExercises\\NetworkProgrammingDemo\\Figures\\Fig01.png");
        Socket client = new Socket("127.0.0.1",8888);
        OutputStream os = client.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        client.shutdownOutput();

        InputStream is = client.getInputStream();
        while ((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        client.close();
        fis.close();
    }
}
