import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.commons.io.FileUtils;

import java.io.*;

public class CommonIODemo {
    public static void main(String[] args) throws IOException {
//        FileUtils.writeStringToFile(new File("Common-IO.txt"),"Test");

//        FileUtils.copyFile(new File("SrcPic.jpg"),new File("CopyPic-Common-IO.jpg"));
//        myCopyFile(new File("SrcPic.jpg"),new File("CopyPic-myCopyFile.jpg"));

//        FileUtils.copyDirectory(new File("SrcFolder"),new File("DestFolder(Copy)-CommonIO"));
        myCopyDirectory(new File("SrcFolder"),new File("DestFolder(Copy)-myCopy"));

    }

    public static void myCopyFile(File src,File dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] bs = new byte[1024];
        int len = 0;
        while ((len=bis.read(bs))!=-1){
            bos.write(bs,0,len);
        }
        bis.close();
        bos.close();
    }

    public static void myCopyDirectory(File src,File dest) throws IOException{
        File[] files = src.listFiles();

        for(File file:files){
            String[] str= file.getAbsolutePath().split("\\\\");
            String childPath = str[str.length-1];
            if (file.isFile()){
                if(!dest.exists()){
                    dest.mkdir();
                }
                File destFile = new File(dest.getAbsolutePath(),childPath);
                myCopyFile(file,destFile);
            }else {
                File direct = new File(dest.getAbsolutePath(),childPath);
                direct.mkdirs();
                myCopyDirectory(file,direct);
            }
        }
    }
}
