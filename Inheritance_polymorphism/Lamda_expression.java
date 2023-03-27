//perform sum of digits, sum of strings and multiplication of digits thro Lamda Expression
class Lamda_expression {
    public static void main(String... args) {
        Numbers sum = (a1 ,b1) ->{return(a1 +b1);};
    
    System.out.println(sum.print(6,9));
 
    //()->{};

    JoingString join = (a, b) ->{return (a + b);};
    System.out.println(join.join("hello", "World"));

    Numbers multiply = (a , b) ->{return (a * b);};
    System.out.println(multiply.print(42, 0));

}
}
@FunctionalInterface
interface Numbers {
    int print(int a , int b);
}
@FunctionalInterface
interface JoingString {
    String join(String a , String b);

}
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Invalid");
            return;
        }

        String[] arr = new String[n];

        // Taking input strings from user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // Sorting the array in ascending order
        Arrays.sort(arr);

        // Displaying the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
 }
}
}