package keyword;

public class Basic1 {
    final int a;
public static void main(String[] args) {
final int s;
Basic1 b1= new Basic1();
System.out.println("a="+b1.a);
}
}
// error in final int a because default value is not given to final instance variable.
// but final int s (local variable) its not giving error but its not giving even default value.


