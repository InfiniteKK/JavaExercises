import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFunctionDemo {
    public static void main(String[] args) {

        System.out.print("map: ");
        Integer[] array = {1,2,3};
        Stream<Integer> stream1 = Stream.of(array);
        stream1.map(i->i.toString()).forEach(s-> System.out.print(s+" "));
        System.out.println();

        System.out.print("count: ");
        List<String> list = new ArrayList<>();
        list.add("Jerry");
        list.add("Tom");
        Stream<String> stream2 = list.stream();
        long num = stream2.count();
        System.out.println(num);

        System.out.print("limit: ");
        Stream<String> stream3 = list.stream();
        stream3.limit(1).forEach(s-> System.out.println(s));

        System.out.print("skip: " );
        Stream<String> stream4 = list.stream();
        stream4.skip(1).forEach(s-> System.out.println(s));

        System.out.print("concat: ");
        Stream<String> stream5 = Stream.of("Hello");
        Stream<String> stream6 = Stream.of("Java");
        Stream stream = Stream.concat(stream5,stream6);
        stream.forEach(s-> System.out.print(s+" "));
    }
}
