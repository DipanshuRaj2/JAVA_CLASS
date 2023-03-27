import java.util.*;
class Ifelse1{
    public static void main(String[] args){
       

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(1<=n && 100>=n){

           if(n%2==1){
            System.out.println("Wierd");
           }
          
         else if(n%2==0 && 2<=n && 4>=n){
            System.out.println("Not Weird");
           }

         else if(n%2==0 && 6<=n && 20>=n){
            System.out.println("Weird");
           }
           
         else if(n%2==0 && 20<=n){
            System.out.println("Not Weird");
           }

        }
        else{
        System.out.println("Invalid Input");
    }
}
}