package cn.demo.annotation;

@MyAnno3
public class Student {


    private String name;

    @MyAnno3
    public void study(){
        System.out.println("study");
    }
}
