//Polymorphism = runtime (object behaving differently with different classes of object)
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