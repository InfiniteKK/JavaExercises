package demo04;

public class People {
    public void buyHouse(){
        System.out.println("Buy HOUSE!!!");
    }

    public void marry(RichInterface ri){
        ri.buy();
    }

    public void happy(){
//        marry(()->{
//            this.buyHouse();
//        });

        marry(this::buyHouse);
    }
}
