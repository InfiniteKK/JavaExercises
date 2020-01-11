package cn.demo.annotation.Application;

public class Calculator {
    @Check
    public void add() {
        System.out.println("1 + 0 = " + (1 + 0));
    }
    @Check
    public void sub() {
        System.out.println("1 - 0 = " + (1 - 0));
    }
    @Check
    public void mul() {
        System.out.println("1 * 0 = " + (1 * 0));
    }
    @Check
    public void div() {
        System.out.println("1 / 0 = " + (1 / 0));
    }
    @Check
    public void show(){
        String str = null;
        str.toString();
        System.out.println("NO BUG!!!");
    }
}
