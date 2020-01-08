package demo03;

public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am a man.");
    }

    public void method(GreetInterface gi){
        gi.greet();
    }

    public void show(){
//        method(()->{
//            Human h = new Human();
//            h.sayHello();
//        });

//        method(()->super.sayHello());

        method(super::sayHello);
    }

}
