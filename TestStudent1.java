class Student {
int id;//field or data member or instance variable
String name;
}
class TestStudent1{
 public static void main(String args[]){
 Student s1=new Student();//creating the reference variable
//s1=new  Student();//creating reference to object of student
  System.out.println(s1.id);//accessing member through reference variable
  System.out.println(s1.name);
}
}