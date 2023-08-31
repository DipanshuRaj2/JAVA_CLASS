//Polymorphism = runtime (object behaving differently with different classes of object)
//different object will different behaviour
/*class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
     public void show()
    {
        System.out.println("In B show");
    }

}
class C extends A
{
 public void show()
    {
        System.out.println("In C show");
    }
}
public class Demo5
{
    
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
        
        obj = new C();
        obj.show();



        

    }
}

*/

// 2ND CONCEPT OF fINAL KEYWORD
//final - varible , method, class
/* 
class Calc{
    public final void show(){
        System.out.println("In Calc show");
    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{
    public void show1(){
        System.out.println("In AdvCalc");
    }
}
public class Demo5{
    public static void main(String a[]){
       Calc obj = new AdvCalc();
       obj.show();
       obj.add(7 , 8);
    }
}
*/
//3rd concept of java Abstract class.   
//we cannot create a object of abstract class.
//public void Drive(){} it is defining the method;
//public void Drive ();it is declaring the method;
abstract class Car
 {
    public abstract void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Play Music");
    }
 }
 abstract class WagonR extends Car
 {
    public void drive()
    {
        System.out.println("Driving");
    }
    public void fly()
    {
        System.out.println("flying..");
    }
 }
 class updateWagonR extends WagonR
 {
    public void fly(){
        System.out.println("Flying");
    }
 
 }
 class Demo5
 {
    public static void main(String a[])
    {
        Car obj = new updateWagonR(); //we cannot create a obj of a class 
        obj.playMusic();
        obj.drive();
        obj.fly();
 }
 }
 