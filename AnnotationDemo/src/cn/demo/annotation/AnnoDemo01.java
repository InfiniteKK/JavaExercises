package cn.demo.annotation;

public class AnnoDemo01 {
    public static void main(String[] args) {

    }

    @MyAnno(value = 1,per = Person.p1,anno2 = @MyAnno2,strs = {"Hello","Java"})
    public static void show(){

    }

}
