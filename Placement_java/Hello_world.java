import java.util.Scanner;
class Hello_world{
    public static void main(String[]args){
        
        

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the value of a: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of b: ");


        // int b = sc.nextInt();
        

        // System.out.println("a+b: "+(a+b));

        
        


        // String name =sc.nextLine();
        

        // System.out.println();

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the value of a");

        // int a = sc.nextInt();

        // System.out.println("Enter the value of b");

        // int b = sc.nextInt();

        // System.out.println("a : "+a+" b : "+b);
        // if(a < b){
        //     System.out.println("b is greater");
        // }
        // else{
        //     System.out.println("a is greater");
        // }

        // int temp = 0;

        // temp = a;
        // a  = b;
        // b = temp;
        // System.out.println("a : "+a+" b : "+b);

        //using two varible
        // a = a+b;
        // b = a-b;
        // a = a-b;
        // System.out.println("a : "+a+" b : "+b);
        // System.out.println("Enter the value of n");
        // int n =sc.nextInt();

        // for(int i = 1; i<=n; i++){
        //     System.out.println("i = "+i);
        // }
        Scanner sc =new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum = sum+arr[i];
        }
        
        System.out.println("sum : "+sum);
        System.out.println("avg : "+sum/size);
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i<size; i++){
            if(arr[i] > max)
                max = arr[i];

            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("max :"+max);
        System.out.println("min :"+min);


        

        
    }
}