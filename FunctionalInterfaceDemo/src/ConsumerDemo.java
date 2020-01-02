import java.util.function.Consumer;

public class ConsumerDemo {
    public static void method(String s, Consumer<String> con1, Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("Hello Java.",(t)->{
                    System.out.println(t.toUpperCase());
                },
                (t)->{
                    System.out.println(t.length());
                });
    }
}
