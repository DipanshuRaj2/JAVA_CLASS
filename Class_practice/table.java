// import java.util.*;
// class table{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in); 
//         System.out.print("Hello World");
//         int n = sc.nextInt();
        
//         for(int i = 1 ; i < 11; i++){
//             System.out.println(n+" * "+i+" = "+n * i); 
            
//         }
        
        
//     }
// }


//percentage question ;
// import java.util.*;
// class table{
//     public static void main(String[] args){
//         System.out.println("Enter the Number of Subject : ");

//         Scanner sc = new Scanner(System.in);

//         float n = sc.nextInt();
        
     
//         System.out.println("Marks obtained by the Subject 1 : ");
        
//         float s1 = sc.nextInt();

//         System.out.println("Marks obtained by the Subject 2 : ");

//         float s2 = sc.nextInt();

//         System.out.println("Marks obtained by the Subject 3 : ");
        
//         float s3 = sc.nextInt();

//         System.out.println("Marks obtained by the Subject 4 : ");

//         float s4 = sc.nextInt();

//         System.out.println("Marks obtained by the Subject 5 : ");

//         float s5 = sc.nextInt();

//         float totalmarks = s1 + s2 + s3 + s4 + s5;

//         System.out.println("percentage : "+((totalmarks/500)*100));
        

        
//     }
// }

import java.util.*;



public class table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n<=0)
        {
        System.out.println("Invalid Array Size");
        return;
        }
        
        int arr[] = new int [n]; //Declare the size of the array;

        int a = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); //taking eleement int the array;
            if(arr[i]<0){
                System.out.println("Invalid Array Elements");
                return;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
        }

        

    
}