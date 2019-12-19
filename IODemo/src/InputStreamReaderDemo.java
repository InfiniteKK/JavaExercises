import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src3.txt"));
        System.out.println((char)isr.read());
        System.out.println(isr.getEncoding());
        isr.close();
    }
}
