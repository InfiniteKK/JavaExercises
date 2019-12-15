import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\TestFolder");
        File[] files = f.listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        if (pathname.getName().endsWith(".txt")){
                            return true;
                        }
                        return false;

                    }
                }
        );
        for (File file:files
             ) {
            System.out.println(file);

        }

//        String[] array = {"1","2","3"};
//        Integer[] array2 = {1,2,3};
        int[] array3 = {1,2,3};
        System.out.println(Arrays.toString(array3));
    }
    public static void traverseFile(File f,long length){
        File[] files = f.listFiles();
        for (File file:files) {
            if(file.isFile()) {
                length += file.length();
                file.delete();
            }else {
                traverseFile(file,length);
                file.delete();
            }
        }
    }
}
