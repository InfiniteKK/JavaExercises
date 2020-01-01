package com.test.TCPFileUploadOptimization;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);

        while (true) {
            Socket client = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try ( InputStream is = client.getInputStream();
                          OutputStream os = client.getOutputStream())
                    {

                        File file = new File("E:\\Code\\JavaExercises\\NetworkProgrammingDemo\\Figures(Server)");
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        String fileName = System.currentTimeMillis() + ".png";
                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        os.write("上传成功！".getBytes());
                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }
            }).start();

//            server.close();
        }



    }
}
