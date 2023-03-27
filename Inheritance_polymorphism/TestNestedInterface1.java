class Outer1
{
    void display()
    {
        System.out.println("display method");
    }
    interface inner1
    {
        void display1();//abstract public
    }

}
class TestNestedInterface1 implements Outer1.inner1
//class TestNestedInterface1 extends Outer1
{
    public void display1()
    {
        System.out.println("display1 method");
    }
    public static void main(String...aa){
        TestNestedInterface1 obj = new TestNestedInterface1();
        //obj.display;
        obj.display1();
    }
}