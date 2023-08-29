// class Gen<T extends Number>{
//     T obj;
//     Gen(T o){
//         obj=o;
//     }
//     T getobj(){
//         return obj;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Gen<Double> d = new Gen<>(11.5);
//         Gen<Integer> i = new Gen<>(55);
//         double result1 = d.getobj().doubleValue() + i.getobj().intValue();
//         System.out.println("Result 1 = " + result1);

//         Gen<Float> f = new Gen<>(16.5f);
//         i = new Gen<>(20);
//         float result2 = f.getobj().floatValue() + i.getobj().intValue();
//         System.out.println("Result 2 = " + result2);

//         d = new Gen<>(8.5);
//         Gen<Float> f2 = new Gen<>(6.5f);
//         double result3 = d.getobj().doubleValue() + f2.getobj().floatValue();
//         System.out.println("Result 3 = " + result3);
//     }
// }
import java.util.*;
@FunctionalInterface
interface Validator {
    boolean valid(String str, int n);
}

public class Gen2 {
    public static void main(String[] args) {
        Validator validator = (str, n) -> str.length() > n;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid input");
        } else {
            if (validator.valid(str, n)) {
                System.out.println("Valid string");
            } else {
                System.out.println("Invalid string");
            }
        }
    }
}