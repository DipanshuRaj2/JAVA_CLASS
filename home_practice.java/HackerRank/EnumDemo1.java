//Constructor are private in Enums.
enum Mobile{
    Samsung(400), Nokia(250),Motorola(325);
    
    int price;
Mobile(int p){
    price=p;
}
int showPrice(){
    return price;
}
}

public class EnumDemo1{

public static void main(String args[])
{
System.out.println("CellPhone List: ");

for(Mobile m: Mobile.values()) {
String s= m.name();
int a =m.ordinal();
System.out.println(s);

System.out.println(m +"costs"+m.showPrice()+"dollars");
}
Mobile ret;
ret= Mobile.valueOf("Samsung"); //convert String into enum Objects
System.out.println("Seleceted:"+ret);
}
}