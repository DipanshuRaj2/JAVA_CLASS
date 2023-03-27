// Write a programm A class with one abstract method int add(int a, int b) and a variable a with value 10
abstract class A{
    abstract void add(int a , int b)
}
class  Z extends A{
    int sum{
        return a+b;
    }
}



class question2{
    public static void main(String[] args){
        A c= new Z();
        
    }

}