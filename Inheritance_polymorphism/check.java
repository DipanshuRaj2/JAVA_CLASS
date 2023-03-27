// interface A{
//     default void add(){
//         System.out.println("A hello");
//     }
// }
// interface B{
//     default void add(){
//         System.out.println("hello");

//     }
// }
// class check implements A, B{
//     public static void main(String[] args) {
//         check c= new check();
//         c.add();
//     }
// }
interface A{
default void add(){
System.out.println("A hello");
}
}
interface B{
default void add(){
System.out.println("B hello");
}
}
class check implements A,B{
public static void main(String[] args){
check c = new check();
c.add();
}
public void add() {
A.super.add();
}
}