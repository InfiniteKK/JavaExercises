package demo05;

public class Application05 {
    public static void printName(String name,PersonBuilderInterface pbi){
        System.out.println(pbi.builderPerson(name).getName());
    }

    public static void main(String[] args) {
        printName("Jerry",(name)->new Person(name));
        printName("Tom",Person::new);
    }
}
