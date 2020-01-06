import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"Jerry","Tom"};
        for (String a:arr
             ) {
            System.out.println(a);
        }
        System.out.println("===========");

        Stream<String> arr1 = Stream.of(arr);
        arr1.filter(name->name.startsWith("J")).forEach(name-> System.out.println(name));
        System.out.println("===========");
        for (String a:arr
                ) {
            System.out.println(a);
        }


    }
}
