//difference between static and nonstatic 
class A 
{
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        A r =new A(); //make a object of class A
        r.Disp();//then use of Static variable
        A.show(); // class name A or name of static method show
        
    }
    // static method name show
    static void show() //static method 1. static keyword use 2.directly not access
    {
       System.out.println("Show() "+b ); 
       //1.we can't access a instantaneous variable
    //  2.only access a static variable
    //3. So if we write "System.out.println("Show() "+a + b);" it get an error.
    //4. Error :non-static variable a cannot be referenced from a static context
    //5. Make a A class object then we use it. 
    //          A r = new A();
    //          r disp();
    }                                       

//    non static method  name Disp
    void Disp() //non static method 1. no any keyword 
    {
        System.out.println("Disp() " +a+ " "+b);
        //use directly write A.show();
    }
}
//Please understand the code . It's easy
