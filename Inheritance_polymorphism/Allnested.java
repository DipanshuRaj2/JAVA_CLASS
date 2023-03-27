class AllNested
{
//Static Nested Class
static class nestedstatic
{
int a=10;
static int b=20;
void display()
{
System.out.println("non static a="+a);
System.out.println(" static b="+b);
}
}
// Inner Class
class inner
{
int a=10;
final static int b=20;
//static int b=20;
// Error: modifier static is only allowed in constant variable declarations
void display()
{
System.out.println(" static b="+b);
int a=10;//effectively final

System.out.println("inner a= "+a);
// Local class
class localclass
{
int b;
//a=20;//Error: because a is effectively final
void show()
{
System.out.println("local a= "+a);
}
}
localclass obj3 = new localclass();
obj3.show();
}
}

public static void main(String args[])
{ //anaonymous class which define its own method
new AllNested(){

void display()
{
System.out.println("Hello");
}

}.display();
//create instance of nested static class
AllNested.nestedstatic obj= new AllNested.nestedstatic();
obj.display();

//create instance of nested nonstatic class
AllNested obj2 =new AllNested();
AllNested.inner obj1= obj2.new inner();
obj1.display();


}
}