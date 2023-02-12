import java.io.*;
import java.util.*;

public class Zoo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(n.equalsIgnoreCase("24")){
            System.out.print("Invalid size of array");
            return;
            
        }
        sc.nextLine();
        String s = sc.nextLine();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)>= 65 && s.charAt(i)<=90)
                System.out.print(s.charAt(i)+" "+(char)(s.charAt(i)+32));
            else
                System.out.print(s.charAt(i));
        }
        
    }
}