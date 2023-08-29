//Interface = Any service Requirement Specification is by default consider. 
//ex : API = Application Programming Interfaces is used to 
//interface def2 = Any contract between client and service provider.
//interface def3 = 100% pure abstract class.   

interface Interf{
    public void m1();
    public void m2();
}
abstract class interface_srs implements Interf{
    public void m1(){

    }
  
}
//whenever declaring any interfaces method make sure it should be public