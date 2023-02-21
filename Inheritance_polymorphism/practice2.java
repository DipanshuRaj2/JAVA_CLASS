//make a student class take user input to print the value;
//easy and understand
/*
import java.io.*;
import java.util.*;
class Student{
    String name;
    int a;
    Student(String name, int a){
        this.name=name;
        this.a=a;
    }
    void display(){
        System.out.println(name);
        System.out.println("Unknown");
    }
}

class practice2{
    public static void main(String[] args){
        Scanner dipanshu = new Scanner(System.in);
        String name = dipanshu.next();
        int a = dipanshu.nextInt();
        Student s1 = new Student(name , a);
        s1.display();
        //System.out.println("HEllo World");
    }
}
*/
import java.io.*;
import java.util.*; //take user input 
class Employee{    
    private int id , age;

    public Employee(int id ,int age){
        this.id = id; //access the id in the class of Employee
        this.age = age;//access the age in the class of Employee
    }
    public int DisplayId(){
        return id;
    }
    public int DisplayAge(){
        return age;
    }
}
class practice2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1||n > 10){
            System.out.println("Invalid Input");
            return;
        }
        Employee[] employees = new Employee[n];
        for(int i = 0; i<n; i++){
            int id = sc.nextInt();
            int age = sc.nextInt();
            if(id < 10 || id >1000 || age<18||age>50){
                System.out.println("Invalid Data");
                return;
            }
            employees[i] =new Employee(id, age);
        }
        for(Employee e :employees) {
            if(e.DisplayAge() < 30){
                System.out.println(e.DisplayId() +" " +e.DisplayAge());
            }
        }
    }
}