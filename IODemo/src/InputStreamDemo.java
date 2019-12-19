import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("src2.txt");
//        byte[] bs = new byte[2];
//        int len = 0;
//        while ((len = fis.read(bs))!= -1){
//            System.out.print(new String(bs,0,len));
//        }
//        fis.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src2.txt"));
        int b = 0;
        while ((b = bis.read()) != -1) {
            System.out.print((char) b);
        }
        bis.close();

    }
}
