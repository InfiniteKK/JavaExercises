import java.util.ArrayList;
import java.util.stream.Stream;

public class ListFilterDemo {
    public static void main(String[] args) {
        ArrayList<String> person = new ArrayList<>();
        person.add("Jerry");
        person.add("Tom");
        person.add("Lily");
        person.add("Tina");
        person.add("Jack");
        person.add("Tony");
        person.stream().filter(name->name.startsWith("J")).
                filter(name->name.length()>=5).
                forEach(name-> System.out.println(name));
    }
}
