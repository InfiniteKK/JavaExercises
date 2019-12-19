import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("dest3.txt"));
        osw.write("你好！");
        System.out.println(osw.getEncoding());
        osw.close();

    }
}
