package cn.demo.reflect;
import cn.demo.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class,int.class,String.class,String.class,String.class,String.class);
        System.out.println(constructor);
        Object o = constructor.newInstance("Jerry", 18, "a", "b", "c", "d");
        System.out.println(o);
        System.out.println("-----------------");

        Object o1 = personClass.newInstance();
        System.out.println(o1);


    }
}
