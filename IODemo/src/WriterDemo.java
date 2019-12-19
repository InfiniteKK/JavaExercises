import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) throws IOException{
//        FileWriter fw = new FileWriter("dest.txt");
//        fw.write('A');
//        fw.write('\r');
//        fw.write('\n');
//        fw.write("a b c\r\n");
//        char[] content = {'1','2','3','\r','\n'};
//        fw.write(content,1,2);
//        fw.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("dest.txt"));
        bw.write('B');
        bw.newLine();
        bw.write("a b c");
        bw.newLine();
        char[] content = {'1',' ','2',' ','3'};
        bw.write(content);
        bw.newLine();
        bw.close();


    }
}
