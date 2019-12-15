import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("001","A");
        map.put("002","B");
        Set<Map.Entry<String,String>> iterator = map.entrySet();
        Set<String> keyset = map.keySet();

    }
}
