package cn.demo.reflect;
import cn.demo.domain.Person;
import sun.reflect.generics.scope.MethodScope;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Person p = new Person();
        Method method = personClass.getMethod("eat", String.class);
        method.invoke(p,"apple");
        System.out.println("---------------");

        Method[] methods = personClass.getMethods();
        for (Method methodTemp : methods) {
            System.out.println(methodTemp.getName());

        }
        System.out.println("---------------");

        String className = personClass.getName();
        System.out.println(className);


    }
}
