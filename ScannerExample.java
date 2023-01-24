import java.util.Scanner;
import java.lang.*;//
//import java.io.*;
class ScannerExample
{
public static void main(String[] args) {
//throws IOException {
byte b;
short s;
int i;
long l;
float f;
double d;
boolean bo;
String c;
String s1;
char c1;
Scanner in = new Scanner(System.in);
System.out.println("Enter a Word");
c=in.next(); // hello
System.out.println("Word: "+c);
in.nextLine();
System.out.println("Enter a String");
s1=in.nextLine();// hello world
System.out.println("String: "+s1);
System.out.println("Enter a Byte");
b=in.nextByte();
System.out.println("Byte: " +b);

System.out.println("Enter a Short");
s=in.nextShort();
System.out.println("Short: " +s);

System.out.println("Enter a Integer");
i=in.nextInt();
System.out.println("Integer: " +i);

System.out.println("Enter a Long");
l=in.nextLong();
System.out.println("Long: " +l);

System.out.println("Enter a Float");
f=in.nextFloat();
System.out.println("Float: " +f);

System.out.println("Enter a Double");
d=in.nextDouble();
System.out.println("Double: "+d);

System.out.println("Enter a Boolean");
bo=in.nextBoolean();
System.out.println("Boolean: " +bo);

System.out.println("Enter a Word");
c=in.next(); // hello
System.out.println("Word: "+c);

System.out.println("Print a character");
c1=c.charAt(0);//h
//c1=in.next().charAt(1);//charAt(index) is a method in java.lang.String
System.out.println("Character: "+c1);
//c1=(char)System.in.read();//read gives value in int
//System.out.println("Character: "+c1);
}
}