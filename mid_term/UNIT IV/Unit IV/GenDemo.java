class Gen<T>{
  T ob;
  Gen(T o){
    ob = o;
  }
  T getob(){
    return ob;
  }
  void showType(){
    System.out.println("Type ofT is" +ob.getClass().getName());
  }
}
class GenDemo{
    public static void main(String args[]){
        Gen<Integer>iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v =iOb.getob();
        System.out.println("value: "+ v);
        Gen<String>strOb;
        strOb = new Gen<String>("Generics Test");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("value:" +str);

    }
}