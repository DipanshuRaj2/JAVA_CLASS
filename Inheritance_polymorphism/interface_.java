//interface -> child
//implements keyword is used .
interface Printable  
{
    void print();
    }

interface Showable
{
    void show();

}
class  interface_ implements Printable,Showable{
    public void print()
    {
       System.out.println("Hello");
    }
    public void show()
    {
       System.out.println("welcome");
    }
    public static void main(String[] args){
        interface_ obj = new interface_ ();
        obj.print();
        obj.show();
    }
}