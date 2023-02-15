// import java.util.*;
// class ca_practice{
//     public static void main(String[] args){

// // calculate the percentage

//         // Scanner sc = new Scanner(System.in);

//         // System.out.println("Enter the number of Subject : ");

//         // float n = sc.nextFloat();

//         // System.out.println("Marks of First Subject : ");

//         // float a = sc.nextFloat();

//         // System.out.println("Marks of Second Subject : ");

//         // float b = sc.nextFloat();

//         // System.out.println("Marks of third Subject : ");

//         // float c = sc.nextFloat();

//         // System.out.println("Marks of fourth Subject : ");

//         // float d = sc.nextFloat();

//         // System.out.println("Marks of Fifth Subject : ");

//         // float e = sc.nextFloat();

//         // float sum = a + b + c + d + e ;

//         // System.out.println("Sum : " + sum);

//         // System.out.println("Average : "+ (sum/n));

//         // System.out.println("Percentage : " + (sum/500)*100);



//  // calculate the CGPA 


//         // float subject1 = 45;

//         // float subject2 = 95;

//         // float subject3 = 98;

//         // float cgpa =(subject1 + subject2 +subject3)/3;

//         // System.out.println(cgpa);



//         //question 3

//         //Wap to print the name and "have a good day" by using user input ?

//         // System.out.println("What is your name ? ");
   
//         // Scanner sc = new Scanner(System.in);

//         // String name = sc.next();

//         // System.out.println("Hello,"+ name +" have a good day .");



        

//         // Question 4
//         // wap to convert kilometers to miles by user input ?

//         //Wap to detect whether a number entered by the user is integer or not.
        
//         System.out.println("Enter the Number : ");

//         Scanner sc = new Scanner(System.in);

//         System.out.println(sc.hasNextInt());

//         System.out.println("Hello_world");
        
//     }
// }



// table of any given no.
import java.util.*;
class ca_practice{
    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Table of any number : ");

        //  int n = sc.nextInt();

        // System.out.println(n);

        // for(int i = 1; i <= 10; i++){

        //     System.out.println(n+"*"+i+"="+n*i);

        // }



        // Various operators using in the code;

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the First number : ");

        // int n= sc.nextInt();

        // System.out.print("Enter the Second number : ");

        // int x = sc.nextInt();

        // System.out.print("First number + second number = " + (n+x));


        // WAP to print the percentage of the of 5 subject:
        // Scanner sc = new Scanner (System.in);

        // System.out.print("Enter the marks of first Subject : ");

        // float f = sc.nextFloat();

        // System.out.print("Enter the marks of Second Subject : ");

        // float g = sc.nextFloat();

        // System.out.print("Enter the marks of Third Subject : ");

        // float h = sc.nextFloat();
        // System.out.print("Enter the marks of Fourth Subject : ");

        // float i = sc.nextFloat();

        // System.out.print("Enter the marks of Fifth Subject : ");

        // float j = sc.nextFloat();

        // System.out.println(" Total marks : "+(f + g + h + i + j) );

        // System.out.println("Average marks : " + (f + g + h + i + j )/5); 

        // System.out.println("Percentage : " + ((f + g + h + i + j )/500)*100); 
        
    

        //print the name 
        Scanner sc = new Scanner (System.in);

        String s = sc.next();

        int n = sc.nextInt();

        System.out.println("myString is:" + s);
        System.out.println("myInt is:" + n);



public class Test_Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        System.out.print("Enter real part: ");
        int real1 = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        int imaginary1 = sc.nextInt();
        Complex c1 = new Complex(real1, imaginary1);
        
        System.out.println("Enter the second complex number: ");
        System.out.print("Enter real part: ");
        int real2 = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        int imaginary2 = sc.nextInt();
        Complex c2 = new Complex(real2, imaginary2);
        
        Complex result = new Complex();
        result = result.mul_Complex(c1, c2);
        System.out.print("The result is: ");
        result.display();
}
}


      
    
    }
}