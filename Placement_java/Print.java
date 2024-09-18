class Maa{
    public void show(){
        System.out.println("Hello Maa");
    }
}
class Son1 extends Maa{
    public void show(){
        System.out.println("Hello son1");
    }
}
class Son2 extends Maa{
    public void show(){
        System.out.println("hello son2");
    }
}
class Print{
    public static void main(String[] args){
        System.out.println("hello world");
        Maa ma = new Son2();
        ma.show();
    }
}
