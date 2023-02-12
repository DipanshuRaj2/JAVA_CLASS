import java.io.*;
import java.util.*;
public class Simple_array{

    public static void main(String[] args){
    // Scanner dipanshu = new Scanner(System.in);
    // int n = dipanshu.nextInt();
    
    // if(n>1){
    //     int aa[] = new int[n];
    //     if(n>0 && n<50)
    //     {
    //         for(int i = 0; i<n; i++){
    //             aa[i]=dipanshu.nextInt();
            
    //         }
    //         for(int j = 0; j<n; j++){
    //             double x = aa[j];
    //             if(x<0){
    //                 x = 0;
    //                 System.out.print(x+" ");
    //             }
    //             else{
    //                 System.out.print(x+" ");
    //             }
    //         }
    //     }
    // }
    // else{
    //     System.out.println("Invalid array size");
    // }

    Scanner dipanshu = new Scanner(System.in);
    int[][]arr =new int[4][5];
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 5; j++){
            arr[i][j] =dipanshu.nextInt();
        }
    }
    for(int i = 0; i <arr.length; i++){
        Arrays.sort(arr[i]);

    }
    for(int i = 0; i<4; i++){
        for(int j = 0; j<4; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
}

    

