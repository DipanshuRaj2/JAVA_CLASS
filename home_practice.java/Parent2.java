class Parent2{
    Parent2(){
        System.out.println("Parent");
    }
}  
class Child extends Parent2{

}

class Child1 extends Child{
    Child1(){
        System.out.println("Child1");
        }

public static void main(String[] args){
    Child1 c1=new Child1();
}
}