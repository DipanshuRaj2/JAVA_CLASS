/*
Create a class Person having a single attribute: age. Now, create a functional interface with the following method in it: void find(Person p[]);
Create a Demo class having main() method and ask the user to createa and initialize "n" Person objects (where "n" is input given by user). Now, use the lambda expression that will use this find() method to find out how many Persons have age greater than 25.

Your program will take 2 types of inputs. First user input will be no. of person objects "n" to be created. Remaining user inputs will be "age" value of every Person object created. If value of "n" entered is less than 1, then display message "Invalid input" and no further input should be taken. Otherwise, display no. of persons having age greater than 25.*/
import java.util.*;
class Person{
    int age;
    Person(int age){
        this.age = age;
    }
}
@FunctionalInterface
interface Finder{
    void find(Person p []);
}
public class monday2 {
     public static void maind   0
}
