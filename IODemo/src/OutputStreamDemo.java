import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("dest2.txt");
//        byte[] bs = {'a','b','c'};
//        fos.write(bs);
//        fos.close();

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("dest2.txt"));
        bos.write(48);
        bos.write('\r');
        bos.write('\n');
        bos.write(96);
        bos.close();
    }
}
