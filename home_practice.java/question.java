import java.io.*;
import java.util.*;

public class question {

 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 if(n<=0){
 System.out.println("Invalid Array Size");
 return;
 }
 int arr[]=new int[n];
 int a=0;
 for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
 if(arr[i]<0){
 System.out.println("Invalid Array Elements");
 return; 
 }
 }
 Arrays.sort(arr);
 System.out.println(arr[n-2]);
 }
}