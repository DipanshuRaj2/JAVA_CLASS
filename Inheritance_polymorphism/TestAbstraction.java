abstract class Shape{
    abstract void draw(); //declaration of abstract

}   
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");

    }
}
class CircleI extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}
class TestAbstraction{
    public static void main(String args[]){
        Shape s = new CircleI();//In real scenario, object is Provided through method e.g getShape() method
        s.draw();
    }
}