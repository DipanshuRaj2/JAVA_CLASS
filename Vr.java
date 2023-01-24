class Vr
{
int k=20;
int x=25;//instance
static int y=10;
public static void main(String args[])
{
int x=5;
Vr k=new Vr();
Vr a=new Vr();
System.out.println("Value of Local variable is " + x);//5
System.out.println("Value of Local variable is " + k.x);//25
System.out.println("Value of instance variable is " +k.k); //20
System.out.println("Value of Class variable is " + Vr.y); //10
k.abc();
k.x=30;

a.abc();
}

void abc()
{
int x=15;
System.out.println("Value of Local variable is " + x); //15
System.out.println("Value of instance variable is " +this.x);// 25
System.out.println("Value of instance variable is " + k);//20
System.out.println("Value of class variable is " + Vr.y);//10
}

}