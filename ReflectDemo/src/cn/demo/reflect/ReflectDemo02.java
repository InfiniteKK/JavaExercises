package cn.demo.reflect;
import cn.demo.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("----------------");

        Field a = personClass.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p,"Jerry");
        System.out.println(p);
        System.out.println("----------------");

        Field[] fields2 = personClass.getDeclaredFields();
        for (Field field:fields2){
            System.out.println(field);
        }
        System.out.println("----------------");

        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);
        d.set(p,"d");
        System.out.println(p);

    }
}
