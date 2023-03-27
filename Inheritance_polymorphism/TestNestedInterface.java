interface Outer{
void show();
interface inner{
void show1();
}
}
class TestNestedInterface implements Outer
// class TestNestedInterface implements Outer.inner
{
public void show(){
System.out.println("Show Method");
}
public void show1(){
System.out.println("Show1 Method");
}
public static void main(String...aa){
//TestNestedInterfaec obj= new TestNestedInterface
//Outer obj= new TestNestedInterface(); //error in show 1
Outer.inner obj= new TestNestedInterface(); //error in show

//obj.show();
obj.show1();

}
}

