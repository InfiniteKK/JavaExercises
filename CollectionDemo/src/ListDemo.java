import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> arrayList = new LinkedList<>();
        arrayList.add("Beijing");
        arrayList.add("Jinan");
        arrayList.add("Yantai");
        arrayList.set(2,"Shanghai");
//        arrayList.remove(1);
//        arrayList.remove("Shanghai");
//        System.out.println(arrayList);
        arrayList.addFirst("Guangzhou");
//        System.out.println(arrayList.removeFirst());
//        System.out.println(arrayList.removeLast());
//        System.out.println(arrayList.getFirst());
//        System.out.println(arrayList.getLast());
        arrayList.pop(); // removeFirst
        arrayList.push("Qingdao"); // addFirst
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        System.out.println(arrayList.contains("Qingdao"));






    }
}
