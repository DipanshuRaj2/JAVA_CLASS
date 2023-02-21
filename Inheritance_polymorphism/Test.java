class Parent{
    int a = 20;
    void f1(){
        System.out.println("Parent");
    }
}
class child extends Parent{
    int a = 30;
    void f1()
    {
        System.out.println("child");
    }
}
class Test{
    public static void main(String[] args){
        Parent c1 = new child();
        System.out.println(c1.a);
        c1.f1();

    }
}