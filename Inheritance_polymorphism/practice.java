class Parent{    
    void show(){
        System.out.println("Parent's Show");
        System.out.println("Parent's Show1");

    }
}
class practice{
    public static void main(String[] args){  //minimum 1 public class is necessary

        Parent p1 = new Parent();   // access the parent class 

        p1.show(); // show all the output;
        

    }
}
