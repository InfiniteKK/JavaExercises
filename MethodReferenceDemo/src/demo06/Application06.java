package demo06;

public class Application06 {
    public static int[] createArray(int length,ArrayBuilder ab){
        return ab.builderArray(length);
    }
    public static void main(String[] args) {
        int[] arr1 = createArray(10,(len)->new int[len]);
        System.out.println(arr1.length);

        int[] arr2 = createArray(5,int[]::new);
        System.out.println(arr2.length);
    }
}
