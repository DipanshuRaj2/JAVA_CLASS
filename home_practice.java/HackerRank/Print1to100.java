import java.util.Scanner;
public class Print1to100{
    public static void main(String[] args){
        Scanner dipanshu = new Scanner(System.in);
        int n = dipanshu.nextInt();
        if( n < 0){
            System.out.println("Invalid Input");
        }
        else{
            for(int i = 0; i<=n; i++){
                System.out.println(i);
            }
            System.out.println("Games End");
        }
        
    }
}