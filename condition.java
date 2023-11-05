/*

check the whether the given is Even or Odd

import java.util.*;
public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
*/

/*  
//check the whether the condition is person is able to Vote or not

import java.util.*;
public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); 

        if(age > 18 ){
            System.out.println("Even");
        }
        else {
            System.out.println("Child");
        }
    }


    }

    */

    //Take as user Input and check the whether the given No. is Greater or Smaller;
     import java.util.*;

     public class condition {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Value of a :- ");
            int a = sc.nextInt();
            System.out.println("Enter the Value of b :- ");
            int b = sc.nextInt();
            if(a == b) {
                System.out.println("Equal");
            }else {
                if(a > b ) {
                    System.out.println("a is greater");
                }else {
                    System.out.println("a is lesser");
                }
            }


        }

     }