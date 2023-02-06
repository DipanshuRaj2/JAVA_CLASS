package keyword.java;
//final keyword is used to set the variable value lock the variable value.

 class Test {
    final int a = 7;
 

public static void main(String args[]){
    Test t1 = new Test();

    t1.a = 20;   //error because final keyword 
    System.out.println(t1.a);
}


 }

 //error 