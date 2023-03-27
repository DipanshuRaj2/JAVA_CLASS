interface Drawable{
    void draw();
    default void msg() 
    {
        System.out.println("default method");
        }
}
class Rectangle implements Drawable{
     public void draw(){ //attempting to assign weaker access privileges; ERROR So we use public
        System.out.println("drawing Rectangle");
    }
}
class TestInterface{
public static void main(String args[]){
    Drawable d = new Rectangle();
    d.draw();
    d.msg();
}
}