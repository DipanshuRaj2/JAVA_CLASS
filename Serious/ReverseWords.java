/*use of new keyword in java
1)call instance variable & non static method.
2)call constructor
3)Array

*/
/*
class newKeyword{
  int a = 10;

  public static void main(String[] args){
    newKeyword n = new newKeyword(); // make a object (n) of class newKeyword
    System.out.println(n.a);
  }
}
*/
//--------------------------------------------------------
/*
class newKeyword{
  int a = 10;
  newKeyword(){ //constructor //method 
    System.out.println(a);
  }
  public static void main(String[] args){
    newKeyword n = new newKeyword();
  }

}

import java.util.*;
class newKeyword{
  public static void main(String[] args) {
    int size;
    System.out.println("Enter Array size: ");
    Scanner sc = new Scanner(System.in);
    size=sc.nextInt();

    int a[] = new int[size]; 
    System.out.println("Enter array Element: ");
    for(int i = 0; i< size; i++){
      a[i] = sc.nextInt();
    }
    System.out.println("Array Elements: ");
    for(int m : a){
      System.out.print(m+" ");
    }
  }
}



//hacker rank





/*
class newKeyword{
  int a = 10;
  static int b = 20;
  public static void main(String[] args){
   newKeyword A = new newKeyword();
   A.disp(); // 10
  //  newKeyword.show(); //20
   A.show(); //20

  }

  static void show(){
    System.out.println(b);
  }

  void disp(){
    System.out.println(a);
  }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = str.length();
        boolean flag = true;
        
        for(int i = 0, j = n-1; i < j; i++, j--) {
            if(str.charAt(i) != str.charAt(j)) {
                flag = isPalindrome(str, i+1, j) || isPalindrome(str, i, j-1);
                break;
            }
        }
        
        System.out.println(flag);
    }
    
    public static boolean isPalindrome(String str, int start, int end) {
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
}}*/
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        String input = sc.nextLine();
        
        
        if (input.matches(".*\\d.*") || input.isEmpty()) {
            System.out.println("Invalid input");
        } else {
            String[] words = input.split("\\s+");
            StringBuilder reversedString = new StringBuilder();
            for (String word : words) {
                String reversedWord = reverse(word.toLowerCase());
                reversedString.append(reversedWord).append(" ");
            }
            System.out.println(reversedString.toString().trim());
        }
    }

    private static String reverse(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
        
          }
}