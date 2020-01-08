package demo02;

public class CalculateInterfaceApplication {
    public static int method(int number,CalculateInterface ci){
        return ci.calAbs(number);
    }
    public static void main(String[] args) {
        System.out.println(method(-10,n->Math.abs(n)));
        System.out.println(method(-10,Math::abs));
    }
}
