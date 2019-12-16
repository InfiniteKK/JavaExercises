import java.util.Collection;

public class GenericsDemo {
    static class Person<E>{ //class
        E id;
        public E getId() {
            return id;
        }

        public void setId(E id) {
            this.id = id;
        }
    }

    public static <T> T show(T t){ //method
       return t;
    }

    public interface MyInter<Q>{ //interface
        public Q show(Q q);
    }

    public static class MyClass<Q> implements MyInter<Q>{

        @Override
        public Q show(Q q) {
            return q;
        }
    }

    public static void main(String[] args) {
        Person<String> person = new Person<String>();
        person.setId("10001");
        System.out.println(person.getId());

        Person<Integer> person2 = new Person<Integer>();
        person2.setId(20001);
        System.out.println(person2.getId());

        System.out.println(show(1));
        System.out.println(show("A"));
        System.out.println(show(new Person<String>()));


        System.out.println(new MyClass().show(2));
        System.out.println(new MyClass().show("a"));
        System.out.println(new MyClass().show(new Person<String>()));

    }
}
