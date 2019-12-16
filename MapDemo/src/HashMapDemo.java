import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("Tom","18");
        hashMap.put("Jerry","20");
        hashMap.put("Tina","19");
//        System.out.println(hashMap.put("Tina","20"));

        // 第一种遍历方式 KeySet（）
        System.out.println("KeySet");
        Set<String> keys = hashMap.keySet();
        for (String key:keys) {
            System.out.println(key+":"+hashMap.get(key));
        }

        // 第二种遍历方式 EntrySet（）
        System.out.println("\nEntrySet");
        Set<Map.Entry<String,String>> entrySet = hashMap.entrySet(); // 2nd
        Iterator<Map.Entry<String,String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        }

}
