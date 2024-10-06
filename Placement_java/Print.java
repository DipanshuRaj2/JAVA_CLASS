class papa{
    public void show2(){
        System.out.println("hello papa");
    }
}
class child extends papa{
    public void show2(){
        System.out.println("hello  child");
    }
}
class Print{
    public static void main(String[] args){
        System.out.println("hello world");
        papa ch = new child();
        ch.show2();
    }
}
