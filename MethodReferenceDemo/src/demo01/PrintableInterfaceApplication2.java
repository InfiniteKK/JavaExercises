package demo01;

public class PrintableInterfaceApplication2 {
    public static void printString(PrintableInterface p) {
        p.print("Hello Java.");
    }

    public static void main(String[] args) {
        printString((s)->{
            MethodReferenceObject obj = new MethodReferenceObject();
            obj.printUpperCaseString(s);
        });

        MethodReferenceObject obj = new MethodReferenceObject();
        printString(obj::printUpperCaseString);
    }
}
