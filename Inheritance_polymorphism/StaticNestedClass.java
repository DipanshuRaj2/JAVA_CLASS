//outer class
class OuterClass
{
    //static member
    static int outer_x =10;

    //instance (non-static)
    int outer = 20;

    //private member
    private static int outer_private= 30;

    //static nested class
    static class StaticNestedClass{
        void add(){
            void display(){
                //can access static member of outer class
                System.out.println("outer_x=" +outer_private);

                //THe following satement will give compilation error
                //as static nested class cannot directly access non-static members
                Sytem.out.println("outer_y = " + outer_y);
            }
        }

    }
//Driver class
public class StaticNestedClass
{
    public static void main(String[] args)
    {
        //accessing a static nested class
        OuterClass.StaticNestedClass.nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.Display();
    }
}