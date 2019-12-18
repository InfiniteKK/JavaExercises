import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        // 创建文件
        File f1= new File("E:\\TestFolder\\1.png");
//        System.out.println(f1.createNewFile());

        // 创建文件夹
        File f2= new File("E:\\TestFolder\\folder3\\folder3.1\\1");
//        System.out.println(f2.mkdirs());

        // 判断是否是文件或文件夹
//        File f3= new File("E:\\TestFolder\\folder3\\folder3.1\\1");
        File f3= new File("E:\\TestFolder\\1.png");
        if (f3.exists()){
            if (f3.isFile()){
                System.out.println(f3+" is file.");
            }else {
                System.out.println(f3+" is folder.");
            }
        }
        System.out.println();


        // 浏览目录下所有文件
        File file = new File("E:\\TestFolder");
        printFile(file);
        System.out.println();

        // 浏览目录下所有文件(带过滤器）
        File file2 = new File("E:\\TestFolder");
        printFileWithFilter(file2);


    }

    public static void printFile(File file){
        if(!file.exists()){
            return;
        }

        File[] files = file.listFiles();

        for (File file1:files){
            if(file1.isFile()){
                System.out.println(file1);
            }else {
                printFile(file1);
            }
        }
    }

    public static void printFileWithFilter(File file){
        if(!file.exists()){
            return;
        }

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".txt")){
                    return false;
                }
                return true;
            }
        });

        for (File file1:files){
            if(file1.isFile()){
                System.out.println(file1);
            }else {
                printFile(file1);
            }
        }
    }

}
