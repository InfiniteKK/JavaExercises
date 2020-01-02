import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {
    public static boolean checkString(String str, Predicate<String> pre){
        return pre.test(str);
    }

    public static boolean checkString2(String str, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(str) && pre2.test(str);
        return pre1.and(pre2).test(str);
    }

    public static boolean checkString3(String str, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(str) || pre2.test(str);
        return pre1.or(pre2).test(str);
    }

    public static boolean checkString4(String str, Predicate<String> pre){
//        return !pre.test(str);
        return pre.negate().test(str);
    }

    public static int castDataType(String str, Function<String,Integer> fun){
        return fun.apply(str);
    }

    public static String castDataType2(String str, Function<String,Integer> fun1,Function<Integer,String> fun2){
        return fun1.andThen(fun2).apply(str);
    }

    public static void main(String[] args) {
        String s = "Hello Java.";

        System.out.println(Boolean.toString(checkString(s,s1->s1.length() > 5)).toUpperCase());

        System.out.println(Boolean.toString(checkString2(s,s2->s2.length() > 5,s2->s2.contains("1"))).toUpperCase());

        System.out.println(Boolean.toString(checkString3(s,s2->s2.length() > 5,s2->s2.contains("1"))).toUpperCase());

        System.out.println(Boolean.toString(checkString4(s,s2->s2.length() > 5)).toUpperCase());

        String s2 = "123";
        System.out.println(castDataType2(s2,s3->Integer.parseInt(s3)+3,i->i+""));


    }
}
