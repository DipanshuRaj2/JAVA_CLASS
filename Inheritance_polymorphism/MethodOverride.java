class Parent{
    // void show(){
        // System.out.println("Parent's show()");

    }
// }
class Child extends Parent{
    //This method overrides show() of Parent

    void show(){
        System.out.println("child's show()");

        
    }
}

class MethodOverride {
    
    public static void main(String[] args){
        Parent obj2 = new Child();
        // Parent p1 = new Parent();

        // p1.show();

        // Child obj2 = new Child();
        obj2.show();
    }
}