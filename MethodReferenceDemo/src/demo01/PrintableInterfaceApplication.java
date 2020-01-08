package demo01;

public class PrintableInterfaceApplication {
    public static void printString(PrintableInterface p){
        p.print("Hello Java.");
    }

    public static void main(String[] args) {
        printString(s-> System.out.println(s));
        printString(System.out::println);
    }
}
