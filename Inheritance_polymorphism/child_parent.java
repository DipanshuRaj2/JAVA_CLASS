class Parent {
    int num = 10;
}

class Child extends Parent {
    int num = 20;

    void printNum() {
        System.out.println("Child class variable num = " + num);
        System.out.println("Parent class variable num = " + super.num); //to access the parent class use super keyword
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.printNum();
 }
}
class child_parent{
    public static void main(String[] args){
        Child child = new Child();
        child.printNum();
    
        

    }
}
