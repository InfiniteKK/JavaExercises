import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("HUAWEI P20","1999");
        properties.setProperty("HUAWEI Mate20","6999");

        // entrySet()遍历方式
        System.out.println("entrySet");
        Set<Map.Entry<Object,Object>> entrySet = properties.entrySet();
        Iterator<Map.Entry<Object,Object>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Object,Object> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        // 特有获取Key集合方式
        System.out.println("\nstringPropertyNames");
        Set<String> keys = properties.stringPropertyNames();
        for (String key:keys) {
            System.out.println(key+":"+properties.getProperty(key));
        }
        System.out.println();

        // 持久化功能,Java规定文件以.properties结尾,第二个参数为注释（一般不写）
        // 保存数据到文件
        properties.store(new FileWriter("Phones.properties"),"");

        // 从文件读取数据
        Properties properties2 = new Properties();
        properties2.load(new FileReader("Phones.properties"));
        System.out.println(properties2);

    }

}
