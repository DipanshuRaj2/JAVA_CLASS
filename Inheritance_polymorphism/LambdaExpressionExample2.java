@FunctionalInterface
interface Drawable{
    public void draw();
    default void max(){
        System.out.println("Hello1");
    }
}
public class LambdaExpressionExample2{
    public static void main(String[] args) {
        int width = 10;

        //with lamda
        Drawable d2 = ()->{
            System.out.println("Drawing " + width);
        };
        d2.draw();
        d2.max();
        //lamda expression for Drawable1

        Drawable d1 = ()->{
            System.out.println("Drawing "+ width);
        };
d1.draw();
    }
}