import java.io.*;

public class PrintWriterOrPrintStreamDemo {
    // PrintWriter（打印字符流） 方法同 PrintStream（打印字节流） , 小区别：打印的目的地不太一样
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter(new FileOutputStream("pw.txt"));
        pw.print("你好");
        pw.print(1);
        pw.print(2);
        pw.close();

        PrintStream ps = new PrintStream(new FileOutputStream("ps.txt"));
        ps.print("abc");
        ps.print(1);
        ps.print(2);
        ps.close();

    }
}
