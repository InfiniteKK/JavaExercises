package cn.demo.annotation;

public @interface MyAnno {
//    public abstract String show1() default "Jerry";
    public abstract int value();
    public abstract Person per();
    public abstract MyAnno2 anno2();

    public abstract String[] strs();
}
