class A{
    public int ab(int n1 ,  int n2, int n3){
        
        return n1 + n2 + n3;
    }
    public double ab(double n1 , int n2){
        
        return n1+n2;
    }
}
class Demo{
    public static void main(String args[]){
        A obj = new A();
        int a = obj.ab(2 , 5 , 8);
        double b = obj.ab(9 ,5);
        System.out.println(a);
        System.out.println(b);

    }  
}