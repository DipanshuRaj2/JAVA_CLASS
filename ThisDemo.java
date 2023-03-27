public class ThisDemo {
   public ThisDemo() {
    this(10);
    System.out.println("First Constructor");
   }

   public ThisDemo(int a) //overloaded constructor
   {
     this(10,20); 
     System.out.println("Second Constructor");
   }
   public ThisDemo(int a, )//and still another

   {
     System.out.println("Third Constructor");
   }
   public static void main(String args[]){
    ThisDemo d1 = new ThisDemo();{

    }
   }
}
