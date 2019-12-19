import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src.txt");
        // 读一个字节
//        int b = 0;
//        while((b = fr.read())!= -1){
//            System.out.print((char)b);
//        }
        // 读一个字符数组
//        char[] content = new char[1024];
//        System.out.println(fr.read(content,0,2));
//        for (char c:content) {
//            System.out.print(c);
//        }
//        System.out.println();
        // 关闭流
        fr.close();

        BufferedReader br = new BufferedReader(new FileReader("src.txt"));
        int b2 = 0;
        while ((b2 = br.read()) != -1){
            System.out.print((char)b2);
        }
        System.out.println();

//        char[] content = new char[1024];
//        System.out.println(br.read(content,0,9));
//        for (char c:content){
//            System.out.print(c);
//        }
//        System.out.println();
        br.close();


    }
}
