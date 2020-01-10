package cn.demo.domain;

public class Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    public Person() {
    }

    public Person(String name, int age, String a, String b, String c, String d) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat(String food) {
        System.out.println("eat " + food + "...");
    }

    public void walk() {
        System.out.println("walk...");
    }

    public void sleep(){
        System.out.println("sleep...");
    }
}
