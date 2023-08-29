/*WAP to functional Interface Create a functional interface with the following method in it: boolean valid(String str, int n);
Write a program with the help of lambda expression that will use this valid() method to find out if a string (str) is having characters greater than "n" in it or not.*/
import java.util.*;
@FunctionalInterface
interface validator{
    boolean valid(String str , int a);
}

public class monday1{
    public static void main(String[] args) {
        validator validator = (str ,n)->str.length() > n;
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        if(n < 1) {
            System.out.println("Invalid input");

        }
        else{
            if(validator.valid(str , n)){
                System.out.println("Valid string");
            }
            else{
                System.out.println("Invalid string");
            }
        }
    }
}