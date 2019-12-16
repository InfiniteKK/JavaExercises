import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("Yantai");
        collection.add("Jinan");
        collection.add("Beijing");
//        collection.remove("Yantai");
//        System.out.println(collection.size());
//        System.out.println(collection.contains("Jinan"));
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }



    }
}
